package page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlocksOne_POM_HomePage_Header 
{
	@FindBy(xpath="(//div[@class='hidden lg:flex lg:gap-10 snip1135'])//a[2]")
	private WebElement ClickOn_link_Services;


	@FindBy(xpath="//h2[text()='Services we offer']")
	private WebElement verify_txt_on_ServicesPage;


	@FindBy(xpath="(//div[@class='hidden lg:flex lg:gap-10 snip1135'])//a[3]")
	private WebElement ClickOn_link_AboutUs;
	
	@FindBy(xpath="//div[@class='order-2 md:order-1 text-center md:text-left']/h2")
	private WebElement verify_txt_on_AboutUsPage;
	
	@FindBy(xpath="//div[contains(text(),'Copyright © 2024 BlocksOne')]")
	private WebElement scrollToBottom_Element;
	

	@FindBy(xpath="(//div[@class='hidden lg:flex lg:gap-10 snip1135'])//a[4]")
	private WebElement ClickOn_link_Career;
	
	@FindBy(xpath="//div[@class='lg:max-w-[680px]']//h1")
	private WebElement verify_txt_on_CareerPage;
	
	@FindBy(xpath="(//div[@class='hidden lg:flex lg:gap-10 snip1135'])//a[5]")
	private WebElement ClickOn_link_ContactUs;
	
	
	@FindBy(xpath="//h1[text()='Contact Us']")
	private WebElement verify_txt_on_ContactUSPage;

	public WebElement getClickOn_link_Services() {
		return ClickOn_link_Services;
	}

	public void setClickOn_link_Services(WebElement clickOn_link_Services) {
		ClickOn_link_Services = clickOn_link_Services;
	}

	public WebElement getVerify_txt_on_ServicesPage() {
		return verify_txt_on_ServicesPage;
	}

	public void setVerify_txt_on_ServicesPage(WebElement verify_txt_on_ServicesPage) {
		this.verify_txt_on_ServicesPage = verify_txt_on_ServicesPage;
	}

	public WebElement getClickOn_link_AboutUs() {
		return ClickOn_link_AboutUs;
	}

	public void setClickOn_link_AboutUs(WebElement clickOn_link_AboutUs) {
		ClickOn_link_AboutUs = clickOn_link_AboutUs;
	}

	public WebElement getVerify_txt_on_AboutUsPage() {
		return verify_txt_on_AboutUsPage;
	}

	public void setVerify_txt_on_AboutUsPage(WebElement verify_txt_on_AboutUsPage) {
		this.verify_txt_on_AboutUsPage = verify_txt_on_AboutUsPage;
	}

	public WebElement getScrollToBottom_Element() {
		return scrollToBottom_Element;
	}

	public void setScrollToBottom_Element(WebElement scrollToBottom_Element) {
		this.scrollToBottom_Element = scrollToBottom_Element;
	}

	public WebElement getClickOn_link_Career() {
		return ClickOn_link_Career;
	}

	public void setClickOn_link_Career(WebElement clickOn_link_Career) {
		ClickOn_link_Career = clickOn_link_Career;
	}

	public WebElement getVerify_txt_on_CareerPage() {
		return verify_txt_on_CareerPage;
	}

	public void setVerify_txt_on_CareerPage(WebElement verify_txt_on_CareerPage) {
		this.verify_txt_on_CareerPage = verify_txt_on_CareerPage;
	}

	public WebElement getClickOn_link_ContactUs() {
		return ClickOn_link_ContactUs;
	}

	public void setClickOn_link_ContactUs(WebElement clickOn_link_ContactUs) {
		ClickOn_link_ContactUs = clickOn_link_ContactUs;
	}

	public WebElement getVerify_txt_on_ContactUSPage() {
		return verify_txt_on_ContactUSPage;
	}

	public void setVerify_txt_on_ContactUSPage(WebElement verify_txt_on_ContactUSPage) {
		this.verify_txt_on_ContactUSPage = verify_txt_on_ContactUSPage;
	}



	/*@FindBy(xpath="")
	private WebElement x;

	@FindBy(xpath="")
	private WebElement x;

	@FindBy(xpath="")
	private WebElement x;

	@FindBy(xpath="")
	private WebElement x;*/
}
