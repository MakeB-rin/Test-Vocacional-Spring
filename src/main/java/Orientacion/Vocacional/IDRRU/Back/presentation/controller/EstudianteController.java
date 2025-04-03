package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.EstudianteService;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.MunicipioService;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ProvinciaService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EstudianteDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/estudiante")

public class EstudianteController {
    @Autowired
    private ProvinciaService provinciaService;


    private final EstudianteService estudianteService;

    @GetMapping
    public ResponseEntity<List<Estudiante>> getAll(){
        List<Estudiante> EstudianteList = estudianteService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(EstudianteList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> findById(@PathVariable Integer id){
        Estudiante estudianteFound = estudianteService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(estudianteFound);
    }

    @PostMapping("/")
    public ResponseEntity<Estudiante> save(@Valid @RequestBody EstudianteDto dto) {
        Estudiante estudianteSave = estudianteService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(estudianteSave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Estudiante> delete(@PathVariable Integer id) {
        estudianteService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> update(@PathVariable Integer id, @Valid @RequestBody EstudianteDto estudianteDto) {
        Estudiante estudianteUpdate = estudianteService.update(id, estudianteDto);
        return ResponseEntity.ok(estudianteUpdate);
    }




}
