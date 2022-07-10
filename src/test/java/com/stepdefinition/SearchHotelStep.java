package com.stepdefinition;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SearchHotelStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	
	@Then("User should Select all fields to search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldSelectAllFieldsToSearchHotelAnd(String location, String hotel, String roomType, String roomNo, String datepickin, String datepickout, String adultPerRoom, String ChildrenPerRoom) {
	pom.getSearchHotelPage().searchHotel(location, hotel, roomType, roomNo, datepickin, datepickout, adultPerRoom, ChildrenPerRoom);
	}
		
	@Then("User should verify the message after search hotel {string}")
	public void userShouldVerifyTheMessageAfterSearchHotel(String selecthotel) {
		String selecthotel2 = getText(pom.getSearchHotelPage().getTxtSelectHotel());
		Assert.assertTrue("Verify Select Hotel", selecthotel2.contains(selecthotel));
		System.out.println(selecthotel2);
	}
	@Then("User should Select the mandatory fields to search hotel {string},{string},{string},{string},{string}")
	public void userShouldSelectTheMandatoryFieldsToSearchHotel(String location, String roomnos, String datepickin, String datepickout,
			String adultroom) {
		pom.getSearchHotelPage().searchHotel(location, roomnos, datepickin,	datepickout, adultroom);
		
	}
	

	@Then("User should verify error message after search in both date field {string} , {string}")
	public void userShouldVerifyErrorMessageAfterSearchInBothDateField(String string, String string2) {
	    
	}

	@Then("User need to click search button")
	public void userNeedToClickSearchButton() {
		
		pom.getSearchHotelPage().searchHotel(); 
	    
	}

	@Then("User should verify error message after search hotel {string}")
	public void userShouldVerifyErrorMessageAfterSearchHotel(String location) {
		String searchhotel1 = getText(pom.getSearchHotelPage().getLocationerror());
		Assert.assertTrue("Verify Search Hotel", searchhotel1.contains(location));
		System.out.println(location);
	}

}
