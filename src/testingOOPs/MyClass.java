package testingOOPs;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		std1.setId(1);
		std1.setName("Jitendra");
		std1.setAge(25);
		System.out.println(std1.getName() + " is " + std1.getAge() + " years old");

		Cube cubevol1 = new Cube(10,10,12);
		//System.out.println(cubevol1.getvolume(11, 12, 13));
		int vol1 = cubevol1.getvolume(cubevol1.length, cubevol1.breadth, cubevol1.height);
		System.out.println("cube volume1 " +  vol1);
		Cube cubevol2 = new Cube();
		int vol2 = cubevol2.getvolume(cubevol2.length, cubevol2.breadth, cubevol2.height);
		System.out.println("cube volume2 " +  vol2);
		

	}

}
