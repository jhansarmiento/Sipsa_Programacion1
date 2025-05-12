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
	
	public Departamento recuperarDepartamento(String pCodigoDane) {
		Departamento rDepartamento;
		RegistroCsv tRegistro;
		tRegistro = this.recuperarRegistro(this.archivoDepartamentos, pCodigoDane, 0);
		rDepartamento = new Departamento();
		rDepartamento.setCodigoDane(tRegistro.extraerString(0));
		rDepartamento.setNombre(tRegistro.extraerString(1));
		return rDepartamento;
	}
	
	public void grabarMunicipio(Municipio pMunicipio) {
		RegistroCsv tRegistro;
		tRegistro = new RegistroCsv();
		tRegistro.agregarValor(pMunicipio.getCodigoDane());
		tRegistro.agregarValor(pMunicipio.getNombre());
		this.grabarRegistro(this.archivoMunicipios, tRegistro);
	}
	
	public Municipio recuperarMunicipio(String pCodigoDane) {
		Municipio rMunicipio;
		RegistroCsv tRegistro;
		tRegistro = this.recuperarRegistro(this.archivoMunicipios, pCodigoDane, 0);
		rMunicipio = new Municipio();
		rMunicipio.setCodigoDane(tRegistro.extraerString(0));
		rMunicipio.setNombre(tRegistro.extraerString(1));
		return rMunicipio;
	}
}
