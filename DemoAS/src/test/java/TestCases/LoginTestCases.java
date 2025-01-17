package TestCases;

import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTestCases {

	@Test
	public void logintest() throws Exception {
		LoginPage l = new LoginPage();
		l.getUserField();
		

	}

}
