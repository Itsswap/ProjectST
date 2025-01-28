package Pages;

import org.openqa.selenium.By;

import commonmethod.CommonMethods;
import masterpag.MasterPage;

public class Addtocart extends CommonMethods
{
	public Addtocart() throws Exception 
	{
		super();		
	}
	public void verfiy()
	{
		driver.findElement(By.id("first-name")).sendKeys("Tejal");
	    driver.findElement(By.id("last-name")).sendKeys("Patel");
	    driver.findElement(By.id("postal-code")).sendKeys("422003");
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.id("finish")).click();
	}

}
