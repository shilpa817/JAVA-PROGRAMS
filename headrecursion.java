class headrecursion
{
 static int Print(int n)
 {
  if(n==0)
  {
  return 0;}
 
 Print(n-1);
 System.out.println(n);
 return 0;
}

public static void main(String args[])
{
 Print(10);
}
}