package es.cie.repositories;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import es.cie.negocio.Libro;

public class LibroRepository {

	private static List<Libro> lista= new ArrayList<Libro>();
	
	static {
		
		lista.add(new Libro("1","java","pepe",200));
		lista.add(new Libro("2","php","juan",100));
		
	}
	
	public List<Libro> buscarTodos() {
		
		return lista;
	}
}
