package Sipsa;

public class Main {

	public static void main(String[] args) {
		
	}
	
	public static void registrarDepartamento() {
		Departamento departamento;
		Presentacion presentacion;
		Datos datos;
		
		presentacion = new Presentacion();
		datos = new Datos();
		
		departamento = presentacion.capturarDepartamento();
		datos.grabarDepartamento(departamento);
		presentacion.presentarDepartamento(departamento);
	}
	
	public static void consultarDepartamento() {
		Departamento departamento;
		Presentacion presentacion;
		Datos datos;
		
		presentacion = new Presentacion();
		datos = new Datos();
		
<<<<<<< HEAD
=======
		departamento = datos.recuperarDepartamento(presentacion.capturarCodigoDaneDepartamento());
		presentacion.presentarDepartamento(departamento);
>>>>>>> 3bd627d (recupera clase departamento)
	}

	public static void registrarMunicipio() {
		Municipio municipio;
		Presentacion presentacion;
		
		presentacion = new Presentacion();
		
		municipio = presentacion.capturarMunicipio();
		presentacion.presentarMunicipio(municipio);
	}
	
}
