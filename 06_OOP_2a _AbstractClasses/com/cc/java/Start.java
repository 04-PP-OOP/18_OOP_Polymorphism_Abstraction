package com.cc.java;

public class Start {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10.0, 10.0);
		Circle circle = new Circle(5.0);
		Triangle triangle = new Triangle(10.0, 10.0);
		
		ausgabe("----- Flächen ----------");
		ausgabe("Fläche Rechteck: " + rectangle.area());
		ausgabe("Fläche Kreis: " + circle.area());
		ausgabe("Fläche Dreieck: " + triangle.area());
		ausgabe("----- Differenz ----------");
		ausgabe("Diff. r/t: " +  areaDiff(rectangle, triangle));
		ausgabe("Diff. r/t: " +  areaDiff(rectangle, circle));
		ausgabe("Diff. c/t: " +  areaDiff(circle, triangle));
	}

	
	// Shape - Shape ;-) .. all you can eat ...
	public static double areaDiff(Shape sh1, Shape sh2) {
		return sh1.area() - sh2.area();
	}

	
	protected static void ausgabe(String outStr) {
		System.out.println(outStr);
	}

}
