package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.EstudianteRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.EstudianteMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.EstudianteService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EstudianteDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private EstudianteMapper estudianteMapper;

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante findById(Integer id){
        return estudianteRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Estudiante" , id));
    }

    @Override
    public Estudiante create(EstudianteDto estudianteDto) {
        Estudiante estudiante = estudianteMapper.fromDtoToEntity(estudianteDto, null);
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante update(Integer id, EstudianteDto estudianteDto) {
        Estudiante estudianteFound = estudianteRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("Estudiante", id));
        Estudiante estudianteSave = estudianteMapper.fromDtoToEntity(estudianteDto, estudianteFound);
        return estudianteRepository.save(estudianteSave);
    }

    @Override
    public void delete(Integer id) {
        estudianteRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("Estudiante", id));
        estudianteRepository.deleteById(id);
    }

}
