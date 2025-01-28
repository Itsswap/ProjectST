package TestCases;

import org.testng.annotations.Test;

import Pages.Addtocart;
import Pages.ProductsPage;
import masterpag.MasterPage;

public class Addtocarttestcase extends MasterPage
{
	@Test
	public void addtocart() throws Exception
	{
		Addtocart at= new Addtocart();
		at.verfiy();
	}

}
