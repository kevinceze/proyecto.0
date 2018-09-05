package categor�a.control;

import categor�a.entity.Categor�a;
import categor�a.entity.NoExisteCategor�a;

public class Categor�as {

	private Categor�a[] categor�as;
	private int cantidad;
	private int �ltimo;

	public Categor�as(int tama�o) {
		categor�as = new Categor�a[tama�o];
		cantidad = 0;
		�ltimo = -1;
	}

	/****************************
	 * Ingresar una Categor�a    *
	 ****************************/
	
	public void ingresar(Categor�a Categor�a) throws  java.lang.ArrayIndexOutOfBoundsException{
		
		categor�as[++�ltimo] = Categor�a;
		cantidad++;
	}

	/****************************
	 * Devuelve la cantidad de  *
	 * elementos                *
	 ****************************/
	
	
	public int getCantidad() {
		return cantidad;
	}
	

	/****************************
	 * Eliminar una Categor�a     
	 * @throws NoExisteCategor�a *
	 ****************************/
	
	public void eliminar(int codCategor�a) throws NoExisteCategor�a {
		int �ndice;
		�ndice = buscar(codCategor�a);

			if (�ndice != �ltimo) {
				for (int i = �ndice; i <= �ltimo; i++) {
					categor�as[i] = categor�as[i + 1];
				}
			}
			�ltimo--;
			cantidad--;
	}
	
	
	/****************************
	 * Buscar una   Categor�a     
	 * @throws NoExisteCategor�a *
	 ****************************/

	public int buscar(int codCategor�a) throws NoExisteCategor�a {
		int �ndice = -1;
		for (int i = 0; i <= �ltimo; i++) {
			if (codCategor�a == categor�as[i].getCodCategor�a()) {
				�ndice = i;
			}
		}
		if (�ndice == -1) {
			throw new NoExisteCategor�a();
		}
		return �ndice;
	}
	
	
	/****************************
	 * Devuelve el vector de    * 
	 * Categor�as                *
	 ****************************/

	public Categor�a[] getCategor�as() {
		return categor�as;
	}
}
