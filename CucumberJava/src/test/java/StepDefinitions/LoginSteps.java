package StepDefinitions;

import Methods.LoginMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	
	@Given("the Hudl home page is open")
	public void the_hudl_home_page_is_open() {
	    LoginMethods.LaunchBrowser();
	    LoginMethods.GetHomePage();
	}

	@When("I click the Login button")
	public void i_click_the_login_button() {
	    LoginMethods.ClickLogin();
	}

	@Then("the Login page is displayed")
	public void the_login_page_is_displayed() {
		LoginMethods.GetLoginPage();
	}

	@When("I enter {string} in the Email field")
	public void i_enter_in_the_Email_field(String string) {
	    LoginMethods.EnterUsername(string);
	}

	@When("I enter {string} in the Password field")
	public void i_enter_in_the_password_field(String string) {
	    LoginMethods.EnterPassword(string);
	}

	@When("I click Login")
	public void i_click_login() {
	    LoginMethods.SubmitLogin();
	}

	@Then("the welcome page is displayed")
	public void the_welcome_page_is_displayed() {
		LoginMethods.GetWelcomePage();
	}
	
	@Given("I close the browser")
	public void i_close_the_browser() {
	    LoginMethods.CloseBrowser();
	}
}
