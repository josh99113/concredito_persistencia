package com.examen.concredito.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author jrios
 *
 */
@Entity
@Table(name = "maestros", catalog = "escuela")
public class MaestroEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7732887457706206531L;

	@Id
	@Column(name = "idmaestro")
	private Integer idmaestro;

	@Column(name = "nombres")
	private String nombres;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idmaestro == null) ? 0 : idmaestro.hashCode());
		result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
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
		MaestroEntity other = (MaestroEntity) obj;
		if (idmaestro == null) {
			if (other.idmaestro != null)
				return false;
		} else if (!idmaestro.equals(other.idmaestro))
			return false;
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		return true;
	}

	public Integer getIdmaestro() {
		return idmaestro;
	}

	public void setIdmaestro(Integer idmaestro) {
		this.idmaestro = idmaestro;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
}
