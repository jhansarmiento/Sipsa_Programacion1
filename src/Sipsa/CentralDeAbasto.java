package Sipsa;

public class CentralDeAbasto {
	
	/**
	 * Nombre de la central de abasto
	 */
	private String nombre;
	
	/**
	 * Codigo asignado a la central de abastos, solo letras
	 */
	private String codigo;
	
	/**
	 * Metodo constructor de la clase
	 */
	public CentralDeAbasto() {
		this.nombre = "";
		this.codigo = "";
	}
	
	/**
	 * Método para asignación de valor al atributo nombre.
	 * @pNombre : parámetro con el valor a asignar. Debe verificar que sea una cadena no vacía.
	 */
	public void setNombre(String pNombre) {
		if (pNombre.length() > 0) {
			this.nombre = pNombre;
		}
	}
	
	/**
	 * Método para asignación de valor al atributo codigo.
	 * @pCodigo : parámetro con el valor a asignar. Debe verificar que sea una cadena no vacía.
	 */
	public void setCodigo(String pCodigo) {
		if (pCodigo.length() > 0) {
			this.nombre = pCodigo;
		}
	}
	
	/**
	 * Método para obtener el valor del atributo nombre.
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Método para obtener el valor del atributo nombre.
	 */
	public String getCodigo() {
		return this.codigo;
	}
}
