package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.MunicipioMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.MunicipioService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.MunicipioDto;
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
@RequestMapping("/municipio")
public class MunicipioController {

  private final MunicipioService municipioService;
  private final MunicipioMapper municipioMapper;

  @GetMapping
  public ResponseEntity<List<Municipio>> getAll() {
    List<Municipio> municipioList = municipioService.getAll();
    return ResponseEntity.status(HttpStatus.OK).body(municipioList);
  }

  @GetMapping("/{id}")
  public ResponseEntity<MunicipioDto> getById(@PathVariable Integer id) {
    MunicipioDto municipioDto = municipioMapper.fromEntityToDto(municipioService.getById(id));
    return ResponseEntity.status(HttpStatus.OK).body(municipioDto);
  }

  @PostMapping("/{id}")
  public ResponseEntity<Municipio> save(@Valid @RequestBody MunicipioDto dto) {
    Municipio municipioToSave = municipioService.create(dto);
    return ResponseEntity.status(HttpStatus.CREATED).body(municipioToSave);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Object> delete(@PathVariable Integer id) {
    municipioService.delete(id);
    return ResponseEntity.ok().build();
  }

  @PutMapping("/state/{id}")
  public ResponseEntity<Object> save(@PathVariable Integer id) {
    municipioService.changeState(id);
    return ResponseEntity.ok().build();
  }

  @PutMapping("/{id}")
  public ResponseEntity<Municipio> update(@PathVariable Integer id,
      @Valid @RequestBody MunicipioDto dto) {
    Municipio municipioUpdated = municipioService.update(id, dto);
    return ResponseEntity.status(HttpStatus.OK).body(municipioUpdated);
  }
}
