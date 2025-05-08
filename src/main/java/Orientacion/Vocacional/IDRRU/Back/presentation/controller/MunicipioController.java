package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.mapper.MunicipioMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.MunicipioService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.MunicipioDto;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/municipio")
public class MunicipioController {

  private final MunicipioService municipioService;
  private final MunicipioMapper municipioMapper;

  @GetMapping("/")
  public ResponseEntity<List<MunicipioDto>> getAll() {
    List<MunicipioDto> municipioList = municipioService.getAll();
    return ResponseEntity.status(HttpStatus.OK).body(municipioList);
  }

  @GetMapping("/{id}")
  public ResponseEntity<MunicipioDto> getById(@PathVariable Integer id) {
    MunicipioDto municipioDto = municipioMapper.fromEntityToDto(municipioService.getById(id));
    return ResponseEntity.status(HttpStatus.OK).body(municipioDto);
  }

}