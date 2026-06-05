package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ColegioService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ColegioDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/colegio")
public class ColegioController {

    private final ColegioService colegioService;

    @GetMapping
    public ResponseEntity<List<ColegioDto>> getAll(){
        List<ColegioDto> colegioList = colegioService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(colegioList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ColegioDto> getById(@PathVariable Integer id){
        ColegioDto colegioDto = colegioService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(colegioDto);
    }

}
