package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entidades.PasosDB;
import Entidades.ProporcionDB;
import Entidades.RecetaDB;

public class DaoProporcion implements dao<ProporcionDB> {

	private SessionFactory _sessionFactory;
	private Session _session;
	
	public DaoProporcion() {

		_sessionFactory = new Configuration().configure().buildSessionFactory();

	}
	
	
	@Override
	public void add(ProporcionDB proporcion) {

		_session = _sessionFactory.openSession();
		_session.beginTransaction();
		_session.save(proporcion);
		_session.getTransaction().commit();
		_session.close();	
	}
	
	public void addAll(List<ProporcionDB> proporcion) {
		
		for (ProporcionDB p : proporcion) {
			add(p);
		}
	}

	@Override
	public void remove(int id) {
		
		_session = _sessionFactory.openSession();
		_session.beginTransaction();
		ProporcionDB proporcionObtenida = _session.find(ProporcionDB.class, id);
		_session.remove(proporcionObtenida);
		_session.getTransaction().commit();
		_session.close();
		
	}
	
	public void removeAll(int id) {
		
		_session = _sessionFactory.openSession();
		_session.beginTransaction();
		
		Query query = _session.createQuery("from ProporcionDB where _idReceta = "+id);
		List<ProporcionDB> proporciones = query.list();
		
		for (ProporcionDB p : proporciones) {
			remove(p.get_id());
		}
		
		_session.getTransaction().commit();
		_session.close();
		
	
	}

	@Override
	public void update( ProporcionDB obj) {

		_session = _sessionFactory.openSession();
		_session.beginTransaction();
		_session.update(obj);
		_session.getTransaction().commit();
		_session.close();
		
	}

	@Override
	public List<ProporcionDB> readAll() {
		
		_session = _sessionFactory.openSession();
		_session.beginTransaction();
		Query query = _session.createQuery("from PorporcionDB");
		List<ProporcionDB> proporciones= query.list();
		_session.getTransaction().commit();
		_session.close();
		
		return proporciones;
	}

	
	public List<ProporcionDB> read(int id){
		
		_session = _sessionFactory.openSession();
		_session.beginTransaction();
		_session.find(ProporcionDB.class,id);
		Query query = _session.createQuery("from ProporcionDB where idReceta = "+id);
		List<ProporcionDB> proporciones = query.list();
		_session.getTransaction().commit();
		_session.close();
		
		return proporciones;
	}
	
	

}
