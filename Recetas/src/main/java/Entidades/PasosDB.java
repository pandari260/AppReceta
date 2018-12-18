package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Pasos", schema = "CatalogoRecetas")
public class PasosDB {
	
	@Id
	@Column (name = "id")
	private int _id;
	@Column (name = "id_Receta")
	private int _idReceta;
	@Column (name = "descripcion")
	private String _descripcion;
	
	public PasosDB(int id, int receta, String descripcion) {
		
		this._id = id;
		this._idReceta = receta;
		this._descripcion = descripcion;
	}
	
	public PasosDB() {
		
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public int get_idReceta() {
		return _idReceta;
	}

	public void set_idReceta(int _idReceta) {
		this._idReceta = _idReceta;
	}

	public String get_descripcion() {
		return _descripcion;
	}

	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}
	
}
