package tipos_datos;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	       char letra;

	        System.out.print("Introduzca una letra: ");
	        letra = sc.next().charAt(0);
	        if (Character.isUpperCase(letra)) {
				System.out.println("May�scula");
			} else {
				System.out.println("Min�scula");
			}
	}

}
