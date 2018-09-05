package categor�a.view;

import java.util.Scanner;

import categor�a.control.Categor�as;
import categor�a.entity.Categor�a;
import categor�a.entity.NoExisteCategor�a;
import view.InputTypes;

public class Categor�asIO {
	private Categor�as categor�as;
	private Scanner scanner;

	
	/****************************
	 * Constructor              *
	 ****************************/
	
	public Categor�asIO(int n, Scanner scanner) {
		categor�as = new Categor�as(n);
		this.scanner = scanner;
	}

	
	/****************************
	 * Agregar categor�as        *
	 ****************************/
	
	public void add() {
		Categor�a categor�a = Categor�aIO.ingresar(scanner);
		try {
			categor�as.ingresar(categor�a);
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("No existe espacio!");
		}
	}
	
	
	/****************************
	 * Eliminar categor�as       
	 * @throws NoExisteCategor�a *
	 ****************************/
	
	public void delete() throws NoExisteCategor�a {
		int codcategor�a = InputTypes.readInt("C�digo de categor�a: ", scanner);
		categor�as.eliminar(codcategor�a);
	}

	
	/****************************
	 * Listar categor�as         *
	 ****************************/
	
	public void list() {
		for (int i = 0; i < categor�as.getCantidad(); i++) {
			System.out.println(categor�as.getCategor�as()[i]);
		}
	}

	/****************************
	 * Vector de categor�as     *
	 ****************************/
	public Categor�as getCategor�as() {
		return categor�as;
	}
	
	
}
