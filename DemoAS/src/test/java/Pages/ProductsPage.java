package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonmistake.CommonMethods;

public class ProductsPage extends CommonMethods {
	
	public ProductsPage() throws Exception {
		super();	
	}
	
	public void dropdown() 
	{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Ensure driver is initialized
	    WebElement java = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='product_sort_container']")));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(java).click().build().perform();
	}


}
