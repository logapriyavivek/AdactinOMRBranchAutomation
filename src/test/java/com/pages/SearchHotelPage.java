package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

@FindBy (id ="location")
private WebElement dDnlocation;
@FindBy (id="hotels")
 private WebElement dDnhotel;
@FindBy (id="room_type")
 private WebElement dDnroomtype;
@FindBy (id="room_nos")
 private WebElement dDnroomNo;
@FindBy (id="datepick_in")
 private WebElement checkin;
@FindBy (id="datepick_out")
 private WebElement checkout;
@FindBy (id="adult_room")
 private WebElement adultroom;
@FindBy (id="child_room")
 private WebElement childrenroom;
@FindBy(xpath="//td[text()='Select Hotel ']")
private WebElement txtSelectHotel;
@FindBy(id = "location_span")
private WebElement locationerror;
//@FindBy (id="checkin_span")
//private WebElement checkinSpan;
//@FindBy (id= "checkout_span")
//private WebElement checkoutSpan;
@FindBy (id="Submit")
 private WebElement btnsubmit;
@FindBy (className="login_title")
private WebElement txtlogintitle;



public WebElement getdDnlocation() {
	return dDnlocation;
}
public WebElement getdDnhotel() {
	return dDnhotel;
}
public WebElement getdDnroomtype() {
	return dDnroomtype;
}
public WebElement getdDnroomNo() {
	return dDnroomNo;
}
public WebElement getCheckin() {
	return checkin;
}
public WebElement getCheckout() {
	return checkout;
}
public WebElement getAdultroom() {
	return adultroom;
}
public WebElement getChildrenroom() {
	return childrenroom;
}
public WebElement getTxtSelectHotel() {
	return txtSelectHotel;
}
public WebElement getLocationerror() {
	return locationerror;
}
public WebElement getBtnsubmit() {
	return btnsubmit;
}
public WebElement getTxtlogintitle() {
	return txtlogintitle;
}
public void searchHotel(String location, String hotel, String roomType, String roomNo, String datepickin, String datepickout, String adultPerRoom, String ChildrenPerRoom) {
	 SelectBytext(getdDnlocation(), location);
	 SelectBytext(getdDnhotel(), hotel);
	 SelectBytext(getdDnroomtype(), roomType);
	 SelectBytext(getdDnroomNo(), roomNo);
	 type(getCheckin(), datepickin);
	 type(getCheckout(), datepickout);
	 SelectBytext(getAdultroom(), adultPerRoom);
	 SelectBytext(getChildrenroom(), ChildrenPerRoom);
	 click(getBtnsubmit());
}
public void searchHotel(String location, String roomNo, String datepickin, String datepickout, String adultPerRoom) {
	SelectBytext(getdDnlocation(), location);
	SelectBytext(getdDnroomNo(), roomNo);
	type(getCheckin(), datepickin);
    type(getCheckout(), datepickout);
	SelectBytext(getAdultroom(), adultPerRoom);
	click(getBtnsubmit());
}
public void searchHotel() {
	click(getBtnsubmit());
	 

}
}