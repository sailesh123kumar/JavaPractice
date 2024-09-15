package objectCompare;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeTest {
	
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("sailesh", 20000, 1, "chennai");
		Employee emp2 = new Employee("suresh", 22000, 9, "Mumbai");
		Employee emp3 = new Employee("santhosh", 25000, 7, "Bengalore");
		Employee emp4 = new Employee("somesh", 27000, 4, "Maharashtra");
		Employee emp5 = new Employee("kailash", 30000, 2, "Ooty");
		
		
		Employee[] emp ={emp1 , emp2, emp3 , emp4, emp5};
		
		Arrays.sort(emp);
		
		for(Employee e : emp) {
			System.out.println(e);
		}
		
	}

}
