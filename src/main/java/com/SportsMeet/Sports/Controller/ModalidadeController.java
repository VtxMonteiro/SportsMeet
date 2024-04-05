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

import com.SportsMeet.Sports.Entities.ModalidadeEntities;
import com.SportsMeet.Sports.Service.ModalidadeService;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping("/modalidades")
public class ModalidadeController {

    @Autowired
    private ModalidadeService modalidadeService;

    @GetMapping
    public List<ModalidadeEntities> listarTodos(){
        return modalidadeService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ModalidadeEntities>> buscarPorId(@PathVariable int id){
        Optional<ModalidadeEntities> modalidade = modalidadeService.buscarPorId(id);
        return modalidade.isPresent() ? ResponseEntity.ok(modalidade) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<ModalidadeEntities> salvar(@RequestBody ModalidadeEntities modalidade){
        return ResponseEntity.status(HttpStatus.CREATED).body(modalidadeService.salvar(modalidade));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ModalidadeEntities> atualizar(@PathVariable int id, @RequestBody ModalidadeEntities modalidade){
        return ResponseEntity.ok(modalidadeService.atualizar(id, modalidade));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable int id) {
        modalidadeService.deletar(id);
    }
}
