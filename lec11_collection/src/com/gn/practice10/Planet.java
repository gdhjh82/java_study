package com.gn.practice10;

public class Planet {
	private String name;
	private int diameter;
	private double salary;
	
	public Planet() {}
	
	public Planet(String name, int diameter, double salary) {
		this.name = name;
		this.diameter = diameter;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return  " 값: "+name+"(지름 :"+diameter+" km, 공전주기: "+salary+"년)";
	}
	
}
