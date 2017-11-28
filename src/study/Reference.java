package study;
import java.util.Scanner;

public class Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number upto which Fibonacci series to print: "); 
		@SuppressWarnings("resource")
		int number = new Scanner(System.in).nextInt(); 
		System.out.println("Fibonacci series upto " + number +" numbers : "); 
		//printing Fibonacci series upto number for(int i=1; i<=number; i++){ System.out.print(fibonacci2(i) +" "); }
		for(int i=1; i<=number; i++){ 
			System.out.print(fibonacci(i) +" "); 
		}
	}
	public static int fibonacci(int number){ 
		if(number == 1 || number == 2){ 
			return 1; 
		} 
		return fibonacci(number-1) + fibonacci(number -2); 
	}

}
