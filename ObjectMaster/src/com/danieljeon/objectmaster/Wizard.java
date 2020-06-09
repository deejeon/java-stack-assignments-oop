package com.danieljeon.objectmaster;

public class Wizard extends Human {
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public void heal(Human target) {
		target.health += this.intelligence;
		System.out.println("Used heal!");
		System.out.println("Target health now: " + target.health);
	}
	
	public void fireball(Human target) {
		target.health -= this.intelligence * 3;
		System.out.println("Used fireball!");
		System.out.println("Target health now: " + target.health);
	}
}
