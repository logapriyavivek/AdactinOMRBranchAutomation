package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author LOGAPRIYA
 * Description To maintain the locator for cancel booking page
 * @CreationDate 30/06/2022
 *
 */
public class CancelBookingPage extends BaseClass{
	public  CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id = "search_result_error")
	private WebElement errorMessage;
	
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement btnMyItinerary;
	@FindBy(id = "order_id_text")
	private WebElement orderSearch; 
	@FindBy(id = "search_hotel_id")
	private WebElement btnOrderSearch;
//	@FindBy(xpath = "//a[text()='Show all']")
//	private WebElement showAll;
	@FindBy(xpath = "//input[contains(@value, 'Cancel')]")
	private WebElement clickCheckId;
//	@FindBy(className = "reg_button")
//	private WebElement cancelAll;
	
	
	public WebElement getErrorMessage() {
		return errorMessage;
	}
	public WebElement getBtnMyItinerary() {
		return btnMyItinerary;
	}
	public WebElement getOrderSearch() {
		return orderSearch;
	}
	public WebElement getBtnOrderSearch() {
		return btnOrderSearch;
	}
	public WebElement getClickCheckId() {
		return clickCheckId;
	}
	
	public void cancelBooking(String OrderId) {
		click(getBtnMyItinerary());
		type(getOrderSearch(), OrderId);
		click(getBtnOrderSearch());
		click(getClickCheckId());
		okAlert();
		System.out.println("Deleted Successfully");
	}
	public void cancelBooking() {
		click(getBtnMyItinerary());
		click(getClickCheckId());
		okAlert();
	}


	
}
