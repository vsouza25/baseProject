package br.com.baseProject.service;

import java.util.List;
import java.util.Optional;

import br.com.baseProject.entity.Escola;

public interface EscolaService {
	
	List<Escola> listarTodos();
	Optional<Escola> listarPorId(Long id);
}
