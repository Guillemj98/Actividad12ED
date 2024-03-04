package Entidades;

import java.util.ArrayList;

public class Casa {

	// Atributos de la clase
	private Direccion direccion;
	private double precio;
	private boolean esSegundaMano;
	private int metrosCuadrados;
	private Jardin jardin;
	private ArrayList<Habitacion> habitaciones;

	// Constructores de la la clase
	public Casa() {
		super();
	}

	public Casa(Direccion direccion, double precio, boolean esSegundaMano, int metrosCuadrados, Jardin jardin,
			ArrayList<Habitacion> habitaciones) {
		super();
		this.direccion = direccion;
		this.precio = precio;
		this.esSegundaMano = esSegundaMano;
		this.metrosCuadrados = metrosCuadrados;
		this.jardin = jardin;
		this.habitaciones = habitaciones;
	}

	// Métodos de la clase
	@Override
	public String toString() {
		return "Casa [precio=" + precio + ", esSegundaMano=" + esSegundaMano + ", metrosCuadrados=" + metrosCuadrados
				+ ", jardin=" + jardin + "]";
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEsSegundaMano() {
		return esSegundaMano;
	}

	public void setEsSegundaMano(boolean esSegundaMano) {
		this.esSegundaMano = esSegundaMano;
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public Jardin getJardin() {
		return jardin;
	}

	public void setJardin(Jardin jardin) {
		this.jardin = jardin;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	/**
	 * El método calculoMetrosCuadrados calcula el total de los metros cuadrados de
	 * las diferentes estancias de la casa y asigna el cálculo total al atributo
	 * precio de la clase Casa
	 * 
	 * @return void.
	 */
	
	public void calculoMetrosCuadrados() {
		int totalMetrosCuadrados = 0;
		totalMetrosCuadrados += this.jardin.getMetrosCuadrados();

		for (Habitacion h : habitaciones) {
			totalMetrosCuadrados += h.getMetrosCuadrados();
		}

		this.metrosCuadrados = totalMetrosCuadrados;
	}

	public boolean esChalet() {
		return jardin != null;
	}

	/**
	 * El método de calcularPrecioCasaConIva calcula el precio 
	 * de la casa con IVA. El IVA será del 5% si es de segunda mano
	 * y del 10% si es nueva.
	 * 
	 * @return precioFinalCasa
	 */
	public double calcularPrecioCasaConIva() {
		// Vamos a calcular el precio de la casa dependiendo 
		// de si es de segunda mano o no sera diferente
		double precioFinalCasa = 0;
		if(this.esSegundaMano == true) {
			precioFinalCasa = (this.precio * 0.05) + this.precio;
		}
		else {
			precioFinalCasa = (this.precio * 0.10) + this.precio;
		}
		return precioFinalCasa;

		
	}
}
