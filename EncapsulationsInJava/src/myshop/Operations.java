package myshop;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Operations {
	static Scanner sc=new Scanner(System.in);
	static Appliances ap=new Appliances();

	public static void setInfo() {
		// TODO Auto-generated method stub
		System.out.println("***** add product *****");
		System.out.println("enter product id:");
		ap.setProductid(sc.nextInt());
		System.out.println("enter product name");
		ap.setProductname(sc.next());
		System.out.println("enter product price");
		ap.setPrice(sc.nextDouble());
		System.out.println("***** product added ******");
		System.out.println();
		ap.setGST(12);
	}

	public static void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("**** product info *******");
		System.out.println("product id: "+ap.getProductid());
		System.out.println("product name: "+ap.getProductname());
		System.out.println("product price:"+(ap.getPrice()));
		System.out.println("GST:"+ap.getGST());
		System.out.println("total price:"+ap.getTotalPrice());
		System.out.println("**** thank you *********");
		System.out.println();
		
	}

	public static void updateData() {
		// TODO Auto-generated method stub
		System.out.println("press 1:update id\npress 2:update name\npress 3:update price");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("enter new id:");
			ap.setProductid(sc.nextInt());
			System.out.println("Id updated at: "+LocalDateTime.now());
			break;
		case 2:
			System.out.println("enter new name:");
			ap.setProductname(sc.next());
			System.out.println("name updated at: "+LocalDateTime.now());

			break;
		case 3:
			System.out.println("enter new price:");
			ap.setPrice(sc.nextDouble());
			System.out.println("price updated at: "+LocalDateTime.now());

			break;
		}
	}

}
