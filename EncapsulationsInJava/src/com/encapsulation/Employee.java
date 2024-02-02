package com.encapsulation;

public class Employee {
	private int eid;
	private String ename;
	private int sallary;
	
	public void seteid(int eid) {
		this.eid=eid;
	}
	public int getid() {
		return eid;
	}
	public void setename(String ename) {
		this.ename=ename;
	}
	public String getename() {
		return ename;
	}
	public void setsallary(int sallary) {
		this.sallary=sallary;
	}
	public int getsallary() {
		return sallary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sallary=" + sallary + "]";
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.seteid(10);
		e1.setename("radha");
		e1.setsallary(23456);
		System.out.println(e1);
		
		Employee e2=new Employee();
		e2.seteid(12);
		e2.setename("ram");
		e2.setsallary(15487);
		System.out.println(e2);
		
		
	}

}
