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

import com.SportsMeet.Sports.Entities.CadastroEntities;
import com.SportsMeet.Sports.Service.CadastroService;

@RestController

@CrossOrigin(origins = "http://localhost:5173/")

@RequestMapping("/Cadastro")

public class CadastroController {

	@Autowired
	private CadastroService cadastroService;
	
	@GetMapping
	public List<CadastroEntities> listarTodas(){
		
		return cadastroService.listarTodas();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<CadastroEntities>> buscarPorId( @PathVariable Integer id){
		
		Optional<CadastroEntities> cadastro = cadastroService.buscarPorId(id);
		
		return cadastroService.isPresent() ? ResponseEntity.ok(cadastro): ResponseEntity.notFound().build();
		}
	
	@PostMapping
	public ResponseEntity<CadastroEntities> salvar (@RequestBody CadastroEntities cadastro){

		return ResponseEntity.status(HttpStatus.CREATED).body(cadastroService.salvar(cadastro));
	}
	
	@PutMapping ("/{id}")
	public ResponseEntity<CadastroEntities> atualizar (@PathVariable int id, @RequestBody CadastroEntities cadastro){
		
		return ResponseEntity.ok(cadastroService.atualizar(id, cadastro));
	}
	@DeleteMapping ("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		cadastroService.deletar(id);
		
	}
}
