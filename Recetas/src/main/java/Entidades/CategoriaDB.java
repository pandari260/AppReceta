package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Categoria", schema="CatalogoRecetas")
public class CategoriaDB {
	
	@Id
	@Column (name= "id")
	private int _id;
	@Column (name= "nombre")
	private String _nombre; 
	@Column (name= "descripcion")
	private String _descripcion;
	
	public CategoriaDB(int id, String nombre, String descripcion) {
		this._id = id;
		this._nombre = nombre;
		this._descripcion = descripcion;
	}
	
	public CategoriaDB() {
		
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

	public String get_descripcion() {
		return _descripcion;
	}

	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}

	@Override
	public String toString() {
		return "CategoriaDB [_id=" + _id + ", _nombre=" + _nombre + ", _descripcion=" + _descripcion + "]";
	}

	
}
