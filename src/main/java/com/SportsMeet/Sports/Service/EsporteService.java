package com.SportsMeet.Sports.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.SportsMeet.Sports.Entities.EsporteEntities;
import com.SportsMeet.Sports.Repository.EsporteRepository;

@Service
public class EsporteService {

    @Autowired
    private EsporteRepository esporteRepository;

    public List<EsporteEntities> listarTodos(){
        return esporteRepository.findAll();
    }

    public Optional<EsporteEntities> buscarPorId(int id){
        return esporteRepository.findById(id);
    }

    public EsporteEntities salvar(EsporteEntities esporte) {
        return esporteRepository.save(esporte);
    }

    public EsporteEntities atualizar(int id, EsporteEntities esporte) {
        EsporteEntities esporteSalvo = validarEsporteExiste(id);
        BeanUtils.copyProperties(esporte, esporteSalvo, "id");
        return esporteRepository.save(esporteSalvo);
    }

    private EsporteEntities validarEsporteExiste(int id) {
        Optional<EsporteEntities> esporte = buscarPorId(id);
        if(esporte.isEmpty()) {
            throw new EmptyResultDataAccessException(1);
        }
        return esporte.get();
    }

    public void deletar(int id) {
        esporteRepository.deleteById(id);
    }
}
