package shefali;

import oops.Student;

public class MyClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student deepak = new Student();
		deepak.setId(1);
		deepak.setName("Deepak");
		deepak.setAge(15);
		System.out.println(deepak.getName() + " is " + deepak.getAge() + "years old");
		
		Cube amits = new Cube(20,20,20);
		System.out.println (amits.getVolumeOfCube());
		
		
		/*int num; 
        num = 100; 
        System.out.println("This is num: " + num);  
        num = num * 2;  
        System.out.print("The value of num * 2 is " + num); 
        System.out.println(num); 
		*/
	

	}
}
