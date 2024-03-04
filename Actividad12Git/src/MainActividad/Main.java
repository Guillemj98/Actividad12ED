package MainActividad;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Entidades.Casa;
import Entidades.Direccion;
import Entidades.Habitacion;
import Entidades.Jardin;
import Entidades.TipoHabitacion;
import Entidades.TipoVia;

public class Main {

	public static void main(String[] args) {
		// Creamos la dirección
		Direccion direccion = new Direccion();
		direccion.setTipoVia(TipoVia.PLAZA);
		direccion.setNombreVia("Puentelarra");
		direccion.setLocalidad("Madrid");
		direccion.setCodigoPostal("28031");
		
		// Creamos el obejto jardín.
		Jardin jardin = new Jardin();
		jardin.setMetrosCuadrados(200);
		jardin.setNumeroDePlantas(500);
		
		// Creamos el objeto Habitaciones.
		ArrayList <Habitacion>listaHabitaciones = new ArrayList<Habitacion>();
		Habitacion h1 = new Habitacion();
		Habitacion h2 = new Habitacion();
		h1.setNombre("Carlos");
		h1.setMetrosCuadrados(50);
		h1.setTipoHabitacion(TipoHabitacion.COCINA);
		
		h2.setNombre("Dani");
		h2.setMetrosCuadrados(10);
		h2.setTipoHabitacion(TipoHabitacion.BANIO);
		listaHabitaciones.add(h1);
		listaHabitaciones.add(h2);
		
		Casa casa = new Casa(direccion, 100000, true, 0, jardin, listaHabitaciones);
		
		// Ahora ponemos los metodos de la primera casa
		
		System.out.println(casa.toString());
		casa.calculoMetrosCuadrados();
		
		// Para ver los cambios
		System.out.println(casa.toString());
		System.out.println(casa.calcularPrecioCasaConIva());
		
		System.out.println(casa.esChalet());	
		
		

	}

}
