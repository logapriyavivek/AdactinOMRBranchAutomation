package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

@FindBy (id ="radiobutton_0")
private WebElement btnclick;
@FindBy (id ="continue")
private WebElement btncontinue;
@FindBy (xpath="//td[text()='Book A Hotel ']")
private WebElement txtBookHotel;
@FindBy (id = "radiobutton_span")
private WebElement txtSelectHotel;



public WebElement getBtnclick() {
	return btnclick;
}
public WebElement getBtncontinue() {
	return btncontinue;
}
public WebElement getTxtBookHotel() {
	return txtBookHotel;
}
public WebElement getTxtSelectHotel() {
	return txtSelectHotel;
}
public void selectHotel() {
	click(getBtnclick());
	click(getBtncontinue());
	
}
public void SelectContinute() {
	click(getBtncontinue());
}

}






















