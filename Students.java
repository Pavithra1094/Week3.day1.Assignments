package org.college;

public class Students {

	public static void main(String[] args) {
		Students std= new Students();
		std.getStudentInfo(001);
		std.getStudentInfo(001, "TEST");
		std.getStudentInfo("xyz", 786746453);

	}
	
	public void getStudentInfo(int id)
	{
		System.out.println(id);
	}

	public void getStudentInfo(int id, String name)
	{
		System.out.println(id + name);
	}
	
	public void getStudentInfo(String email,long phonenumber)
	{
		System.out.println( email + phonenumber);

	}
}
