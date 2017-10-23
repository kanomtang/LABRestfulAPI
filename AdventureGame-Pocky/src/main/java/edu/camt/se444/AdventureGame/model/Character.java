package edu.camt.se444.AdventureGame.model;

public class Character {

	
	private String name;
	private int level,experience,health;
	public Character() {
		this.name = "Pocky";
		this.level = 20;
		this.experience = 200;
		this.health = 300;
	}
	public Character(String a, int b , int c,int d){
		this.name = a;
		this.level = b;
		this.experience = c;
		this.health = d;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
}
