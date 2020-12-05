package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICiclista, ICorredor, INadador{

	private String distanciaPreferida;
	private TipoDeBicicleta tipoDeBicicleta;
	private Integer cantidadDeKilometrosEntrenados;
	private String soyCorredor = "Yo se correr.";
	private String soyNadador = "Yo se nadar";
	private String soyCiclista = "Yo se andar en Bici.";
	
	public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta bici) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.cantidadDeKilometrosEntrenados= 0;
		this.tipoDeBicicleta = bici;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	
	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKilometrosEntrenados = km;
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.cantidadDeKilometrosEntrenados;
	}

	@Override
	public String getSoyCorredor() {
		return soyCorredor;
	}

	@Override
	public String getSoyCiclista() {
		return soyCiclista;
	}

	@Override
	public String getSoyNadador() {
		return soyNadador;
	}

	
	
}
