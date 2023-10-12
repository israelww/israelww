package CLASE4;

import java.util.Stack;

public class EjemploStack {
	
	public static void main(String[]args) {
		// Crear una nueva Pila de enteros
		Stack<Integer> pila=new Stack<Integer>();
		//Se apilan algunos datos
		pila.push(2);
		pila.push(5);
		pila.push(7);
		//Consultar la cima
		System.out.println("Eltope de la pila es: "+pila.peek());
		//Se desapila
		pila.pop();
		System.out.println("El tope de la pila es:"+pila.peek());
		pila.pop();
		System.out.println("El tope de la pila es:"+pila.peek());
		pila.pop();
		if(pila.empty())
			System.out.println("Pila Vacia");
		System.out.println("El tope de la pila es:"+pila.peek());
		
		
		
		
	}
}
