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

import com.SportsMeet.Sports.Entities.UsuarioEntities;
import com.SportsMeet.Sports.Service.UsuarioService;

@RestController

@CrossOrigin(origins = "http://localhost:5173/")

@RequestMapping("/usuarios")

public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<UsuarioEntities> listarTodas(){
		
		return usuarioService.listarTodas();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<UsuarioEntities>> buscarPorId(@PathVariable Integer id){
		
		Optional<UsuarioEntities> usuario = usuarioService.buscarPorId(id);
		
		return usuarioService.isPresent() ? ResponseEntity.ok(usuario): ResponseEntity.notFound().build();
		}
	
	@PostMapping
	public ResponseEntity<UsuarioEntities> salvar (@RequestBody UsuarioEntities cadastro){

		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.salvar(cadastro));
	}
	
	@PutMapping ("/{id}")
	public ResponseEntity<UsuarioEntities> atualizar (@PathVariable int id, @RequestBody UsuarioEntities cadastro){
		
		return ResponseEntity.ok(usuarioService.atualizar(id, cadastro));
	}
	@DeleteMapping ("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		usuarioService.deletar(id);
		
	}
}
