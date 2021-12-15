import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add('A');
		hs.add("dog");
		hs.add(null);
		hs.add(null);
		hs.add(6);
		hs.add(6);
		hs.add(10);
		hs.add('Z');
		hs.add("Cat");
		hs.add(4.5);
		hs.add(8);
		System.out.println(hs);
		
//Iterator it=hs.iterator();
//while(it.hasNext()) {
//	System.out.println(it.next());
//}
//
//for(Object e:hs) {
//	System.out.println(e);
//}

HashSet hs_new=new HashSet();
hs_new.add("Elephant");
hs_new.addAll(hs);
System.out.println(hs_new.isEmpty());

ArrayList arr = new  ArrayList ();
arr.add(1);
arr.add(2,0);
arr.add(6);
System.out.println(arr);

	}

	
	
	


}
