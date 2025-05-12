package Sipsa;
import interaccion.PresentacionConsola;

public class Presentacion extends PresentacionConsola {
	
	public Presentacion() {
		this.rotuloPrimerNivel = "SIPSA - Programación 1";
		this.rotuloSegundoNivel = "Registro de precios en centrales de abasto";
	}
	
	public Departamento capturarDepartamento() {
		this.rotuloPrimerNivel = "Captura De Datos Del Departamento";
		
		Departamento rDepartamento;
		rDepartamento = new Departamento();
		this.vaciarContenido();
		
		rDepartamento.setCodigoDane(this.desplegarCapturaString("Código DANE del departamento: ", true));
		rDepartamento.setNombre(this.desplegarCapturaString("Nombre del departamento: ", true));
		return rDepartamento;
	}
	
	public Municipio capturarMunicipio() {
		this.rotuloTercerNivel = "Captura De Datos Del Municipio";
		Municipio rMunicipio;
		rMunicipio = new Municipio();
		this.vaciarContenido();
		rMunicipio.setCodigoDane(this.desplegarCapturaString("Código DANE del municipio: ", true));
		rMunicipio.setNombre(this.desplegarCapturaString("Nombre del municipio: ", true));
		return rMunicipio;
	}
	
	public void presentarDepartamento(Departamento pDepartamento) {
		this.rotuloTercerNivel = "Presentación De Datos Del Departamento";
		this.vaciarContenido();
		this.agregarContenido("Código DANE del departamento: " + pDepartamento.getCodigoDane());
		this.agregarContenido("Nombre del departamento: " + pDepartamento.getNombre());
		this.desplegarPresentacion();
	}
	
	public void presentarMunicipio(Municipio pMunicipio) {
		this.rotuloTercerNivel = "Presentación De Datos Del Municipio";
		this.vaciarContenido();
		this.agregarContenido("Código DANE del municipio: " + pMunicipio.getCodigoDane());
		this.agregarContenido("Nombre del municipio: " + pMunicipio.getNombre());
		this.desplegarPresentacion();
	}
}
