package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Receta" , schema = "CatalogoRecetas")
public class RecetaDB {
	
	
	@Id
	@Column (name = "id")
	private int _id;
	@Column (name = "id_categoria")
	private int _idCategoria;
	@Column (name = "nombre")
	private String _nombre;
	@Column (name = "dificultad")
	private String _dificultad;
	@Column (name = "descripcion")
	private String _descripcion;
	
	public RecetaDB(int id, int categoria, String nombre, String dificultad, String descripcion){
		
		this._id = id;
		this._idCategoria = categoria;
		this._nombre = nombre;
		this._dificultad = dificultad;
		this._descripcion = descripcion;
	}
	
	public RecetaDB() {
		
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public int get_idCategoria() {
		return _idCategoria;
	}

	public void set_idCategoria(int _idCategoria) {
		this._idCategoria = _idCategoria;
	}

	public String get_nombre() {
		return _nombre;
	}

	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}

	public String get_dificultad() {
		return _dificultad;
	}

	public void set_dificultad(String _dificultad) {
		this._dificultad = _dificultad;
	}

	public String get_descripcion() {
		return _descripcion;
	}

	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}

	@Override
	public String toString() {
		return "RecetaDB [_id=" + _id + ", _idCategoria=" + _idCategoria + ", _nombre=" + _nombre + ", _dificultad="
				+ _dificultad + ", _descripcion=" + _descripcion + "]";
	}

	
	
}
