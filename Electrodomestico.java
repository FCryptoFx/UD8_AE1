package UD8_AE1_Actividad_entregable;

public class Electrodomestico {
	
	//Attributes:
	public double precioBase;
	public String color;
	public double peso;
	public char consumoEnergetico;
	
	//Getters & Setters
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	//No sé como obligas a un atributo char a estar entre dos valores array? if's?
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	//Builders:
	public Electrodomestico () {}
	
	public Electrodomestico (double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	public Electrodomestico (double precioBase, String color, double peso, char consumoEnergetico) {
		this.precioBase=precioBase;
		this.color=color;
		this.peso=peso;
		this.consumoEnergetico=consumoEnergetico;
	}
	
	//Methods:
	public char comprobarConsumo (char consumoEnergetico) {
		if (this.getConsumoEnergetico() == 'A' || this.getConsumoEnergetico() == 'B' || this.getConsumoEnergetico() == 'C' || this.getConsumoEnergetico() == 'D' || this.getConsumoEnergetico() == 'E' || this.getConsumoEnergetico() == 'F') {
			 this.setConsumoEnergetico(this.consumoEnergetico);
		}else  this.setConsumoEnergetico('F');
	
	return getConsumoEnergetico();
	}
	
	public String comprobarColor (String Color) {
		if (this.getColor() == "blanco" || this.getColor() == "negro" || this.getColor() == "rojo" || this.getColor() == "azul" || this.getColor() == "gris") {
			this.setColor(this.color);
		} else this.setColor("blanco");
		
	return this.getColor();
	}
	
	public double precioFinal (char consumoEnergetico, double precioBase, double peso) {
		double precioFinal = 0;
		if (consumoEnergetico == 'A' || peso >= 79) {
			precioFinal = precioBase+100;
		} else if (consumoEnergetico == 'B' || (peso >= 50 && peso < 79)) {
			precioFinal = precioBase+80;
		} else if (consumoEnergetico == 'C') {
			precioFinal = precioBase+60;
		}else if (consumoEnergetico == 'D' || (peso >= 20 && peso <= 49)) {
			precioFinal = precioBase+50;
		}else if (consumoEnergetico == 'E') {
			precioFinal = precioBase+30;
		}else if (consumoEnergetico == 'F' || peso <= 19) {
			precioFinal = precioBase+10;
		}
		
	return precioFinal;
	}
}
