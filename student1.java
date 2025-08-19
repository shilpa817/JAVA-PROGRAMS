package cseproject1;
import java.util.*;
interface student {
  public void inputdetails();
  public void displaydetails();
}
  class studentinfo implements student
{
	private String Name;
	private int rollno;
	private double marks;
	
	public  void setName(String Name)
	{
		this.Name=Name;
	}
	public void setrollno(int rollno)
	{
		this.rollno=rollno;
	}
	public void setmarks(double marks)
	{
		this.marks=marks;
	}
	public String getName()
	{
		return Name;
	}
	public int getrollno()
	{
		return rollno;
	}
	public double getmarks()
	{
		return marks;
	}
	public void inputdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		setName(sc.nextLine());
		System.out.println("enter rollno:");
		setrollno(sc.nextInt());
		System.out.println("enter marks:");
		setmarks(sc.nextDouble());
	}
	public void displaydetails()
	{
		System.out.println("Name:"+getName());
		System.out.println("rollno:"+getrollno());
		System.out.println("marks:"+getmarks());
	}
}
 public class student1
{
	public static void main(String[] args)
	{
		student std=new studentinfo();
		std.inputdetails();
	    std.displaydetails();
	}
}