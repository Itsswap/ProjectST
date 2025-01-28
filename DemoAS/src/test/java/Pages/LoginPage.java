package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import commonmethod.CommonMethods;
import masterpag.MasterPage;

public class LoginPage extends CommonMethods
{
	
	public LoginPage() throws Exception 
	{
		super();
	}

	public void getUserField() 
	{
		sendkeys("Username", "username");
		sendkeys("Password", "password");
		clickmethod("LgnButton");
	}
	

}
