package UD8_AE1_Actividad_entregable;

public class Television extends Electrodomestico {

	//Attributes:
	public double resolucion;
	public boolean smartTV;
	
	//Getters & Setters:
	public double getResolucion() {
		return resolucion;
	}
	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isSmartTV() {
		return smartTV;
	}
	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
	
	//Builders:
	public Television () {}
	
	public Television (double precioBase, double peso) {
		this.precioBase=precioBase;
		this.peso=peso;
	}
	
	public Television (double precioBase, String color, double peso, char consumoEnergetico, double resolucion, boolean smartTV) {
		super (precioBase, color, peso, consumoEnergetico);
		this.resolucion=resolucion;
		this.smartTV=smartTV;
	}	
	
	//Methods:

}
