package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Ingrediente", schema = "CatalogoRecetas")
public class IngredienteDB {
	
	@Id
	@Column (name = "id")
	private int _id;
	@Column (name = "nombre")
	private String _nombre;
	
	public IngredienteDB(int id, String nombre) {
		
		this._id = id;
		this._nombre = nombre;
		
	}
	
	public IngredienteDB () {
		
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_nombre() {
		return _nombre;
	}

	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}

}
