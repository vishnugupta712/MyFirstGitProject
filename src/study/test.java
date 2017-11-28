package study;

import java.util.HashMap;
import java.util.Map;

/*class A{
	
}

class B extends A{
	
}*/
public class test {
		public static void main(String[]args) {
		// TODO Auto-generated method stub
		Integer i= new Integer(10);
		Integer j = 10;
		System.out.println(i==j );
		Map<Integer,String>m= new HashMap<Integer,String>();
		m.put(i, "abc");
		m.put(j, "xyz");
		System.out.println(m.size());
		System.out.println(m.get(i));
		}
}
