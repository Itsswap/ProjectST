package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import commonmethod.CommonMethods;

public class Verifytitle extends CommonMethods{

	public Verifytitle() throws Exception {
		super();
		
	}

	
	public void verifytitleoftheproducts()
	{
		String actual= "Thank you for your order!";
		String excepted= driver.findElement(By.xpath("//*[text()='Thank you for your order!']")).getText();
		Assert.assertEquals(actual, excepted);
		System.out.println("Thank you for shopping");
	}
}
