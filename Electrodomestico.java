package UD8_AE1_Actividad_entregable;

public class Electrodomestico {
	
	//Attributes:
	protected double precioBase = 100;
	protected String color = "Blanco";
	protected double peso;
	protected char consumoEnergetico = 'F';
	
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
		this.color= comprobarColor(color);
		this.peso=peso;
		this.consumoEnergetico=comprobarConsumo(consumoEnergetico);
	}
	
	//Methods:
	public char comprobarConsumo (char consumoEnergetico) {
		char consumoActualizado = 'F';
		
		if (Character.toString(consumoEnergetico).matches("[a-f]") || Character.toString(consumoEnergetico).matches("[A-F]")) {
			consumoActualizado = Character.toUpperCase(consumoEnergetico);
		}
		return consumoActualizado;
	}
	
	public String comprobarColor(String color) {
		String colorActualizado="Blanco";
		
		if(color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris")) {
			colorActualizado=color;
		}
		return colorActualizado;
	}
	
public double precioFinal() {
		
		double precioActualizado = 0;
		
		if(this.consumoEnergetico=='A') {
			precioActualizado = (this.getPrecioBase()+100);
		} else if(this.consumoEnergetico=='B') {
			precioActualizado = (this.getPrecioBase()+80);
		} else if(this.consumoEnergetico=='C') {
			precioActualizado = (this.getPrecioBase()+60);
		} else if(this.consumoEnergetico=='D') {
			precioActualizado = (this.getPrecioBase()+50);
		} else if(this.consumoEnergetico=='E') {
			precioActualizado = (this.getPrecioBase()+30);
		} else if(this.consumoEnergetico=='F') {
			precioActualizado = (this.getPrecioBase()+10);
		}
		
		if(this.peso <= 19) {
			precioActualizado = (this.getPrecioBase()+10);
		} else if(this.peso >= 20 && this.peso <= 49) {
			precioActualizado = (this.getPrecioBase()+50);
		} else if(this.peso >= 50 && this.peso <= 79) {
			precioActualizado = (this.getPrecioBase()+80);
		} else if(this.peso > 79) {
			precioActualizado = (this.getPrecioBase()+100);
		}
		
		return precioActualizado;
	}

	@Override
	public String toString() {
		return "Electrodoméstico ==> Precio Base: "+precioBase+"€ , Color: "+color+", Peso: "+peso
				+", Consumo Energético:"+consumoEnergetico;
	}
}