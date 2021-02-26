package com.cc.java.birds;
import com.cc.java.beaviours.Flyable;
import com.cc.java.beaviours.IFeathers;

public class Bird implements Flyable,IFeathers{

	
	@Override
	public String fly() {
		return "I'm a bird, I can also fly!";
	}

	@Override
	public String hasFeathers() {
		return "I'm a bird, I have feathers!";
	}

	
}
