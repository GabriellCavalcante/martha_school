package com.project.martha_school.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "aluno_matriculado")
public class AlunoMatriculado extends Pessoa implements Serializable {
	
	
	private static final long serialVersionUID = -2684184303207467575L;
	
	private String foto;
	
	private String Matricula;
	
	private boolean matriculado;
	
	private boolean desistencia;
	
	@Column(name = "responsavel_pela_notificacao")
	private String responsavelPelaNotificacao;
	
	@Column(name = "motivo_desistencia")
	private String motivoDesistencia;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_matricula")
	private Date dataMatricula;
		
	
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
	public String getResponsavelPelaNotificacao() {
		return responsavelPelaNotificacao;
	}
	public void setResponsavelPelaNotificacao(String responsavelPelaNotificacao) {
		this.responsavelPelaNotificacao = responsavelPelaNotificacao;
	}
	public String getMotivoDesistencia() {
		return motivoDesistencia;
	}
	public void setMotivoDesistencia(String motivoDesistencia) {
		this.motivoDesistencia = motivoDesistencia;
	}
	public Date getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	
}
