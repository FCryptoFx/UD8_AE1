package UD8_AE1_Actividad_entregable;

import java.util.ArrayList;
import java.util.Scanner;

import UD8_AE1_Actividad_entregable.Electrodomestico;
import UD8_AE1_Actividad_entregable.Lavadora;
import UD8_AE1_Actividad_entregable.Television;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Creaci�n del arraylist de Electrodom�sticos
		ArrayList<Electrodomestico> arrayElectrodomestico = new ArrayList<Electrodomestico>();
	
		//Creaci�n de objetos de tipo electrodom�stico
		Electrodomestico E1 = new Electrodomestico(250, "Rojo", 37.5, 'B');
		Lavadora E2 = new Lavadora(300, "Blanco", 34.15, 'C', 10.3);
		Television E3 = new Television(500, "Negro", 15.3, 'A', 25, true);
		Electrodomestico E4 = new Electrodomestico(450, "Azul", 40.3, 'D');
		Electrodomestico E5 = new Electrodomestico(870, "Gris", 34.15, 'C');
		Television E6 = new Television(800, "Gris", 39, 'A', 20.3, false);
		Lavadora E7 = new Lavadora(500, 48.4);
		Electrodomestico E8 = new Electrodomestico();
		Lavadora E9 = new Lavadora();
		Television E10 = new Television();
		
		//Se a�aden los electrodom�sticos al arraylist
		arrayElectrodomestico.add(E1);
		arrayElectrodomestico.add(E2);
		arrayElectrodomestico.add(E3);
		arrayElectrodomestico.add(E4);
		arrayElectrodomestico.add(E5);
		arrayElectrodomestico.add(E6);
		arrayElectrodomestico.add(E7);
		arrayElectrodomestico.add(E8);
		arrayElectrodomestico.add(E9);
		arrayElectrodomestico.add(E10);
		
		//Men�
		int opcion = 0;
		
		System.out.println(" --------------------------------------------");
		System.out.println("| ########################################## |");
		System.out.println("| ## Bienvenido Electrodomesticos la Casa ## |");
		System.out.println("| ########################################## |");
		System.out.println(" --------------------------------------------");
		
		do {
			
			System.out.println("\n1. Listar electrodom�sticos.");
			System.out.println("2. A�adir electrodom�sticos.");
			System.out.println("3. Eliminar electrodom�sticos.");
			System.out.println("4. Agrupar electrodom�sticos.");
			System.out.println("5. Salir.");
			System.out.print("Indique que acci�n desea realizar: ");
			opcion = sc.nextInt();
			
			/*if (opcion < 3 || opcion < 5) {
				System.out.println("La opci�n introducida no es v�lida, introduzca una opci�n disponible en el men�.");*/
				
			switch(opcion) {
			case 1:
				listarElectrodomestico(arrayElectrodomestico);
			break;
				
			case 2:
				crearElectrodomestico(arrayElectrodomestico);
			break;
			
			case 3:
				eliminarElectrodomestico(arrayElectrodomestico);
			break;
			
			case 4:
				agruparElectrodomestico(arrayElectrodomestico);
			break;
			
			case 5:
				System.out.println("Ha finalizado el proceso! Vuelva cuando quiera :)");
			break;
			
			default:
				System.out.println("\nLa opci�n introducida no es v�lida, introduzca una opci�n disponible en el men�.");
			}
			
		} while (opcion >=1 && opcion <= 4);
	}
	
		public static void listarElectrodomestico(ArrayList<Electrodomestico> arrayElectrodomestico) {
			
			int i = 0;
			
			System.out.println("\nEstos son los Electrodom�sticos disponibles");
			
			for(Electrodomestico e: arrayElectrodomestico) {
				if(e instanceof Electrodomestico) {
					System.out.println("ID: "+i+". "+e.toString());
					
				} else if(e instanceof Lavadora) {
					
					Lavadora caracteristicas=(Lavadora) e;
					System.out.println("ID: "+i+". "+caracteristicas.toString());
				
				} else if(e instanceof Television) {
					
					Television caracteristicas=(Television) e;
					System.out.println("ID: "+i+". "+caracteristicas.toString());
				}
				
				i++;
			}
		}
		
		public static void crearElectrodomestico(ArrayList<Electrodomestico> arrayElectrodomestico) {
			
			System.out.println("\n1. Electrodom�stico Est�ndar");
			System.out.println("2. Lavadora");
			System.out.println("3. Televisi�n");
			System.out.println("�Que clase de electrodom�stico quiere crear?");
			int respuestaElectrodomestico;
			respuestaElectrodomestico = sc.nextInt();
			
				while(respuestaElectrodomestico <= 1 && respuestaElectrodomestico >= 3) {
					System.out.println("Porfavor,introduzca una opci�n v�lida: ");
					respuestaElectrodomestico = sc.nextInt();
				}
				System.out.println("Indique el precio base: ");
				int precioBase;
				precioBase = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Indique el color: ");
				String color;
				color = sc.nextLine();
				
				System.out.println("Indique el peso: ");
				int peso;
				peso = sc.nextInt();
				
				System.out.println("Indique el tipo de consumo energ�tico: ");
				char consumoEnergetico;
				consumoEnergetico = sc.next().charAt(0);
				
				if(respuestaElectrodomestico == 2) {
					System.out.println("Indique la carga: ");
					int carga;
					carga = sc.nextInt();
					
					Lavadora electrodomesticoNuevo = new Lavadora(precioBase, color, peso, consumoEnergetico, carga);
					arrayElectrodomestico.add(electrodomesticoNuevo);
					
				} else if(respuestaElectrodomestico == 3) {
					System.out.println("Indique la resolucion: ");
					int resolucion;
					resolucion = sc.nextInt();
					
					System.out.println("\n�Tiene SmartTv la televisi�n que desea crear?");
					System.out.println("1.- Si");
					System.out.println("2.- No");
					System.out.println("Indique la respuesta: ");
					int respuestaSmartTV;
					respuestaSmartTV = sc.nextInt();
					
					 while(respuestaSmartTV <= 1 && respuestaSmartTV >= 2) {
							System.out.println("Porfavor, introduzca una opci�n v�lida: ");
							respuestaSmartTV = sc.nextInt();
						}
						
					boolean smartTV;	
						
					if(respuestaSmartTV == 1) {
						smartTV = true;
					} else {
						smartTV = false;
					}
					
					Television electrodomesticoNuevo = new Television(precioBase, color, peso, consumoEnergetico, resolucion, smartTV);
					arrayElectrodomestico.add(electrodomesticoNuevo);
					
				} else {
					Electrodomestico electrodomesticoNuevo = new Electrodomestico(precioBase, color, peso, consumoEnergetico);
					arrayElectrodomestico.add(electrodomesticoNuevo);
				}
				
			}
		
		public static void eliminarElectrodomestico(ArrayList<Electrodomestico> arrayElectrodomestico) {
			int borrarElectrodomestico;
			int respuesta;
			
			 for(int i = 0; i < arrayElectrodomestico.size(); i++) {
		            System.out.println("ID: "+i+" - Precio base: "+arrayElectrodomestico.get(i).getPrecioBase()+" - Color: "+arrayElectrodomestico.get(i).getColor()+" - Peso: "+arrayElectrodomestico.get(i).getPeso()+" - Consumo Energ�tico: "+arrayElectrodomestico.get(i).getConsumoEnergetico());
		        }
			 
			 System.out.println("Indique el ID del electrodom�stico que desea eliminar: ");
			 borrarElectrodomestico = sc.nextInt();
			 
			 System.out.println("�Est� seguro de que desea eliminarlo?");
			 System.out.println("1. S�");
			 System.out.println("2. No");
			 System.out.println("Indique la respuesta: ");
			 respuesta = sc.nextInt();
			 
			 while(respuesta <= 1 && respuesta >= 2) {
				 System.out.println("Porfavor, introduzca una opci�n v�lida: ");
					respuesta = sc.nextInt();
			 }
			 
			 if(respuesta == 1) {
				 arrayElectrodomestico.remove(borrarElectrodomestico);
				 System.out.println("Electrodom�stico eliminado correctamente.");
			 } else {
				 System.out.println("No se ha eliminado el electrodom�stico indicado.");
			 }
		}
		
		public static void agruparElectrodomestico(ArrayList<Electrodomestico> arrayElectrodomestico) {
			
			int precioLavadora = 0;
			int precioTelevision = 0;
			int precioTotal = 0;
			
			for(Electrodomestico e: arrayElectrodomestico) {
				if(e instanceof Electrodomestico) {
					precioTotal += e.precioFinal();
				}
				if(e instanceof Lavadora) {
					Lavadora caracteristicas=(Lavadora) e;
					precioLavadora += caracteristicas.precioFinal();
				}
				
				if(e instanceof Television) {
					Television caracteristicas=(Television) e;
					precioTelevision += caracteristicas.precioFinal();
				}
			}
		
			System.out.println("\nEl precio total de todos los electrodom�sticos disponibles es de: " + precioTotal + "�");
			
		}
}
