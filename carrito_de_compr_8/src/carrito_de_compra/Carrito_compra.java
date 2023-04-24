package carrito_de_compra;

import java.util.ArrayList;



public class Carrito_compra {

	public static void main(String[] args) {
		
		// vamos a llamar al producto
		
		Persona persona1 = new Persona("Pedro", "Lezcano", "12/04/1987");
		//Producto persona1_prod = new Producto(0, null, 0);
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getApellido());
		System.out.println(persona1.getFechanacim());
		
		Producto pers1_prod = new Producto();
		item_carrito pers_prod = new item_carrito(0, 0, 0);
	
		//System.out.println(pers1_prod.Prod.charAt(0));

	}
	
	
}
