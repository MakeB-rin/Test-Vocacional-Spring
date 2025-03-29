package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.data.repository.EstudianteRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @GetMapping("/")
    public ResponseEntity<Page<Estudiante>> getAll(Pageable pageable){
        return ResponseEntity.ok(estudianteRepository.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> findEstudianteById(@PathVariable Integer id){
        Optional<Estudiante> estudianteOptional = estudianteRepository.findById(id);
        if(!estudianteOptional.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.ok(estudianteOptional.get());
    }


}
