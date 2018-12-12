package com.project.martha_school.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 4010380594717068057L;

	
	private String matricula;

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
}
