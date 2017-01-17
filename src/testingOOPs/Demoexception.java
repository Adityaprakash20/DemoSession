public class Demoexception
{
public static void main(String[] args)
{
 int a = 5;
 int b = 0;
 int c = a/b;

try{
System.out.println(c);
}
catch(Arithmaticexception e)
{
System.out.println("invalid input");
}
}
}