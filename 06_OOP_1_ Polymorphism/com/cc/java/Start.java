package com.cc.java;

public class Start {

	public static void main(String[] args) {
		
		HoneyBee queen = new Queen();
		HoneyBee worker = new Worker();
		HoneyBee drone = new Drone();
		
		ausgabe(queen.doYourJob());
		ausgabe(worker.doYourJob());
		ausgabe(drone.doYourJob());
		
		ausgabe("-----------------");
		
		ausgabe(queen.fly());
		ausgabe(worker.fly());
		ausgabe(drone.fly());
		
		ausgabe("-----------------");
		
		// Das sollte eigentlich nicht möglich sein
		// --> Lösung: Abstrakte Klasse
		HoneyBee bee = new HoneyBee();
		ausgabe(bee.doYourJob());

	}
	
	
	protected static void ausgabe(String outStr) {
		System.out.println(outStr);
	}

}
