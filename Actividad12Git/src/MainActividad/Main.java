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

		// Creamos el objeto jardín
		Jardin jardin = new Jardin();
		jardin.setMetrosCuadrados(200);
		jardin.setNumeroDePlantas(500);

		// Creamos el objeto Habitaciones
		ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
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

		// Creamos la segunda casa:

		// Dirección
		Direccion direccion2 = new Direccion();
		direccion2.setTipoVia(TipoVia.CALLE);
		direccion2.setNombreVia("Ferrocarril");
		direccion2.setLocalidad("Madrid");
		direccion2.setCodigoPostal("28045");

		// Creamos el objeto jardín
		// No creamos jardín porque no tiene

		// Creamos el objeto Habitaciones
		ArrayList<Habitacion> listaHabitaciones2 = new ArrayList<Habitacion>();
		Habitacion h3 = new Habitacion();
		Habitacion h4 = new Habitacion();
		Habitacion h5 = new Habitacion();

		h3.setNombre("Dani");
		h3.setMetrosCuadrados(10);
		h3.setTipoHabitacion(TipoHabitacion.BANIO);

		h4.setNombre("Guille");
		h4.setMetrosCuadrados(5);
		h4.setTipoHabitacion(TipoHabitacion.COCINA);

		h5.setNombre("Piero");
		h5.setMetrosCuadrados(50);
		h5.setTipoHabitacion(TipoHabitacion.SALON);

		listaHabitaciones2.add(h3);
		listaHabitaciones2.add(h4);
		listaHabitaciones2.add(h5);

		Casa casa2 = new Casa(direccion2, 150000, false, 0, null, listaHabitaciones2);

		// Ahora ponemos los metodos de la segunda casa

		System.out.println(casa2.toString());
		casa2.calculoMetrosCuadrados();

		// Para ver los cambios
		System.out.println(casa2.toString());
		System.out.println(casa2.calcularPrecioCasaConIva());

		System.out.println(casa2.esChalet());

	}

}
