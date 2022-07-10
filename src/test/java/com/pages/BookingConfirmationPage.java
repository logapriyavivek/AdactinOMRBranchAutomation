package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingConfirmationPage extends BaseClass {
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "order_no")
	private WebElement orderNo;
	@FindBy(className = "login_title")
	private WebElement confirmationMessage;

	public WebElement getTxtOrderNo() {
		return orderNo;
	}

	public WebElement getConfirmationMessage() {
		return confirmationMessage;
	}

	public String bookingConfirmation() {
		 String orderNum = getAttribute(getTxtOrderNo());
		 return orderNum;
	}

}
