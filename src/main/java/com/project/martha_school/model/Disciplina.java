package com.project.martha_school.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "disciplina")

public class Disciplina implements Serializable {
	
	private static final long serialVersionUID = 2706181505743827375L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	private String nome;
	
	private double nota1;
	
	private double nota2;
	
	private double media;
	
	@OneToOne
	@JoinColumn(name = "codigo_professor")
	private Professor professor;
	
	@OneToMany
	@JoinColumn(name = "codigo_disciplina")
	private List<AlunoMatriculado> alunoMatriculado;
	
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public List<AlunoMatriculado> getAlunoMatriculado() {
		return alunoMatriculado;
	}
	public void setAlunoMatriculado(List<AlunoMatriculado> alunoMatriculado) {
		this.alunoMatriculado = alunoMatriculado;
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
		Disciplina other = (Disciplina) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	
	
}
