import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgram {
	     
    String empId, empName,empAddress,empDept;    
     
    public HashMapProgram(String empId, String empName, String empAddress, String empDept) {    
        this.empId = empId;    
        this.empName = empName;    
        this.empAddress = empAddress;    
        this.empDept = empDept;    
          
    }    
       
        
    public static void main(String[] args) { 
   
        //Creating map of Employees
        
	HashMap<Integer,HashMapProgram> map=new HashMap<Integer,HashMapProgram>();    
       
 //Creating Employees
			HashMapProgram e1=new HashMapProgram("Emp1","EmpName1","Address1","Dep1");        
			HashMapProgram e2=new HashMapProgram("Emp2","EmpName2","Address2","Dep2");  
			HashMapProgram e3=new HashMapProgram("Emp3","EmpName3","Address3","Dep3");        
			HashMapProgram e4=new HashMapProgram("Emp4","EmpName4","Address4","Dep4");    
			HashMapProgram e5=new HashMapProgram("Emp5","EmpName5","Address5","Dep5");    
       
 //Adding Employees to map   
        map.put(1,e1);  
        map.put(2,e2);  
        map.put(3,e3); 
	map.put(4,e4); 
	map.put(5,e5); 
	    
// To get Set of Keys from Hash Map
	    
	    Set setOfKeys=map.keySet();
	    
//To get the Iterator instance from Set
	    Iterator iterator=setOfKeys.iterator();
	    
	    while(iterator.hasNext()){
	    	
	    	int key= (int) iterator.next(); 
	    	
	    	System.out.println(key);
	    	
	    	HashMapProgram value= (HashMapProgram)map.get(key); 
	    	
	    	System.out.println(value.empId+" "+value.empName+" "+value.empAddress+" "+value.empDept);
	    	
	    }
	    
	    
    }    
    } 