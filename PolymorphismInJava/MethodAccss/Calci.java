package MethodAccss;

import java.util.Scanner;

public class Calci {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("addition is "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    System.out.println("enter num1:");
	    int num1=s.nextInt();
	    System.out.println("enter num2");
	    int num2=s.nextInt();
	    Calci c=new Calci();
	    c.add(num1, num2);
	    }

}
