package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.services.Color;

public class ProgramaShape {

	public static void main(String[] args) {
		//programa feito com herança, então o proximo versonamento será para inserir a interface
		//inserido interface, trocando o shape para abstract shape
		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Cor do circulo : " + s1.getColor());
		System.out.println("Área do circulo: " + String.format("%.3f", s1.area()));
		System.out.println("Cor do retangulo: " + s2.getColor());
		System.out.println("Área do retangulo: " + String.format("%.3f", s2.area()));

	}

}
