package com.SportsMeet.Sports.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.SportsMeet.Sports.Entities.UsuarioEntities;
import com.SportsMeet.Sports.Repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<UsuarioEntities> listarTodas(){
			
		return usuarioRepository.findAll();
	}
	
	public Optional<UsuarioEntities> buscarPorId(Integer id){
		
		return usuarioRepository.findById(id);
	}
	
	public UsuarioEntities salvar (UsuarioEntities cadastro) {
		
		return usuarioRepository.save(cadastro);
	}
	
	public UsuarioEntities atualizar (int id, UsuarioEntities cadastro) {
		
		UsuarioEntities cadastroSalvar = validarCadastroExiste(id);
		BeanUtils.copyProperties(cadastro, cadastroSalvar, "id");
		return usuarioRepository.save(cadastroSalvar);
	}

	private UsuarioEntities validarCadastroExiste(int id) {
		Optional<UsuarioEntities> cadastro = buscarPorId(id);
		if(cadastro.isEmpty()) {
			throw new EmptyResultDataAccessException(1);
		}
		return cadastro.get();
	}
	
	public void deletar (int id) {
		
		usuarioRepository.deleteById(id);
	}

	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}
}
