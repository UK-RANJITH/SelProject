package org.company;

public class CompanyInfo {
	private void companyName() {
		 
System.out.println("Company Name to be Displayed");
	}
	
	private void companyId() {
		System.out.println("Company ID to be Displayed");
	}
	
	private void companyAddress() {
		System.out.println("Company Address to be Displayed");

	}
	
	public static void main(String[] args) {
		
		 CompanyInfo c=new  CompanyInfo();
		 c.companyName();
		 c.companyId();
		 c.companyAddress();
		
		
	}

}
