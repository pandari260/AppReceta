package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entidades.RecetaDB;

public class DaoReceta implements dao<RecetaDB> {

	private SessionFactory _sessionFactory;
	private Session _session;
	
	
	public DaoReceta() {
		
		_sessionFactory = new Configuration().configure().buildSessionFactory();
		
	}
	
	@Override
	public void add(RecetaDB receta) {
		
		_session = _sessionFactory.openSession();
		_session.beginTransaction();
		_session.save(receta);
		_session.getTransaction().commit();
		_session.close();		

	}

	@Override
	public void remove(int id) {
		
		_session = _sessionFactory.openSession();
		_session.beginTransaction();
		RecetaDB recetaObtenida = find(id);
		_session.remove(recetaObtenida);
		_session.getTransaction().commit();
		_session.close();
		
	}

	@Override
	public void update(RecetaDB obj) {
		
		_session = _sessionFactory.openSession();
		_session.beginTransaction();
		_session.update(obj);
		_session.getTransaction().commit();
		_session.close();
		
	}

	@Override
	public List<RecetaDB> readAll() {
		
		_session = _sessionFactory.openSession();
		_session.beginTransaction();
		Query query = _session.createQuery("from RecetaDB");
		List<RecetaDB> recetas = query.list();
		_session.getTransaction().commit();
		_session.close();
		
		return recetas;
	}
	
	public RecetaDB find(int id ) {
		
		_session = _sessionFactory.openSession();
		_session.beginTransaction();
		Query query = _session.createQuery("from RecetaDB where id = "+id);
		RecetaDB receta = (RecetaDB) query.getSingleResult();
		_session.getTransaction().commit();
		_session.close();
		
		return receta;
	}
	

}
