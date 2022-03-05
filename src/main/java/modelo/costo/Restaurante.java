package modelo.costo;

public class Restaurante {

	private String nombre;
	private int costoPlato;
	private int comensales;

	public int getCostoTotal() {
		return costoPlato * comensales;
	}

}
