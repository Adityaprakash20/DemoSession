package testproject1;

public class MyClass {
	
	public static void main (String[] args){
	
	System.out.println("My details");
	
	Student st = new Student();
	
	st.setId(40343);
	st.setName("Vikash");
	st.setAge(26);

	System.out.println(st.getName()+"(Id:"+st.getId()+") is "+st.getAge()+" years old " );
	
	Cube c = new Cube(10, 20, 40);
	
	Cube d = new Cube();
	
	int p=c.getCubeVolume(c.len,c.brd,c.hgt);
	System.out.println(p);
	
	int e=c.getCubeVolume(d.len,d.brd,d.hgt);
	System.out.println(e);
	
	System.out.println(c.getCubeVolume(100, 100, 100));
	
	
	
		
	}
	

}
