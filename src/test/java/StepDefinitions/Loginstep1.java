package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstep1 {

	@Given("User is on login page")
	public void loginpage()
	{
     System.out.println("loginpage111");

	}

	@When("User enters username and password")
	public void credentials1()
	{System.out.println("enters usernamem pas pass");

	}

	@And("click on submit1")
	public void Click1()
	{
		System.out.println("submit");
	}

	@Then("user should login successfully and naviage to home page")
	public void HomePage()
	{
		System.out.println("homepahe");
	}
}
