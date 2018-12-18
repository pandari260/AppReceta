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

public class DaoCategoria implements dao<CategoriaDB> {

	private static EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("misRecetasDB");
	private EntityManager _entityCategoria = fabrica.createEntityManager();
	

	@Override
	public void add(CategoriaDB categoria) {
		
		_entityCategoria.getTransaction().begin();
		_entityCategoria.persist(categoria);
		_entityCategoria.getTransaction().commit();

	}

	@Override
	public void remove(int id) {
		
		_entityCategoria.getTransaction().begin();
		CategoriaDB categoriaD = _entityCategoria.find(CategoriaDB.class, id); 
		_entityCategoria.remove(categoriaD);
		_entityCategoria.getTransaction().commit();
	}

	@Override
	public void update(CategoriaDB obj) {
		
		_entityCategoria.getTransaction().begin();
		
		//CategoriaDB categoriaM = _entityCategoria.find(CategoriaDB.class, id); 
		//categoriaM.set_nombre(obj.get_nombre());
		//categoriaM.set_descripcion(obj.get_descripcion());
		
		_entityCategoria.getTransaction().commit();
		
	}

	@Override
	public List<CategoriaDB> readAll() {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from CategoriaDB");
		List<CategoriaDB> categorias = query.list();
		
		session.getTransaction().commit();
		session.close();
		
		return categorias;
	}
	
	

}
