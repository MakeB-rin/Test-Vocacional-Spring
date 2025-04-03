package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Provincia;

import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ProvinciaService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ProvinciaDto;
import jakarta.validation.Valid;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/provincia")

public class ProvinciaController {

    private final ProvinciaService provinciaService;

    @GetMapping
    public ResponseEntity<List<Provincia>> getAll() {
        List<Provincia> provinciaList = provinciaService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(provinciaList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Provincia> getById(@PathVariable Integer id) {
        Provincia provinciaFound = provinciaService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(provinciaFound);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Provincia> save(@Valid @RequestBody ProvinciaDto dto) {
        Provincia provinciaToSave = provinciaService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(provinciaToSave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Integer id) {
        provinciaService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/state/{id}")
    public ResponseEntity<Object> save(@PathVariable Integer id) {
        provinciaService.changeState(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Provincia> update(@PathVariable Integer id,
        @Valid @RequestBody ProvinciaDto dto) {
        Provincia provinciaUpdated = provinciaService.update(id, dto);
        return ResponseEntity.status(HttpStatus.OK).body(provinciaUpdated);
    }

}
