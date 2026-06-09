package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.EvaluacionService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EvaluacionRequestDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EvaluacionResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evaluacion")
@RequiredArgsConstructor
public class EvaluacionController {

    private final EvaluacionService evaluacionService;

    @PostMapping
    public ResponseEntity<EvaluacionResponseDto> guardar(@RequestBody EvaluacionRequestDto evaluacionRequestDto){

        EvaluacionResponseDto response = evaluacionService.guardarEvaluacion(evaluacionRequestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
