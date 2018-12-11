package com.project.martha_school.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aluno_matriculado")
public class AlunoMatriculado extends Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	private String foto;
	
	private String Matricula;
	
	private boolean matriculado;
	
	private boolean desistencia;
	
	private String responsavelNotificacao;
	
	private String motivoDesestencia;
	
	private Date dataMatricula;
	
	@ManyToOne
	private Turma turma;
	
	@OneToMany
	private List<Disciplina> disciplina;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public boolean isMatriculado() {
		return matriculado;
	}
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}
	public boolean isDesistencia() {
		return desistencia;
	}
	public void setDesistencia(boolean desistencia) {
		this.desistencia = desistencia;
	}
	public String getResponsavelNotificacao() {
		return responsavelNotificacao;
	}
	public void setResponsavelNotificacao(String responsavelNotificacao) {
		this.responsavelNotificacao = responsavelNotificacao;
	}
	public String getMotivoDesestencia() {
		return motivoDesestencia;
	}
	public void setMotivoDesestencia(String motivoDesestencia) {
		this.motivoDesestencia = motivoDesestencia;
	}
	public Date getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public List<Disciplina> getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
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
		AlunoMatriculado other = (AlunoMatriculado) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	
	
	
}
