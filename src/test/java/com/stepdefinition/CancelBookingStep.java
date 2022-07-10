package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class CancelBookingStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	
	@Then("User should cancel the Order Id")
	public void userShouldCancelTheOrderId() throws InterruptedException {
		Thread.sleep(2000);
		pom.getCancelBookingPage().cancelBooking();
		}

	@Then("User should verify Order Id cancelled message after cancelling the booking {string}")
	public void userShouldVerifyOrderIdCancelledMessageAfterCancellingTheBooking(String errormsg) {
		String CancelId1 = getText(pom.getCancelBookingPage().getErrorMessage());
		   Assert.assertTrue("Verify The booking has been cancelled.", errormsg.contains(errormsg));
		   System.out.println(CancelId1);
	}

	@Then("User should cancel the Existing Order Id in Book Itinerary page {string}")
	public void userShouldCancelTheExistingOrderIdInBookItineraryPage(String OrderId) throws InterruptedException {
		
	    pom.getCancelBookingPage().cancelBooking(OrderId);
}
}