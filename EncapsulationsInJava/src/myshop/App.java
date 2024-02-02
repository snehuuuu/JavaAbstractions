package myshop;

import java.util.Scanner;

public class App {
	static Scanner sc=new Scanner(System.in);

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		System.out.println("press 1:add product\npress 2:see products\npress 3:update product");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			Operations.setInfo();
			break;
		case 2:
			Operations.getInfo();
			break;
		case 3:
			Operations.updateData();
			break;
		}
		}

	}

}
