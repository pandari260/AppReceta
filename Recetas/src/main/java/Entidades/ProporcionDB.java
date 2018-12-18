package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Proporcion", schema = "CatalogoRecetas")
public class ProporcionDB {

	@Id
	@Column (name = "id")
	private int _id;
	@Column (name = "id_Receta")
	private int _idReceta;
	@Column (name = "id_Ingrediente")
	private int _idIngrediente;
	@Column (name = "cantidad")
	private float _cantidad;
	@Column (name = "descripcion")
	private String _descripcion;
	
	public ProporcionDB(int id, int id_Receta, int id_Ingrediente, int cantidad, String descripcion) {
		
		this._id = id;
		this._idReceta = id_Receta;
		this._idIngrediente = id_Ingrediente;
		this._cantidad = cantidad;
		this._descripcion = descripcion;
	}
	
	public ProporcionDB() {
		
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

	public int get_idIngrediente() {
		return _idIngrediente;
	}

	public void set_idIngrediente(int _idIngrediente) {
		this._idIngrediente = _idIngrediente;
	}

	public float get_cantidad() {
		return _cantidad;
	}

	public void set_cantidad(float d) {
		this._cantidad = d;
	}

	public String get_descripcion() {
		return _descripcion;
	}

	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}
	
	
}
