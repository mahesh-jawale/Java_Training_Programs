package com.polymorphism.methodoverriding;

public class NoDataLimitPlan extends JioRecharge{

	@Override
	public void rechargeJioNumber() {
		System.out.println("----No Data Limit Plan----");
		super.rechargeJioNumber();//use of Super keyword
		String str296Plan="296";
		System.out.println("You have selected : "+str296Plan+" plan (25 GB/Day,30 Days)");
		}
}
