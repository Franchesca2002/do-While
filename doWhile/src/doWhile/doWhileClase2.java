package doWhile;

import javax.swing.JOptionPane;

public class doWhileClase2 {

	public static void main(String[] args) {
		int suma =0;
		int numeroUno=1;
		
		do {
			suma += numeroUno;
			numeroUno++;
		} while (numeroUno >=5);

		System.out.println("La suma de los numeros del 1 al 5 es:"+ suma);
	}
	

}
