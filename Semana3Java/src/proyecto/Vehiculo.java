package proyecto;

import java.util.LinkedList;

public class Vehiculo {
		public int idVehiculo;
		public String nombre;
		public String color;
		public Persona dueño;
	
		public Vehiculo(int idVehiculo, String nombreVehiculo, String color/*,Persona dueño*/) {
			this.setIdVehiculo(idVehiculo);
			this.setNombreVehiculo(nombreVehiculo);
			this.setColor(color);
			//this.dueño=dueño;
			
			}
		
			
		public int getIdVehiculo() {
			return idVehiculo;
		}

		public void setIdVehiculo(int idVehiculo) {
			this.idVehiculo = idVehiculo;
		}

		public String getNombreVehiculo() {
			return nombre;
		}

		public void setNombreVehiculo(String nombre) {
			this.nombre = nombre;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		
		public String toString() {
			return idVehiculo + ", nombre=" + nombre + ", color=" + color /*+ ", Dueño id= " + dueño*/;
		}

		
}
