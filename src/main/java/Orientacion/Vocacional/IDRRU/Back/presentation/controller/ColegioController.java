package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ColegioService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ColegioDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/colegio")
public class ColegioController {

    private final ColegioService colegioService;

    @GetMapping
    public ResponseEntity<List<ColegioDto>> getAll(){
        List<ColegioDto> colegioList = colegioService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(colegioList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ColegioDto> getById(@PathVariable Integer id){
        ColegioDto colegioDto = colegioService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(colegioDto);
    }

    @PostMapping
    public ResponseEntity<ColegioDto> create(@Valid @RequestBody ColegioDto dto){
        ColegioDto response = colegioService.create(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("{/id}")
    public ResponseEntity<ColegioDto> updated(@PathVariable Integer id, @Valid @RequestBody ColegioDto dto){
        ColegioDto response = colegioService.update(id, dto);

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("{/id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        colegioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
