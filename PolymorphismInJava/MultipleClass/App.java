package MultipleClass;

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		System.out.println("press 1 for add\npress 2 for see items\npress 3 for update item");
		 int ch=s.nextInt();
		switch(ch) {
		case 1:
			Operation.setitems();
			break;
		case 2:
			Operation.getitem();
			break;
		case 3:
			break;
		}
	}

}
