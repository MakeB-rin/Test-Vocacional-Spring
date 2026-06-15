package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ConfiguracionService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ConfiguracionDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/configuracion")
@RequiredArgsConstructor
public class ConfiguracionController {

    private final ConfiguracionService configuracionService;

    @GetMapping
    public ResponseEntity<ConfiguracionDto> getConfiguracion(){

        return ResponseEntity.ok(configuracionService.getConfiguracion());

    }

    @PutMapping("/{id}")
    public ResponseEntity<ConfiguracionDto> update(
            @PathVariable Integer id,
            @Valid @RequestBody ConfiguracionDto configuracionDto
    ){
        return ResponseEntity.ok(
                configuracionService.update(id, configuracionDto));
    }
}
