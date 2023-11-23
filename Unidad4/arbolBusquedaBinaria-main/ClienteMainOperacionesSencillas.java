

public class ClienteMainOperacionesSencillas {

	public static void main(String[] args) {
		ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
		try {
			//Agregar los datos al binario ordenado
			arbol.insertar(new Entero(10));
			arbol.insertar(new Entero(15));
			arbol.insertar(new Entero(30));
			arbol.insertar(new Entero(8));
			arbol.insertar(new Entero(5));
			arbol.insertar(new Entero(2));
			arbol.insertar(new Entero(1));
			
		}catch(Exception e) {
			System.out.println("Error "+e.getMessage());
		}
		//Recorrido
		System.out.println("Recorridos Recursivos");
		System.out.println("Preorden");
		arbol.preorden();
		System.out.println("\nInorden");
		arbol.inorden();
		System.out.println("\nPostorden");
		arbol.postorden();
		System.out.println("\nPor Niveles");
		arbol.recorridoPorNiveles();
		
		//Imprimirelarbol
		BTreePrinter.printNode(arbol.getRaiz());
		//Busqueda Iterativa
		
		

	}

}
