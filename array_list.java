package cseproject1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
public class array_list {
 public static void main(String[] args) {
	 
	ArrayList<Object>a1=new ArrayList<>();
a1.add(10);
a1.add("shilpa");
a1.add(4.2);
a1.add('h');
System.out.println(a1);
	 ArrayList<Object>a11=new ArrayList<>();
		a11.add("BUDIGI");
		a11.add("shilpa");
		a11.add("YADAV");
		a11.add("FROM");
		a11.add("chagalamarri");
		a11.addAll(a1);
		System.out.println(a11);
		//a1.add(a1);
		//System.out.println(a1);
		System.out.println("after remove"+a1);
	    a11.add(3,"nandyal");
	    System.out.println("after adding:"+a1);
	    System.out.println("----linkedlist-----");
	  LinkedList<Object>li=new LinkedList<>();
	  li.add(20);
	  li.add(33);
	  li.add(3);
	  li.add("kavya");
	  System.out.println(li);
	  li.addFirst(44);
      System.out.println(li);		
      //li.addFirst(44);
      li.add(2,"shilpa");
      System.out.println(li);
      li.remove(3);
      System.out.println("after removing:"+li);
      li.remove(1);
      System.out.println("after removing:"+li);
      System.out.println("----stack---");
      Stack<String> s1=new Stack<>();
      s1.push("shilpa");
      s1.push("yadav");
      s1.add("budigi");
      s1.peek();
      System.out.println(s1.peek());
      s1.pop();
      System.out.println("after removing:"+s1);
}
 
}
