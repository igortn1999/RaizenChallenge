package com.app.raizen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="Model", schema="public")
public class Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nome")
	private String nome;
	
	public Model() {
		
	}
	
	public Model(String nome) {
		super();
		this.nome=nome;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.nome;
	}
}
