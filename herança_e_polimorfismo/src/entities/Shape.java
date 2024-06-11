package entities;

import entities.enums.Color;

public abstract class Shape {
	
	private Color color;
	
	public Shape() {
		
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();//colocado abstract porque a classe Shape não tem a implementação do metodo
	
}
