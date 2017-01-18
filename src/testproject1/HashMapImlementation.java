package testproject1;


import java.util.HashMap;
import java.util.Scanner;

public class HashMapImlementation{
	
	public static HashMap<Integer, Employee> hm;
	public static int heid;
	public static String hename;
	public static String heqa;
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub	
		hm = new HashMap<Integer, Employee>() ;
		Scanner reader = new Scanner(System.in);
		Employee emp1 = new Employee();
		
		for(int i=1;i<=1;i++){
			
			// Reading from System.in
			System.out.println("Enter employee details for employee "+ i +":");
			System.out.println("Employee Name");
			emp1.setEname(reader.next());  
			System.out.println("Employee ID (Only Numeric)");
			emp1.setEmpid(reader.nextInt()); 
			System.out.println("Employee Qualification");
			emp1.setEqualification(reader.next());
			
			hm.put(i, emp1 );			
			
		}
		System.out.println("---------------------------------------");
		System.out.println("EmpID"+"   "+"EmpName"+"   "+"EmpQualifcation");
		System.out.println("---------------------------------------");
		for(int i=1;i<=hm.size();i++){	
		System.out.println(hm.get(i).getEname() + "       " +hm.get(i).getEmpid() + "      " +hm.get(i).getEqualification());
		System.out.println();
		}

	}

}
