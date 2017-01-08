import java.util.Scanner;

public class TryCatchWithFinally{

public static void main(String[] args){

//****************** for taking input from console**************

Scanner objScan= new Scanner(System.in);

int num1;
int num2;
float newNumber;

System.out.println("Enter 1st number: ");

num1=objScan.nextInt();

System.out.println("Enter 2nd number: ");

num2=objScan.nextInt();

try{

newNumber=num1/num2;

}


//****************** Different Methods for printing Exceptions**************

catch(ArithmeticException e){

System.out.println("1. This is direct Exception: " +e);

System.out.println(" 2. This is using getPrintStackTrace Method");

e.printStackTrace();

System.out.println("3. This is using toString Method "+e.toString());

System.out.println("4. This is using getMessage Method"+e.getMessage());


}

finally{
System.out.println("Out of Try/Catch Block");
}

System.out.println("The output is :" + num1/num2);

}


}