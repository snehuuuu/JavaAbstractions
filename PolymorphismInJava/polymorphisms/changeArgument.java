package polymorphisms;

public class changeArgument {
	void display(float l,int b) {//ob.display(2.3f,2);
				System.out.println("float and int");
		
	}
	void display(int l,float b) {//ob.display(4,4.6f);
		System.out.println("int and float");
	}
	public static void main(String[] args) {
		changeArgument ob=new changeArgument();
		ob.display(2.3f,2);
		ob.display(4,4.6f);
		
	}

}
