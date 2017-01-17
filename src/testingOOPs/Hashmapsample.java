package testingOOPs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hashmapsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner userinput = new Scanner(System.in);
		
		 HashMap<String, Employee> empDetail = new HashMap<String, Employee>();
		
				 
		 for (int i = 0; i < 3; i++)
		 {
			 System.out.println("***** Please enter data for next empl: ****");
			 Employee employee = new Employee();
			
			 System.out.println("Please enter employee name: ");
			String empName = userinput.next();
			employee.setEmpName(empName);
			
			System.out.println("Please enter employee id: ");
			String empId = userinput.next();
			employee.setEmpId(empId);
			
			System.out.println("Please enter employee dept: ");
			String dept = userinput.next();
			employee.setDept(dept);
			
			empDetail.put(empId,employee);
			
		 }
		 userinput.close();
	
	
	for (String key : empDetail.keySet())
	     {
			System.out.println("------------------------------------------------");
		    System.out.println("Iterating or looping map using employee list");
		    System.out.println("key: " + key + " value: " + empDetail.get(key));
		 }
	
	}
	}
