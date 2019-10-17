package com.inheritance.cfsd;
public class Manager extends Employee{

	Manager(long Id , String Name , String Address , long Phone , double Salary){
		super (Id ,Name,Address,Phone);
		this.basicSalary=Salary;
	}
		public void calculateTransportAllowance() {
			//super.calculateTransportAllowance();
			double transportAllowance = (0.15)*basicSalary;
			System.out.println("The transport allowance of manager is :" + transportAllowance);
		
	}
	
}
