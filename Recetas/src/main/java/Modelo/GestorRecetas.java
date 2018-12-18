package Modelo;

import java.util.List;

import Entidades.PasosDB;
import dao.DaoPasos;
import dao.DaoProporcion;
import dao.DaoReceta;

public class GestorRecetas {
	
	private DaoReceta _daoReceta;
	private DaoProporcion _daoProporcion;
	private DaoPasos _daoPasos;
	
	public GestorRecetas() {
		
		_daoReceta = new DaoReceta();
		_daoProporcion = new DaoProporcion();
		_daoPasos = new DaoPasos();
		
	}
	
	public void agregarReceta(Recetas receta) {
		
		_daoReceta.add(receta.get_receta());
		_daoPasos.addAll(receta.get_secuenciaPasos());
		_daoProporcion.addAll(receta.get_proporciones());
	}
	
	public void eliminarReceta(int id) {
		
		_daoProporcion.removeAll(id);
		_daoPasos.deleteAll(id);
		_daoReceta.remove(id);
		
	}
	
	public void modificarReceta(Recetas receta) {
		
	}
	
	public void modificarRecetaPasos(Recetas receta) {
		
	}
	
	public void modificarRecetaProporciones(Recetas receta) {
		
	}
	
	public List<Recetas> consultarRecetas(){
		return null;
	}
	
	public int cantidadRecetas() {
		return 0;
	}
	
	 

}
