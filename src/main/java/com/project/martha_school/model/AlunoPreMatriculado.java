package com.project.martha_school.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "aluno_pre_matriculado")
public class AlunoPreMatriculado extends Pessoa implements Serializable {
	

	private static final long serialVersionUID = -1137152118249385179L;

	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_pre_matricula")
	private Date dataPreMatricula;
	
	

	public Date getDataPreMatricula() {
		return dataPreMatricula;
	}
	public void setDataPreMatricula(Date dataPreMatricula) {
		this.dataPreMatricula = dataPreMatricula;
	}
	

}
