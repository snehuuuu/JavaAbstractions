package Abststionandinterfaces;

abstract class Coach{
	public abstract String getworkout();//abstract method
	
	public abstract String getPractice();
	
	public abstract String getCoachName();
	
	public void PlayerName() {
		System.out.println("xyz");
	}
	
}

//coach class is abstarct so we override abstract methods of coach class
 class Cricket extends Coach{

	@Override
	public String getworkout() {
		// TODO Auto-generated method stub
		return "running";
	}

	@Override
	public String getPractice() {
		// TODO Auto-generated method stub
		return "consistent";
	}

	@Override
	public String getCoachName() {
		// TODO Auto-generated method stub
		return "vipul";
	}
	
	
}
 
 class Football extends Coach{

	@Override
	public String getworkout() {
		// TODO Auto-generated method stub
		return "pushup";
	}

	@Override
	public String getPractice() {
		// TODO Auto-generated method stub
		return "regular";
	}

	@Override
	public String getCoachName() {
		// TODO Auto-generated method stub
		return "sachin";
	}
	 
 }




public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c=new Cricket();
		System.out.println(c.getCoachName());
		System.out.println(c.getPractice());
		System.out.println(c.getworkout());
		c.PlayerName();
		
		
		Football f=new Football();
		System.out.println(f.getCoachName());
		System.out.println(f.getPractice());
		System.out.println(f.getworkout());
		f.PlayerName();

	}

}
