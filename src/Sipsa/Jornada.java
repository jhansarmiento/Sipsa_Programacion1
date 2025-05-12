package Sipsa;

public class Jornada {
	
	private String fecha;
	
	private String codigo;
	
	public Jornada() {
		this.fecha = "";
		this.codigo = "";
	}
	
	public void setFecha(String pFecha) {
		if(pFecha.length() > 0) {
			this.fecha = pFecha;
		}
	}
	
	public void setCodigo(String pCodigo) {
		if (pCodigo.length() > 0) {
			this.codigo = pCodigo;
		}
	}
	
	public String getFecha() {
		return this.fecha;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
}
