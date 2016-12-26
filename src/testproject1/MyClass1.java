package testproject1;

public class MyClass1 {
	public static void main(String[] args)
	{
		Student deepak= new Student();
		deepak.setId(1);
		deepak.setName("Gaurav");
		deepak.setAge(25);
		System.out.println(deepak.getName()+" is "+deepak.getAge()+" years old "+" whose id is "+deepak.getId());
		
		cube deepaks = new cube();
		System.out.println("Volume of the first cube with default parameters is: " + deepaks.getvolumecube(10,20,30));
		
		cube gaurav= new cube();
		int f= gaurav.getvolumecube(gaurav.length,gaurav.breadth,gaurav.height);
		System.out.println("Volume of the second cube with given parameters is: " + f);
}
}








































