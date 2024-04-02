package com.SportsMeet.Sports.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.SportsMeet.Sports.Entities.CadastroEntities;
import com.SportsMeet.Sports.Repository.CadastroRepository;

@Service
public class CadastroService {

	@Autowired
	private CadastroRepository cadastroRepository;
	
	public List<CadastroEntities> listarTodas(){
			
		return cadastroRepository .findAll();
	}
	
	public Optional<CadastroEntities> buscarPorId(Integer id){
		
		return cadastroRepository .findById(id);
	}
	
	public CadastroEntities salvar (CadastroEntities cadastro) {
		
		return cadastroRepository.save(cadastro);
	}
	
	public CadastroEntities atualizar (int id, CadastroEntities cadastro) {
		
		CadastroEntities cadastroSalvar = validarCadastroExiste(id);
		BeanUtils.copyProperties(cadastro, cadastroSalvar, "id");
		return cadastroRepository.save(cadastroSalvar);
	}

	private CadastroEntities validarCadastroExiste(int id) {
		Optional<CadastroEntities> cadastro = buscarPorId(id);
		if(cadastro.isEmpty()) {
			throw new EmptyResultDataAccessException(1);
		}
		return cadastro.get();
	}
	
	public void deletar (int id) {
		
		cadastroRepository.deleteById(id);
	}

	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}
}
