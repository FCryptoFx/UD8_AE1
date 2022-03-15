package UD8_AE1_Actividad_entregable;

public class Television extends Electrodomestico {

	//Attributes:
	public double resolucion = 20;
	public boolean smartTV = false;
	
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
		super(precioBase, peso);
	}
	
	public Television (double precioBase, String color, double peso, char consumoEnergetico, double resolucion, boolean smartTV) {
		super (precioBase, color, peso, consumoEnergetico);
		this.resolucion=resolucion;
		this.smartTV=smartTV;
	}	
	
	//Methods:
	public double precioFinal() {
		double precioActualizado=super.precioFinal();
		
		if(this.resolucion>40) {
			precioActualizado *= 1.03;
		}
		if(smartTV) {
			precioActualizado += 50;
		}	
		return precioActualizado;
	}
	
	@Override
	public String toString() {
		return "Televisión ==> Resolución: "+resolucion+", SmartTV: " + smartTV + ", Precio Base: " +precioBase
				+"€ , Color: "+ color+", Peso: "+peso+", Consumo Energético: "+consumoEnergetico;
	}
}
