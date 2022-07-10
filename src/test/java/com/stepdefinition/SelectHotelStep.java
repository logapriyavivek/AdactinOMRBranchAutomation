package com.stepdefinition;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class SelectHotelStep extends BaseClass{
	PageObjectManager pom = new PageObjectManager();
	
	@Then("User should click the radio button and continue button in select hotel page")
	public void userShouldClickTheRadioButtonAndContinueButtonInSelectHotelPage() {
	    pom.getSelectHotelPage().selectHotel();
	    }

	@Then("User should verify the message after select hotel {string}")
	public void userShouldVerifyTheMessageAfterSelectHotel(String txtBookHotel) {
	    String txtBookHotel1=getText(pom.getSelectHotelPage().getTxtBookHotel());
	    	Assert.assertTrue("verify Book A Hotel", txtBookHotel1.contains(txtBookHotel1));
	    	System.out.println(txtBookHotel1);
	    }
	

	@Then("User need to click Continue button without select any hotel")
	public void userNeedToClickContinueButtonWithoutSelectAnyHotel() {
	    pom.getSelectHotelPage().SelectContinute();
	}

	@Then("User should verify error message in select hotel {string}")
	public void userShouldVerifyErrorMessageInSelectHotel(String string) {
	    getText(pom.getSelectHotelPage().getTxtSelectHotel());
	    		}
}
