package com.SportsMeet.Sports.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.SportsMeet.Sports.Entities.PagamentoEntities;
import com.SportsMeet.Sports.Repository.PagamentoRepository;

@Service

public class PagamentoService {
	
	@Autowired
	private PagamentoRepository pagamentoRepository;
	
	public List<PagamentoEntities> listarTodas(){
			
		return pagamentoRepository .findAll();
	}
	
	public Optional<PagamentoEntities> buscarPorId(Integer id){
		
		return pagamentoRepository .findById(id);
	}
	
	public PagamentoEntities salvar (PagamentoEntities pagamento) {
		
		return pagamentoRepository.save(pagamento);
	}
	
	public PagamentoEntities atualizar (int id, PagamentoEntities pagamento) {
		
		PagamentoEntities pagamentoSalvar = validarPagamentoExiste(id);
		BeanUtils.copyProperties(pagamento, pagamentoSalvar, "id");
		return pagamentoRepository.save(pagamentoSalvar);
	}

	private PagamentoEntities validarPagamentoExiste(int id) {
		Optional<PagamentoEntities> pagamento = buscarPorId(id);
		if(pagamento.isEmpty()) {
			throw new EmptyResultDataAccessException(1);
		}
		return pagamento.get();
	}
	
	public void deletar (int id) {
		
		pagamentoRepository.deleteById(id);
	}

	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}

}
