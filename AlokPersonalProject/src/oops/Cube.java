package oops;

public class Cube {
int length;
int breadth;
int height;

Cube()
{
	length=10;
	breadth=20;
	height=30;
}

public Cube(int i, int j, int k) {
	length=i;
	breadth=j;
	height=k;
}

public int getVolumeOfCube()
{
return(length * breadth * height);
}
	
}

