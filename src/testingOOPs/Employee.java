package testingOOPs;

public class Employee {
 String empName;
 String empId;
 String dept;
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}

@Override
public String toString() {
	return "Employee [empName=" + empName + ", empId=" + empId + ", dept="
			+ dept + "]";
}
 
}
