package clase7;

public class colas<T> {

	
	private Nodo<T> cabeza;
	
	private Nodo<T> cola;
	
	private int tamaño;
	//Constructor por defecto
	public colas() {
		cabeza=null;
		cola=null;
		tamaño =0;
		
	}
	//Verificar si lac ola esta vacia 
	public boolean esVacia() {
		return( cabeza == null);
	}
	//Encolar elemenmto nuevo
	public void encolar(T valor) {
		//Crear Nuevo Nodo
		Nodo<T> nuevo = new Nodo<T>();
		nuevo.setValor(valor);
		if(esVacia()) {
			//Caebza y cola apuntan al nuevo elemento
			cabeza = nuevo;
			cola = nuevo;
		}else {
			//se enlaza el campo siguiente de cola con el nuevo elemento
			cola.setSiguiente(nuevo);
			//La nueva cola pAsa a ser el nuevo 
			cola= nuevo;
		}
		//Incrementa el tamaño por que ha un nuevo elemento
		tamaño++;
		
	}
	//Desencolar o eliminar el primer elemento de la cola 
	public void desencolar() {
		if(!esVacia()) {
			//Verificar si hay un solo elemento en la cola
			if(cabeza==cola) {
				cabeza = null;
				cola = null;
			}else {
				//Se eliminia el primer elemento de la cola
				//Desplazando la cabeza al siguiente nodo
				cabeza = cabeza.getSiguiente();
			
			}
			//Se dismniuye el tamaño
			tamaño --;
			
		}
	}
	//DEvolver el pirmer elemenro de la cola 
	public T frente() {
		
		if(!esVacia()) 
			return cabeza.getValor();
		else 
			return null;
		
		
	}
	
}
