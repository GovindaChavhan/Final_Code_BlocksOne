package tests_AssignmentTask_BlocksOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import page_Object_Model.Master_POM;
import utility_AssignmentTask_BlocksOne.Base_Class;
import utility_AssignmentTask_BlocksOne.Library;

public class Test_Tabs extends Base_Class{

	private static Master_POM pom;
	private static WebDriverWait wait;

	@BeforeMethod
	public void setUp() 
	{
		pom = PageFactory.initElements(driver, Master_POM.class);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public static void custom_scrollToElement(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	@Test(description="Home Tab actions",enabled=true)
	public void verify_HomeTab() 
	{
		Library.custom_click(pom.getHomeTab(), "Clicked on Home Tab");
		try {
			String homeHeading = pom.getHomeMainHeading().getText();
			Assert.assertEquals(homeHeading, config.verifyHomeMainHeading(), "Home page heading verification failed");
			Library.test.log(Status.PASS, "Home page heading verification passed.");
		} catch (AssertionError e) {
			Library.test.log(Status.FAIL, "Home page heading verification failed: " + e.getMessage());
			throw e;
		}

	}
	@Test(description="ExlporeAllProduct Tab actions",enabled=true)
	public void verify_ExlporeAllProductTab() 
	{
		wait.until(ExpectedConditions.elementToBeClickable(pom.getButton_ExploreAllProduct()));
		Library.custom_click(pom.getButton_ExploreAllProduct(), "Clicked on ExlporeAllProduct Tab");
		try {
			String ExlporeAllProductHeading = pom.getExploreAllProductMainHeading().getText();
			Assert.assertEquals(ExlporeAllProductHeading, config.verify_exploreAllProductMainHeading(), "ExlporeAllProduct heading verification failed");
			Library.test.log(Status.PASS, "ExlporeAllProductHeading heading verification passed.");
		} catch (AssertionError e) {
			Library.test.log(Status.FAIL, "ExlporeAllProductHeading heading verification failed: " + e.getMessage());
			throw e;
		}

	}

	@Test(description="Discover Services actions", enabled=true)
	public void verify_DiscoverServices() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.getButton_DiscoverServices()));
		Library.custom_click(pom.getButton_DiscoverServices(), "Clicked on Discover Services button");
		try {
			String servicesHeading = pom.getServicesweoffer_MainHeading().getText();
			Assert.assertEquals(servicesHeading, config.verify_Servicesweoffer_MainHeading(), "Services we offer heading verification failed");
			Library.test.log(Status.PASS, "Services we offer heading verification passed.");
		} catch (AssertionError e) {
			Library.test.log(Status.FAIL, "Services we offer heading verification failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(description = "To Verify Product DropDown", enabled = true)
	public void verify_ProductDropDown() 
	{
		Library.custom_click(pom.getBtn_ProductDropDown(), "Clicked on Product Dropdown");

		try {
			Library.custom_click(pom.getDropdown_SmartContract(), "Clicked on Smart Contract link");
			String smartContractText = pom.getVerify_link_SmartContract().getText();
			Assert.assertEquals(smartContractText, config.verifysmartcontractpage(), "Smart Contract link verification failed");
			Library.test.log(Status.PASS, "Smart Contract link verification passed.");
		} catch (AssertionError e) {
			Library.test.log(Status.FAIL, "Smart Contract link verification failed: " + e.getMessage());
			throw e;
		}
		driver.navigate().back();

		Library.custom_click(pom.getBtn_ProductDropDown(), "Clicked on Product Dropdown");

		try {
			Library.custom_click(pom.getVerify_link_mulitchainBalancerPool(), "Clicked on MultichainBalancerPool link");
			String balancerPoolText = pom.getVerify_Txt_for_mulitchainBalancerPool().getText();
			Assert.assertEquals(balancerPoolText, config.verify_txt_MultichainBalancerPool(), "MultichainBalancerPool verification failed");
			Library.test.log(Status.PASS, "MultichainBalancerPool verification passed.");
		} catch (AssertionError e) {
			Library.test.log(Status.FAIL, "MultichainBalancerPool verification failed: " + e.getMessage());
			throw e;
		}
		driver.navigate().back();

		Library.custom_click(pom.getBtn_ProductDropDown(), "Clicked on Product Dropdown");

		try {
			Library.custom_click(pom.getVerify_link_DEX(), "Clicked on DEX link");
			String dexText = pom.getVerify_txt_link_DEX().getText();
			Assert.assertEquals(dexText, config.verify_txt_DEX(), "DEX link verification failed");
			Library.test.log(Status.PASS, "DEX link verification passed.");
		} catch (AssertionError e) {
			Library.test.log(Status.FAIL, "DEX link verification failed: " + e.getMessage());
			throw e;
		}
		driver.navigate().back();

		Library.custom_click(pom.getBtn_ProductDropDown(), "Clicked on Product Dropdown");

		try {
			Library.custom_click(pom.getBtn_ViewAllProduct(), "Clicked on View All Product button");
			String viewAllProductText = pom.getVerify_txt_ViewAllProduct().getText();
			Assert.assertEquals(viewAllProductText, config.verify_txt_viewAllProduct(), "View All Product button verification failed");
			Library.test.log(Status.PASS, "View All Product button verification passed.");
		} catch (AssertionError e) {
			Library.test.log(Status.FAIL, "View All Product button verification failed: " + e.getMessage());
			throw e;
		}
	}

	// --------------------------------------------------------------------------------------


	@Test(description = "Verify Links to Services", enabled = true)
	public void verifyLinksServices() 
	{
		Library.custom_click(pom.getClickOn_link_Services(), "Clicked on Services link");
		try {
			wait.until(ExpectedConditions.visibilityOf(pom.getVerify_txt_on_ServicesPage()));
			String actualText = pom.getVerify_txt_on_ServicesPage().getText();
			Assert.assertEquals(actualText, config.verify_txt_OnServicesPage(), "Services page text verification failed");
			Library.test.log(Status.PASS, "Services page text verification passed.");
			System.out.println("Verification is successful-->> Text on Services Page is: " + actualText);
		} catch (AssertionError e) {
			Library.test.log(Status.FAIL, "Services page text verification failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(description = "Verify Links to About Us", enabled = true)
	public void verifyLinksAboutUs() 
	{
		Library.custom_click(pom.getClickOn_link_AboutUs(), "Clicked on About Us link");
		try {
			wait.until(ExpectedConditions.visibilityOf(pom.getVerify_txt_on_AboutUsPage()));
			String actualText = pom.getVerify_txt_on_AboutUsPage().getText();
			Assert.assertEquals(actualText, config.verify_txt_OnAboutUSPage(), "About Us page text verification failed");
			Library.test.log(Status.PASS, "About Us page text verification passed.");
			System.out.println("Verification is successful-->> Text on About Us Page is: " + actualText);
		} catch (AssertionError e) {
			Library.test.log(Status.FAIL, "About Us page text verification failed: " + e.getMessage());
			throw e;
		}
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", pom.getScrollToBottom_Element());
	}

	@Test(description = "Verify Links to Careers", enabled = true)
	public void verifyLinksCareers() 
	{
		Library.custom_click(pom.getClickOn_link_Career(), "Clicked on Careers link");
		try {
			wait.until(ExpectedConditions.visibilityOf(pom.getVerify_txt_on_CareerPage()));
			String actualText = pom.getVerify_txt_on_CareerPage().getText();
			Assert.assertEquals(actualText, config.verify_txt_OnCareerPage(), "Careers page text verification failed");
			Library.test.log(Status.PASS, "Careers page text verification passed.");
			System.out.println("Verification is successful-->> Text on Careers Page is: " + actualText);
		} catch (AssertionError e) {
			Library.test.log(Status.FAIL, "Careers page text verification failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(description = "Verify Links to Contact Us", enabled = true)
	public void verifyLinksContactUs() 
	{
		Library.custom_click(pom.getClickOn_link_ContactUs(), "Clicked on Contact Us link");
		try {
			wait.until(ExpectedConditions.visibilityOf(pom.getVerify_txt_on_ContactUSPage()));
			String actualText = pom.getVerify_txt_on_ContactUSPage().getText();
			Assert.assertEquals(actualText, config.verify_txt_OnContactUSPage(), "Contact Us page text verification failed");
			Library.test.log(Status.PASS, "Contact Us page text verification passed.");
			System.out.println("Verification is successful-->> Text on Contact Us Page is: " + actualText);
		} catch (AssertionError e) {
			Library.test.log(Status.FAIL, "Contact Us page text verification failed: " + e.getMessage());
			throw e;
		}
	}

	//------------------------------------------------------------------------------------

	@Test(priority=-1,description = "Test functionality of Next and Previous buttons", enabled = true)
	public void verifyNextAndPreviousButtons() 
	{
		try {
			String beforeText = pom.getVerify_btn_next_BeforeClicking().getText();
			Library.custom_click(pom.getBtn_Next(), "Next button");
			String afterText = pom.getVerify_btn_next_AfterClicking().getText();
			Assert.assertNotEquals(beforeText, afterText, "Next button functionality failed");

			Library.custom_click(pom.getBtn_Previous(), "Previous button");
			String previousText = pom.getVerify_btn_next_BeforeClicking().getText();
			Assert.assertNotEquals(afterText, previousText, "Previous button functionality failed");

			Library.test.log(Status.PASS, "Next and Previous button functionality verified successfully.");
		} catch (AssertionError e) {
			Library.test.log(Status.FAIL, "Next and Previous button functionality verification failed: " + e.getMessage());
			throw e;
		}
	}
	
	 @Test(description = "Test all click functions on elements in the Industry We Serve section", enabled = true)
	    public void verifyIndustryWeServe() 
	    {
	        try {
//	            Library.custom_scrollToElement(pom.getTonavigate_Servicesweoffer());
	            
	            verifyIndustryButton(pom.getBtn_HealthcareWellness(), pom.getVerify_txt_Healthcare_Wellness(), 
	                                 config.verify_txt_HealthcareandWellness(), "Healthcare and Wellness");
	            
	            verifyIndustryButton(pom.getBtn_Digital_Assets(), pom.getVerify_txt_Digital_Asset(), 
	                                 config.verify_txt_DigitalAssets(), "Digital Assets");
	            
	            verifyIndustryButton(pom.getBtn_Education(), pom.getVerify_txt_Education(), 
	                                 config.verify_txt_Education(), "Education");
	            
	            verifyIndustryButton(pom.getBtn_RealEstate(), pom.getVerify_txt_RealEstate(), 
	                                 config.verify_txt_RealEstate(), "Real Estate");
	            
	            verifyIndustryButton(pom.getBtn_Supplychain(), pom.getVerify_txt_SupplyChain(), 
	                                 config.verify_txt_SupplyChain(), "Supply Chain");
	            
	            verifyIndustryButton(pom.getBtn_MassMedia(), pom.getVerify_txt_Mass_Media(), 
	                                 config.verify_txt_MassMedia(), "Mass Media");
	            
	            Library.test.log(Status.PASS, "All Industry We Serve buttons verified successfully.");
	        } catch (AssertionError e) {
	            Library.test.log(Status.FAIL, "Industry We Serve buttons verification failed: " + e.getMessage());
	            throw e;
	        }
	    }

	    private void verifyIndustryButton(WebElement button, WebElement textElement, String expectedText, String description) {
	        Library.custom_click(button, description + " button");
	        String actualText = textElement.getText();
	        Assert.assertEquals(actualText, expectedText, description + " text verification failed");
	    }
	}






