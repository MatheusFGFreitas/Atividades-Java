package entities;

import entities.enums.Color;

public class Circle extends Shape{//mesmo erro do Retangle, e implementa o metodo abstrato, feito um Override para
								//retirar o erro
	
	private Double radius;
	
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	

}
