package categoría.view;

import java.util.Scanner;

import categoría.control.Categorías;
import categoría.entity.Categoría;
import categoría.entity.NoExisteCategoría;
import view.InputTypes;

public class CategoríasIO {
	private Categorías categorías;
	private Scanner scanner;

	
	/****************************
	 * Constructor              *
	 ****************************/
	
	public CategoríasIO(int n, Scanner scanner) {
		categorías = new Categorías(n);
		this.scanner = scanner;
	}

	
	/****************************
	 * Agregar categorías        *
	 ****************************/
	
	public void add() {
		Categoría categoría = CategoríaIO.ingresar(scanner);
		try {
			categorías.ingresar(categoría);
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("No existe espacio!");
		}
	}
	
	
	/****************************
	 * Eliminar categorías       
	 * @throws NoExisteCategoría *
	 ****************************/
	
	public void delete() throws NoExisteCategoría {
		int codcategoría = InputTypes.readInt("Código de categoría: ", scanner);
		categorías.eliminar(codcategoría);
	}

	
	/****************************
	 * Listar categorías         *
	 ****************************/
	
	public void list() {
		for (int i = 0; i < categorías.getCantidad(); i++) {
			System.out.println(categorías.getCategorías()[i]);
		}
	}

	/****************************
	 * Vector de categorías     *
	 ****************************/
	public Categorías getCategorías() {
		return categorías;
	}
	
	
}
