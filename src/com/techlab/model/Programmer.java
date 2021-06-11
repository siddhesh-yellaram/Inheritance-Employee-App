package com.techlab.model;

public class Programmer extends Student {
	private double bonus;
	
	public Programmer(int id, String name, double salary, double bonus) {
		super(id,name,salary);
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	
}
