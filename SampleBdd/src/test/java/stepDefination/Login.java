package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{   
	
	
	@Given("user is on login page.")
	public void User_is_on_login_page()
	{
		System.out.println("User is on login page");
		System.out.println("Hello...");
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() 
	{
		System.out.println("User name and password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() 
	{
	   System.out.println("User clicks login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page()
	{
	   System.out.println("User is navigated to home page");
	}
	
	
}
