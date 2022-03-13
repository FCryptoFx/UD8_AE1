package UD8_AE1_Actividad_entregable;

public class Lavadora extends Electrodomestico {

	//Attributes:
	private double carga;

	//Getters & Setters:
	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	//Builders:
	public Lavadora () {}
	public Lavadora (double precioBase, double peso) {
		this.precioBase=precioBase;
		this.peso=peso;
	}
	
	public Lavadora (double precioBase, String color, double peso, char consumoEnergetico, double carga) {
		super (precioBase, color, peso, consumoEnergetico);
		this.carga=carga;
	}
	
	//Methods:
	public double precioFinal (double carga, double precioBase) {
		double precioFinalLavadora = 0;
		if (carga > 30) {
			precioFinalLavadora=precioBase+50;
		} else precioFinalLavadora = precioBase;
		
	return precioFinalLavadora;
	}
}