  package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author LOGAPRIYA
 * @Description User should maintain the locators
 * @Dated 25/06/2022
 */
public class BookingPage extends BaseClass {
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id ="first_name")
    private WebElement txtfirstname;
	@FindBy (id ="last_name")
    private WebElement txtlastname;
    @FindBy (id ="address")
    private WebElement txtaddress;
    @FindBy (id ="cc_num")
    private WebElement cardno;
    @FindBy (id ="cc_type")
    private WebElement cardtype;
    @FindBy (id ="cc_exp_month")
    private WebElement btnmonth;
    @FindBy (id="cc_exp_year")
    private WebElement btnyear;
    @FindBy (id ="cc_cvv")
    private WebElement btnccv;
    @FindBy (id ="book_now")
    private WebElement btnbooknow;
    @FindBy(xpath="//td[text()='Booking Confirmation ']")
    private WebElement txtBookConfirm;
    @FindBy(id="first_name_span")
    private WebElement firstNameErrorMsg;
    @FindBy(id= "last_name_span")
    private WebElement lastNameErrorMsg;
    @FindBy(id="address_span")
    private WebElement addressErrorMsg;
    @FindBy(id="cc_num_span")
    private WebElement ccNumErrorMsg;
    @FindBy(id="cc_type_span")
    private WebElement cctypeErrorMsg;
    @FindBy (id="cc_expiry_span")
    private WebElement ccExpirySpanMsg;
    @FindBy(id="cc_cvv_span")
    private WebElement ccCvvErrorMsg;   
    
	   

public WebElement getTxtfirstname() {
		return txtfirstname;
	}
	public WebElement getTxtlastname() {
		return txtlastname;
	}
	public WebElement getTxtaddress() {
		return txtaddress;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getBtnmonth() {
		return btnmonth;
	}
	public WebElement getBtnyear() {
		return btnyear;
	}
	public WebElement getBtnccv() {
		return btnccv;
	}
	public WebElement getBtnbooknow() {
		return btnbooknow;
	}
	public WebElement getTxtBookConfirm() {
		return txtBookConfirm;
	}
	public WebElement getFirstNameErrorMsg() {
		return firstNameErrorMsg;
	}
	public WebElement getLastNameErrorMsg() {
		return lastNameErrorMsg;
	}
	public WebElement getAddressErrorMsg() {
		return addressErrorMsg;
	}
	public WebElement getCcNumErrorMsg() {
		return ccNumErrorMsg;
	}
	public WebElement getCctypeErrorMsg() {
		return cctypeErrorMsg;
	}
	public WebElement getCcExpirySpanMsg() {
		return ccExpirySpanMsg;
	}
	public WebElement getCcCvvErrorMsg() {
		return ccCvvErrorMsg;
	}
/**
 * 
 * @param firstname
 * @param lastname
 * @param address
 * @param cardno
 * @param cardtype
 * @param month
 * @param year
 * @param ccv
 * @Description 
 */
	public void bookHotel(String firstname, String lastname, String address, String cardno, String cardtype, String month, String year, String ccv) {
		type(getTxtfirstname(), firstname);
		type(getTxtlastname(), lastname);
		type(getTxtaddress(), address);
		type(getCardno(), cardno);
		type(getCardtype(), cardtype);
		type(getBtnmonth(), month);
		type(getBtnyear(), year);
		type(getBtnccv(), ccv);
		click(getBtnbooknow());
	
		
	}
	public void bookHotel() {
		click(getBtnbooknow());
	}
}
