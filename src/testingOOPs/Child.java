package testingOOPs;

public class Child extends Parent{
 String a;
	Child(String a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child c = new Child("Test String1");
       c.printtest();
		//Parent p = new Parent("testing string");
	//	System.out.println(p.a);
		
	}

}
