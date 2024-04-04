package com.SportsMeet.Sports.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.SportsMeet.Sports.Entities.EventoEntities;
import com.SportsMeet.Sports.Repository.EventoRepository;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public List<EventoEntities> listarTodos(){
        return eventoRepository.findAll();
    }

    public Optional<EventoEntities> buscarPorId(int id){
        return eventoRepository.findById(id);
    }

    public EventoEntities salvar(EventoEntities evento) {
        return eventoRepository.save(evento);
    }

    public EventoEntities atualizar(int id, EventoEntities evento) {
        EventoEntities eventoSalvo = validarEventoExiste(id);
        BeanUtils.copyProperties(evento, eventoSalvo, "id");
        return eventoRepository.save(eventoSalvo);
    }

    private EventoEntities validarEventoExiste(int id) {
        Optional<EventoEntities> evento = buscarPorId(id);
        if(evento.isEmpty()) {
            throw new EmptyResultDataAccessException(1);
        }
        return evento.get();
    }

    public void deletar(int id) {
        eventoRepository.deleteById(id);
    }
}
