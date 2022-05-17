package com.mindgate.pojo;

public class Employee {
	private int emploeeId;
	private String name;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int emploeeId, String name, double salary) {
		super();
		this.emploeeId = emploeeId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmploeeId() {
		return emploeeId;
	}

	public void setEmploeeId(int emploeeId) {
		this.emploeeId = emploeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employee [emploeeId=" + emploeeId + ", name=" + name + ", salary=" + salary + ", getEmploeeId()="
				+ getEmploeeId() + ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
