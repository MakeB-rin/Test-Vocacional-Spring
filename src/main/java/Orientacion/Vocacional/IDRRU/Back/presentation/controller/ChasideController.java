package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Chaside;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ChasideService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ChasideDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chaside")
public class ChasideController {

    private final ChasideService chasideService;

    @GetMapping("/{id}")
    public ResponseEntity<ChasideDto> getById(@PathVariable Integer id) {
        ChasideDto chasideDto = chasideService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(chasideDto);
    }

    @GetMapping
    public ResponseEntity<List<ChasideDto>> getById() {
        List<ChasideDto> chasideList = chasideService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(chasideList);
    }

    @PostMapping("/")
    public ResponseEntity<ChasideDto> save(@Valid @RequestBody ChasideDto dto) {
        ChasideDto chaside = chasideService.create(dto);
        return ResponseEntity.status(HttpStatus.OK).body(chaside);
    }
}
