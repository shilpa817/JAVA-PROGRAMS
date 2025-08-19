package cseproject1;
import java.util.HashMap;
import java.util.Scanner;
public class Hashmap {
public static void main(String[] args) 
{
	HashMap<Integer,String> Map=new HashMap<>();
	Scanner sin=new Scanner(System.in);
	System.out.println("enter n value");
	int n=sin.nextInt();
	//sin.nextLine();
	int i;
	for(i=0;i<n;i++)
	{
		
	
		System.out.println("enter id:");
		int id=sin.nextInt();
		sin.nextLine();
		System.out.println("enter name:");
		String name=sin.nextLine();
		Map.put(id,name);
		
	}
	
	System.out.println("student details:"+Map);
    for(HashMap.Entry<Integer,String>d:Map.entrySet())
    {
    	System.out.println(d.getKey()+":"+d.getValue());
    }
}
}
