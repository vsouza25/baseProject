package br.com.baseProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Escola {
	
	 	@Id
	    @GeneratedValue
	    private Long id;
	 	
	    private String nome;
}
