package tests_AssignmentTask_BlocksOne;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page_Object_Model.BlocksOne_POM;
import utility_AssignmentTask_BlocksOne.Base_Class;

public class Test_Product_DropDown extends Base_Class {

	    private BlocksOne_POM pom;
	    private WebDriverWait wait;

	    @BeforeMethod
	    public void setUp() {
	        pom = PageFactory.initElements(driver, BlocksOne_POM.class);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    }

	    private void clickAndVerify(WebElement dropdownLink, WebElement verifyElement, String expectedText, String description) {
	        pom.getBtn_ProductDropDown().click();
	        dropdownLink.click();
	        String actualText = verifyElement.getText();
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pom.getScrollToBottom_Element());

	        if (actualText.equals(expectedText)) {
	            System.out.println("Verified--->> " + description + " functionality");
	        } else {
	            System.out.println("Failed--->> " + description + " functionality");
	        }

	        driver.navigate().back();
	    }

	    @Test(description = "To Verify Product DropDown")
	    public void verifyTabs() {
	        clickAndVerify(
	            pom.getDropdown_SmartContract(),
	            pom.getVerify_link_SmartContract(),
	            config.verifysmartcontractpage(),
	            "Smart Contract link"
	        );

	        clickAndVerify(
	            pom.getVerify_link_mulitchainBalancerPool(),
	            pom.getVerify_Txt_for_mulitchainBalancerPool(),
	            config.verify_txt_MultichainBalancerPool(),
	            "MultichainBalancerPool"
	        );

	        clickAndVerify(
	            pom.getVerify_link_DEX(),
	            pom.getVerify_txt_link_DEX(),
	            config.verify_txt_DEX(),
	            "DEX link"
	        );

	        clickAndVerify(
	            pom.getBtn_ViewAllProduct(),
	            pom.getVerify_txt_ViewAllProduct(),
	            config.verify_txt_viewAllProduct(),
	            "View All Product button"
	        );
	    }
	}



