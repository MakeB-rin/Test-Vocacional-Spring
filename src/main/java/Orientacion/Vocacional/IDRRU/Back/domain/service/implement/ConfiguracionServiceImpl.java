package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.ConfiguracionRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Configuracion;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.ConfiguracionMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ConfiguracionService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ConfiguracionDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConfiguracionServiceImpl implements ConfiguracionService {

    private final ConfiguracionRepository configuracionRepository;

    private final ConfiguracionMapper configuracionMapper;

    @Override
    public ConfiguracionDto getConfiguracion() {
        Configuracion configuracion = configuracionRepository.findById(1)
                .orElseThrow(() ->
                        new RuntimeException("No existe la configuracion"));
        return configuracionMapper.fromEntityToDto(configuracion);
    }

    @Override
    public ConfiguracionDto update(Integer id, ConfiguracionDto configuracionDto) {
        Configuracion configuracion = configuracionRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Configuracion no encontrada"));

        configuracion = configuracionMapper.fromDtoToEntity(configuracionDto, configuracion);

        configuracion = configuracionRepository.save(configuracion);

        return configuracionMapper.fromEntityToDto(configuracion);
    }
}
