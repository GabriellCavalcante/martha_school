package com.project.martha_school.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "agendamento_aula_perdida")
public class AgendamentoAulaPerdida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo; 
	
	@ManyToOne
	private Turma turma;
	
	@OneToOne
	private Disciplina aulaARepor;
	
	private String local;
	
	private Date dataAula;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public Disciplina getAulaARepor() {
		return aulaARepor;
	}
	public void setAulaARepor(Disciplina aulaARepor) {
		this.aulaARepor = aulaARepor;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Date getDataAula() {
		return dataAula;
	}
	public void setDataAula(Date dataAula) {
		this.dataAula = dataAula;
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
		AgendamentoAulaPerdida other = (AgendamentoAulaPerdida) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	
	
}
