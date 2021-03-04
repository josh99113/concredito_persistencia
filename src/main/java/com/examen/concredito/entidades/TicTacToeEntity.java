package com.examen.concredito.entidades;

/**
 * 
 * @author jrios
 *
 */
public class TicTacToeEntity {
	private boolean asignado;
	private String marca;
	private String url;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isAsignado() {
		return asignado;
	}

	public void setAsignado(boolean asignado) {
		this.asignado = asignado;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
