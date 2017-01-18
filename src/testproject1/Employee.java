package testproject1;

import java.util.HashMap;
import java.util.Scanner;


public class Employee {
	
	private  String ename;
	private  int empid;
	private  String equalification;
	
	
	public void setEname(String name){
		this.ename=name;
	}
	
	public void setEmpid(int id){
		this.empid=id;
	}
	
	public void setEqualification(String qualification){
		this.equalification=qualification;
	}
	
	public String getEname(){
		return ename;
	}
	
	public int getEmpid(){
		return empid;
	}
	
	public String getEqualification(){
		return equalification;
	}
	
	
	
}

