package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class CuringasDelimitados {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
													//inicial myShapes
		System.out.println("Area total: " + totalArea(myCircles));//se colocar o myCircles, vai dar erro pois não é um supertipo de list circle
	}
	
	public static double totalArea(List<? extends Shape> list) {//metodo recebendo uma lista de shape//se colocar o ? para receber o my circle, vai dar
																						   //erro que os elementos não vao ser do tipo shape
																						   //então trocaremos para ? extends Shape
		//list.add(new Rectangle(3.0, 4.0));//não podemos fazer isso, pois o tipo pode ser subtipo de shape, porem incompativel com retangulo
		//se fosse Circle pode funcionar porque a lista delimitada permite Circle
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();//percorre todas as listas, soma tudo e retorna a soma
		}
		return sum;
	}

}
