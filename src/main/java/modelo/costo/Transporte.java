package modelo.costo;

public class Transporte {

	private String aerolinea;
	private int costoPorPersona;
	private int pasajeros;

	public int getCostoTotal() {
		return costoPorPersona * pasajeros;
	}
}
