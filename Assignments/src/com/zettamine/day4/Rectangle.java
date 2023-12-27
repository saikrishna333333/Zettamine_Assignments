package com.zettamine.day4;

public class Rectangle extends Shape{
	private double length;
    private double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public double area() {
		
		return this.length * this.width;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return -1;
	}
    
    


}
