package Entidades;

public class Direccion {
	private TipoVia tipoVia;
	private String nombreVia;
	private String localidad;
	private String codigoPostal;

	public Direccion() {
		super();
	}

	public Direccion(TipoVia tipoVia, String nombreVia, String localidad, String codigoPostal) {
		super();
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", NombreVia=" + nombreVia + ", Localida=" + localidad
				+ ", CodigoPostal=" + codigoPostal + "]";
	}

	public TipoVia getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(TipoVia tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

}
