package cseproject1;

public class Method {
	
	int add(int a,int b) {
		int c=a+b;
		return c;
	}
	int add(int a,int b,int c) {
	    return a+b+c;
	    
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Methodoverloading m1=new Method();
     
        
        int ref=m1.add(50,100);
        int ref1=m1.add(50,60,70);
        System.out.println(ref);
        System.out.println(ref1);

	}

}
