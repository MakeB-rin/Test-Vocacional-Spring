package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

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

    @GetMapping("/")
    public ResponseEntity<List<EstudianteDto>> getAll(){
        List<EstudianteDto> EstudianteList = estudianteService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(EstudianteList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstudianteDto> findById(@PathVariable Integer id){
        EstudianteDto estudianteDto = estudianteService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(estudianteDto);
    }

    @PostMapping("/")
    public ResponseEntity<Object> save(@Valid @RequestBody EstudianteDto dto) {
        try{
            EstudianteDto estudianteDto = estudianteService.create(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(estudianteDto);
        }catch (Exception e){
          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error en el servidor E" + e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstudianteDto> update(@PathVariable Integer id, @Valid @RequestBody EstudianteDto estudianteDto) {
        EstudianteDto estudianteUpdate = estudianteService.update(id, estudianteDto);
        return ResponseEntity.status(HttpStatus.OK).body(estudianteUpdate);
    }

    @PutMapping("/state/{id}")
    public ResponseEntity<Object> save(@PathVariable Integer id) {
        estudianteService.changeState(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Integer id) {
        estudianteService.delete(id);
        return ResponseEntity.ok().build();
    }
}