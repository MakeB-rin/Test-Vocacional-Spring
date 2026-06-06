package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.ColegioRepository;
import Orientacion.Vocacional.IDRRU.Back.data.repository.EstudianteRepository;
import Orientacion.Vocacional.IDRRU.Back.data.repository.MunicipioRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Colegio;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.EstudianteMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.EstudianteService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EstudianteDto;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepository;
    private final ColegioRepository colegioRepository;
    private final MunicipioRepository municipioRepository;

    @Autowired
    private EstudianteMapper estudianteMapper;

    @Override
    public List<EstudianteDto> findAll() {
        List<Estudiante> estudianteList = estudianteRepository.findAll();
        return estudianteMapper.fromEntityListToDto(estudianteList);
    }

    @Override
    public EstudianteDto findById(Integer id){
        Estudiante estudiante = estudianteRepository.findById(id)
                .orElseThrow(()->new EntityNotFoundException("Estudiante" , id));
        return estudianteMapper.fromEntityToDto(estudiante);
    }

    @Override
    public EstudianteDto create(EstudianteDto estudianteDto) {
        Colegio colegio = colegioRepository
                .findById(estudianteDto.getIdColegio())
                .orElseThrow(()->
                        new EntityNotFoundException("Colegio", estudianteDto.getIdColegio()));
        Municipio municipio = municipioRepository
                .findById(estudianteDto.getId_municipio())
                .orElseThrow(()->
                        new EntityNotFoundException("Municipio", estudianteDto.getId_municipio()));
        Estudiante estudiante = estudianteMapper.fromDtoToEntity(estudianteDto, null);
        estudiante.setColegio(colegio);
        estudiante.setMunicipio(municipio);
        Estudiante estudianteSave = estudianteRepository.save(estudiante);
        return estudianteMapper.fromEntityToDto(estudianteSave);
    }

    @Override
    public EstudianteDto update(Integer id, EstudianteDto estudianteDto) {

        Estudiante estudianteId =  estudianteRepository
                .findById(id)
                .orElseThrow(()->
                        new EntityNotFoundException("Estudiante", id));
        Colegio colegio = colegioRepository
                .findById(estudianteDto.getIdColegio())
                .orElseThrow(()->
                        new EntityNotFoundException("Colegio", estudianteDto.getIdColegio()));
        Municipio municipio = municipioRepository
                .findById(estudianteDto.getId_municipio())
                .orElseThrow(()->
                        new EntityNotFoundException("Municipio", estudianteDto.getId_municipio()));
        Estudiante estudianteEdit = estudianteMapper.fromDtoToEntity(estudianteDto, estudianteId);
        estudianteEdit.setMunicipio(municipio);
        estudianteEdit.setColegio(colegio);
        Estudiante updated = estudianteRepository.save(estudianteEdit);
        return estudianteMapper.fromEntityToDto(updated);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        estudianteRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("Estudiante", id));
        estudianteRepository.deleteById(id);
    }

    //eliminacion LOGICA
    @Override
    public void changeState(Integer id) {

        Estudiante estudiante = estudianteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Estudiante", id));
        estudiante.active= estudiante.active? false: true;
        estudianteRepository.save(estudiante);
    }
}