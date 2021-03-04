package com.examen.concredito.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;
/**
 * 
 * @author jrios
 *
 */
@NamedNativeQueries({
		@NamedNativeQuery(name = "PRO_GET_ALL_CURSOS", query = "CALL PRO_GET_ALL_CURSOS()", resultClass = CursoEntity.class) })

@Entity
@Table(name = "cursos", catalog = "escuela")
public class CursoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7981286149130840564L;

	@Id
	@Column(name = "idcurso")
	private Integer idcurso;

	@Column(name = "descripcion")
	private String descripcion;

	@OneToOne
	@JoinColumn(name = "idmaestro")
	private MaestroEntity idmaestro;

	public CursoEntity() {
		super();
		idmaestro = new MaestroEntity();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((idcurso == null) ? 0 : idcurso.hashCode());
		result = prime * result + ((idmaestro == null) ? 0 : idmaestro.hashCode());
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
		CursoEntity other = (CursoEntity) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idcurso == null) {
			if (other.idcurso != null)
				return false;
		} else if (!idcurso.equals(other.idcurso))
			return false;
		if (idmaestro == null) {
			if (other.idmaestro != null)
				return false;
		} else if (!idmaestro.equals(other.idmaestro))
			return false;
		return true;
	}

	public Integer getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public MaestroEntity getIdmaestro() {
		return idmaestro;
	}

	public void setIdmaestro(MaestroEntity idmaestro) {
		this.idmaestro = idmaestro;
	}
}
