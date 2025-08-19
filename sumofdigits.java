package cseproject1;

import java.util.Scanner;
class SumOfDigits
{
 public static void main(String[]args)
{
  Scanner a=new Scanner(System.in);
  System.out.println("enter num ");
  int num=a.nextInt();
  int sum=0;
  while(num!=0)
  {
  int digit=num%10;
    sum=sum+digit;
  num=num/10;
  }
  System.out.println("sumofdigits:"+sum);
  }
  }
  
   
