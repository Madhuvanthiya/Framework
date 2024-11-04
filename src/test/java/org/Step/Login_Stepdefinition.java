package org.Step;

import java.io.IOException;

import org.TestData.TestData;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.pom.login_page;

import Cucumber.Framework.TestBase_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Stepdefinition extends TestBase_class {
	

login_page pom_login;

@Given("User should enter the UserName as {string}")
public void userShouldEnterTheUserNameAs(String userName) {
	pom_login = new login_page(driver);
	tofill(pom_login.getUserName(), userName);
}
@Given("User should enter the Password as {string}")
public void userShouldEnterThePasswordAs(String Password) {
    tofill(pom_login.getPassword(), Password);
}
@When("User click on the Login button")
public void userClickOnTheLoginButton() {
	jsclick(pom_login.getLoginbtn());
}
@Then("Login should pass")
public void loginShouldPass() {
	String title = driver.getTitle();
	System.out.println(title);
    Assert.assertEquals(title, "Adactin.com - Search Hotel");
}
@When("user should Select the Location")
public void userShouldSelectTheLocation() {
  Select select = new Select(pom_login.getLocation());
  select.selectByIndex(5);
}
@When("User Select the Hotel,Room type")
public void userSelectTheHotelRoomType() {
   Select select = new Select(pom_login.getHotels());
   select.selectByValue("Hotel Sunshine");
   Select select1= new Select(pom_login.getRoom_type());
   select1.selectByVisibleText("Standard");
}
@When("User Select the Number of Rooms")
public void userSelectTheNumberOfRooms() {
   Select select = new Select(pom_login.getNofRooms());
   select.selectByIndex(1);
}
@When("User should Enter the Check In Date")
public void userShouldEnterTheCheckInDate() {
   tofill(pom_login.getCheckinDate(), "30/09/2024");
}
@When("User should Enter the Check Out Date")
public void userShouldEnterTheCheckOutDate() {
   tofill(pom_login.getCheckoutDate(), "31/09/2024");
}
@When("User Should Select the Adults per Room")
public void userShouldSelectTheAdultsPerRoom() {
   Select select = new Select(pom_login.getAdults());
   select.selectByValue("2");
}
@When("User Should Select the Children per Room")
public void userShouldSelectTheChildrenPerRoom() {
   Select select = new Select(pom_login.getChildren());
   select.selectByIndex(2);
}
@When("User Click the Search button")
public void userClickTheSearchButton() {
   jsclick(pom_login.getSearchbtn());
}
@Then("Navigate to Select Hotel Page")
public void navigateToSelectHotelPage() {
	String title = driver.getTitle();
	System.out.println(title);
    Assert.assertEquals(title, "Adactin.com - Select Hotel");
}

@When("User Click on the Radio button")
public void userClickOnTheRadioButton() {
   radiobutton(pom_login.getRadiobtn());
}
@When("User should Click Continue button")
public void userShouldClickContinueButton() {
   jsclick(pom_login.getContinuebtn());
}
@Then("Navigate to Book A Hotel page")
public void navigateToBookAHotelPage() {
   String title = driver.getTitle();
   System.out.println(title);
   Assert.assertEquals(title, "Adactin.com - Book A Hotel");
}

@When("User Enter the FirstName, LastName, Billing Address,Credit card No.")
public void userEnterTheFirstNameLastNameBillingAddressCreditCardNo() {
   tofill(pom_login.getFirstname(), "Madhu");
   tofill(pom_login.getLastname(), "Arun");
   tofill(pom_login.getBillAddress(), "Perungudi,Chennai-128.");
   tofill(pom_login.getCreditcardNo(), "2589631471679438");
}
@When("User should Select the Credit card type,Expire Date")
public void userShouldSelectTheCreditCardTypeExpireDate() {
   Select select = new Select(pom_login.getCardtype());
   select.selectByValue("MAST");
   Select select2= new Select(pom_login.getMonth());
   select2.selectByValue("9");
   Select select3= new Select(pom_login.getYear());
   select3.selectByValue("2030");
}
@When("User should enter the CVV Number")
public void userShouldEnterTheCVVNumber() {
    tofill(pom_login.getCVVnum(), "6173");
}
@Then("Click BookNow button")
public void clickBookNowButton() {
   jsclick(pom_login.getBooknowbtn());
}
@Then("User navigate to Booking Confirmation page")
public void userNavigateToBookingConfirmationPage() {
   String retrivetext = retrivetext(pom_login.getBookingconf());
   System.out.println(retrivetext);
   Assert.assertTrue(retrivetext, true);
}
@Then("Get the Orderno for booking conformation")
public void getTheOrdernoForBookingConformation() {
    String orderno = getattribute(pom_login.getOrderNO(), "value");
    System.out.println(orderno);
    Assert.assertTrue(orderno, true);
}
@Then("User Click MyItinerary button")
public void userClickMyItineraryButton() {
   jsclick(pom_login.getItinerary());
}
@Then("User Navigate to Select Hotel page")
public void userNavigateToSelectHotelPage() {
	 String title = driver.getTitle();
	   System.out.println(title);
	   Assert.assertEquals(title, "Adactin.com - Select Hotel");
}
@When("User select the Ordered checkbox")
public void userSelectTheOrderedCheckbox() {
   checkbox(pom_login.getCheckbox());
}
@Then("Click on the CancleSelect button")
public void clickOnTheCancleSelectButton() {
    jsclick(pom_login.getCancleselectedbtn());
    Alert alert= driver.switchTo().alert();
    alert.accept();
}
@Then("User Click on Logout button to exit the Test")
public void userClickOnLogoutButtonToExitTheTest() throws IOException {
    jsclick(pom_login.getLogoutbtn());
   screenshots(TestData.path);
}
}