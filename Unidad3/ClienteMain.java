package clase3;

public class ClienteMain {

	public static void main(String[] args) {
		// Crear nueva pila de enteros
		Pila<Integer> pila2= new Pila<Integer>();
		
		//Apilar los elementos
		pila2.apilar(2);
		pila2.apilar(5);
		pila2.apilar(9);
		System.out.println("El tope de la pila es: "+pila2.cima());
		
		//Desapilar
		pila2.retira();
		System.out.println(" El nuevo tope es: "+pila2.cima());
		pila2.retira();
		System.out.println(" El nuevo tope es: "+pila2.cima());
		pila2.retira();
		System.out.println(" El nuevo tope es: "+pila2.cima());

	}

}
