package tests_AssignmentTask_BlocksOne;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page_Object_Model.POM_AllElement_HP;
import utility_AssignmentTask_BlocksOne.Base_Class;

public class Test_FooterSection extends Base_Class {

    private POM_AllElement_HP pom;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        pom = PageFactory.initElements(driver, POM_AllElement_HP.class);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    private void scrollToFooter() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pom.getText_Copyright());
    }

    private void verifyText(WebElement element, String expectedText, String fieldName) {
        String actualText = element.getText();
        Assert.assertEquals(actualText, expectedText, fieldName + " verification failed.");
        System.out.println(fieldName + " is verified: " + actualText);
    }

    @Test(description = "Verify the text content in the footer section",enabled=false)
    public void verifyFooterSection() {
        scrollToFooter();
        
        verifyText(pom.getText_Email(), config.verify_txt_email(), "Email");
        verifyText(pom.getText_Address(), config.verify_txt_address(), "Address");
        verifyText(pom.getText_Copyright(), config.verify_txt_copyright(), "Copyright");
        
    }
    @Test(enabled=true)
    public void verify_ContactNumber() throws IOException, InterruptedException
    {
    	scrollToFooter();
    	pom.getLink_contactNumber().click();
    	Thread.sleep(3000);
    	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String filePath= "./Snapshots/contact.bmp";
		FileUtils.copyFile(screenshot, new File(filePath));
    }
}
