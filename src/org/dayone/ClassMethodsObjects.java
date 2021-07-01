package org.dayone;

public class ClassMethodsObjects {
	// question 1
private void empId() {
	System.out.println("EmpId is 12345");
}
private void empName() {
	System.out.println("EmpName is Mercy Charles");
	}
private void empDob() {
	System.out.println("empDob is 19/07/1995");
}
private void empPhone() {
	System.out.println("empPhone is 9987654321");
}
private void empEmail() {
	System.out.println("empEmail is mercyjames9095@gmail.com");
}
private void empAddress() {
	System.out.println("empAddress is Salem");
}
public static void main(String[] args) {
	ClassMethodsObjects c=new ClassMethodsObjects();
	c.empId();
	c.empEmail();
	c.empDob();
	c.empPhone();
	c.empAddress();
	c.empName();
}
}














