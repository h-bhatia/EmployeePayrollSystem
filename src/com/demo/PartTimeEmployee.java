package com.demo;

public class PartTimeEmployee extends Employee
{
	private int hoursWorked;

	private double hourlyRate;

public PartTimeEmployee(String name, int id, int hoursWorked,double hourlyRate) {
		super(name, id);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
		
		// TODO Auto-generated constructor stub
	}

@Override
public double calculateSalary() {
	// TODO Auto-generated method stub
	return hoursWorked * hourlyRate;
}


}
