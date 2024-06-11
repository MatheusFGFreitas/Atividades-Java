package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.Rectangle;
import entities.Circle;
import entities.enums.Color;

public class ProgramEx3 {

	public static void main(String[] args) {//utilizando Shape, Rectangle, Circle, Color

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println("digite o numero de formas: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados da forma #" + i);
			System.out.print("Retangulo ou Circulo (r/c)?:");
			char ch = sc.next().charAt(0);
			System.out.print("Cor (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(ch == 'r') {
				System.out.print("Largura: ");
				double width = sc.nextDouble();
				System.out.println("Altura: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Raio: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("Area das figuras: ");
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();

	}

}
