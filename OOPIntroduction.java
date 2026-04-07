package OOP;

import java.util.Arrays;

public class OOPIntroduction {
	public static void main(String[] args) {
		//store 5 names and roll numbers
		int[] rno=new int[5];
		String[] name=new String[5];
		
		//Storing Data of the 5 students: rollno,Name,gpa...etc
		int[] rollno=new int[5];
		String[] Name=new String[5];
		float[] gpa=new float[5];
		
//     Using our Own class Storing students data
//     Students[] abc=new Students[6];
//      System.out.print(Arrays.toString(abc));
		
//		Students abc1=new Students(28,"Shravana",9.9f);
		Students abc1=new Students();
		
//		abc1.newName("Shravana");
//		abc1.fun();
//		Students rahul=new Students();
//		abc1.rollno=28;               
//		abc1.Name="student1";
//	    abc1.gpa=9.5f;
		
//		Students Random=new Students(abc1);
		
		Students rand=new Students();
		
        //abc1.salary=90000;   Can't use variables/property that has not present in the class...
		System.out.println(abc1.rollno);
		System.out.println(abc1.Name);
		System.out.println(abc1.gpa);
	
		//Using Final keyword primitives value can not be changes but non-primitives values can be overwrite...
//		final int NUM=5;
//		NUM=6;
		
	}
}
//Creating class
	class Students{
		int rollno;
		String Name;
		float gpa;
		
		
		//Constructors: With Constructor Overloading
//		Students(){
//			this.rollno=28;        //Here 'this' keyword replaces the object name abc1             
//			this.Name="student1";
//		    this.gpa=9.5f;
//		}
		
		//Calling a Constructor from Other constructor
		
		Students(){
			this (20,"Adarsh",10f);
		}
		//Calling value from other objects...via constuctors
		Students(Students other){
			this.Name=other.Name;
			this.rollno=other.rollno;
			this.gpa=other.gpa;
		}
		
		Students(int rollno,String Name,float gpa){
			this.rollno=rollno;                 
			this.Name=Name;
		    this.gpa=gpa;
		}
		
		void fun() {
//			System.out.printf("My Roll Number Is: "+this.rollno);
			System.out.print("My Name is: "+this.Name);
		}
		
		void newName(String name) {
			this.Name=name;
		}
	}