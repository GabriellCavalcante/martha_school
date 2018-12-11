package com.project.martha_school.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aluno_pre_matriculado")
public class AlunoPreMatriculado extends Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private Date dataPreMatricula;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getDataPreMatricula() {
		return dataPreMatricula;
	}
	public void setDataPreMatricula(Date dataPreMatricula) {
		this.dataPreMatricula = dataPreMatricula;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoPreMatriculado other = (AlunoPreMatriculado) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	
	

}
