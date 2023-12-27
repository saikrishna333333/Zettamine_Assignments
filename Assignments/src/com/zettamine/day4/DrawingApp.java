package com.zettamine.day4;

import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Shape[] sarr =new Shape[5];
		
		System.out.println("Enter Base of Triangle");
		double base =s.nextDouble();
		System.out.println("Enter Height of Triangle");
		double height = s.nextDouble();
		Triangle tob = new Triangle(base, height);
		sarr[0] = tob;
		
		
		System.out.println("Enter Radius of sphere");
		double radius = s.nextDouble();
		Sphere sphere = new Sphere(radius);
		sarr[1] = sphere;
		
		System.out.println("Enter length of rectangle");
		double rlength = s.nextDouble();
		System.out.println("Enter the width of Rectangle");
		double rwidth = s.nextDouble();
		Rectangle rectangle = new Rectangle(rlength, rwidth);
		sarr[2] = rectangle;
		
		System.out.println("Enter the length of Cube");
		double clength = s.nextDouble();
		System.out.println("Enter the width of cube");
		double cwidth = s.nextDouble();
		System.out.println("Enter height of cube");
		double cheight = s.nextDouble();
		Cube cube = new Cube(clength, cwidth,cheight);
		sarr[3] = cube;
		
		
		System.out.println("Enter the Base of Triangle");
		double base2 = s.nextDouble();
		System.out.println("Enter the height of Triangle");
		double height2 = s.nextDouble();
		Triangle triangle = new Triangle(base2,height2);
		sarr[4] = triangle;
		
		for(int i=0;i<sarr.length;i++) {
			System.out.println("Area:" + sarr[i].area());
			if(sarr[i] instanceof Spatial) {
				System.out.println("Volume:" + sarr[i].volume());	
			}
		}
		
		s.close();
	}

}
