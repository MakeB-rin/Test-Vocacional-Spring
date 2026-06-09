package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EvaluacionRequestDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EvaluacionResponseDto;

public interface EvaluacionService {

    EvaluacionResponseDto guardarEvaluacion(EvaluacionRequestDto evaluacionRequestDto);

}
