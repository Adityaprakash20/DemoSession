package oops;

public class MyClass {

	
	public static void main(String[] args) {
		Student deepak = new Student();
		deepak.setId(1);
		deepak.setName("Deepak");
		deepak.setAge(15);
		System.out.println(deepak.getName() + " is  " +deepak.getAge() + "  Years old ");
		
   Cube amits = new Cube(20,20,20);
      System.out.println( amits.getVolumeOfCube());
  
	}

}
