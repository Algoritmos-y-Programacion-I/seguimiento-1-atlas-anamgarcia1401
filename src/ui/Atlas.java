/*
* Analisis
* Descripcion del programa: Este programa tiene como objetivo calcular los costos y generar una factura
 * de los paquetes de viaje que venda EVENTOS ATLAS, asegurando un buen calculo con las respectivas opciones 
 * que manejan y casos posibles.
* Entradas:Int noches, Int tipoTransporte, Int tipoViajes
* Salidas: La factura de tipo String

* Ejemplo:
* número de noches: 3
 * Tipo de transporte: Avión
 * Tipo de viaje : Ida y Vuelta
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre, ciudad;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();

        System.out.print(" ¿Qué edad tienes?  ");
        int edad = escaner.nextInt();

        System.out.print(" Por favor escribe tu número de documento:   ");
        int documento = escaner.nextInt();

        System.out.print(" ¿Desde dónde te comunicas con nostros?  ");
        ciudad = escaner.nextLine();

        System.out.print("Ingrese el número de noches de hospedaje (mínimo 1, máximo 4): ");
        int noches = escaner.nextInt();

        System.out.print("Ingrese el tipo de transporte (1 para Bus, 2 para Avión): ");
        int tipoTransporte = escaner.nextInt();

        System.out.print("Ingrese el tipo de viaje (1 para Solo Ida, 2 para Ida y Vuelta): ");
        int tipoViaje = escaner.nextInt();

        double totalTransporte;
        double totalHospedaje;
        
        totalTransporte = calcularTotalTransporte(); 
        totalHospedaje = calcularTotalHospedaje(noches*150000)

        System.out.println("Bienvenido " + nombre + "!");

        System.out.println(" El número de documento es: " + documento + "!");

        System.out.println(" La edad es:  " + edad + "!");

        System.out.println("El total del hospedaje es:  " + totalHospedaje + "!");
        System.out.println("El total del transporte es: " + totalTransporte + "!");
        
        
        }

	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calcularTotalTransporte() {
        return 0; // Completar operacion
    }

	

	
}