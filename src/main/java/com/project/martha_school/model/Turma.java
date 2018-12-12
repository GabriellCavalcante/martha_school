package com.project.martha_school.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "turma")
public class Turma implements Serializable {

	private static final long serialVersionUID = 2323933119984373890L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;

	private String modulo;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_inicio")
	private Date dataInicio;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_termino")
	private Date dataTermino;
	
	@Column(name = "quantidade_alunos")
	private int quantidaAlunos;
	
	@Transient
	private int contadorAluno;
	
	@OneToMany
	@JoinColumn(name = "codigo_turma")
	private List<AlunoMatriculado> alunoMatriculado;
	
	@OneToMany
	@JoinColumn(name = "codigo_turma")
	private List<AgendamentoAulaPerdida> agendamentoAulaPerdida;

	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

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

	public int getQuantidaAlunos() {
		return quantidaAlunos;
	}

	public void setQuantidaAlunos(int quantidaAlunos) {
		this.quantidaAlunos = quantidaAlunos;
	}

	public int getContadorAluno() {
		return contadorAluno;
	}

	public void setContadorAluno(int contadorAluno) {
		this.contadorAluno = contadorAluno;
	}

	public List<AlunoMatriculado> getAlunoMatriculado() {
		return alunoMatriculado;
	}

	public void setAlunoMatriculado(List<AlunoMatriculado> alunoMatriculado) {
		this.alunoMatriculado = alunoMatriculado;
	}

	public List<AgendamentoAulaPerdida> getAgendamentoAulaPerdida() {
		return agendamentoAulaPerdida;
	}

	public void setAgendamentoAulaPerdida(List<AgendamentoAulaPerdida> agendamentoAulaPerdida) {
		this.agendamentoAulaPerdida = agendamentoAulaPerdida;
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
