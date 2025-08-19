package cseproject1;

//import java.util.Array;
import java.util.*;
public class array1 {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
    System.out.println("enter size of an array");
    int size=sc.nextInt();
    ArrayList<Integer>num=new ArrayList<>();  
    //int num[]=new int[size];
    System.out.println("enter "+size+"integer:");
    for(int i=0;i<size;i++)
    {
    	//num[i]=sc.nextInt();
    	num.add(sc.nextInt());
    }
    Integer []array=num.toArray( new Integer[0]);
    //Arrays.sort(array);
    System.out.println("enter arrays.toString  values");
    System.out.println("array:"+Arrays.toString(array));
    Arrays.sort(array);
    System.out.println("after sorting:"+Arrays.toString(array));
	}	
}
