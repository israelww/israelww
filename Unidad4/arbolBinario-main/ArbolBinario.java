
public class ArbolBinario {
	protected Nodo raiz;
	
	public ArbolBinario() {
		raiz = null;
	}
	public ArbolBinario(Nodo raiz) {
		this.raiz =raiz;
	}
	public Nodo getRaiz() {
		return raiz;
	}
	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	//Implementación recursiva de los recorridos
	/**
	 * Invoca al método recursivo
	 */
	public void preorden() {
		preorden(raiz);
	}
	/**
	 * 
	 * @param aux
	 */
	private void preorden(Nodo aux) {
		if(aux !=null) {
			visitar(aux);
			preorden(aux.getIzquierdo());
			preorden(aux.getDerecho());
		}
	}
	private void visitar(Nodo aux) {
		System.out.print(aux.getValor()+" ");
	}
	/**
	 * Invoca al método recursivo
	 */
	public void inorden() {
		inorden(raiz);
	}
	/**
	 * 
	 * @param aux referencia a un nodo
	 */
	private void inorden(Nodo aux) {
		if(aux !=null) {
			inorden(aux.getIzquierdo());
			visitar(aux);
			inorden(aux.getDerecho());
		}
	}
	/**
	 * Invoca al método recursivo
	 */
	public void postorden() {
		postorden(raiz);
	}
	/**
	 * 
	 * @param aux referencia a un nodo
	 */
	
	private void postorden(Nodo aux) {
		if(aux !=null) {
			postorden(aux.getIzquierdo());
			postorden(aux.getDerecho());
			visitar(aux);
		}
		
		
	}
	/**
	 * Recorrido preorden version iterativa, utilizando una pila
	 */
	public void preordenIterativo() {
		//Usa la misma implementacion de Pila de la unidad 
		//anterior
		pilas.Pila<Nodo> pila = new pilas.Pila<Nodo>();
		pila.apilar(raiz);
		while (!pila.esVacia()) {
			Nodo aux = pila.cima();
			visitar(aux);
			pila.retirar();
			if(aux.getDerecho() !=null)
				pila.apilar(aux.getDerecho());
			if(aux.getIzquierdo() !=null)
				pila.apilar(aux.getIzquierdo());
		}
		
	}
	
	/**
	 * Recorrido inorden version iterativa, utilizando una pila
	 */
	public void inordenIterativa() {
		pilas.Pila<Nodo> pila = new pilas.Pila<Nodo>();
		pila.apilar(raiz);
		Nodo aux = raiz.getIzquierdo();
		while (aux !=null || !pila.esVacia()) {
			if(aux !=null) {
				pila.apilar(aux);
				aux = aux.getIzquierdo();
			}else {
				aux = pila.cima();
				pila.retirar();
				visitar(aux);
				aux = aux.getDerecho();
			}
			
		}
	}
	
	/**
	 * Recorrido postorden version iterativa, utilizando una pila
	 */
	public void postOrdenIterativo() {
		pilas.Pila<Nodo> pila = new pilas.Pila<Nodo>();
		Nodo aux = raiz;
		Nodo q = raiz;
		while (aux != null) {
			//Avanza por la izquierda y apila los nodos
			while(aux.getIzquierdo() !=null) {
				pila.apilar(aux);
				aux  = aux.getIzquierdo();
			}
			while (aux !=null && (aux.getDerecho() ==null 
					|| aux.getDerecho()==q)) {
				visitar(aux);
				q = aux;
				if (pila.esVacia())
					return;
				aux = pila.cima();
				pila.retirar();
			}
			pila.apilar(aux);
			aux = aux.getDerecho();
		}
	} 
	/**
	 * Recorrido por nivels
	 * 
	 */
	public void recorridoPorNiveles() {
		colas.Cola<Nodo> cola = new colas.Cola<Nodo>();
		cola.encolar(raiz);
		while (!cola.esVacia()){
			Nodo aux = cola.frente();
			System.out.print(aux.getValor().toString()+" ");
			if(aux.getIzquierdo() !=null)
				cola.encolar(aux.getIzquierdo());
			if(aux.getDerecho() !=null)
				cola.encolar(aux.getDerecho());
			cola.desencolar();
		}
		
	}
	
	
	
	

}
