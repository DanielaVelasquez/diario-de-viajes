package modelo.costo;

public class Estadia {

	private String nombreHospedaje;
	private int costoPorNoche;
	private int huespedes;

	public int getCostoTotal() {
		return costoPorNoche * huespedes;
	}
}
