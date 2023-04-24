
package carrito_de_compra;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;


	public class Producto {
	public String Prod;
	public String Preciounitario;
	
	ArrayList<Produc> prod = new ArrayList<>();
	
	
	public Producto() {
		
	}
	// Metodo
	
		public ArrayList<Produc> leerArchivo(String archivo) {
		
		String Prod, Preciounitario;
		
		File file = new File(archivo);
		
		try (Scanner fileScn = new Scanner(file, StandardCharsets.UTF_8)) {

			while (fileScn.hasNextLine()) {

				String[] vector = (fileScn.nextLine()).split(";");
				Prod = vector[0];
				Preciounitario = vector[1];
				System.out.println( Prod +"," + Preciounitario  );
				System.out.println( Preciounitario );
				Produc produc = new Produc();
				produc.Prod = Prod;
				produc.Preciounitario = Preciounitario;
				
				prod.add(produc);
				


			}

		} catch (IOException e) {
			e.printStackTrace();

		}
		
		return prod;
	}

	
}
	
	