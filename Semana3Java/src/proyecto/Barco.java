package proyecto;

public class Barco extends Vehiculo{

	public double eslora;
	public double manga;
	public Persona dueño;
	

	public Barco(int idVehiculo, String nombre, String color, double eslora, double manga/*, Persona dueñoBarco */){
		super(idVehiculo,nombre,color);
		this.eslora = eslora;
		this.manga = manga;
		//this.setDueñoBarco(dueñoBarco);
	}

	private void setDueñoBarco(Persona dueñoBarco) {
		// TODO Auto-generated method stub
		this.dueño=dueñoBarco;
		//me pide q sea this.dueno 
	}

	public double getEslora() {
		return eslora;
	}


	public void setEslora(double eslora) {
		this.eslora = eslora;
	}


	public double getManga() {
		return manga;
	}


	public void setManga(double manga) {
		this.manga = manga;
	}


	public String toString() {
		return "Barco Id Vehiculo= " + super.toString() + "Eslora" + eslora + "Manga" + manga;
	}

}