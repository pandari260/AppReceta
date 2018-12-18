package dao;

import java.util.List;

public interface dao <T>{
	
	public void add(T obj);
	public void remove(int id);
	public void update(T obj);
	public List<T> readAll();
	
}
