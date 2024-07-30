package tests_AssignmentTask_BlocksOne;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page_Object_Model.BlocksOne_POM_HomePage_Header;
import utility_AssignmentTask_BlocksOne.Base_Class;

public class VerifyLinks extends Base_Class {
	

	    private BlocksOne_POM_HomePage_Header pom;
	    private WebDriverWait wait;

	    @BeforeMethod
	    public void setUp() {
	        pom = PageFactory.initElements(driver, BlocksOne_POM_HomePage_Header.class);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    }

	    private void clickAndVerifyText(WebElement linkElement, WebElement textElement, String expectedText, String description) {
	        wait.until(ExpectedConditions.elementToBeClickable(linkElement)).click();
	        String actualText = textElement.getText();
	        Assert.assertEquals(actualText, expectedText, "Verification failed for " + description);
	        System.out.println("Verification is successful-->> Text on " + description + " Page is: " + actualText);
	        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", pom.getScrollToBottom_Element());
	    }

	    @Test(description = "Verify Links to Services", enabled = true)
	    public void verifyLinksServices() {
	        clickAndVerifyText(
	            pom.getClickOn_link_Services(),
	            pom.getVerify_txt_on_ServicesPage(),
	            config.verify_txt_OnServicesPage(),
	            "Services"
	        );
	    }

	    @Test(description = "Verify Links to About Us", enabled = true)
	    public void verifyLinksAboutUs() {
	        clickAndVerifyText(
	            pom.getClickOn_link_AboutUs(),
	            pom.getVerify_txt_on_AboutUsPage(),
	            config.verify_txt_OnAboutUSPage(),
	            "About Us"
	        );
	    }

	    @Test(description = "Verify Links to Careers", enabled = true)
	    public void verifyLinksCareers() {
	        clickAndVerifyText(
	            pom.getClickOn_link_Career(),
	            pom.getVerify_txt_on_CareerPage(),
	            config.verify_txt_OnCareerPage(),
	            "Careers"
	        );
	    }

	    @Test(description = "Verify Links to Contact Us", enabled = true)
	    public void verifyLinksContactUs() {
	        clickAndVerifyText(
	            pom.getClickOn_link_ContactUs(),
	            pom.getVerify_txt_on_ContactUSPage(),
	            config.verify_txt_OnContactUSPage(),
	            "Contact Us"
	        );
	    }
	}



