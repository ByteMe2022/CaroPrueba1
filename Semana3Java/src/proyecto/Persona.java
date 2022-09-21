package proyecto;

import java.time.LocalDate;
import java.util.LinkedList;

public class Persona {

	public String idPersona;
	public String nombre;
	public String apellido;
	public String dptoResidencia;
	private byte cantHijos;
	private LocalDate fechaNacimiento;
	
	//LinkedList<Vehiculo> vehiculos = new LinkedList<Vehiculo>();
	LinkedList<Barco> barcos = new LinkedList<Barco>();
	LinkedList<Avion> aviones = new LinkedList<Avion>();

	public Persona() {
		
	}

	public Persona(String idPersona, String nombre, String apellido, String dptoResidencia,byte cantHijos,LocalDate fechaNacimiento,LinkedList<Barco>barcos, LinkedList<Avion>aviones) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dptoResidencia = dptoResidencia;
		this.cantHijos = cantHijos;
		this.fechaNacimiento = fechaNacimiento;
		this.barcos = barcos;
		this.aviones=aviones;
		
		
	}

	public String getIdPersona() {
		return idPersona;
	}

	public void setIdPErsona(String idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDptoResidencia() {
		return dptoResidencia;
	}

	public void setDptoResidencia(String dptoResidencia) {
		this.dptoResidencia = dptoResidencia;
	}

	public byte getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(byte cantHijos) {
		this.cantHijos = cantHijos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}	
	
	
}