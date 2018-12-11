package com.project.martha_school.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	private String modulo;
	
	private Date dataInicio;
	
	private Date dataTermino;
	
	private int quantidadeAlunos;
	
	private int contadorAluno;
	
	@OneToMany
	private List<AlunoMatriculado> AlunoMatriculado;

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
	 	this.modulo = modulo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public int getContadorAluno() {
		return contadorAluno;
	}

	public void setContadorAluno(int contadorAluno) {
		this.contadorAluno = contadorAluno;
	}
	
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public List<AlunoMatriculado> getAlunoMatriculado() {
		return AlunoMatriculado;
	}

	public void setAlunoMatriculado(List<AlunoMatriculado> alunoMatriculado) {
		AlunoMatriculado = alunoMatriculado;
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
		Turma other = (Turma) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	

}
