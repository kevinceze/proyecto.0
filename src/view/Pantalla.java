package view;

import java.util.Scanner;

import categoría.entity.NoExisteCategoría;
import categoría.view.CategoríasIO;
import producto.view.ProductosIO;

public class Pantalla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CategoríasIO categoríasIO = new CategoríasIO(10, scanner);
		ProductosIO productosIO = new ProductosIO(10, categoríasIO.getCategorías(), scanner);
		
		categoría.view.Menú.menú(scanner, categoríasIO);
		producto.view.Menú.menú(scanner, productosIO);

		scanner.close();
	}
}
