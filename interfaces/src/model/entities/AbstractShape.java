package model.entities;

import model.services.Color;

public abstract class AbstractShape implements Shape{//criado uma classe abstrata, que implementa o Shape e define o atributo cor
	
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
