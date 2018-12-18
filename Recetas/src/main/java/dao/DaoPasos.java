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

public class DaoPasos implements dao<PasosDB> {

	private static EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("misRecetasDB");
	private EntityManager _entityPasos = fabrica.createEntityManager();
	

	@Override
	public void add(PasosDB pasos) {
		
		_entityPasos.getTransaction().begin();
		_entityPasos.persist(pasos);
		_entityPasos.getTransaction().commit();

	}
	
	public void addAll(List<PasosDB> secuencia) {
		
		for (PasosDB p : secuencia) {
			add(p);
		}
	}
	
	@Override
	public void remove(int id) {
		
		_entityPasos.getTransaction().begin();
		PasosDB pasosD = _entityPasos.find(PasosDB.class, id); 
		_entityPasos.remove(pasosD);
		_entityPasos.getTransaction().commit();
	}
	
	public void deleteAll(int id) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from PasosDB where _idReceta = "+id);
		List<PasosDB> secuencia = query.list();
		
		for (PasosDB p : secuencia) {
			remove(p.get_id());
		}
		
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void update(PasosDB obj) {
		
		_entityPasos.getTransaction().begin();
		
		//PasosDB pasosM = _entityPasos.find(PasosDB.class, id); 
		//pasosM.set_descripcion(obj.get_descripcion());
		
		_entityPasos.getTransaction().commit();
		
	}

	@Override
	public List<PasosDB> readAll() {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from PasosDB");
		List<PasosDB> pasos = query.list();
		
		session.getTransaction().commit();
		session.close();
		
		return pasos;
	}
	
	public List<PasosDB> findPasosReceta(int id){
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from PasosDB where _idReceta = "+id);
		List<PasosDB> secuenciaPasos = query.list();
		
		session.getTransaction().commit();
		session.close();
		
		return secuenciaPasos;
	}
	

}
