package com.polymorphism.methodoverriding;

public class TestMethodOverridingExample extends BaseTest {

	public static void main(String[] args) {

		BaseTest objBaseTest=new BaseTest();
		CardDetails objCardDetails=new CardDetails();
		
		objBaseTest.initializeWebEnvironment("https://www.jio.com/selfcare/recharge/mobility/");
		PopularPlans objPopularPlans=new PopularPlans();
		objPopularPlans.rechargeJioNumber();
		objCardDetails.enterCardDetails();
		objBaseTest.rechargeSuccessful();
		
		System.out.println("\n=========================================");
		NoDataLimitPlan objNoDataLimitPlan=new NoDataLimitPlan();
		objNoDataLimitPlan.rechargeJioNumber();
		objCardDetails.enterCardDetails();
		objBaseTest.rechargeSuccessful();
		
		System.out.println("\n=========================================");
		CricketPlans objCricketPlans=new CricketPlans();
		objCricketPlans.rechargeJioNumber();
		objCardDetails.enterCardDetails();
		objBaseTest.rechargeSuccessful();
		
		
		
	}

}
