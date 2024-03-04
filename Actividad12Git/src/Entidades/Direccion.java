package Entidades;

public class Direccion {
	private TipoVia tipoVia;
	private String NombreVia;
	private String Localida;
	private String CodigoPostal;
	
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", NombreVia=" + NombreVia + ", Localida=" + Localida
				+ ", CodigoPostal=" + CodigoPostal + "]";
	}

	public TipoVia getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(TipoVia tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return NombreVia;
	}

	public void setNombreVia(String nombreVia) {
		NombreVia = nombreVia;
	}

	public String getLocalida() {
		return Localida;
	}

	public void setLocalida(String localida) {
		Localida = localida;
	}

	public String getCodigoPostal() {
		return CodigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		CodigoPostal = codigoPostal;
	}
	
	
}
