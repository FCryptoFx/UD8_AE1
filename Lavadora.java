package UD8_AE1_Actividad_entregable;

public class Lavadora extends Electrodomestico {

	//Attributes:
	protected double carga = 5;

	//Getters & Setters:
	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga=carga;
	}
	
	//Builders:
	public Lavadora () {}
	
	public Lavadora (double precioBase, double peso) {
		super(precioBase, peso);
	}
	
	public Lavadora (double precioBase, String color, double peso, char consumoEnergetico, double carga) {
		super (precioBase, color, peso, consumoEnergetico);
		this.carga=carga;
	}
	
	//Methods:
	public double precioFinal() {
		double precioActualizado=super.precioFinal();
		
		if(this.carga > 30) {
			this.precioBase+=30;
			precioActualizado+=50;
		}
		return precioActualizado;
	}
	
	@Override
	public String toString() {
		return "Lavadora ==> Carga: "+carga+", Precio Base: "+precioBase+"€ , Color: "+color+", Peso: "+peso
				+", Consumo Energético: "+consumoEnergetico;
	}
}