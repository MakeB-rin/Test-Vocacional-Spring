package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Provincia;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ProvinciaService;
import java.util.List;

import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ProvinciaDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/provincia")

public class ProvinciaController {

    private final ProvinciaService provinciaService;

    @GetMapping
    public ResponseEntity<List<ProvinciaDto>> getAll() {
        List<ProvinciaDto> provinciaList = provinciaService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(provinciaList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProvinciaDto> getById(@PathVariable Integer id) {
        ProvinciaDto provinciaFound = provinciaService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(provinciaFound);
    }
}