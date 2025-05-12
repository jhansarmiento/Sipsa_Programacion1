package Sipsa;
import interaccion.PresentacionConsola;

public class Presentacion extends PresentacionConsola {
	
	public Presentacion() {
		this.rotuloPrimerNivel = "SIPSA - Programación 1";
		this.rotuloSegundoNivel = "Registro de precios en centrales de abasto";
	}
	
	/**
	 * Metodos para la captura de los argumentos de las clases
	 * @return
	 */
	
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
	
	/**
	 * Metodos para capturar los atributos utilizados como llaves primarias
	 * para recuperar los objetos instanciados de cada clase
	 * @return
	 */
	
	public String capturarCodigoDaneMunicipio() {
		String rCodigoDane;
		this.rotuloTercerNivel = "Consulta del municipio";
		this.vaciarContenido();
		rCodigoDane = this.desplegarCapturaString("Código DANE del municipio: ", false);
		return rCodigoDane;
	}
	
	public String capturarCodigoDaneDepartamento() {
		String rCodigoDane;
		this.rotuloTercerNivel = "Consulta de departamento";
		this.vaciarContenido();
		
		rCodigoDane = this.desplegarCapturaString("Código DANE del departamento: ", false);
		return rCodigoDane;
	}
	
	/**
	 * Metodos para presentar los objetos de cada clases
	 * @param pDepartamento
	 */
	
	
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
