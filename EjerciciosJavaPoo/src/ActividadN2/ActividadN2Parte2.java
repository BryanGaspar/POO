package ActividadN2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ActividadN2Parte2 {

	public static void main(String[] args) {
		/*2. Elaborar un programa que calcule e imprima el �rea de las siguientes figuras
		 * geom�tricas seg�n la opci�n seleccionada:

		a.- �rea del tri�ngulo (Ingresar base y altura)
		b.- �rea del Cuadrado (Ingresar lado)
		c.- �rea del C�rculo (Ingresar radio)
		d.- �rea del Rect�ngulo (Ingresar base y altura)
	*/
		Scanner sc = new Scanner(System.in);
		double b, h, l, r;
		final double PI = 3.141516;
		char op;

		System.out.print("Menu: "
				+ "\na.�rea del tri�ngulo "
				+ "\nb.�rea del Cuadrado "
				+ "\nc.�rea del C�rculo "
				+ "\nd.�rea del Rect�ngulo "
				+ "\nIngrese una opcion: ");

		op = sc.next().charAt(0);
		switch(op) {
		case 'a':
		case 'A':
			System.out.println("Selecciono �rea del tri�ngulo");
			System.out.print("Ingrese la base: ");
			b = sc.nextDouble();
			System.out.print("Ingrese la altura: ");
			h = sc.nextDouble();
			double calculo = (b * h)/2;
			BigDecimal resultado = new BigDecimal(calculo).setScale(2, RoundingMode.HALF_UP);
			System.out.print("El �rea del triangulo es: " + resultado);
		break;
		case 'b':
		case 'B':
			System.out.println("Selecciono �rea del cuadrado");
			System.out.print("Ingrese el valor de los lados: ");
			l = sc.nextDouble();
			double areaCuadrado = Math.pow(l, 2);
			System.out.print("El �rea del cuadrado es: " + areaCuadrado);
		break;
		case 'c':
		case 'C':
			System.out.println("Selecciono �rea del circulo");
			System.out.print("Ingrese el radio: ");
			r = sc.nextDouble();
			double areaCirculo = PI * Math.pow(r, 2);
			BigDecimal resultado1 = new BigDecimal(areaCirculo).setScale(2, RoundingMode.HALF_UP);
			System.out.print("El �rea del circulo es: " + resultado1);
		break;
		case 'd':
		case 'D':
			System.out.println("Selecciono �rea del rect�ndulo");
			System.out.print("Ingrese la base: ");
			b = sc.nextDouble();
			System.out.print("Ingrese la altura: ");
			h = sc.nextDouble();
			double areaRectangulo = b * h ;
			System.out.print("El �rea del rectangulo es: " + areaRectangulo);
		break;
		default:
			System.out.print("Ingrese Una Opcion Correcta ");
			break;

		}



	}

}
