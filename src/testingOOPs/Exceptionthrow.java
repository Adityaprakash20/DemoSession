public class Exceptionthrow
{
public static void main(String[] args)
{
Exceptionthrow eh = new Exceptionthrow();
eh.demo();
}
public void demo() throws Exception
{
 int a = 5;
 int b = 0;

if (b==0)
throw new Exception("invalid input");

/*
try{
System.out.println(c);
}
catch(Arithmaticexception e)
{ */

System.out.println("invalid input");
}
}