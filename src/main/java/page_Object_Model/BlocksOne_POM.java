package page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlocksOne_POM 
{


	@FindBy(xpath="//button[@class='flex items-center gap-x-1 text-base font-medium '] ")
	private WebElement btn_ProductDropDown;

	@FindBy(xpath="//a[@class=' block font-medium text-sm pb-3']")
	private WebElement dropdown_SmartContract;
	
	@FindBy(xpath="//a[@class=' block font-medium text-sm py-3']")
	private WebElement dropdown_MultichainBalancer;
	 
	@FindBy(xpath="//div[contains(text(),'Copyright © 2024 BlocksOne')]")
	private WebElement scrollToBottom_Element;
	
	@FindBy(xpath="//h1[contains(@class,'text-3xl lg:text-5xl leading-tight')]")
	private WebElement verify_link_SmartContract;
	
	@FindBy(xpath="//a[@class=' block font-medium text-sm py-3']")
	private WebElement verify_link_mulitchainBalancerPool;
	
	
	@FindBy(xpath="//div[text()='DEX']")
	private WebElement verify_link_DEX;
	
	
	@FindBy(xpath="//h1[@class='text-4xl lg:text-5xl leading-tight font-bold mb-3']")
	private WebElement verify_Txt_for_mulitchainBalancerPool;
	 
	@FindBy(xpath="//h1[@class='text-5xl leading-tight font-bold mb-3']")
	private WebElement verify_txt_link_DEX;
	
	@FindBy(xpath="//a[@class=' block font-medium text-sm buttonhover py-3 px-2']")
	private WebElement btn_ViewAllProduct;
	
	
	@FindBy(xpath="//h1[text()='Pioneering the Future of Blockchain Technology']")
	private WebElement verify_txt_ViewAllProduct;
	
	
	
	public WebElement getBtn_ProductDropDown() {
		return btn_ProductDropDown;
	}

	public void setBtn_ProductDropDown(WebElement btn_ProductDropDown) {
		this.btn_ProductDropDown = btn_ProductDropDown;
	}

	public WebElement getDropdown_SmartContract() {
		return dropdown_SmartContract;
	}

	public void setDropdown_SmartContract(WebElement dropdown_SmartContract) {
		this.dropdown_SmartContract = dropdown_SmartContract;
	}

	public WebElement getDropdown_MultichainBalancer() {
		return dropdown_MultichainBalancer;
	}

	public void setDropdown_MultichainBalancer(WebElement dropdown_MultichainBalancer) {
		this.dropdown_MultichainBalancer = dropdown_MultichainBalancer;
	}

	public WebElement getScrollToBottom_Element() {
		return scrollToBottom_Element;
	}

	public void setScrollToBottom_Element(WebElement scrollToBottom_Element) {
		this.scrollToBottom_Element = scrollToBottom_Element;
	}

	public WebElement getVerify_link_SmartContract() {
		return verify_link_SmartContract;
	}

	public void setVerify_link_SmartContract(WebElement verify_link_SmartContract) {
		this.verify_link_SmartContract = verify_link_SmartContract;
	}

	public WebElement getVerify_link_mulitchainBalancerPool() {
		return verify_link_mulitchainBalancerPool;
	}

	public void setVerify_link_mulitchainBalancerPool(WebElement verify_link_mulitchainBalancerPool) {
		this.verify_link_mulitchainBalancerPool = verify_link_mulitchainBalancerPool;
	}

	public WebElement getVerify_link_DEX() {
		return verify_link_DEX;
	}

	public void setVerify_link_DEX(WebElement verify_link_DEX) {
		this.verify_link_DEX = verify_link_DEX;
	}

	public WebElement getVerify_Txt_for_mulitchainBalancerPool() {
		return verify_Txt_for_mulitchainBalancerPool;
	}

	public void setVerify_Txt_for_mulitchainBalancerPool(WebElement verify_Txt_for_mulitchainBalancerPool) {
		this.verify_Txt_for_mulitchainBalancerPool = verify_Txt_for_mulitchainBalancerPool;
	}

	public WebElement getVerify_txt_link_DEX() {
		return verify_txt_link_DEX;
	}

	public void setVerify_txt_link_DEX(WebElement verify_txt_link_DEX) {
		this.verify_txt_link_DEX = verify_txt_link_DEX;
	}

	public WebElement getBtn_ViewAllProduct() {
		return btn_ViewAllProduct;
	}

	public void setBtn_ViewAllProduct(WebElement btn_ViewAllProduct) {
		this.btn_ViewAllProduct = btn_ViewAllProduct;
	}

	public WebElement getVerify_txt_ViewAllProduct() {
		return verify_txt_ViewAllProduct;
	}

	public void setVerify_txt_ViewAllProduct(WebElement verify_txt_ViewAllProduct) {
		this.verify_txt_ViewAllProduct = verify_txt_ViewAllProduct;
	}

	
}
