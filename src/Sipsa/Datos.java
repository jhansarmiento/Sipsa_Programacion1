package Sipsa;
import persistencia.ArchivoCsv;
import persistencia.RegistroCsv;

public class Datos extends ArchivoCsv {
	
	public String archivoDepartamentos;
	
	public Datos() {
		this.archivoDepartamentos = "Departamentos";
		this.archivoMunicipios = "Municipios";

	}
	
	public String archivoMunicipios;

	
	public void grabarDepartamento(Departamento pDepartamento) {
		RegistroCsv tRegistro;
		tRegistro = new RegistroCsv();
		tRegistro.agregarValor(pDepartamento.getCodigoDane());
		tRegistro.agregarValor(pDepartamento.getNombre());
		this.grabarRegistro(this.archivoDepartamentos, tRegistro);
	}
	
	public void grabarMunicipio(Municipio pMunicipio) {
		RegistroCsv tRegistro;
		tRegistro = new RegistroCsv();
		tRegistro.agregarValor(pMunicipio.getCodigoDane());
		tRegistro.agregarValor(pMunicipio.getNombre());
		this.grabarRegistro(this.archivoMunicipios, tRegistro);
	}
}
