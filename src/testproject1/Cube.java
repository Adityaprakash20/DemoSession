package testproject1;

public class Cube {
	
	int len;
	int brd;
	int hgt;
	
	Cube(){
		
		len=10;
		brd=10;
		hgt=10;	
	}
	
	Cube(int l, int b, int h){
		
		len=l;
		brd=b;
		hgt=h;	
	}
	
	public int getCubeVolume(int l, int b, int h){
		return(l*b*h);
	}

}
