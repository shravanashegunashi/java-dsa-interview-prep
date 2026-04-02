package Day1;

import java.util.Scanner;
public class BasicsOfJava{
	public static void main(String[] args) {
			
			Scanner scn=new Scanner(System.in);
			
			//Primitives in Java
//			int a=1000000000;
//			System.out.println(a);
//			
//			long b=1000000000000000000L; 
//			System.out.println(b);
//			
//			float f=2.476557657f;    //7 digits after point
//			System.out.println(f);
//			
//			double d=6.7998765645443232132900000000;  //16 digits after decimal
//			System.out.println(d);
//			
//			char c='s';
//			System.out.println(c);
//			
//			String name="shravani";
//			System.out.println(name);
//			
//			Integer rno=90;
//			rno.compareTo(rno);
//			
//			
			//Taking inputs from users:
			
//			//Integer Input 
//			System.out.print("Enter Your id: ");
//			int n=scn.nextInt();
//			System.out.println("Student id is= "+n);
//			
//			//String Input
//			System.out.print("Enter Your Name: ");
//			String name=scn.next();
//			System.out.println("Student name is="+name);
//			
//			//Floating number input
//			System.out.print("Enter Your CGPA: ");
//			float cgpa=scn.nextFloat();
//			System.out.println("Stuent CGPA is="+cgpa);
//			
//			
//			System.out.println("Enter your moblie no= "+97396121);
//			
//			
//			int z=10_00_000;  //int z=10,00,00 Not acceptable in java
//	        System.out.println(z);
	        
	        //Typecasting..
	        
//	        int a=(int)(98.89);
//			System.out.println(a);
//			
//			long l=100000000000L;
//			int p=(int) (l);
//			System.out.println(p);
	//
//			float f=200.0f;
//			double d=f;
//			System.out.println(d);
//			
//			double m=6287687.875476;
//			float c=(float)(m);
//			System.out.println(c);
			
			//Type promotion in java  *Java Suports Automatic Type promotion
//			int a=7987;
//			char d='S';
//			float f=5676.098908f;
//			double u=765765.776876;
//			byte b=26;
//			double result=(a*u)+(d/f)-(b*u);
//			
//			System.out.println((a*u)+" "+(d/f)+" "+(b*b));
//			
//			System.out.println(result);
//			
//			System.out.println(50*67.0f+8765765765.76556577);
			
			
	        //Sum of two numbers: 
//			System.out.print("Enter First Number:");
//			int a=scn.nextInt();
//			
//			System.out.print("Enter Second Number:");
//			int b=scn.nextInt();
//			
//			int sum=a+b;
//			
//			System.out.println("Sum is:"+sum);
			
			
			//Convertion Of Temperature From Celsius to Fahrenheit and vice versa

		
	 //    	System.out.println("Enter the temperature :");
			
		// 	float Temp=scn.nextFloat();
			
		// 	float F=(Temp*9/5)+32;
					
		//     System.out.println("Temperature in Fahrenheit is:  "+F);
			
		//     float C=(Temp-32)*5/9;
		//     System.out.println("Temperature in Celsius For the same input is: "+C);
		// }

	//Condtional Statements and Loops:
		
		//if,elseif and else conditional statements..
//		int sal=25000;
//		if(sal>10000) {
//			sal+=5000;
//		}
//		else if (sal>2000) {
//			sal+=15000;
//		}
//		else {
//			sal+=25000;
//		}
//		System.out.println(sal)	;
//		}
		
		//For loop, while loop and do-while loop...
		
//	    Scanner scn=new Scanner(System.in);
//        int n=scn.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			System.out.println(i);
//		}
//	
//    	int count=1;
//     	while(count<=n) {
//			System.out.println(count);
//			count*=2;
//		}
//		int countt=1;
//		do {
//			System.out.println(countt);
//			countt++;
//		}while(countt<=5);
		
		
		//Switch statement...
		
		
//		Scanner scn=new Scanner(System.in);
//		System.out.println("Enter fruit Name: ");
//		String Name=scn.next();
//		switch(Name) {
//		case"Mango":
//			System.out.println("Sweet Fruit");
//			break;
//		
//		case"Apple":
//			System.out.println("Red Fruit");
//			break;
//			
//		case"Banana":
//			System.out.println("healthy Fruit");
//			break;
//			
//		default:
//			System.out.println("Invalid input");
//		}
		
		//Nested Switch statement..
		
//		Scanner scn=new Scanner(System.in);
//		
//		int EmpNo=scn.nextInt();
//		String Job=scn.next();
//		switch(EmpNo) {
//		case 101:
//			System.out.println("Shravani");
//			break;
//	    case 102:
//			System.out.println("Ashok");
//			break;
//		case 103:
//			System.out.println("Sheguanshi");
//			switch(Job) {
//			case "Manager":
//				System.out.println("bank-manager");
//				break;
//			case"Sales-Person":
//				System.out.println("Sales-man");
//				break;
//			default:
//				System.out.println("invalid job");
//			}
//            break;
//		default:
//			System.out.println("invalid Id");
//		}

		
		//Reversing A Number...

//		int n=2357987;
//		int ans=0;
//		while(n>0) {
//			int rem=n%10;
//		     ans=ans*10+rem;
//			n=n/10;
//		}
//		System.out.print(ans);
//		
//	}


	//Occurance Of A number..

		
		//  int n=1879898878;
		//  int count=0;
		//  while(n>0) {
		//  if(n%10==8) 
		// 	 count++;	 
		//       n=n/10;
		//  }
		// System.out.println(count);		 
  //  }
  }
}
