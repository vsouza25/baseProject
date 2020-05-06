package br.com.baseProject.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.baseProject.entity.Escola;
import br.com.baseProject.repository.EscolaRepository;
import br.com.baseProject.service.EscolaService;

@Service
public class EscolaServiceImpl implements EscolaService{

	@Autowired
	private EscolaRepository escolaRepository;
	
	@Override
	public List<Escola> listarTodos() {
		return escolaRepository.findAll();
	}

	@Override
	public Optional<Escola> listarPorId(Long id) {
		return escolaRepository.findById(id);
	}

}
