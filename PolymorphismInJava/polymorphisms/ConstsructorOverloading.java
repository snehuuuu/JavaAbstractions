package polymorphisms;

public class ConstsructorOverloading {
	 
	ConstsructorOverloading(){
		System.out.println(" constructor with no parameters");
	}
	ConstsructorOverloading(int a){
		System.out.println("constructor with int parameter ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstsructorOverloading co=new ConstsructorOverloading();
		ConstsructorOverloading co1=new ConstsructorOverloading(10);

		
	}

}
