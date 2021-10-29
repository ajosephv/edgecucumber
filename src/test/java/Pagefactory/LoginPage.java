package Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		//AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);
	}

	
	@FindBy(id= "accept_cookie")
	@CacheLookup
	WebElement cookie;
	
	@FindBy(id= "yt17")
	@CacheLookup
	WebElement lang;
	
	@FindBy(id= "txtUsername")
	@CacheLookup
	WebElement usernames;
	
	@FindBy(id= "txtPassword")
	@CacheLookup
	WebElement passwords;
	
	@FindBy(id= "btnLogin")
	@CacheLookup
	WebElement login;
	
	
	
	public void browser()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.globalenglish.com/");
		driver.manage().window().maximize();
		
	}
	
	public void accept()
	{
		cookie.click();
        lang.click();
        
	}
	
	public void credentials(String username,String password)

	{
		usernames.sendKeys(username);
		passwords.sendKeys(password);
	}
	
	public void submit()
	{
		login.click();
	}
	
	
	
}
