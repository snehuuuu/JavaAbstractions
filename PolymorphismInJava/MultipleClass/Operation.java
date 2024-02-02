package MultipleClass;

import java.util.Scanner;

public class Operation {
	static Scanner sc=new Scanner(System.in);

	public static void setitems() {
		// TODO Auto-generated method stub
		System.out.println("enter 1 for add TV\nenter 2 for add Mobile");
		int ch=sc.nextInt();
	
		switch(ch) {
		case 1:
			Tv.addTV();
			break;
		case 2:
			Mobile.addmb();
			break;
			
		}
	}

	public static void getitem() {
		
		// TODO Auto-generated method stub
		
	}

}
