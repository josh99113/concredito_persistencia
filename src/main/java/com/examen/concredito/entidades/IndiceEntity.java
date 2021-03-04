package com.examen.concredito.entidades;

import java.util.List;

/**
 * 
 * @author jrios
 *
 */
public class IndiceEntity {
	private String indice;
	private List<TicTacToeEntity> listaPosiciones;

	public IndiceEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IndiceEntity(String indice, List<TicTacToeEntity> listaPosiciones) {
		super();
		this.indice = indice;
		this.listaPosiciones = listaPosiciones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((indice == null) ? 0 : indice.hashCode());
		result = prime * result + ((listaPosiciones == null) ? 0 : listaPosiciones.hashCode());
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
		IndiceEntity other = (IndiceEntity) obj;
		if (indice == null) {
			if (other.indice != null)
				return false;
		} else if (!indice.equals(other.indice))
			return false;
		if (listaPosiciones == null) {
			if (other.listaPosiciones != null)
				return false;
		} else if (!listaPosiciones.equals(other.listaPosiciones))
			return false;
		return true;
	}

	public String getIndice() {
		return indice;
	}

	public void setIndice(String indice) {
		this.indice = indice;
	}

	public List<TicTacToeEntity> getListaPosiciones() {
		return listaPosiciones;
	}

	public void setListaPosiciones(List<TicTacToeEntity> listaPosiciones) {
		this.listaPosiciones = listaPosiciones;
	}
}
