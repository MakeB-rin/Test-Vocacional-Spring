package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Resultado;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ResultadoService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/resultado")
public class ResultadoController {

    private final ResultadoService resultadoService;

    @PostMapping
    public ResponseEntity<Resultado> create(@Valid @RequestBody ResultadoDto resultadoDto) {
        Resultado createdResultado = resultadoService.create(resultadoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdResultado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Resultado> update(
            @PathVariable Integer id,
            @Valid @RequestBody ResultadoDto resultadoDto
    ) {
        Resultado updatedResultado = resultadoService.update(id, resultadoDto);
        return ResponseEntity.ok(updatedResultado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resultado> getById(@PathVariable Integer id) {
        Resultado resultado = resultadoService.getById(id);
        return ResponseEntity.ok(resultado);
    }

    @GetMapping
    public ResponseEntity<List<Resultado>> getAll() {
        List<Resultado> resultados = resultadoService.getAll();
        return ResponseEntity.ok(resultados);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        resultadoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}