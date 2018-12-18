package Modelo;

import java.util.List;

import Entidades.PasosDB;
import Entidades.ProporcionDB;
import Entidades.RecetaDB;

public class Recetas {
	
	private List<ProporcionDB> _proporciones;
	private List<PasosDB> _secuenciaPasos;
	private RecetaDB _receta;
	
	
	public Recetas(RecetaDB receta, List<ProporcionDB> proporciones, List<PasosDB> elaboracion) {
		
		this._receta = receta;
		this._secuenciaPasos = elaboracion;
		this._proporciones = proporciones;
		
	}


	public List<ProporcionDB> get_proporciones() {
		return _proporciones;
	}


	public void set_proporciones(List<ProporcionDB> _proporciones) {
		this._proporciones = _proporciones;
	}


	public List<PasosDB> get_secuenciaPasos() {
		return _secuenciaPasos;
	}


	public void set_secuenciaPasos(List<PasosDB> _elaboracion) {
		this._secuenciaPasos = _elaboracion;
	}


	public RecetaDB get_receta() {
		return _receta;
	}


	public void set_receta(RecetaDB _receta) {
		this._receta = _receta;
	}
	
	
}
