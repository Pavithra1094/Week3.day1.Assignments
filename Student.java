package org.college;

public class Student extends Department {

	public static void main(String[] args) {
		 Student std= new Student();
		 std.collegeName();
		 std.collegeCode();
		 std.collgeRank();
		 std.deptName();
		 std.studentDept();
		 std.studentID();
		 std.studentName();
		 

	}
	
	public void studentName()
	{
		System.out.println("TEST");
	}

	public void studentDept()
	{
		System.out.println("ECE");
	}
	
	public void studentID()
	{
		System.out.println("123");
	}
}
