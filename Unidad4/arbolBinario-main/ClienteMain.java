

public class ClienteMain {

	public static void main(String[] args) {
		//crear el arbol binario de la figura de los recorridos
		
		ArbolBinario ab = new ArbolBinario();
		Nodo nodoA = new Nodo("A");
		Nodo nodoB = new Nodo("B");
		Nodo nodoC = new Nodo("C");
		Nodo nodoD = new Nodo("D");
		Nodo nodoE = new Nodo("E");
		Nodo nodoF = new Nodo("F");
		Nodo nodoG = new Nodo("G");
		ab.setRaiz(nodoA);
		ab.getRaiz().setIzquierdo(nodoB);
		ab.getRaiz().setDerecho(nodoC);
		nodoB.setIzquierdo(nodoD);
		nodoB.setDerecho(nodoE);
		nodoC.setIzquierdo(nodoF);
		nodoC.setDerecho(nodoG);
		
		//Imprimir lo recorridos
		System.out.println("PreOrden");
		ab.preorden();
		System.out.println("\nPreOrden Iterativa");
		ab.preordenIterativo();
		
		System.out.println("\nInOrden");
		ab.inorden();
		System.out.println("\nInOrden Iterativa");
		ab.inordenIterativa();
		
		System.out.println("\nPostOrden");
		ab.postorden();
		System.out.println("\nPostOrden Iterativa");
		ab.postOrdenIterativo();
		
		System.out.println("\nRecorrido por Niveles");
		ab.recorridoPorNiveles();
		
		
		
		

	}

}
