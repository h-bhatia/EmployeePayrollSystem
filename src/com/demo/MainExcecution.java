package com.demo;

public class MainExcecution 
{
	public static void main(String[] args) {
		PayrollSystem payrollSystem=new PayrollSystem();
		FullTimeEmployee emp1=new FullTimeEmployee("harsh", 1, 50000);
		PartTimeEmployee emp2=new PartTimeEmployee("Raman", 2, 6,2000); 
		payrollSystem.addEmployee(emp1);
		payrollSystem.addEmployee(emp2);
		payrollSystem.displayEmployees();
		payrollSystem.removeEmployee(2);
		payrollSystem.displayEmployees();
	}

}
