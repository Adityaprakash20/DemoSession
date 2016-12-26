package oopd;

public class MyClass {
	
	public static void main (String[] args)
	{
		Student Alok = new Student();
		Alok.setAge(28);
		Alok.setId(1);
		Alok.setName("Alok");
		
		System.out.println(Alok.getAge());
		System.out.println(Alok.getId());
		System.out.println(Alok.getName());
		
		
		Cube alok1 =new Cube();
		System.out.println("Volume of the Cube" + alok1.getVolumeOfCube());
		
		Cube alok2 = new Cube(30,20,20);
		System.out.println("Volume of the Cube" + alok2.getVolumeOfCube());
		
		
		
		
	}

}
