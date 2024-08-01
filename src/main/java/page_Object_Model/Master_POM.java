package page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Master_POM {
	
	
			@FindBy(xpath="(//a[text()='Know More'])[1]")
			private WebElement btn_KnowMore;
//	--------------------------------------------------------------------
	@FindBy(xpath="//a[contains(@data-hover,'Home')]")
	private WebElement homeTab;
	
	@FindBy(xpath="//p[@class='text-base leading-7 max-w-[660px] mx-auto']")
	private WebElement homeMainHeading;
	
	@FindBy(xpath="//a[text()='Explore All Products']")
	private WebElement button_ExploreAllProduct;
	
	@FindBy(xpath="//h1[text()='Pioneering the Future of Blockchain Technology']")
	private WebElement exploreAllProductMainHeading;
	
	@FindBy(xpath="//span[text()='Discover Services']")
	private WebElement button_DiscoverServices;
	
	@FindBy(xpath="//h2[text()='Services we offer']")
	private WebElement Servicesweoffer_MainHeading;
	
	@FindBy(xpath="//button[@class='slick-arrow slick-prev']")
	private WebElement button_Preview;
	
	@FindBy(xpath="(//h3[text()='Smart Contract Deployment FT/NFT']/following-sibling::a)[1]")
	private WebElement button_KnowMore;
	
	
	
	
	
	
	

	public WebElement getHomeTab() {
		return homeTab;
	}

	public void setHomeTab(WebElement homeTab) {
		this.homeTab = homeTab;
	}

	public WebElement getHomeMainHeading() {
		return homeMainHeading;
	}

	public void setHomeMainHeading(WebElement homeMainHeading) {
		this.homeMainHeading = homeMainHeading;
	}

	public WebElement getButton_ExploreAllProduct() {
		return button_ExploreAllProduct;
	}

	public void setButton_ExploreAllProduct(WebElement button_ExploreAllProduct) {
		this.button_ExploreAllProduct = button_ExploreAllProduct;
	}

	public WebElement getExploreAllProductMainHeading() {
		return exploreAllProductMainHeading;
	}

	public void setExploreAllProductMainHeading(WebElement exploreAllProductMainHeading) {
		this.exploreAllProductMainHeading = exploreAllProductMainHeading;
	}

	public WebElement getButton_DiscoverServices() {
		return button_DiscoverServices;
	}

	public void setButton_DiscoverServices(WebElement button_DiscoverServices) {
		this.button_DiscoverServices = button_DiscoverServices;
	}

	public WebElement getServicesweoffer_MainHeading() {
		return Servicesweoffer_MainHeading;
	}

	public void setServicesweoffer_MainHeading(WebElement servicesweoffer_MainHeading) {
		Servicesweoffer_MainHeading = servicesweoffer_MainHeading;
	}

	public WebElement getButton_Preview() {
		return button_Preview;
	}

	public void setButton_Preview(WebElement button_Preview) {
		this.button_Preview = button_Preview;
	}

	public WebElement getButton_KnowMore() {
		return button_KnowMore;
	}

	public void setButton_KnowMore(WebElement button_KnowMore) {
		this.button_KnowMore = button_KnowMore;
	}
//	--------------------------------------------------------------------------
	
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
	
	@FindBy(xpath="//li[@class='viewallproduct mt-6 px-8']/child::a")
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
	
//	--------------------------------------------------------------------------------
	
	@FindBy(xpath="(//div[@class='hidden lg:flex lg:gap-10 snip1135'])//a[2]")
	private WebElement ClickOn_link_Services;


	@FindBy(xpath="//h2[text()='Services we offer']")
	private WebElement verify_txt_on_ServicesPage;


	@FindBy(xpath="(//div[@class='hidden lg:flex lg:gap-10 snip1135'])//a[3]")
	private WebElement ClickOn_link_AboutUs;
	
	@FindBy(xpath="//div[@class='order-2 md:order-1 text-center md:text-left']/h2")
	private WebElement verify_txt_on_AboutUsPage;
	
//	@FindBy(xpath="//div[contains(text(),'Copyright © 2024 BlocksOne')]")
//	private WebElement scrollToBottom_Element;
	

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

//--------------------------------------------------------------------------------------
	

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

	public WebElement getBtn_KnowMore() {
		return btn_KnowMore;
	}

	public void setBtn_KnowMore(WebElement btn_KnowMore) {
		this.btn_KnowMore = btn_KnowMore;
	}
	
	

}
