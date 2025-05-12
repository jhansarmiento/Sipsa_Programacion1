package Sipsa;

public class Grupo {
	
	private String nombre;
	
	public Grupo() {
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
