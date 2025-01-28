package TestCases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import masterpag.MasterPage;

public class LoginTestCases extends MasterPage{

	@Test
	public void logintest() throws Exception {
		LoginPage l = new LoginPage();
		l.getUserField();
		

	}

}
