package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import Pagefactory.HomePage;
import Pagefactory.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Edgelogin {
	WebDriver driver;
	
	//LoginPage login;
	//HomePage home;
	
	@Given("land on edge login")
	public void land_on_edge_login() throws InterruptedException {
		LoginPage login=new LoginPage(driver);
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions option=new FirefoxOptions();
		option.setHeadless(true);
		//ChromeOptions option=new ChromeOptions();
		//option.setHeadless(true);
		
		
		//driver=new ChromeDriver(option);
		driver=new FirefoxDriver(option);
		driver.get("https://login.globalenglish.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("accept_cookie")).click();
        //driver.findElement(By.id("yt17")).click();
		
		//login.accept();
        Thread.sleep(5000);
        
	}
	
	
	@When("^enters the (.*) and (.*)$")
	public void enters_the_usernamne_and_password(String username,String password) {
		LoginPage login=new LoginPage(driver);
		login.accept();
	    login.credentials(username, password);
	    //driver.findElement(By.id("txtUsername")).sendKeys(username);
		//driver.findElement(By.id("txtPassword")).sendKeys(password);
		
	}
	
	@And("click on submit")
	public void submit() throws InterruptedException
	{
		LoginPage login=new LoginPage(driver);
		login.submit();
		//driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		
	}

	@Then("user will lang on hoome page")
	public void user_will_lang_on_hoome_page() {
	   
		/*System.out.println(driver.getTitle());
	    String a=driver.getTitle();
	    if(a.contains("GlobalEnglish - Home"))
	    {
	    	Assert.assertTrue(true);
	    	
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    	
	    }
	    driver.close();*/
		HomePage home=new HomePage(driver);
		home.homepagetitle();

	}
}
