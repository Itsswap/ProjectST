package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonmethod.CommonMethods;

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
	    Select selects= new Select(java);
	    List<WebElement> options= selects.getOptions();
	    int size=options.size();
	    System.out.println("Size of dropdown is: "+ size );
	    
	    for(int i =0; i<size;i++)
	    {
	    	System.out.println("List of Name A to Z: " +options.get(i).getText());
	    }
	    options.get(2).click();
	    driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
	    driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
	    driver.findElement(By.id("checkout")).click();
	}

	

}
