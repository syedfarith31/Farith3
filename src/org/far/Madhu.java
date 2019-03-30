package org.far;


public class Madhu {
	public void empId(int id) {
		System.out.println(id);}
		public void empId(String dob) {
			System.out.println(dob);}
		public static void main(String[] args) {
			Madhu r=new Madhu();
			r.empId(123);
			r.empId("12.09.2019");
		}

}
