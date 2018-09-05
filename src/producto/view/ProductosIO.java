package producto.view;

import java.util.Scanner;

import categor�a.control.Categor�as;
import categor�a.entity.NoExisteCategor�a;
import producto.control.Productos;
import producto.entity.Producto;
import view.InputTypes;

public class ProductosIO {
	private Productos productos;
	private Scanner scanner;
	private Categor�as categor�as;
	
	
	/****************************
	 * Constructor              *
	 ****************************/
	
	public ProductosIO(int n, Categor�as categor�as, Scanner scanner) {
		productos = new Productos(n);
		this.scanner = scanner;
		this.categor�as = categor�as;
	}

	
	/****************************
	 * Agregar productos        
	 * @throws NoExisteCategor�a *
	 ****************************/
	
	public void add() throws NoExisteCategor�a {
		Producto producto = ProductoIO.ingresar(scanner, categor�as);
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
		int codProducto = InputTypes.readInt("C�digo de producto: ", scanner);
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
