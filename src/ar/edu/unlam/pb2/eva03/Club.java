package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet <Deportista>();
		this.competencias = new HashMap <String, Evento>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}

	public boolean agregarDeportista(Deportista deportista) {
		if(this.socios.add(deportista))
			return true;
		
		return false;
	}

	public Integer getCantidadSocios() {
		return this.socios.size();
	}

	public void crearEvento(TipoDeEvento tipo, String nombre) {
		competencias.put(nombre, new Evento (tipo, null));
	}

	public Integer inscribirEnEvento(String string, Deportista celeste) {
		Integer numeroDeInscripcion = 0;
		Evento deseado = competencias.get(string);
		return numeroDeInscripcion;
	}
	
	
	
	
	
}
