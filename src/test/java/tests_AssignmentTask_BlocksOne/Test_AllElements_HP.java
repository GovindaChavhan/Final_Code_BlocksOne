package tests_AssignmentTask_BlocksOne;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page_Object_Model.POM_AllElement_HP;
import utility_AssignmentTask_BlocksOne.Base_Class;


public class Test_AllElements_HP extends Base_Class {

	    private POM_AllElement_HP pom;
	    private WebDriverWait wait;

	    @BeforeMethod
	    public void setUp() {
	        pom = PageFactory.initElements(driver, POM_AllElement_HP.class);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    }

	    private void scrollToElement(WebElement element) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    }

	    private void hoverOverImage(WebElement image) throws InterruptedException {
	        Actions actions = new Actions(driver);
	        actions.moveToElement(image).perform();
	        Thread.sleep(3000);
	    }

	    @Test(description = "MouseHover_On_ServicesWeOffer_Images", enabled = true)
	    public void verifyMouseHoverEffectOnImages() throws InterruptedException {
	        scrollToElement(pom.getTonavigate_Servicesweoffer());

	        hoverOverImage(pom.getHoverOn_Image1());
	        hoverOverImage(pom.getHoverOn_Image2());
	        hoverOverImage(pom.getHoverOn_Image3());
	        hoverOverImage(pom.getHoverOn_Image4());
	    }

	    @Test(description = "Test functionality of Next and Previous buttons", enabled = true)
	    public void verifyNextAndPreviousButtons() {
	        String beforeText = pom.getVerify_btn_next_BeforeClicking().getText();
	        wait.until(ExpectedConditions.elementToBeClickable(pom.getBtn_Next())).click();
	        String afterText = pom.getVerify_btn_next_AfterClicking().getText();
	        Assert.assertNotEquals(beforeText, afterText);
	        System.out.println("Next button functionality verified.");

	        wait.until(ExpectedConditions.elementToBeClickable(pom.getBtn_Previous())).click();
	        String previousText = pom.getVerify_btn_next_BeforeClicking().getText();
	        Assert.assertNotEquals(afterText, previousText);
	        System.out.println("Previous button functionality verified.");
	    }

	    private void clickAndVerifyText(WebElement button, WebElement textElement, String expectedText, String description) {
	        wait.until(ExpectedConditions.elementToBeClickable(button)).click();
	        String actualText = textElement.getText();
	        Assert.assertEquals(actualText, expectedText);
	        System.out.println("Verified clicking on " + description);
	    }

	    @Test(description = "Test all click functions on elements in the Industry We Serve section", enabled = true)
	    public void verifyIndustryWeServe() {
	        scrollToElement(pom.getTonavigate_Servicesweoffer());

	        clickAndVerifyText(pom.getBtn_HealthcareWellness(), pom.getVerify_txt_Healthcare_Wellness(), config.verify_txt_HealthcareandWellness(), "Healthcare and Wellness");
	        clickAndVerifyText(pom.getBtn_Digital_Assets(), pom.getVerify_txt_Digital_Asset(), config.verify_txt_DigitalAssets(), "Digital Assets");
	        clickAndVerifyText(pom.getBtn_Education(), pom.getVerify_txt_Education(), config.verify_txt_Education(), "Education");
	        clickAndVerifyText(pom.getBtn_RealEstate(), pom.getVerify_txt_RealEstate(), config.verify_txt_RealEstate(), "Real Estate");
	        clickAndVerifyText(pom.getBtn_Supplychain(), pom.getVerify_txt_SupplyChain(), config.verify_txt_SupplyChain(), "Supply Chain");
	        clickAndVerifyText(pom.getBtn_MassMedia(), pom.getVerify_txt_Mass_Media(), config.verify_txt_MassMedia(), "Mass Media");
	    }
	}



