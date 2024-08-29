package entities;

import java.util.Date;

import enums.TipoContratacao;

public class Funcionario extends Pessoa {

	private String matricula;
	private Date dataAdmissao;
	private TipoContratacao tipo;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public TipoContratacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoContratacao tipo) {
		this.tipo = tipo;
	}
	
	

}
