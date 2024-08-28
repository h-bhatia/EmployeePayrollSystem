package com.demo;

import java.util.ArrayList;

public class PayrollSystem {
private ArrayList<Employee> employeeList;

public PayrollSystem() {
	// TODO Auto-generated constructor stub
employeeList=new ArrayList<>();
}
public void addEmployee(Employee employee)
{
	employeeList.add(employee);
}
public void removeEmployee(int id)
{
	Employee employeeToRemov=null;
	for(Employee employee: employeeList)
	{
		if(employee.getId()==id)
		{
			employeeToRemov=employee;
		
			break;
		}
	}
	if(employeeToRemov!=null)
	{
		employeeList.remove(employeeToRemov);
	}
}
public void displayEmployees()
{
	for(Employee employee:employeeList)
	{
		System.out.println(employee);
	}
}





}
