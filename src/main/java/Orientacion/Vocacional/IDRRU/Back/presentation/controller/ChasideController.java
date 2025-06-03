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
    public ResponseEntity<ChasideDto> findById(@PathVariable Integer id) {
        ChasideDto chaside = chasideService.findById(id);
        return ResponseEntity.ok(chaside);
    }

    @GetMapping
    public ResponseEntity<List<ChasideDto>> getAll() {
        List<ChasideDto> chasides = chasideService.findAll();
        return ResponseEntity.ok(chasides);
    }
}