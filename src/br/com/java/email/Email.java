package br.com.java.email;

import java.io.Serializable;

public class Email implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String para;
	
	private String corpo;
	
	private String de;
	
	private String titulo;
	
	private String senha;

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String toString() {
		return "Email [para=" + para + ", corpo="+ corpo + 
			", de="+ de +", titulo="+ titulo +", senha=" + 
				senha + "]";
	}
}