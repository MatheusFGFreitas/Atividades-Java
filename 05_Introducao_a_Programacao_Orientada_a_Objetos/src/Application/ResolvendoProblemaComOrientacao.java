package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Triangulo;

public class ResolvendoProblemaComOrientacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("entre as medidas do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("entre as medidas do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();//chamando o metodo da entidade triangulo
		
		double areaY = y.area();
		
		System.out.printf("Area do triangulo X: %.4f%n", areaX);
		System.out.printf("Area do triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("area maior: X");
		}
		else {
			System.out.println("area maior: Y");
		}
		
		sc.close();
		
	}

}
