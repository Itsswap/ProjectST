package masterpag;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {

	public static WebDriver driver;
	public static Properties p;
	public static Properties p1;
	public static Properties p2;
	public MasterPage() throws Exception {
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

		if (p.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions cop= new ChromeOptions();
			cop.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(cop);
			
		} else if (p.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("No browser found");
		}
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
	}

}
