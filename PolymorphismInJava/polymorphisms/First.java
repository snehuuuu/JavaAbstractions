//polymorphism- many forms
/*2 type-
 		1)runtime polymorphism		- IS-A relation,parent-child->function overriding
 		2)compiletime polymorphism	- function overloading
 
 *overloading:inside a class write same function any number of times
 		ways-1)by changing the no. of arguments
 		 	 2)by changing the datatypes
 		 	 3)by changing order of arguments
 		 	 
 
 
 */
package polymorphisms;
// function overloading
public class First {
	//by changing the datatype 
	void area(float r) {//sc.area(2.1f);
		float ar=3.14f*r*r;
		System.out.println("area of circle: "+ar);
	}
	void area(int s) {//sc.area(5);
		int ar=s*s;
		System.out.println("area of square: "+ar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First sc=new First();
		sc.area(2.1f);
		sc.area(5);

	}

}
