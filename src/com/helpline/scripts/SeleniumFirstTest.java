package com.helpline.scripts;

import javax.swing.plaf.synth.SynthOptionPaneUI;

@SuppressWarnings("unused")
public class SeleniumFirstTest 
{
	
	public static void main(String []args)
	{
		System.out.println("My first program");
		int i = 0;
		while(i<10)
		{
			System.out.println(i);
		i = i+1;
		}
		
		for(i=10;i>0;i--)
		{
			System.out.println(i);
		}
		
		String str = "Monday";
		int ii = 10;
		
		if(str.equals("Monday"))
			System.out.println("Today is Monday");
		else if (str.equals("Sunday"))
			System.out.println("Today is Sunday");
		if(ii==10)
			System.out.println(ii);
		switch (str) { 
		case "Sunday":
			System.out.println("Today is Monday");
			break;
		case "Monday":
			System.out.println("Today is Sunday");

		default:
			break;
		}
		
		String [] studentname = new String [5];
		studentname[0] = "Ashish";
		studentname[1] = "Rajeev";
		studentname[2] = "Raju";
		studentname[3] = "Ashok";
		studentname[4] = "Nitin";
		
		System.out.println("Array first name is " + studentname[0]);
		System.out.println("Array 2nd name is "+ studentname[1]);
		System.out.println("Array 3rd name is "+ studentname[2]);
		System.out.println("Array 4th name is "+ studentname[3]);
		System.out.println("Array 5th name is "+ studentname[4]);
		
		for (int iii =0; iii<=studentname.length-1;iii++)
			System.out.println(studentname[iii]);
		
		for (int in = studentname.length-1;in >=0;in--)
			System.out.println(studentname[in]);
		
	}

}
