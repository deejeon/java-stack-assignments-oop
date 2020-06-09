package com.danieljeon.objectmaster;

public class Samurai extends Human {
	private static int samuraiCount = 0;
	
	public Samurai() {
		this.health = 200;
		samuraiCount++;
	}
	
	public void deathBlow(Human target) {
		target.health -= target.health;
		this.health *= 0.5;
		System.out.println("Landed Death Blow!");
		System.out.println("Target health now: " + target.health);
		System.out.println("Self health now: " + this.health);
	}
	
	public void meditate() {
		this.health *= 1.5;
		System.out.println("Meditated!");
		System.out.println("Self health now: " + this.health);
	}
	
	public int howMany() {
		return samuraiCount;
	}
}
