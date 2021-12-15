import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
				HashMap<Integer,String> m=new HashMap<Integer,String> ();
				
				m.put(100, "Dog");
				m.put(101, "HI");
				m.put(102, "Tiger");
				m.put(103, "Cat");
		System.out.println(m);
			
		System.out.println(m.get(100));

		m.remove(103);
		System.out.println(m);
			
			

	}

}
