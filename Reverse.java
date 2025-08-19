import java.util.Scanner;
public class reverse
{
  public static void main(String args[])
  {
   Scanner obj=new Scanner(System.in);
   System.out.println("enter num value");
   int num=obj.nextInt();
   int reverse=0;
   while(num>0)
   {
	   int digit= num%10;
	   reverse=reverse*10+digit;
	   num/=10;
   }
	System.out.println("reverse number:"+reverse);
    }
   }
//num=num/10