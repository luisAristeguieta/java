package com.krakedev;

public class Rectangulo {
	public int area;
	public int base;
	
	public int areaRectangulo() {
		return area*base;
	}
	
	public double perimetrRectangulo() {
		return (2*area + 2*base);
	}
}
