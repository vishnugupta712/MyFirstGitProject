package study;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/*class A{
	
}

class B extends A{
	
}*/
class Test1
{
	int x, y;
	Test1()
	{
		x = 10;
		y = 20;
	}
}
public class test {
	static BigInteger fib(int n)
	{
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);
		for (int j=2 ; j<=n ; j++)
		{
			c = a.add(b);
			a = b;
			b = c;
		}

		return (a);
	}
	//first commit
		public static void main(String[]args){
			int n = 100;
			System.out.println("Fibonacci of " + n +
				"th term" + " " +"is" +" " + fib(n));
}
}