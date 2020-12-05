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
		return this.socios.add(deportista);
	}

	public Integer getCantidadSocios() {
		return this.socios.size();
	}

	public void crearEvento(TipoDeEvento evento, String desc) {
		this.competencias.putIfAbsent(desc, new Evento(evento));
	}

	public Integer inscribirEnEvento(String evento, Deportista depor) throws NoEstaPreparado, NoExisteElEventoSolicitado {
		if(this.competencias.get(evento) == null) throw new NoExisteElEventoSolicitado();
		return this.competencias.get(evento).inscribirParticipante(depor);
	}
	
	
	
	
	
}
