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
    public ResponseEntity<Chaside> getById(@PathVariable Integer id) {
        Chaside chaside = chasideService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(chaside);
    }

    @GetMapping("/")
    public ResponseEntity<List<Chaside>> getById() {
        List<Chaside> chasideList = chasideService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(chasideList);
    }

    @PostMapping("/")
    public ResponseEntity<Chaside> save(@Valid @RequestBody ChasideDto dto) {
        Chaside chaside = chasideService.create(dto);
        return ResponseEntity.status(HttpStatus.OK).body(chaside);
    }
}
