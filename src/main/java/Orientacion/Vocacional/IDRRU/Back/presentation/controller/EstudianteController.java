package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.mapper.EstudianteMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.EstudianteService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EstudianteDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private final EstudianteService estudianteService;

    @Autowired
    private final EstudianteMapper estudianteMapper;

    @GetMapping("/")
    public ResponseEntity<List<EstudianteDto>> getAll(){
        List<EstudianteDto> EstudianteList = estudianteMapper.fromEntityListToDto(estudianteService.findAll());
        return ResponseEntity.status(HttpStatus.OK).body(EstudianteList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstudianteDto> findById(@PathVariable Integer id){
        EstudianteDto estudianteDto = estudianteMapper.fromEntityToDto(estudianteService.findById(id));
        return ResponseEntity.status(HttpStatus.OK).body(estudianteDto);
    }

    @PostMapping("/")
    public ResponseEntity<EstudianteDto> save(@Valid @RequestBody EstudianteDto dto) {
        EstudianteDto estudianteDto = estudianteMapper.fromEntityToDto(estudianteService.create(dto));
        return ResponseEntity.status(HttpStatus.OK).body(estudianteDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstudianteDto> update(@PathVariable Integer id, @Valid @RequestBody EstudianteDto estudianteDto) {
        EstudianteDto estudianteUpdate = estudianteMapper.fromEntityToDto(estudianteService.update(id, estudianteDto));
        return ResponseEntity.status(HttpStatus.OK).body(estudianteUpdate);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<EstudianteDto> delete(@PathVariable Integer id) {
        estudianteService.delete(id);
        return ResponseEntity.ok().build();
    }
}