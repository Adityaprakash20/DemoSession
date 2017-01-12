package testproject1;

public class Child extends Parent {

	int a;
	
	
	//constructor with parameter
	Child(int a)
	{
	super(a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child1 = new Child(30);
		
		child1.Fn_PrintName();

	}

}
