package com.cc.java;

import com.cc.java.bees.Drone;
import com.cc.java.bees.HoneyBee;
import com.cc.java.bees.Queen;
import com.cc.java.bees.Worker;
import com.cc.java.birds.Bird;

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
		
		Bird bird = new Bird();
		ausgabe(bird.fly());
		ausgabe(bird.hasFeathers());
		
	}
	
	
	protected static void ausgabe(String outStr) {
		System.out.println(outStr);
	}

}
