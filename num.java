package cseproject1;
import java.util.Scanner;
public class num {

	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter n value");
		int n=sc.nextInt();
				
		for(int i=1;i<n;i++)
		{ 			
			System.out.println("eneter a value:");
			int a=sc.nextInt();
			System.out.println("eneter b value:");
			int b=sc.nextInt();
			int  result=a*b+3;
			System.out.println("("+a+","+b+"):"+result);
			
		}
	}
}
