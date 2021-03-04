package com.examen.concredito.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;;

/**
 * 
 * @author jrios
 *
 */
@Entity
@Table(name = "estudiantes", catalog = "escuela")
public class EstudianteEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6620509767757236263L;

	@Id
	@Column(name = "idestudiante")
	private String idestudiante;

	@Column(name = "nombres")
	private String nombres;

	@Column(name = "apellido_paterno")
	private String apellido_paterno;

	@Column(name = "apellido_materno")
	private String apellido_materno;

	@Column(name = "fechaingreso")
	private Date fechaingreso;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido_materno == null) ? 0 : apellido_materno.hashCode());
		result = prime * result + ((apellido_paterno == null) ? 0 : apellido_paterno.hashCode());
		result = prime * result + ((fechaingreso == null) ? 0 : fechaingreso.hashCode());
		result = prime * result + ((idestudiante == null) ? 0 : idestudiante.hashCode());
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
		EstudianteEntity other = (EstudianteEntity) obj;
		if (apellido_materno == null) {
			if (other.apellido_materno != null)
				return false;
		} else if (!apellido_materno.equals(other.apellido_materno))
			return false;
		if (apellido_paterno == null) {
			if (other.apellido_paterno != null)
				return false;
		} else if (!apellido_paterno.equals(other.apellido_paterno))
			return false;
		if (fechaingreso == null) {
			if (other.fechaingreso != null)
				return false;
		} else if (!fechaingreso.equals(other.fechaingreso))
			return false;
		if (idestudiante == null) {
			if (other.idestudiante != null)
				return false;
		} else if (!idestudiante.equals(other.idestudiante))
			return false;
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		return true;
	}

	public String getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(String idestudiante) {
		this.idestudiante = idestudiante;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public Date getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public String obtenerNombreCompleto() {
		return nombres + " " + apellido_paterno + " " + apellido_materno;
	}
}
