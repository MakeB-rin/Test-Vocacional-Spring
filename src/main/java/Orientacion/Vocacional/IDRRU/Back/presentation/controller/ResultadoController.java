package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ResultadoService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDtoResponse;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoResponse;
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

    @GetMapping("/{id}")
    public ResponseEntity<ResultadoDto> getById(@PathVariable Integer id) {
        ResultadoDto resultadoDto = resultadoService.getById(id);
        return ResponseEntity.ok(resultadoDto);
    }

    @GetMapping
    public ResponseEntity<List<ResultadoDto>> getAll() {
        List<ResultadoDto> resultadosDto = resultadoService.getAll();
        return ResponseEntity.ok(resultadosDto);
    }

    @PostMapping("/")
    public ResponseEntity<ResultadoDto> create(@Valid @RequestBody ResultadoDto resultadoDto) {
        ResultadoDto createdResultadoDto = resultadoService.create(resultadoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdResultadoDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResultadoDto> update(@PathVariable Integer id, @Valid @RequestBody ResultadoDto resultadoDto){
        ResultadoDto updatedResultadoDto = resultadoService.update(id, resultadoDto);
        return ResponseEntity.ok(updatedResultadoDto);
    }

    @PutMapping("/state/{id}")
    public ResponseEntity<Object> save(@PathVariable Integer id) {
        resultadoService.changeState(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Integer id) {
        resultadoService.delete(id);
        return ResponseEntity.noContent().build();
    }

//
//    @GetMapping("/busqueda-municipio/{id}")
//    public ResponseEntity<List<ResultadoResponse>> busquedaMunicipioList(@PathVariable Long id,
//                                                                         @RequestParam (required = false) String year){
//        List<ResultadoResponse>  resultadoResponseList = resultadoService.searchToMunicipioList(id, year);
//        return ResponseEntity.ok(resultadoResponseList);
//    }

    @GetMapping("/busqueda-provincia")
    public ResponseEntity<List<ResultadoDtoResponse>> busquedaProvinciaList(@RequestParam (required = false) Long idProvincia,
                                                                            @RequestParam (required = false) Long idMunicipio,
                                                                            @RequestParam (required = false) String year){
        List<ResultadoDtoResponse> resultadoResponseList = resultadoService.searchToProvinciaList(idProvincia,idMunicipio, year);
        return ResponseEntity.ok(resultadoResponseList);
    }

    @GetMapping("/estudiante/{estudianteId}")
    public ResponseEntity<List<ResultadoDto>> getByEstudianteId(@PathVariable Integer estudianteId) {
        List<ResultadoDto> resultados = resultadoService.getByEstudianteId(estudianteId);
        return ResponseEntity.ok(resultados);
    }
}