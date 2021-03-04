package com.examen.concredito.entidades;

import java.io.Serializable;

/**
 * 
 * @author jrios
 *
 */
public class CancionEntity implements Serializable {

	private static final long serialVersionUID = 3341738679721235338L;
	private String autor;
	private String titulo;
	private String fecha;
	private String ruta;

	public CancionEntity(String autor, String titulo, String fecha, String ruta) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.fecha = fecha;
		this.ruta = ruta;
	}

	public CancionEntity() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((ruta == null) ? 0 : ruta.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		CancionEntity other = (CancionEntity) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (ruta == null) {
			if (other.ruta != null)
				return false;
		} else if (!ruta.equals(other.ruta))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
