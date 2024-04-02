package com.SportsMeet.Sports.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import com.SportsMeet.Sports.Entities.EnderecoEntities;
import com.SportsMeet.Sports.Repository.EnderecoRepository;

@Service

public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public List<EnderecoEntities> listarTodas(){
			
		return enderecoRepository .findAll();
	}
	
	public Optional<EnderecoEntities> buscarPorId(Integer id){
		
		return enderecoRepository .findById(id);
	}
	
	public EnderecoEntities salvar (EnderecoEntities endereco) {
		
		return enderecoRepository.save(endereco);
	}
	
	public EnderecoEntities atualizar (int id, EnderecoEntities endereco) {
		
		EnderecoEntities enderecoSalvar = validarEnderecoExiste(id);
		BeanUtils.copyProperties(endereco, enderecoSalvar, "id");
		return enderecoRepository.save(enderecoSalvar);
	}

	private EnderecoEntities validarEnderecoExiste(int id) {
		Optional<EnderecoEntities> endereco = buscarPorId(id);
		if(endereco.isEmpty()) {
			throw new EmptyResultDataAccessException(1);
		}
		return endereco.get();
	}
	
	public void deletar (int id) {
		
		enderecoRepository.deleteById(id);
	}

	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}

}
