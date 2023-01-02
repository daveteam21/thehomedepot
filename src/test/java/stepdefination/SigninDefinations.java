/*package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SigninPage;

public class SigninDefinations {

	@Given("I am on the  homepage")
	public void i_am_on_the_homepage() {
		HomePage homepage = new HomePage();
		homepage.loadPage();
	}

	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.myAccount.click();
		homepage.signinButton.click();
		Thread.sleep(2000);
	}

	@When("I enter valid email address")
	public void i_enter_valid_email_address() throws InterruptedException {
		SigninPage signinpage = new SigninPage();
		signinpage.usernamefield.sendKeys("Billygately22@yahoo.com");
		signinpage.selectcontinuebtn.click();
		Thread.sleep(4000);
	}
	
	@When("click No Thanks on Sign in faster with more security")
	public void click_no_thanks_on_sign_in_faster_with_more_security() {
		SigninPage signinpage = new SigninPage();
		signinpage.selectcontinuebtn.click();
	 
	}
	@When("enter valid password")
	public void enter_valid_password() {
		SigninPage signinpage = new SigninPage();
		signinpage.passwordfield.sendKeys("IT@world22!");
	}
	@When("I should be homepage")
	public void i_should_be_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	    

//	}

}
//	@Then("I should be logged in")
//	public void i_should_be_logged_in() {

	}
*/
