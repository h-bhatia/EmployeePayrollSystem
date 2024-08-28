package com.demo;

public class FullTimeEmployee extends Employee 
{
	

	public FullTimeEmployee(String name, int id, double monthlySalary) {
		super(name, id); 
		this.monthlySalary = monthlySalary;
	}

	private double monthlySalary;

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return monthlySalary;
	}
	
	

}
