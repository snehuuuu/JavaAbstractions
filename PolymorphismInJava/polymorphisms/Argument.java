package polymorphisms;

public class Argument {
	public void m1() {
		System.out.println("m1 with no parameter");
	}

	public void m1(int a) {
		System.out.println("m1 with int parameter");
	}
	public void m1(String a) {
		System.out.println("m1 with string parameter");
	}
	public void m1(float a) {
		System.out.println("m1 with float parameter");
	}
	public void m1(int a,int b) {
		System.out.println("m1 with two int parameters");
	}
	public void m1( int a,float b) {
		System.out.println("m1 with int and float");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Argument f=new Argument();
		f.m1();
		f.m1(10);
		f.m1("kbp");
		f.m1(2.4f);
		f.m1(10,20);
		f.m1(10,2.4f);
	}

}
