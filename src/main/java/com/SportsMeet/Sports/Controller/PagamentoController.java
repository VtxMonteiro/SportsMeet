package com.SportsMeet.Sports.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.SportsMeet.Sports.Entities.PagamentoEntities;
import com.SportsMeet.Sports.Service.PagamentoService;

@RestController

@CrossOrigin(origins = "http://localhost:5173/")

@RequestMapping("/Pagamento")

public class PagamentoController {
	
	@Autowired
	private PagamentoService pagamentoService;
	
	@GetMapping
	public List<PagamentoEntities> listarTodas(){
		
		return pagamentoService.listarTodas();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<PagamentoEntities>> buscarPorId( @PathVariable Integer id){
		
		Optional<PagamentoEntities> pagamento = pagamentoService.buscarPorId(id);
		
		return pagamentoService.isPresent() ? ResponseEntity.ok(pagamento): ResponseEntity.notFound().build();
		}
	
	@PostMapping
	public ResponseEntity<PagamentoEntities> salvar (@RequestBody PagamentoEntities pagamento){

		return ResponseEntity.status(HttpStatus.CREATED).body(pagamentoService.salvar(pagamento));
	}
	
	@PutMapping ("/{id}")
	public ResponseEntity<PagamentoEntities> atualizar (@PathVariable int id, @RequestBody PagamentoEntities pagamento){
		
		return ResponseEntity.ok(pagamentoService.atualizar(id, pagamento));
	}
	@DeleteMapping ("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		pagamentoService.deletar(id);
		
	}

}
