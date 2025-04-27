package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Resultado;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.ResultadoMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ResultadoService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/resultado")
public class ResultadoController {


    @Autowired
    private final ResultadoService resultadoService;

    @Autowired
    private final ResultadoMapper resultadoMapper;


    @GetMapping("/{id}")
    public ResponseEntity<ResultadoDto> getById(@PathVariable Integer id) {
        ResultadoDto resultadoDto = resultadoMapper.fromEntityToDto( resultadoService.getById(id));
        return ResponseEntity.ok(resultadoDto);
    }

    @GetMapping("/")
    public ResponseEntity<List<Resultado>> getAll() {
        List<Resultado> resultados = resultadoService.getAll();
        return ResponseEntity.ok(resultados);
    }

    @PostMapping("/")
    public ResponseEntity<ResultadoDto> create(@Valid @RequestBody ResultadoDto resultadoDto) {
        ResultadoDto createdResultadoDto = resultadoMapper.fromEntityToDto( resultadoService.create(resultadoDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(createdResultadoDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResultadoDto> update(@PathVariable Integer id, @Valid @RequestBody ResultadoDto resultadoDto){
        ResultadoDto updatedResultadoDto = resultadoMapper.fromEntityToDto(resultadoService.update(id, resultadoDto));
        return ResponseEntity.ok(updatedResultadoDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        resultadoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}