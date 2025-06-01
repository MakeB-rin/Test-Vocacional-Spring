package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Facultad;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.FacultadService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.FacultadDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Controlador REST para Facultad
@RestController
@AllArgsConstructor
@RequestMapping("/facultad")
public class FacultadController {

    private final FacultadService facultadService;

    @GetMapping("/{id}")
    public ResponseEntity<FacultadDto> findById(@PathVariable Integer id) {
        FacultadDto facultad = facultadService.findById(id);
        return ResponseEntity.ok(facultad);
    }

    @GetMapping
    public ResponseEntity<List<FacultadDto>> getAll() {
        List<FacultadDto> facultades = facultadService.findAll();
        return ResponseEntity.ok(facultades);
    }
}