package com.hr;

public class Employee {

	private int empId;
	private String name;
	private float salary;

	public Employee(int empId, String name, float salary) {
		super();

		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {

		this.salary = salary;
	}

	public void showDetails() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}

	@Override
	public String toString() {
		return "EempId=" + empId + "\nname=" + name + "\nsalary=" + salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;

		Employee em = (Employee) obj;
		if (this.empId == em.empId)
			return true;

		return false;
	}
}