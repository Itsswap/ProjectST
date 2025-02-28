package TestCases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ProductsPage;
import masterpag.MasterPage;

public class ProductsTestCase extends MasterPage{

	@Test
	public void producttest() throws Exception {
		//LoginPage loginPage = new LoginPage();
	    //loginPage.getUserField();
		ProductsPage p = new ProductsPage();
		p.dropdown();
	}

}
