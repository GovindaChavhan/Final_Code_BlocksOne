package page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_AllElement_HP 
{
	@FindBy(xpath="//h2[text()='Services we offer']")
	private WebElement Tonavigate_Servicesweoffer;
	
	@FindBy(xpath="(//div[@Class='grid sm:grid-cols-2  lg:grid-cols-4 gap-7']/div)[1]")
	private WebElement hoverOn_Image1;
	@FindBy(xpath="(//div[@Class='grid sm:grid-cols-2  lg:grid-cols-4 gap-7']/div)[2]")
	private WebElement hoverOn_Image2;
	@FindBy(xpath="(//div[@Class='grid sm:grid-cols-2  lg:grid-cols-4 gap-7']/div)[3]")
	private WebElement hoverOn_Image3;
	@FindBy(xpath="(//div[@Class='grid sm:grid-cols-2  lg:grid-cols-4 gap-7']/div)[4]")
	private WebElement hoverOn_Image4;
	
	@FindBy(xpath="//button[@class='slick-arrow slick-prev']")
	private WebElement btn_Previous;
	@FindBy(xpath="//button[@class='slick-arrow slick-next']")
	private WebElement btn_Next;
	
	@FindBy(xpath="//h3[contains(text(),'Redefining Boundaries:')]")
	private WebElement Tonavigate_Redefining_Boundaries;
	
	@FindBy(xpath="//h3[contains(text(),'Finance & Payments')]")
	private WebElement Verify_txt_Finance_Payments;
	
	@FindBy(xpath="//button[contains(text(),'Healthcare & Wellness')]")
	private WebElement btn_HealthcareWellness;
	@FindBy(xpath="//h3[contains(text(),'Healthcare & Wellness')]")
	private WebElement Verify_txt_Healthcare_Wellness;
	
	@FindBy(xpath="//button[contains(text(),'Digital Assets')]")
	private WebElement btn_Digital_Assets;
	@FindBy(xpath="//h3[contains(text(),'Digital Assets')]")
	private WebElement Verify_txt_Digital_Asset;
	
	
	@FindBy(xpath="//button[contains(text(),'Education')]")
	private WebElement btn_Education;
	@FindBy(xpath="//h3[contains(text(),'Education')]")
	private WebElement Verify_txt_Education;
	
	@FindBy(xpath="//button[contains(text(),'Real Estate')]")
	private WebElement btn_RealEstate;
	@FindBy(xpath="//h3[contains(text(),'Real Estate')]")
	private WebElement Verify_txt_RealEstate;
	
	@FindBy(xpath="//button[contains(text(),'Supply Chain')]")
	private WebElement btn_Supplychain;
	@FindBy(xpath="//h3[contains(text(),'Supply Chain')]")
	private WebElement Verify_txt_SupplyChain;
	
	@FindBy(xpath="//button[contains(text(),'Mass Media')]")
	private WebElement btn_MassMedia;
	@FindBy(xpath="//h3[contains(text(),'Mass Media')]")
	private WebElement Verify_txt_Mass_Media;
	
	@FindBy(xpath="//div[@data-index='0']")
	private WebElement verify_btn_next_BeforeClicking;
	
	@FindBy(xpath="//div[@data-index='1']")
	private WebElement verify_btn_next_AfterClicking;
	
	@FindBy(xpath="//a[text()='+91 8983615413']")
	private WebElement link_contactNumber;
	
	@FindBy(xpath="//p[@class='text-base leading-6 text-white/60']")
	private WebElement text_Address;
	
	@FindBy(xpath="//a[text()='info@blocksone.tech']")
	private WebElement text_Email;
	
	@FindBy(xpath="//div[contains(text(),'Copyright © 2024 BlocksOne')]")
	private WebElement text_Copyright;
	
	
	public WebElement getTonavigate_Servicesweoffer() {
		return Tonavigate_Servicesweoffer;
	}
	public void setTonavigate_Servicesweoffer(WebElement tonavigate_Servicesweoffer) {
		Tonavigate_Servicesweoffer = tonavigate_Servicesweoffer;
	}
	public WebElement getHoverOn_Image1() {
		return hoverOn_Image1;
	}
	public void setHoverOn_Image1(WebElement hoverOn_Image1) {
		this.hoverOn_Image1 = hoverOn_Image1;
	}
	public WebElement getHoverOn_Image2() {
		return hoverOn_Image2;
	}
	public void setHoverOn_Image2(WebElement hoverOn_Image2) {
		this.hoverOn_Image2 = hoverOn_Image2;
	}
	public WebElement getHoverOn_Image3() {
		return hoverOn_Image3;
	}
	public void setHoverOn_Image3(WebElement hoverOn_Image3) {
		this.hoverOn_Image3 = hoverOn_Image3;
	}
	public WebElement getHoverOn_Image4() {
		return hoverOn_Image4;
	}
	public void setHoverOn_Image4(WebElement hoverOn_Image4) {
		this.hoverOn_Image4 = hoverOn_Image4;
	}
	public WebElement getBtn_Previous() {
		return btn_Previous;
	}
	public void setBtn_Previous(WebElement btn_Previous) {
		this.btn_Previous = btn_Previous;
	}
	public WebElement getBtn_Next() {
		return btn_Next;
	}
	public void setBtn_Next(WebElement btn_Next) {
		this.btn_Next = btn_Next;
	}
	public WebElement getTonavigate_Redefining_Boundaries() {
		return Tonavigate_Redefining_Boundaries;
	}
	public void setTonavigate_Redefining_Boundaries(WebElement tonavigate_Redefining_Boundaries) {
		Tonavigate_Redefining_Boundaries = tonavigate_Redefining_Boundaries;
	}
	public WebElement getVerify_txt_Finance_Payments() {
		return Verify_txt_Finance_Payments;
	}
	public void setVerify_txt_Finance_Payments(WebElement verify_txt_Finance_Payments) {
		Verify_txt_Finance_Payments = verify_txt_Finance_Payments;
	}
	public WebElement getBtn_HealthcareWellness() {
		return btn_HealthcareWellness;
	}
	public void setBtn_HealthcareWellness(WebElement btn_HealthcareWellness) {
		this.btn_HealthcareWellness = btn_HealthcareWellness;
	}
	public WebElement getVerify_txt_Healthcare_Wellness() {
		return Verify_txt_Healthcare_Wellness;
	}
	public void setVerify_txt_Healthcare_Wellness(WebElement verify_txt_Healthcare_Wellness) {
		Verify_txt_Healthcare_Wellness = verify_txt_Healthcare_Wellness;
	}
	public WebElement getBtn_Digital_Assets() {
		return btn_Digital_Assets;
	}
	public void setBtn_Digital_Assets(WebElement btn_Digital_Assets) {
		this.btn_Digital_Assets = btn_Digital_Assets;
	}
	public WebElement getVerify_txt_Digital_Asset() {
		return Verify_txt_Digital_Asset;
	}
	public void setVerify_txt_Digital_Asset(WebElement verify_txt_Digital_Asset) {
		Verify_txt_Digital_Asset = verify_txt_Digital_Asset;
	}
	public WebElement getBtn_Education() {
		return btn_Education;
	}
	public void setBtn_Education(WebElement btn_Education) {
		this.btn_Education = btn_Education;
	}
	public WebElement getVerify_txt_Education() {
		return Verify_txt_Education;
	}
	public void setVerify_txt_Education(WebElement verify_txt_Education) {
		Verify_txt_Education = verify_txt_Education;
	}
	public WebElement getBtn_RealEstate() {
		return btn_RealEstate;
	}
	public void setBtn_RealEstate(WebElement btn_RealEstate) {
		this.btn_RealEstate = btn_RealEstate;
	}
	public WebElement getVerify_txt_RealEstate() {
		return Verify_txt_RealEstate;
	}
	public void setVerify_txt_RealEstate(WebElement verify_txt_RealEstate) {
		Verify_txt_RealEstate = verify_txt_RealEstate;
	}
	public WebElement getBtn_Supplychain() {
		return btn_Supplychain;
	}
	public void setBtn_Supplychain(WebElement btn_Supplychain) {
		this.btn_Supplychain = btn_Supplychain;
	}
	public WebElement getVerify_txt_SupplyChain() {
		return Verify_txt_SupplyChain;
	}
	public void setVerify_txt_SupplyChain(WebElement verify_txt_SupplyChain) {
		Verify_txt_SupplyChain = verify_txt_SupplyChain;
	}
	public WebElement getBtn_MassMedia() {
		return btn_MassMedia;
	}
	public void setBtn_MassMedia(WebElement btn_MassMedia) {
		this.btn_MassMedia = btn_MassMedia;
	}
	public WebElement getVerify_txt_Mass_Media() {
		return Verify_txt_Mass_Media;
	}
	public void setVerify_txt_Mass_Media(WebElement verify_txt_Mass_Media) {
		Verify_txt_Mass_Media = verify_txt_Mass_Media;
	}
	public WebElement getVerify_btn_next_BeforeClicking() {
		return verify_btn_next_BeforeClicking;
	}
	public void setVerify_btn_next_BeforeClicking(WebElement verify_btn_next_BeforeClicking) {
		this.verify_btn_next_BeforeClicking = verify_btn_next_BeforeClicking;
	}
	public WebElement getVerify_btn_next_AfterClicking() {
		return verify_btn_next_AfterClicking;
	}
	public void setVerify_btn_next_AfterClicking(WebElement verify_btn_next_AfterClicking) {
		this.verify_btn_next_AfterClicking = verify_btn_next_AfterClicking;
	}
	public WebElement getLink_contactNumber() {
		return link_contactNumber;
	}
	public void setLink_contactNumber(WebElement link_contactNumber) {
		this.link_contactNumber = link_contactNumber;
	}
	public WebElement getText_Address() {
		return text_Address;
	}
	public void setText_Address(WebElement text_Address) {
		this.text_Address = text_Address;
	}
	public WebElement getText_Email() {
		return text_Email;
	}
	public void setText_Email(WebElement text_Email) {
		this.text_Email = text_Email;
	}
	public WebElement getText_Copyright() {
		return text_Copyright;
	}
	public void setText_Copyright(WebElement text_Copyright) {
		this.text_Copyright = text_Copyright;
	}
	
	
}
