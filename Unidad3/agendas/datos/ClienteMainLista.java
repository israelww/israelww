package datos;

public class ClienteMainLista {

	public static void main(String[] args) {
		try {
			Lista<Integer> lista = new Lista<Integer>();
			//Agregar elementos a la lista
			lista.agregar(12);
			lista.agregar(15);
			lista.agregar(20);
			//Imprimir los valores
			System.out.println("Datos del elemento 0: " +
					lista.getValor(0));
			System.out.println("Datos del elemento 1: " +
					lista.getValor(1));
			System.out.println("Datos del elemento 2: " +
					lista.getValor(2));
			//Insertar elementos
			lista.insertar(13, 1);
			lista.insertar(16, 3);
			System.out.println("Mostrar los valores despues de la insercion ");
			System.out.println("Datos del elemento 0: " +
					lista.getValor(0));
			System.out.println("Datos del elemento 1: " +
					lista.getValor(1));
			System.out.println("Datos del elemento 2: " +
					lista.getValor(2));
			System.out.println("Datos del elemento 3: " +
					lista.getValor(3));
			System.out.println("Datos del elemento 4: " +
					lista.getValor(4));
			//Remover elementos
			lista.remover(0);
			lista.remover(3);
			System.out.println("Valores despues de remover");
			System.out.println("Datos del elemento 0: " +
					lista.getValor(0));
			System.out.println("Datos del elemento 1: " +
					lista.getValor(1));
			System.out.println("Datos del elemento 2: " +
					lista.getValor(2));
			
			
		}catch( PosicionIlegalException e) {
			e.printStackTrace();
		}

	}
}