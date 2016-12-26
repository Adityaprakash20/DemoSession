package testingOOPs;

public class Cube {
	int length;
	int breadth;
	int height;
	
	Cube()
	{
		length = 10;
		breadth = 15;
		height = 30;
	}
	
	Cube( int l, int b, int h)
	{
		length = l;
  	    breadth = b;
		height = h;
	}
	public int getvolume(int l , int b, int h)
	{
		int vol;
		vol = l*b*h;
		return vol;
	}
	
}
