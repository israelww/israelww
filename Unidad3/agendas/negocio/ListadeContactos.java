package negocio;

import datos.Contacto;
import datos.Lista;
import datos.PosicionIlegalException;


public class ListadeContactos {
//Atributos
	private Lista<Contacto> contactos;
	
	public ListadeContactos() {
		contactos =new Lista<Contacto>();
	}
	
	public Lista<Contacto> mostrarTodosLosContactos(){
		try {
			for(int i=0; i<contactos.getTamanio();i++) {
				System.out.println("Num:"+i+"-> ");
				System.out.println(contactos.getValor(i).getNombres()+" "+
				contactos.getValor(i).getApellidos()+" "+
				contactos.getValor(i).getDireccion()+" "+
				contactos.getValor(i).getCelular());
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return contactos;
	}
	/*
	 *Agregar un nuevo contacto
	 */
	
	public boolean agregarContacto(String nombres,String apellido,
			String direccion,String telefono,String celular,)throws PosicionIlegalException{
		Contacto con =buscarCOntacto(nombres,apellido);
		if(con== null) {
			Contacto
		}
	}
	
	
}
