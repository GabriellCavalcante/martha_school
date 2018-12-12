package com.project.martha_school.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "agendamento_aula_perdida")
public class AgendamentoAulaPerdida implements Serializable {
	
	private static final long serialVersionUID = -8601539003400678617L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo; 
	
	
	@OneToOne
	@JoinColumn(name = "codigo_disciplina")
	private Disciplina aulaARepor;
	
	private String local;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_aula")
	private Date dataAula;
	
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	}
	
	
	

