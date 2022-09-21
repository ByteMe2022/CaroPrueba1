package proyecto;

public class Avion extends Vehiculo {
	public double longitud;
	public int cantPasajeros;
	public Persona dueño;
	
	
	public Avion(int idVehiculo, String nombre, String color/*,Persona dueño*/, double longitud, int cantPasajeros) {
		super(idVehiculo,nombre,color);
		this.longitud= longitud;
		this.cantPasajeros = cantPasajeros;
		//this.dueño=dueño;
	}


	public double getLongitud() {
		return longitud;
	}


	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}


	public int getCantPasajeros() {
		return cantPasajeros;
	}


	public void setCantPasajeros(int cantPasajeros) {
		this.cantPasajeros = cantPasajeros;
	}


	public String toString() {
		return "Avion Id Vehiculo= " + super.toString() + ", Longitud= " + longitud + ", Cantidad de Pasajeros=" + cantPasajeros ;
	}



	
	
	
}
