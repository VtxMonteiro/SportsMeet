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

import com.SportsMeet.Sports.Entities.EventoEntities;
import com.SportsMeet.Sports.Service.EventoService;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping("/Evento")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping
    public List<EventoEntities> listarTodos(){
        return eventoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<EventoEntities>> buscarPorId(@PathVariable int id){
        Optional<EventoEntities> evento = eventoService.buscarPorId(id);
        return evento.isPresent() ? ResponseEntity.ok(evento) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<EventoEntities> salvar(@RequestBody EventoEntities evento){
        return ResponseEntity.status(HttpStatus.CREATED).body(eventoService.salvar(evento));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventoEntities> atualizar(@PathVariable int id, @RequestBody EventoEntities evento){
        return ResponseEntity.ok(eventoService.atualizar(id, evento));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable int id) {
        eventoService.deletar(id);
    }
}
