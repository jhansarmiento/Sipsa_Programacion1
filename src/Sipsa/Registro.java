package Sipsa;

public class Registro {
	
	private float precio;
	
	public Registro() {
		this.precio = 0;
	}
	
	public void setPrecio(float pPrecio) {
		if (pPrecio > 0) {
			this.precio = pPrecio;
		}
	}
	
	public float getPrecio() {
		return this.precio;
	}
	
}
