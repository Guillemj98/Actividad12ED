package Entidades;

public class Jardin {
	private int metrosCuadrados;
	private int numeroDePlantas;
	
	public Jardin() {
		super();
	}

	public Jardin(int metrosCuadrados, int numeroDePlantas) {
		super();
		this.metrosCuadrados = metrosCuadrados;
		this.numeroDePlantas = numeroDePlantas;
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}
	
	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public int getNumeroDePlantas() {
		return numeroDePlantas;
	}
	public void setNumeroDePlantas(int numeroDePlantas) {
		this.numeroDePlantas = numeroDePlantas;
	}
	@Override
	public String toString() {
		return "Jardin [metrosCuadrados=" + metrosCuadrados + ", numeroDePlantas=" + numeroDePlantas + "]";
	}
	
	

}
