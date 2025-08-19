package cseproject1;
import java .util.*;
public class pattern3 
{
	public static void main(String args[])
	{
  Scanner sc=new Scanner(System.in);
  System.out.println("eneter size value");
  int size=sc.nextInt();
  int i;
		  for( i=0;i<size;i++)
		  {
			  if(i==0 || i==size/2 || i==size-1)
			  {
				  for(int j=0;j<size;j++)
				  {
					  System.out.print("*");
				  }
		      }
			  else if(i<size/2)
			  {
				  System.out.print("*");
			  }
			  else
			  {
				  for(int j=0;j<size-1;j++)
				  {
					  System.out.print(" ");
				  }
				  System.out.print("*");
			  }
			  System.out.println();
		  }
			  

}
}
