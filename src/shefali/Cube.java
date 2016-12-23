package shefali;

public class Cube {
    int length;
    int breadth;
    int height;
    
    Cube(int l, int b, int h)
          {
          length = l;
          breadth = b;
          height = h;
         
    }
    Cube()
    {
          length = 20;
          breadth = 20;
          height = 40;
    }
public int getVolumeOfCube()
{
    return (length * breadth * height);
}
}