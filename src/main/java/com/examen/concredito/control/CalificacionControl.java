package com.examen.concredito.control;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.examen.concredito.entidades.CalificacionEntity;

/**
 * 
 * @author jrios
 *
 */
public class CalificacionControl {
	private static final Logger log = Logger.getLogger(CalificacionControl.class);

	private static final String PRO_GET_ALL_CALIFICACIONES = "PRO_GET_ALL_CALIFICACIONES";

	private SessionFactory factory = null;

	public CalificacionControl(SessionFactory factory) {
		this.factory = factory;
	}

	/**
	 * Esté metodo obtiene el listado de calificaciones a partir de un idcurso dado
	 * 
	 * @param idcurso
	 * @return List<CalificacionEntity>
	 * @throws Exception
	 */
	public List<CalificacionEntity> obtenerTodos(Integer idcurso) throws Exception {
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		List<CalificacionEntity> res = null;
		try {
			int indice = 1;
			tx = session.beginTransaction();
			Query<?> query = session.getNamedQuery(PRO_GET_ALL_CALIFICACIONES);
			query.setParameter(indice++, idcurso);
			res = (List<CalificacionEntity>) query.getResultList();
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
