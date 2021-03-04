package com.examen.concredito.entidades;

import java.io.Serializable;
import java.math.BigDecimal;

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
		@NamedNativeQuery(name = "PRO_GET_ALL_CALIFICACIONES", query = "CALL PRO_GET_ALL_CALIFICACIONES(?)", resultClass = CalificacionEntity.class) })

@Entity
@Table(name = "calificaciones", catalog = "escuela")
public class CalificacionEntity implements Serializable {

	private static final long serialVersionUID = -157315820718127553L;

	@Id
	@Column(name = "idcalificacion")
	private Integer idcalificacion;

	@OneToOne
	@JoinColumn(name = "idcurso")
	private CursoEntity idcurso;

	@OneToOne
	@JoinColumn(name = "idestudiante")
	private EstudianteEntity idestudiante;

	@Column(name = "calificacion_parcial1")
	private BigDecimal calificacion_parcial1;

	@Column(name = "calificacion_parcial2")
	private BigDecimal calificacion_parcial2;

	@Column(name = "calificacion_parcial3")
	private BigDecimal calificacion_parcial3;

	@Column(name = "promedio")
	private BigDecimal promedio;

	public CalificacionEntity() {
		super();
		// TODO Auto-generated constructor stub
		idestudiante = new EstudianteEntity();
		idcurso = new CursoEntity();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calificacion_parcial1 == null) ? 0 : calificacion_parcial1.hashCode());
		result = prime * result + ((calificacion_parcial2 == null) ? 0 : calificacion_parcial2.hashCode());
		result = prime * result + ((calificacion_parcial3 == null) ? 0 : calificacion_parcial3.hashCode());
		result = prime * result + ((idcalificacion == null) ? 0 : idcalificacion.hashCode());
		result = prime * result + ((idcurso == null) ? 0 : idcurso.hashCode());
		result = prime * result + ((idestudiante == null) ? 0 : idestudiante.hashCode());
		result = prime * result + ((promedio == null) ? 0 : promedio.hashCode());
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
		CalificacionEntity other = (CalificacionEntity) obj;
		if (calificacion_parcial1 == null) {
			if (other.calificacion_parcial1 != null)
				return false;
		} else if (!calificacion_parcial1.equals(other.calificacion_parcial1))
			return false;
		if (calificacion_parcial2 == null) {
			if (other.calificacion_parcial2 != null)
				return false;
		} else if (!calificacion_parcial2.equals(other.calificacion_parcial2))
			return false;
		if (calificacion_parcial3 == null) {
			if (other.calificacion_parcial3 != null)
				return false;
		} else if (!calificacion_parcial3.equals(other.calificacion_parcial3))
			return false;
		if (idcalificacion == null) {
			if (other.idcalificacion != null)
				return false;
		} else if (!idcalificacion.equals(other.idcalificacion))
			return false;
		if (idcurso == null) {
			if (other.idcurso != null)
				return false;
		} else if (!idcurso.equals(other.idcurso))
			return false;
		if (idestudiante == null) {
			if (other.idestudiante != null)
				return false;
		} else if (!idestudiante.equals(other.idestudiante))
			return false;
		if (promedio == null) {
			if (other.promedio != null)
				return false;
		} else if (!promedio.equals(other.promedio))
			return false;
		return true;
	}

	public Integer getIdcalificacion() {
		return idcalificacion;
	}

	public void setIdcalificacion(Integer idcalificacion) {
		this.idcalificacion = idcalificacion;
	}

	public CursoEntity getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(CursoEntity idcurso) {
		this.idcurso = idcurso;
	}

	public EstudianteEntity getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(EstudianteEntity idestudiante) {
		this.idestudiante = idestudiante;
	}

	public BigDecimal getCalificacion_parcial1() {
		return calificacion_parcial1;
	}

	public void setCalificacion_parcial1(BigDecimal calificacion_parcial1) {
		this.calificacion_parcial1 = calificacion_parcial1;
	}

	public BigDecimal getCalificacion_parcial2() {
		return calificacion_parcial2;
	}

	public void setCalificacion_parcial2(BigDecimal calificacion_parcial2) {
		this.calificacion_parcial2 = calificacion_parcial2;
	}

	public BigDecimal getCalificacion_parcial3() {
		return calificacion_parcial3;
	}

	public void setCalificacion_parcial3(BigDecimal calificacion_parcial3) {
		this.calificacion_parcial3 = calificacion_parcial3;
	}

	public BigDecimal getPromedio() {
		return promedio;
	}

	public void setPromedio(BigDecimal promedio) {
		this.promedio = promedio;
	}

}
