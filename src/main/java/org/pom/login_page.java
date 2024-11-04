package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	
	WebDriver driver;

	@FindBy(id="username")
	WebElement userName;
	@FindBy(id="password")
	WebElement Password;
	@FindBy(xpath="//input[@id='login']")
	WebElement loginbtn;
	@FindBy(css="div[class='auth_error'] b")
	WebElement error;
	@FindBy(id="location")
	WebElement Location;
	@FindBy(id="hotels")
	WebElement Hotels;
	@FindBy(name="room_type")
	WebElement Room_type;
	@FindBy(name="room_nos")
	WebElement NofRooms;
	@FindBy(id="datepick_in")
	WebElement checkinDate;
	@FindBy(id="datepick_out")
	WebElement CheckoutDate;
	@FindBy(id="adult_room")
	WebElement Adults;
	@FindBy(id="child_room")
	WebElement Children;
	@FindBy(xpath="//input[@name='Submit']")
	WebElement Searchbtn;
	@FindBy(id="radiobutton_0")
	WebElement radiobtn;
	@FindBy(xpath="//input[@name='continue']")
	WebElement continuebtn;
	@FindBy(id="first_name")
	WebElement Firstname;
	@FindBy(id="last_name")
	WebElement Lastname;
	@FindBy(id="address")
	WebElement BillAddress;
	@FindBy(id="cc_num")
	WebElement CreditcardNo;
	@FindBy(xpath="//select[@name='cc_type']")
	WebElement cardtype;
	@FindBy(xpath="//select[@name='cc_exp_month']")
	WebElement Month;
	@FindBy(xpath="//select[@name='cc_exp_year']")
	WebElement Year;
	@FindBy(id="cc_cvv")
	WebElement CVVnum;
	@FindBy(xpath="//input[@name='book_now']")
	WebElement Booknowbtn;
	@FindBy(xpath="//table[@class='login']//tbody//tr//td[@class='login_title']")
	WebElement bookingconf;
	@FindBy(id="order_no")
	WebElement orderNO;
	@FindBy(id="my_itinerary")
	WebElement itinerary;
	@FindBy(xpath="//div//input[@name='check_all']")
	WebElement checkbox;
	@FindBy(xpath="//td//input[@name='cancelall']")
	WebElement cancleselectedbtn;
	@FindBy(xpath="//input[@id='logout']")
	WebElement logoutbtn;
	
	
	
	public login_page(WebDriver driver) {//constructor
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebDriver getDriver() {
		return driver;
	}	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getError() {
		return error;
	}
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotels() {
		return Hotels;
	}
	public WebElement getRoom_type() {
		return Room_type;
	}
	public WebElement getNofRooms() {
		return NofRooms;
	}
	public WebElement getCheckinDate() {
		return checkinDate;
	}
	public WebElement getCheckoutDate() {
		return CheckoutDate;
	}
	public WebElement getAdults() {
		return Adults;
	}
	public WebElement getChildren() {
		return Children;
	}
	public WebElement getSearchbtn() {
		return Searchbtn;
	}
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
	}
	public WebElement getFirstname() {
		return Firstname;
	}
	public WebElement getLastname() {
		return Lastname;
	}
	public WebElement getBillAddress() {
		return BillAddress;
	}
	public WebElement getCreditcardNo() {
		return CreditcardNo;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getMonth() {
		return Month;
	}
	public WebElement getYear() {
		return Year;
	}
	public WebElement getCVVnum() {
		return CVVnum;
	}
	public WebElement getBooknowbtn() {
		return Booknowbtn;
	}
	public WebElement getBookingconf() {
		return bookingconf;
	}
	public WebElement getOrderNO() {
		return orderNO;
	}
	public WebElement getItinerary() {
		return itinerary;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getCancleselectedbtn() {
		return cancleselectedbtn;
	}
	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	
	
	
	

}
