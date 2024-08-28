package com.demo;

abstract class Employee 
{
	private String name;
	private int id;
	public Employee(String name, int id) {
	
		this.name = name;
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	
	
 public abstract double calculateSalary();

 @Override
public String toString() {
	// TODO Auto-generated method stub
	return "Employee [name="  +name + ", id=" + id + ",salary=" +calculateSalary()+ "]" ;   
}
 
}
