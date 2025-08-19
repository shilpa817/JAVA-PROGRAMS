package cseproject1;
import java.util.*;
public class swap {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter values");
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 int c=sc.nextInt();
	
	System.out.println("beforew swap"+a+"----b----"+b+"---c----"+c);
	for(int i=0;i<1;i++)
	{
		int temp=a;
		a=b;
		b=temp;
		temp=c;
		c=b;
	b=a;
	}
	
	System.out.println("after swap"+a+"--b--"+b+"----c----"+c);
	
}
}
