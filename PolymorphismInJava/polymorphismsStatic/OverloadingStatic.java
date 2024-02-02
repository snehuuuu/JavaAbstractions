package polymorphismsStatic;

public class OverloadingStatic {
	public static void m1() {
		System.out.println("m1 with no parameter");
	}
	public static void m1(int a) {
		System.out.println("m1 with int parameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingStatic.m1();
		OverloadingStatic.m1(10);

	}

}
