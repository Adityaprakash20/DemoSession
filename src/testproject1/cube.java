package testproject1;

public class cube {

	int length;
	int breadth;
	int height;
	
	cube(int l, int b, int h)
	{
		length = l;
		breadth = b;
		height = h;
	}
		
	
	cube()
	{
		length = 20;
		breadth = 20;
		height = 20;
	}
	
	public int getvolumecube(int l, int b, int h)
	{
		return(l*b*h);
	}
	
	
	}

