package com.examen.concredito.control;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.examen.concredito.entidades.CalificacionEntity;

public class Main {

	public static void main(String[] args) throws Exception {
		SessionFactory factory;
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		CalificacionControl control = new CalificacionControl(factory.getSessionFactory());
		List<CalificacionEntity> res = control.obtenerTodos(1);
		System.out.print(res);

	}

}
