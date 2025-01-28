package TestCases;

import org.testng.annotations.Test;

import Pages.Verifytitle;

public class Verifytitletestcase {
	@Test
	public void verifyorder() throws Exception
	{
		Verifytitle v= new Verifytitle();
		v.verifytitleoftheproducts();
	}

}
