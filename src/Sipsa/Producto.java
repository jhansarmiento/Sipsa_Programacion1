package Sipsa;

public class Producto {
	
	private String nombre;
	
	public Producto() {
		this.nombre = "";
	}
	
	public void setNombre(String pNombre) {
		if (pNombre.length() > 0) {
			this.nombre = pNombre;
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
