package value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.annotations.Test;

import java.util.*;

public class EmpSalary {

	@Test
	public void getEmployeeSalary(){
		List<String> nameList = new LinkedList<>(Arrays.asList("John", "S1", "Raj"));
		for(String s : nameList){
			printSalary(s);
		}
	}
	public static void printSalary(String empName) {
		Map<String, Employee> empData = new HashMap<>();
		empData.put("Ram", new Employee(101, 1000));
		empData.put("John", new Employee(102, 2000));
		empData.put("John S", new Employee(103, 10000));
		empData.put("Raj", new Employee(104, 6000));

		if(empData.containsKey(empName)){
			System.out.println(empName + " is having salary " + empData.get(empName).getEmployeeSalary());
		} else {
			System.out.println("There is no employee with name : " + empName);
		}
	}

	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	public static class Employee{
		public Integer employeeId;
		public Integer employeeSalary;
	}
}

