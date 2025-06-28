package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.HollandService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.HollandDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/holland")
public class HollandController {

    private final HollandService hollandService;

    @GetMapping("/{id}")
    public ResponseEntity<HollandDto> findById(@PathVariable Integer id) {
        HollandDto holland = hollandService.findById(id);
        return ResponseEntity.ok(holland);
    }

    @GetMapping
    public ResponseEntity<List<HollandDto>> getAll() {
        List<HollandDto> hollands = hollandService.findAll();
        return ResponseEntity.ok(hollands);
    }
}