package com.SportsMeet.Sports.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.SportsMeet.Sports.Entities.InfoEventoEntities;
import com.SportsMeet.Sports.Repository.InfoEventoRepository;

@Service

public class InfoEventoService {
	
	@Autowired
    private InfoEventoRepository infoeventoRepository;

    public List<InfoEventoEntities> listarTodos(){
        return infoeventoRepository.findAll();
    }

    public Optional<InfoEventoEntities> buscarPorId(int id){
        return infoeventoRepository.findById(id);
    }

    public InfoEventoEntities salvar(InfoEventoEntities infoevento) {
        return infoeventoRepository.save(infoevento);
    }

    public InfoEventoEntities atualizar(int id, InfoEventoEntities infoevento) {
        InfoEventoEntities infoeventoSalvo = validarInfoEventoExiste(id);
        BeanUtils.copyProperties(infoevento, infoeventoSalvo, "id");
        return infoeventoRepository.save(infoeventoSalvo);
    }

    private InfoEventoEntities validarInfoEventoExiste(int id) {
        Optional<InfoEventoEntities> infoevento = buscarPorId(id);
        if(infoevento.isEmpty()) {
            throw new EmptyResultDataAccessException(1);
        }
        return infoevento.get();
    }

    public void deletar(int id) {
        infoeventoRepository.deleteById(id);
    }

}
