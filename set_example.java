package cseproject1;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
public class set_example {

	public static void main(String[] args) {
		HashSet<Integer> h1=new HashSet<>();
	    h1.add(5);
	    h1.add(7);
	    h1.add(8);
	    h1.add(33);
	    h1.add(45);
	    System.out.println("hashset:"+h1);//it prints randomly
	    LinkedHashSet<Integer> li=new LinkedHashSet<>();
	    li.add(2);
	    li.add(5);
	    li.add(7);
	    li.addAll(h1);
	    System.out.println("linkedset:"+li);
	    TreeSet<Object>ts=new TreeSet<>();
	    ts.add(7);
	    ts.add(6);
	   // ts.addAll(li);
	   ts.addAll(h1);
	    System.out.println("treeset:"+ts);//print orderWise
	    HashMap<Integer,String> hm=new HashMap<>();
	    hm.put(1, "shilpa");
	    hm.put(4,"null");
	    hm.put(2,"shilpa");
	    hm.put(3,"vijaya");
	    hm.put(3,"vijaya");
	   
	    System.out.println("hashmap:"+hm);
	    TreeMap<Integer,String>tm = new TreeMap<>();
	    tm.put(1,"string");
	    tm.put(5,null);
	   //tm.putAll(hm);
	    //System.out.println("treemap:"+tm);
	    tm.putAll(hm);
	    System.out.println("treemap:"+tm);
	    
	    LinkedHashMap<Integer,String>lm=new LinkedHashMap<>();
	    lm.put(06,"radha" );
	    lm.put(7,"krishna");
	    lm.put(03,"rama");
	    lm.putAll(tm);
	    System.out.println("linked values:"+lm);
	    for(HashMap.Entry<Integer,String> b:tm.entrySet())
	    {
	    	System.out.println(b.getKey()+""+b.getValue());
	    }
	    
	    
	    
	    
	}
}
