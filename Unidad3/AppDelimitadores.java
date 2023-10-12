package clase5;

public class AppDelimitadores {

	public static void main(String[] args) {
		Delimitadores objDel = new Delimitadores();
		String exp ="(a+b)/2";//VALida
		if (objDel.evaluacionDelimitadores(exp))
			System.out.println("Expresion Valida");
		else
			System.out.println("Expresion Invalida");
		exp ="(a+b/2";
		if (objDel.evaluacionDelimitadores(exp))
			System.out.println("Expresion Valida");
		else
			System.out.println("Expresion Invalida");
		
		
		

	}

}
