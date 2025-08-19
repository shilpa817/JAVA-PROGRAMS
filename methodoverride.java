package cseproject1;

 class a
{
	void student()
	{
		System.out.println("student 1");
	}
}
 class student2 extends a
 {
	 void student()
	 {
		   System.out.println("student2");

	 }

	}
public class methodoverride {

	public static void main()
	{
		student2 sc=new student2();
		sc.student();
	}
}
