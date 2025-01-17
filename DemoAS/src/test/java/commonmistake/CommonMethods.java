package commonmistake;

import org.openqa.selenium.By;

import masterpag.MasterPage;

public class CommonMethods extends MasterPage {

	public CommonMethods() throws Exception {
		super();
	}

	// Click method
	public void clickmethod(String xpathkey) {
		driver.findElement(By.id(p1.getProperty(xpathkey))).click();
	}

	// Gettext method
	public void getText(String xpathkey) {
		driver.findElement(By.id(p1.getProperty(xpathkey))).getText();
	}

	// Sendkeys
	public void sendkeys(String xpathkey, String testdata) {
		driver.findElement(By.id(p1.getProperty(xpathkey))).sendKeys(p2.getProperty(testdata));
	}

	// Clear
	// public void
}
