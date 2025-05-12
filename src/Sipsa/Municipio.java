package Sipsa;

public class Municipio {
	
	/**
	 * Código de identificación pública del municipio, asignado por el DANE.
	 */
	private String codigoDane;
	
	/**
	 * Denominación oficial del municipio certificada por el DANE.
	 */
	private String nombre;
	
	/**
	 * Método constructor de la clase. Inicializa los aributos codigoDane y nombre en con cadenas vacías, y los atributos poblacion y area en cero.
	 */
	public Municipio() {
		this.codigoDane = "";
		this.nombre = "";
	}
	
	/**
	 * Método para asignación de valor al atributo codigoDane.
	 * @pCodigoDane : parámetro con el valor a asignar. Debe verificar que sea una cadena no vacía.
	 */
	public void setCodigoDane(String pCodigoDane) {
		if (pCodigoDane.length() > 0) {
			this.codigoDane = pCodigoDane;
		}
	}
	
	/**
	 * Método para asignación del atributo nombre.
	 * @pNombre : parámetro con el valor a asignar al atributo nombre.
	 */
	public void setNombre(String pNombre) {
		if (pNombre.length() > 0) {
			this.nombre = pNombre;
		}
	}
	
	/**
	 * Método para obtener el valor del atributo codigoDane.
	 */
	public String getCodigoDane() {
		return this.codigoDane;
	}
	
	/**
	 * Método para obtener el valor del atributo nombre.
	 */
	public String getNombre() {
		return this.nombre;
	}
}
