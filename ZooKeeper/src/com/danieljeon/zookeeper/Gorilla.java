package com.danieljeon.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Gorilla has thrown something!");
		this.energy -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Gorilla likes bananas!");
		this.energy += 10;
	}
	
	public void climb() {
		System.out.println("Gorilla has climbed a tree!");
		this.energy -= 10;
	}
}
