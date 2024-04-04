package com.SportsMeet.Sports.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.SportsMeet.Sports.Entities.ModalidadeEntities;
import com.SportsMeet.Sports.Repository.ModalidadeRepository;

@Service
public class ModalidadeService {

    @Autowired
    private ModalidadeRepository modalidadeRepository;

    public List<ModalidadeEntities> listarTodos(){
        return modalidadeRepository.findAll();
    }

    public Optional<ModalidadeEntities> buscarPorId(int id){
        return modalidadeRepository.findById(id);
    }

    public ModalidadeEntities salvar(ModalidadeEntities modalidade) {
        return modalidadeRepository.save(modalidade);
    }

    public ModalidadeEntities atualizar(int id, ModalidadeEntities modalidade) {
        ModalidadeEntities modalidadeSalva = validarModalidadeExiste(id);
        BeanUtils.copyProperties(modalidade, modalidadeSalva, "id");
        return modalidadeRepository.save(modalidadeSalva);
    }

    private ModalidadeEntities validarModalidadeExiste(int id) {
        Optional<ModalidadeEntities> modalidade = buscarPorId(id);
        if(modalidade.isEmpty()) {
            throw new EmptyResultDataAccessException(1);
        }
        return modalidade.get();
    }

    public void deletar(int id) {
        modalidadeRepository.deleteById(id);
    }
}
