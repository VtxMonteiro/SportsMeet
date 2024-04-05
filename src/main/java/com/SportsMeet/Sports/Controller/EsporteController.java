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

import com.SportsMeet.Sports.Entities.EsporteEntities;
import com.SportsMeet.Sports.Service.EsporteService;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping("/esportes")
public class EsporteController {

    @Autowired
    private EsporteService esporteService;

    @GetMapping
    public List<EsporteEntities> listarTodos(){
        return esporteService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<EsporteEntities>> buscarPorId(@PathVariable int id){
        Optional<EsporteEntities> esporte = esporteService.buscarPorId(id);
        return esporte.isPresent() ? ResponseEntity.ok(esporte) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<EsporteEntities> salvar(@RequestBody EsporteEntities esporte){
        return ResponseEntity.status(HttpStatus.CREATED).body(esporteService.salvar(esporte));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EsporteEntities> atualizar(@PathVariable int id, @RequestBody EsporteEntities esporte){
        return ResponseEntity.ok(esporteService.atualizar(id, esporte));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable int id) {
        esporteService.deletar(id);
    }
}
