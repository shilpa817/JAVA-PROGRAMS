package cseproject1;

	import java.util.Scanner;
	public class pattern2 {
		 public static void main(String []args)
		 {
		 Scanner sc=new Scanner(System.in);
		  System.out.println("enter number");
		  int num=sc.nextInt();
		  int i,j;
		    for(i=0;i<=num;i++)
		  {
		  
		   for(j=1;j<=num-i;j++)
		   {
		   System.out.print("*\t");
		   }
		  
		   System.out.println("\n");
		 }
		   }
		   
	}
