package Sipsa;

public class Main {

	public static void main(String[] args) {
		
	}
	
	public static void registrarDepartamento() {
		Departamento departamento;
		Presentacion presentacion;
		
		presentacion = new Presentacion();
		
		departamento = presentacion.capturarDepartamento();
		presentacion.presentarDepartamento(departamento);
	}
	
	public static void consultarDepartamento() {
		Departamento departamento;
		Presentacion presentacion;
		
		presentacion = new Presentacion();
		
		presentacion.presentarDepartamento(departamento);
	}

	public static void registrarMunicipio() {
		Municipio municipio;
		Presentacion presentacion;
		
		presentacion = new Presentacion();
		
		municipio = presentacion.capturarMunicipio();
		presentacion.presentarMunicipio(municipio);
	}
	
}
