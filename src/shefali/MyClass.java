package shefali;

import oops.Student;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student deepak = new Student();
		deepak.setId(1);
		deepak.setName("Deepak");
		deepak.setAge(15);
		System.out.println(deepak.getName() + " is " + deepak.getAge() + "years old");
		
		Cube amits = new Cube(20,20,20);
		System.out.println (amits.getVolumeOfCube());
		
	

	}
}
