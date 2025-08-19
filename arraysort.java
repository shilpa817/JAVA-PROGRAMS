package cseproject1;
import java.util.*;
public class arraysort {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of students");
	int n=sc.nextInt();
	int []marks=new int[n];
    System.out.println("enter student marks");
    int i=0;
    while(i<n)
    {
    	marks[i]=sc.nextInt();
    	i++;
    	
    }
    Arrays.sort(marks);
    System.out.println(" after sorting:"+Arrays.toString(marks));
    
 }
}
