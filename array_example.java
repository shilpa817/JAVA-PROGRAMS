package cseproject1;

import java.util.Arrays;

public class array_example {

	public static void main(String[] args) {
		int[]ages= {10,50,3};
		//refernce of ARRAY
		System.out.println(ages);
		int[]age=new int[5];
		age[0]=5;
		age[1]=52;
		age[2]=35;
		age[3]=56;
		age[4]=23;
		//REFERENCE OF ARRAY
		System.out.println(age);
		for(int num:age)
		{
			System.out.println(num);
		}
		System.out.println("this is from to string method");
		System.out.println(Arrays.toString(age));
		//sorting
		System.out.println("sorting");
		Arrays.sort(age);
		int i;
	
		for( i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
		System.out.println("arrays afetr sorting Array.toString(age)");
		System.out.println(Arrays.toString(age));
		int sum=0;
		for( i=0;i<age.length;i++)
		{
			sum=sum+age[i];
			//System.out.println("sum of arrays:"+sum);
		
		}
		System.out.println("sum of arrays:-"+sum);
	}
}

