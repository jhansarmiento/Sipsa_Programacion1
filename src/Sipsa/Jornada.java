package Sipsa;

public class Jornada {
	
	private String fecha;
	
	public Jornada() {
		this.fecha = "";
	}
	
	public void setFecha(String pFecha) {
		if(pFecha.length() > 0) {
			this.fecha = pFecha;
		}
	}
	
	public String getFecha() {
		return this.fecha;
	}
}
