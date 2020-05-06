package br.com.baseProject.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.baseProject.entity.Escola;
import br.com.baseProject.service.EscolaService;

@RestController
@RequestMapping(path="/api/escola")
@CrossOrigin(origins = "*")
public class EscolaController {
	
	@Autowired
	private EscolaService escolaService;
	
	@GetMapping(path="/list")
	public String listaEscola() {
		return "hello world API Ana Carolina";
	}
	
	
	@GetMapping(path="/all")
	public List<Escola> listaTodasEscola() {
		return escolaService.listarTodos();
	}

	
	@GetMapping(path="/search/{id}")
	public Optional<Escola> listaTodasEscola(@PathVariable(name = "id") Long id) {
		return escolaService.listarPorId(id);
	}
}
