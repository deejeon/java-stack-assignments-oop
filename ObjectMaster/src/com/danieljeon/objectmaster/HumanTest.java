package com.danieljeon.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human();
		Human human2 = new Human();
		
		human1.attack(human2);
		
		Wizard wizard1 = new Wizard();
		wizard1.heal(human2);
		wizard1.fireball(human1);
		
		human1.attack(wizard1);
		
		Ninja ninja1 = new Ninja();
		ninja1.steal(wizard1);
		ninja1.runAway();
		
		Samurai samurai1 = new Samurai();
		Samurai samurai2 = new Samurai();
		System.out.println(samurai1.howMany());
		
		samurai1.deathBlow(wizard1);
		samurai1.deathBlow(ninja1);
		samurai1.deathBlow(human1);
		samurai1.deathBlow(human2);
		samurai2.meditate();
	}

}
