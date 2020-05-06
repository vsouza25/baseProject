package br.com.baseProject.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.baseProject.entity.Escola;

@Transactional
public interface EscolaRepository extends JpaRepository<Escola, Long> {

}
