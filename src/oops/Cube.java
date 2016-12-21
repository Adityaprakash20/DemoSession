package oops;

public class Cube {


	int length;
	int width;
	int hight;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	Cube()
	{
		length = 10;
		width = 20;
		hight = 30;
		
	}
	
	Cube (int l, int w, int h)
	{
		length = l;
		width = w;
		hight = h;
	}
	
	public int VolumeOfCube()
	{
		return length*width*hight;
	}

}
