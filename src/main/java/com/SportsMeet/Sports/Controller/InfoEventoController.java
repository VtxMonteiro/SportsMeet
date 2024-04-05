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

import com.SportsMeet.Sports.Entities.InfoEventoEntities;
import com.SportsMeet.Sports.Service.InfoEventoService;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")

@RequestMapping("/infoEventos")

public class InfoEventoController {
	
	 @Autowired
	    private InfoEventoService infoeventoService;

	    @GetMapping
	    public List<InfoEventoEntities> listarTodos(){
	        return infoeventoService.listarTodos();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Optional<InfoEventoEntities>> buscarPorId(@PathVariable int id){
	        Optional<InfoEventoEntities> infoevento = infoeventoService.buscarPorId(id);
	        return infoevento.isPresent() ? ResponseEntity.ok(infoevento) : ResponseEntity.notFound().build();
	    }

	    @PostMapping
	    public ResponseEntity<InfoEventoEntities> salvar(@RequestBody InfoEventoEntities infoevento){
	        return ResponseEntity.status(HttpStatus.CREATED).body(infoeventoService.salvar(infoevento));
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<InfoEventoEntities> atualizar(@PathVariable int id, @RequestBody InfoEventoEntities infoevento){
	        return ResponseEntity.ok(infoeventoService.atualizar(id, infoevento));
	    }

	    @DeleteMapping("/{id}")
	    @ResponseStatus(HttpStatus.NO_CONTENT)
	    public void deletar(@PathVariable int id) {
	        infoeventoService.deletar(id);
	    }

}
