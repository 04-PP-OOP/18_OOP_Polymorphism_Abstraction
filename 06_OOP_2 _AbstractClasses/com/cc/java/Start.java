package com.cc.java;

public class Start {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10.0, 10.0);
		Circle circle = new Circle(5.0);
		Triangle triangle = new Triangle(10.0, 10.0);
		
		ausgabe("----- Fl�chen ----------");
		ausgabe("Fl�che Rechteck: " + rectangle.area());
		ausgabe("Fl�che Kreis: " + circle.area());
		ausgabe("Fl�che Dreieck: " + triangle.area());
		ausgabe("----- Differenz ----------");
		ausgabe("Diff. r/t: " +  areaDiff(rectangle, triangle));
		ausgabe("Diff. r/t: " +  areaDiff(rectangle, circle));

	}
	
	
	// Problem: Aufwand/Nutzen : Linear!!!!
	// 1966 "HELP!" :: "Hi, Hi, Hilfe!"
	
	
	// Rechteck - Dreieck
	public static double areaDiff(Rectangle r, Triangle t) {
		return r.area() - t.area();
	}
	
	// Rechteck - Dreieck
	public static double areaDiff(Rectangle r, Circle c) {
		return r.area() - c.area();
	}
	
	
	
	protected static void ausgabe(String outStr) {
		System.out.println(outStr);
	}

}
