package UI;

import java.util.Scanner;

public class Interfaz {

	static Scanner entrada = new Scanner(System.in);
	
	private static void imrpimirMenu() {
		System.out.println("Bienvenido ");
		System.out.println("Por favor, escoje una opcion");
		System.out.println("Para acceder a la opcion, escriba el numero ");
		//por implementar
		imprimirMenu();
	}
	private static void imprimirMenu() {
	
		System.out.println("Por favor, escoje una opcion");
		System.out.println("Para acceder a la opcion, escriba el numero ");
		System.out.println("------Menu Principal------- ");
		System.out.println("1.- Ingresar Nuevo Contactos");
		System.out.println("2.- Mostrar contactos ");
		System.out.println("3.- Modificar Contactos ");
		System.out.println("4.- Eliminar Contactos");
		System.out.println("5.- Salir ");
		System.out.println("--------------------------- ");
		int opcion = entrada.nextInt();
		switch(opcion) {
		case 1:
			entrada.hasNextLine();//Limpia el Scanner
			break;
		case 2:
			
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			salir();
			break;
		default:
			System.out.println("Opcion invalida");
			System.out.println("Adios!");
			break;
		}
			
		}
		
		private static void salir() {
			System.out.println("Sesion Finalizada");
			System.out.println("Salir");
			System.exit(0);
			
		}
	
		
	}
	
	

