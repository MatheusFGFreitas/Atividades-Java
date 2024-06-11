package entities;

import entities.enums.Color;

public class Rectangle extends Shape{//deu um erro pois o eclipse precisa que sobreescreva o metodo area no Shape
									//pois colocamos como abstrato, então é feito um Override para o erro sair

	private Double width;
	private Double height;
	
	public Rectangle() {
		super();
	}	
	
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {//implementação padrao pelo Eclipse, porém alterado
		return  width * height;
	}

	
	
}
