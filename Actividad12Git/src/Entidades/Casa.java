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

}
