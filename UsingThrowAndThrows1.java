import java.util.Scanner;

public class UsingThrowAndThrows1{

public static void main(String[] args){

Scanner objScan= new Scanner(System.in);


int num1;
int num2;

System.out.println("Enter number 1 : ");
num1=objScan.nextInt();

System.out.println("Enter number 2 : ");
num2=objScan.nextInt();

try{

displayIntegers(num1,num2);

}
catch(Exception e)
{

System.out.println("I am catch block");
System.out.println(e);

}
System.out.println("I am back in Main Method");

}

public static void displayIntegers(int firstNum, int secondNum) throws Exception

{

if(secondNum==0)
{
throw new Exception("Invalid Input");
}

float newNum=firstNum/secondNum;

System.out.println(newNum);
}

}