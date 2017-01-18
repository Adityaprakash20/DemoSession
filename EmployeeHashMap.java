
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class EmployeeHashMap {
 

 public static void addValuestoMap()
 {
  	for(int i=0;i<4;i++){

  	Scanner sc=new Scanner(System.in);
   
	System.out.println("enter your empid");
   	
	String empID=sc.next();  
    
 	System.out.println("enter your name");
  	
	 String empName=sc.next(); 
    
	System.out.println("enter the address");
    
	String empAddress =sc.next();
    	
System.out.println("enter the dept");
    	
String empDepartment = sc.next();
    String empDetails= empID +" "+ empName+" "+empAddress+ " "+empDepartment;
    
	Map<Integer,String> hm=new HashMap<Integer,String>(); 
    	
	hm.put(i+1, empDetails);
    
	Iterator iterator = hm.entrySet().iterator();
    
	while(iterator.hasNext()){
     Map.Entry entry=(Map.Entry) iterator.next();
     System.out.print(entry.getKey()+ "   ");
     System.out.println(entry.getValue() +   "    ");
          
          
    }
    
 }
  
 } 

 public static void main(String[] args) {  

 
  addValuestoMap();
 
 }


}