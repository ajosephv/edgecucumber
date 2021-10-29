package Pagefactory;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);
	}

	public void homepagetitle()
	{
		String a=driver.getTitle();
		
		if(a.contains("GlobalEnglish - Home"))
		{
			Assert.assertTrue(true);

		}
		else if(a.contains("GlobalEnglish One Dashboard - 01 Booster Inc"))
		{
			
			Assert.assertTrue(true);

		}
		else
		{
			Assert.assertTrue(false);
		}
		driver.close();
	}
}

