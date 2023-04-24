package carrito_de_compra;
import java.util.ArrayList;



public class item_carrito {
	public int ideitem_carrito;
	public double  item_total;
	public double  cantidad;
	public item_carrito(int item_carrito, double item_total, double cantidad) {
	
		
		Producto producto = new Producto();
		String archivo = "C:\\Users\\y01cmadriaga\\eclipse-workspace\\carrito_de_compr_8\\src\\carrito_de_compra\\mercaderia.csv";
		
			
		ArrayList<Produc> product = producto.leerArchivo(archivo);
		
		
		
		for (int i=0; i< product.size(); i++) {
			System.out.println("\n" + product.get(i).getProd() +  " " + product.get(i).getPreciounitario());
			
			
			
				}
		
		
	}

}
