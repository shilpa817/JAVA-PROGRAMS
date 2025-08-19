package cseproject1;
 class tata implements car
 {
  public void engine()
  {
   System.out.println(" vo of engine");
   System.out.println(" horse power:2000");
   System.out.println("torque:120 N/M");
   }
   public void gears(){
   System.out.println("automatic grearing system");
   }
 }
 public class abstractiondemo
{
   public static void main(String args[]) 
    {
     car t1=new tata();
	 t1.engine();
	 t1.gears();
	}
}
   
