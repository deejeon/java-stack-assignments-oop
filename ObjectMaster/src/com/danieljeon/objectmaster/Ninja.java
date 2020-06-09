package com.danieljeon.objectmaster;

public class Ninja extends Human {
	public Ninja() {
		this.stealth = 10;
	}
	
	public void steal(Human target) {
		target.health -= this.stealth;
		this.health += this.stealth;
		System.out.println("Used steal!");
		System.out.println("Target health now: " + target.health);
		System.out.println("Self health now: " + this.health);
	}
	
	public void runAway() {
		this.health -= 10;
		System.out.println("Ran away!");
		System.out.println("Self health now: " + this.health);
	}
}
