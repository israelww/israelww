package clase7;

public class AppColas {

	public static void main(String[] args) {
		//Crear una nueva cola de enteros 
		colas<Integer> cola = new colas<Integer>();
		
		cola.encolar(123);
		cola.encolar(122);
		cola.encolar(121);
		cola.encolar(120);
		cola.encolar(119);
		//imprime el primer elemento de la cola
		System.out.println("El primer elemento de la cola = "+cola.frente());
		cola.desencolar();
		
		System.out.println("El primer elemento de la cola = "+cola.frente());
		cola.desencolar();

		System.out.println("El primer elemento de la cola = "+cola.frente());
		cola.desencolar();
		
		System.out.println("El primer elemento de la cola = "+cola.frente());
		cola.desencolar();
		
		System.out.println("El primer elemento de la cola = "+cola.frente());
		cola.desencolar();
		
		System.out.println("El primer elemento de la cola = "+cola.frente());
		cola.desencolar();
		
	}

}
