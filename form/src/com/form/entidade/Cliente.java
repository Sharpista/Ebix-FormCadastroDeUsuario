package com.form.entidade;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;

import com.form.controller.ClienteServlet;

public class   Cliente {

	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private String [] seguros;
	private String correntista;
	private String [] diasVisita;

	public Cliente(String nome, String cpf, String rg, String sexo, String[] seguros, String correntista,
			String[] diasVisita) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.seguros = seguros;
		this.correntista = correntista;
		this.diasVisita = diasVisita;
	}
	

	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String[] getSeguros() {
		return seguros;
	}

	public void setSeguros(String[] seguros) {
		this.seguros = seguros;
	}

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public String[] getDiasVisita() {
		return diasVisita;
	}

	public void setDiasVisita(String[] diasVisita) {
		this.diasVisita = diasVisita;
	}

}
