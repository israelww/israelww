package clase7;

	public class Nodo<T> {
		//Atributo valor tipo T.Almacena al referenciar el objeto
		private T valor;
		//Referencia al siguiente nodo enlazado
		Nodo<T> siguiente;
		//constructor por defecto
		public Nodo() {
			valor =null;
			siguiente =null;
			
		}
		//devuelve el valor
		public T getValor() {
			return valor;
		}
		//Modifica el valor
		public void setValor(T valor) {
			this.valor = valor;
		}
		//Devuelve el atributo
		public Nodo<T> getSiguiente() {
			return siguiente;
		}
		//Modifica el atributo siguiente
		public void setSiguiente(Nodo<T> siguiente) {
			this.siguiente = siguiente;
		}
		
		
	}
	
	
	