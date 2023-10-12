package datos;

public class PosicionIlegalException extends Exception{
	public PosicionIlegalException() {
		super("posicion ilegal en la lista");
	}

}