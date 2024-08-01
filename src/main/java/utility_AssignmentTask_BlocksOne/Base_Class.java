package utility_AssignmentTask_BlocksOne;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import page_Object_Model.BlocksOne_POM;

public class Base_Class {
	public static WebDriver driver;
	public static ConfigDataProvider config;
	
	@BeforeSuite
	public void configureFile() throws FileNotFoundException
	{
		config = new ConfigDataProvider();	 
	}

	@BeforeMethod
	public void aopen_Browser()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(config.getProdUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@AfterMethod(enabled=true)
	public void close_Browser()
	{       
		driver.quit();
	}

}
