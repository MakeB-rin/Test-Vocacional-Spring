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

@RestController
@AllArgsConstructor
@RequestMapping("/facultades")
public class FacultadController {

    private final FacultadService facultadService;

    @PostMapping
    public ResponseEntity<Facultad> create(@Valid @RequestBody FacultadDto facultadDto) {
        Facultad createdFacultad = facultadService.create(facultadDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFacultad);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Facultad> update(
            @PathVariable Integer id,
            @Valid @RequestBody FacultadDto facultadDto
    ) {
        Facultad updatedFacultad = facultadService.update(id, facultadDto);
        return ResponseEntity.ok(updatedFacultad);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Facultad> getById(@PathVariable Integer id) {
        Facultad facultad = facultadService.getById(id);
        return ResponseEntity.ok(facultad);
    }

    @GetMapping
    public ResponseEntity<List<Facultad>> getAll() {
        List<Facultad> facultades = facultadService.getAll();
        return ResponseEntity.ok(facultades);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        facultadService.delete(id);
        return ResponseEntity.noContent().build();
    }
}