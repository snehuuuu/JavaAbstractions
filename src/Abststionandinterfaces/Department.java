package Abststionandinterfaces;
//we can acheive abstraction by two methods
//1)by making chaild class as abstarct class(i.e department)
//2)by overriding abstract method of parent class in child class(i.e getclasses)

//public abstract class Department extends College{
//	
//}

public class Department extends College{

	@Override
	public void getclasses() {
		// TODO Auto-generated method stub
		System.out.println("fy");
	}
	

}
