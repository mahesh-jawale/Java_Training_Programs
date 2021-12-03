package com.inheritance;

public class TestRechargeNum extends CardDetails {

	public static void initializeWebEnvironment(String strURL)
	{
		System.out.println("Opening URL : "+strURL);
	}
	
	
	
	public static void main(String[] args) {
		PlanDetails objPlanDetails=new PlanDetails();
		MobileNumber objMobileNumber=new MobileNumber();
		CardDetails objCardDetails=new CardDetails();
		initializeWebEnvironment("https://www.jio.com/selfcare/recharge/mobility/");
		objPlanDetails.selectPlan();
		objMobileNumber.enterMobileNum();
		objCardDetails.enterCardDetails();
		tearDown();

	}

	public static void tearDown()
	{
		System.out.println("\nPayment Successful");
		System.out.println("Your Mobile Number Is Recharged");
	}
}
