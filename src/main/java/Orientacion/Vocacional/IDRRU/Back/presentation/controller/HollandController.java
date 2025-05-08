package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Chaside;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Holland;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ChasideService;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.HollandService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ChasideDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.HollandDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/holland")
public class HollandController {

    private final HollandService hollandService;

    @GetMapping("/{id}")
    public ResponseEntity<HollandDto> getById(@PathVariable Integer id) {
        HollandDto hollandDto = hollandService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(hollandDto);
    }

    @GetMapping
    public ResponseEntity<List<HollandDto>> getById() {
        List<HollandDto> hollandList = hollandService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(hollandList);
    }

    @PostMapping("/")
    public ResponseEntity<HollandDto> save(@Valid @RequestBody HollandDto dto) {
        HollandDto holland = hollandService.create(dto);
        return ResponseEntity.status(HttpStatus.OK).body(holland);
    }
}
