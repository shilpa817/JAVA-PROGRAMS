package cseproject1;

public class Stack {
public static void main(String[] args) 
{
	 Stack<String> s1=new Stack();
     s1.push("shilpa");
     s1.push("yadav");
     s1.add("budigi");
     s1.peek();
     System.out.println(s1.peek());
     s1.pop();
     System.out.println("after removing:"+s1);
}
}
