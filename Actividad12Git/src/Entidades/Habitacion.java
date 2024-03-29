package Entidades;

public class Habitacion {
	private String nombre;
	private int metrosCuadrados;
	private TipoHabitacion tipoHabitacion;
	
	
	public Habitacion() {
		super();
	}


	public Habitacion(String nombre, int metrosCuadrados, TipoHabitacion tipoHabitacion) {
		super();
		this.nombre = nombre;
		this.metrosCuadrados = metrosCuadrados;
		this.tipoHabitacion = tipoHabitacion;
	}


	@Override
	public String toString() {
		return "Habitacion [nombre=" + nombre + ", metrosCuadrados=" + metrosCuadrados + ", tipoHabitacion="
				+ tipoHabitacion + "]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}


	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}


	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}


	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	
	
	
	
	
	
	
}