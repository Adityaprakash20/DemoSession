package oops;

public class MyClass {
	
	
	public static void main(String[] args) {
		
		Student sayyed = new Student();
		sayyed.setName("Sayyed Akram");
		sayyed.setAge(31);
		sayyed.setId(82015);
		
		System.out.println("Name of the student is " + sayyed.getName());
		System.out.println("Age of the Student is "+sayyed.getAge());
		System.out.println("Id of the student is "+sayyed.getId());
		
		
		Cube mycube1 = new Cube();
		System.out.println("Volume of the Cube of "+ mycube1.VolumeOfCube());
		
		Cube mycube = new Cube(10,10,10);
		
		System.out.println("Volume of the Cube of "+ mycube.VolumeOfCube());
		System.out.println("This is a new change from Sayyed");
		
		
		

	}
	

}
