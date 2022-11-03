package com.demo;

public class StudentArray {
	
	
	public static void main(String[] args) {
		
		//declare array of student class
		Student a[]; 
		
		//allocating memory to student array
		a=new Student[5];
		
		
		Student s1=new Student(1, "Shubham");
		
		a[0]=s1;
		
		a[1]=new Student(2,"Rohit");
		a[2]=new Student(3,"Virat");
		a[3]=new Student(4,"sky");
		a[4]=new Student(5,"Axar");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].rollNo +" "+a[i].name);
		}
		
		
		for(Student s:a)
		{
			System.out.println(s.name+" "+s.rollNo);
			System.out.println(s);
		}
		
	}

}
