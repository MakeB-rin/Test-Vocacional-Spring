package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.data.repository.EstudianteRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.EstudianteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    private EstudianteRepository estudianteRepository;

    private final EstudianteService estudianteService;

    @GetMapping("/")
    public ResponseEntity<List<Estudiante>> getAll(Pageable pageable){
        List<Estudiante> EstudianteList = estudianteService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(EstudianteList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> findEstudianteById(@PathVariable Integer id){
        Estudiante estudianteFound = estudianteService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(estudianteFound);
    }


}
