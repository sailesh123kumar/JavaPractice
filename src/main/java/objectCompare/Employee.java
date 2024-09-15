package objectCompare;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	


	String name;
	double salary;
	int id;
	String location;
	
	
	public Employee(String name, double salary, int id, String location) {
		this.name = name;
		this.salary = salary;
		this.id = id;
		this.location = location;
	}
	
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public int getId() {
		return id;
	}
	public String getLocation() {
		return location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + ", location=" + location + "]";
	}



	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id -o.id;
	}
	
}
