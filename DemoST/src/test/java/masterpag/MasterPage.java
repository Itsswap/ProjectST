package masterpag;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {

    public static WebDriver driver;
    public static Properties p;
    public static Properties p1;
    public static Properties p2;

    @BeforeTest
    @Parameters("browser")
    public void setup() throws Exception {
        // Load configuration files
        File f = new File("C:\\Automationframework\\DemoAS\\ConfigProperties\\config.properties");
        FileInputStream fs = new FileInputStream(f);
        p = new Properties();
        p.load(fs);

        File f1 = new File("C:\\Automationframework\\DemoAS\\ConfigProperties\\Locators.properties");
        FileInputStream fs1 = new FileInputStream(f1);
        p1 = new Properties();
        p1.load(fs1);

        File f2 = new File("C:\\Automationframework\\DemoAS\\ConfigProperties\\testdata.properties");
        FileInputStream fs2 = new FileInputStream(f2);
        p2 = new Properties();
        p2.load(fs2);

        // Set up WebDriver based on the browser property in config
        if (p.getProperty("browser").equalsIgnoreCase("chrome")) 
        {
            WebDriverManager.chromedriver().setup();
            ChromeOptions cop = new ChromeOptions();
            cop.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(cop);
        } 
        else if (p.getProperty("browser").equalsIgnoreCase("firefox")) 
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else 
        {
            System.out.println("No browser found");
        }

        driver.manage().window().maximize();
        driver.get(p.getProperty("url"));

        // Check if the user is logged in, if not, perform login
        if (!isUserLoggedIn())
        {
            login();
        }
    }

    // Helper method to check if user is logged in (e.g., check for logout button or user profile)
    private boolean isUserLoggedIn() 
    {
        try {
            // Assuming there's an element with id 'logoutButton' or similar after login
            return driver.findElements(By.id("logoutButton")).size() > 0;
        } catch (Exception e) {
            return false;
        }
    }

    // Login method to log in to the application
    private void login() throws Exception 
    {
        LoginPage loginPage = new LoginPage();
        loginPage.getUserField(); // This method should handle entering username, password, and clicking login
    }

    // Cleanup WebDriver after test execution
    //@AfterTest
    public void tearDown() 
    {
        if (driver != null) {
            driver.quit();
        }
    }
}
