package producto.view;

import java.util.Scanner;

import categoría.control.Categorías;
import categoría.entity.NoExisteCategoría;
import producto.control.Productos;
import producto.entity.Producto;
import view.InputTypes;

public class ProductosIO {
	private Productos productos;
	private Scanner scanner;
	private Categorías categorías;
	
	
	/****************************
	 * Constructor              *
	 ****************************/
	
	public ProductosIO(int n, Categorías categorías, Scanner scanner) {
		productos = new Productos(n);
		this.scanner = scanner;
		this.categorías = categorías;
	}

	
	/****************************
	 * Agregar productos        
	 * @throws NoExisteCategoría *
	 ****************************/
	
	public void add() throws NoExisteCategoría {
		Producto producto = ProductoIO.ingresar(scanner, categorías);
		try {
			productos.ingresar(producto);
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("No existe espacio!");
		}
	}
	
	
	/****************************
	 * Eliminar productos       *
	 ****************************/
	
	public void delete() {
		int codProducto = InputTypes.readInt("Código de producto: ", scanner);
		productos.eliminar(codProducto);
	}

	
	/****************************
	 * Listar productos         *
	 ****************************/
	
	public void list() {
		for (int i = 0; i < productos.getCantidad(); i++) {
			System.out.println(productos.getProductos()[i]);
		}
	}
}
