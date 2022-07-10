package com.pagemanager;

import com.pages.BookingConfirmationPage;
import com.pages.BookingPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {
private LoginPage loginPage;
private SearchHotelPage searchHotelPage;
private SelectHotelPage selectHotelPage;
private BookingPage bookingPage;
private BookingConfirmationPage bookingConfirmationPage;
private CancelBookingPage cancelBookingPage;


public LoginPage getLoginPage() {
	return (loginPage==null)? loginPage= new LoginPage() : loginPage;
}

public SearchHotelPage getSearchHotelPage() {
	return (searchHotelPage==null)? searchHotelPage= new SearchHotelPage() : searchHotelPage;
}

public SelectHotelPage getSelectHotelPage() {
	return (selectHotelPage==null)? selectHotelPage= new SelectHotelPage() : selectHotelPage;
}

public BookingPage getBookingPage() {
	return (bookingPage==null)? bookingPage= new BookingPage() : bookingPage;
}

public BookingConfirmationPage getBookingConfirmationPage() {
	return (bookingConfirmationPage==null)? bookingConfirmationPage= new BookingConfirmationPage() : bookingConfirmationPage;
}

public CancelBookingPage getCancelBookingPage() {
	return (cancelBookingPage==null)? cancelBookingPage= new CancelBookingPage() : cancelBookingPage;
}

}

