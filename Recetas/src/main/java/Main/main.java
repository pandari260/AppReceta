package Main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entidades.CategoriaDB;
import Entidades.RecetaDB;
import dao.DaoCategoria;
import dao.DaoPasos;
import dao.DaoProporcion;
import dao.DaoReceta;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("misRecetasDB");
		//EntityManager entityCarrera= fabrica.createEntityManager();
		//entityCarrera.getTransaction().begin();
		
		/* SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		Query query = session.createQuery("from CategoriaDB");
		List carreras = query.list();
		
		System.out.println("tamaño de los registros " + carreras.size());

		//Carrera existingEmployee = entityCarrera.find(Carrera.class, 7); 
		//entityCarrera.remove(existingEmployee); 
		
	//	Carrera nuevaCarrera = new Carrera(6,"Filosofia", 5); 

		//entityCarrera.persist(nuevaCarrera); 
		//entityCarrera.getTransaction().commit();
		

		session.getTransaction().commit();
		session.close();
		
		
		System.out.println("tamaño de los registros " + carreras.size());
		*/
		
		
		
		
		DaoProporcion daoProporcion = new DaoProporcion();
		DaoPasos daoPasos = new DaoPasos();
		DaoReceta daoReceta = new DaoReceta();
		
		
		RecetaDB r = daoReceta.find(3);
		System.out.println(r.toString());
		r.set_dificultad("bajo");
		daoReceta.update(r);
		
		
	}

}
