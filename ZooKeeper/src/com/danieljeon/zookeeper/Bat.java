package com.danieljeon.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		this.energy = 300;
	}
	
	public void fly() {
		System.out.println("Zpft zpft zpft...");
		this.energy -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Yum...");
		this.energy += 25;
	}
	
	public void attackTown() {
		System.out.println("AHHHHHHH!");
		this.energy -= 100;
	}
}
