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

import com.SportsMeet.Sports.Entities.EnderecoEntities;
import com.SportsMeet.Sports.Service.EnderecoService;

@RestController

@CrossOrigin(origins = "http://localhost:5173/")

@RequestMapping("/Endereco")

public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping
	public List<EnderecoEntities> listarTodas(){
		
		return enderecoService.listarTodas();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<EnderecoEntities>> buscarPorId( @PathVariable Integer id){
		
		Optional<EnderecoEntities> endereco = enderecoService.buscarPorId(id);
		
		return enderecoService.isPresent() ? ResponseEntity.ok(endereco): ResponseEntity.notFound().build();
		}
	
	@PostMapping
	public ResponseEntity<EnderecoEntities> salvar (@RequestBody EnderecoEntities endereco){

		return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.salvar(endereco));
	}
	
	@PutMapping ("/{id}")
	public ResponseEntity<EnderecoEntities> atualizar (@PathVariable int id, @RequestBody EnderecoEntities endereco){
		
		return ResponseEntity.ok(enderecoService.atualizar(id, endereco));
	}
	@DeleteMapping ("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		enderecoService.deletar(id);
		
	}

}
