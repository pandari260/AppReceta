package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entidades.CategoriaDB;
import Entidades.IngredienteDB;

public class DaoIngrediente implements dao<IngredienteDB> {

	private static EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("misRecetasDB");
	private EntityManager _entityIngrediente = fabrica.createEntityManager();
	

	@Override
	public void add(IngredienteDB ingrediente) {
		
		_entityIngrediente.getTransaction().begin();
		_entityIngrediente.persist(ingrediente);
		_entityIngrediente.getTransaction().commit();

	}

	@Override
	public void remove(int id) {
		
		_entityIngrediente.getTransaction().begin();
		IngredienteDB ingredienteD = _entityIngrediente.find(IngredienteDB.class, id); 
		_entityIngrediente.remove(ingredienteD);
		_entityIngrediente.getTransaction().commit();
	}

	@Override
	public void update(IngredienteDB obj) {
		
		_entityIngrediente.getTransaction().begin();
		
	//	IngredienteDB ingredienteM = _entityIngrediente.find(IngredienteDB.class, id); 
	//	ingredienteM.set_nombre(obj.get_nombre());
		
		_entityIngrediente.getTransaction().commit();
		
	}

	@Override
	public List<IngredienteDB> readAll() {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from IngredienteDB");
		List<IngredienteDB> ingredientes = query.list();
		
		session.getTransaction().commit();
		session.close();
		
		return ingredientes;
	}
	
	

}
