package view;

import java.util.Scanner;

import categor�a.entity.NoExisteCategor�a;
import categor�a.view.Categor�asIO;
import producto.view.ProductosIO;

public class Pantalla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Categor�asIO categor�asIO = new Categor�asIO(10, scanner);
		ProductosIO productosIO = new ProductosIO(10, categor�asIO.getCategor�as(), scanner);
		
		categor�a.view.Men�.men�(scanner, categor�asIO);
		producto.view.Men�.men�(scanner, productosIO);

		scanner.close();
	}
}
