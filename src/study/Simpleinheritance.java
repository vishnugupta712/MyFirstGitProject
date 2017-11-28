package study;
class A {
	int i , j;
	void showij(){
		System.out.println("i and j :" + i + " " + j);
	}
}
class B extends A{
	int k;
	void showk(){
		System.out.print("k :" + k);
	}
	void sum(){
		System.out.print("i + j + k :" + (i + j + k));
	}
}
class Simpleinheritance {
	public static void main(String[] args) {
		A superob = new A();
		B subob = new B();
		superob.i = 20;
		superob.j = 10;
		System.out.println("contents of superob");
		superob.showij();
		subob.i = 7;
		subob.j = 8;
		subob.k = 9;
		System.out.println("contents of subob : ");
		subob.showij();
		System.out.println("sum ofn i , j and k in subob");
		subob.sum();
	}
}
