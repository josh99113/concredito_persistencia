package com.examen.concredito.control;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.examen.concredito.entidades.CursoEntity;

/**
 * 
 * @author jrios
 *
 */
public class CursoControl {
	private static final Logger log = Logger.getLogger(CalificacionControl.class);

	private static final String PRO_GET_ALL_CURSOS = "PRO_GET_ALL_CURSOS";

	private SessionFactory factory = null;

	public CursoControl(SessionFactory factory) {
		this.factory = factory;
	}

	/**
	 * Esté método obtiene todos los registros de la tabla Cursos
	 * 
	 * @return List<CursoEntity>
	 * @throws Exception
	 */
	public List<CursoEntity> obtenerTodos() throws Exception {
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		List<CursoEntity> res = null;
		try {
			int indice = 1;
			tx = session.beginTransaction();
			Query<?> query = session.getNamedQuery(PRO_GET_ALL_CURSOS);
			res = (List<CursoEntity>) query.getResultList();
			tx.commit();
		} catch (Exception e) {
			try {
				tx.rollback();
			} catch (Exception exRollback) {
				log.error("Fallo al hacer rollback", exRollback);
			}
			log.error(e);
			throw new Exception(e);
		}
		return res;
	}
}
