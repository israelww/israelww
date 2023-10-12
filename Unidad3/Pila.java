package clase3;
//haremos que se apunte al tamaño y se vaya incrementando
// En pocas palabras modificaremos el apuntador de la cabeza
public class Pila<T> {
	
	//Atributo cabeza, que apunta al tope de la pila 
	private Nodo<T> cabeza;
	
	//Almacena el total de elementos de la pila 
	private int tamaño;
	
	//COntructor por defecto
	public Pila() {
		cabeza =null;
		tamaño =0;
	}
	
	//Devuelve el tamaño de la pila 
	public int getTamaño() {
		return tamaño;
	}
	
	//Verificar si la pila esta vacia
	public boolean esVacia() {
		return (cabeza ==null);
		
	}
	//Apilar nuevo elemento
	public void apilar (T valor) {
		
		//Crear nuevo nodo
		Nodo<T> nuevo = new Nodo<T>();
		//fijar el valor dentro del nodo
		nuevo.setValor(valor);
		
		if(esVacia()) {
			//cabeza apunta al nuevo nodo
			cabeza = nuevo;
		}
		else {
			//Se enlaza el campo siguiente al nuevo con la cabeza
			nuevo.setSiguiente(cabeza);
			//La nueva cabeza de la pila pasa a ser el nuevo
			cabeza=nuevo;
		}
		//autoincrement
		
		tamaño++;
		
	}
	
	public void retira() {
		if(!esVacia()) {
			cabeza= cabeza.getSiguiente();
			tamaño--;
			
		}
	}
	//Si la cima esta vacia me regresa el valor y si no me regresa null
	public T cima() {
	if(!esVacia()) {
		return cabeza.getValor();
	}else {
		return null;
	}
	

	}
}
