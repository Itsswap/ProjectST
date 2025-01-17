package TestCases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ProductsPage;
import masterpag.MasterPage;

public class ProductsTestCase extends MasterPage{

	public ProductsTestCase() throws Exception {
		super();
	}

	@Test
	public void producttest() throws Exception {

		ProductsPage p = new ProductsPage();
		p.dropdown();
		
		

	}

}
