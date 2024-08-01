package utility_AssignmentTask_BlocksOne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	public static Properties pro;
	
	public ConfigDataProvider() throws FileNotFoundException
	{
		String filepath="./Property/config.properties";
		FileInputStream file = new FileInputStream(filepath);
		pro = new Properties();
		try {
			pro.load(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public String verifyHomeMainHeading()
	{
		return pro.getProperty("verifyHomeMainHeading");
	}
	
	
	public String verify_exploreAllProductMainHeading()
	{
		return pro.getProperty("verify_exploreAllProductMainHeading");
	}
	
	public String verify_Servicesweoffer_MainHeading()
	{
		return pro.getProperty("verify_Servicesweoffer_MainHeading");
	}
	
	public String verify_ButtonKnowMore()
	{
		return pro.getProperty("verify_ButtonKnowMore");
	}
	
	
	
	
//	--------------------------------------------------------------
	public String getProdUrl()
	{
		return pro.getProperty("productionUrl");
	}
	public String verifyHomePage()
	{
		return pro.getProperty("verifyHomePage");
	}
	
	public String verifysmartcontractpage()
	{
		return pro.getProperty("verifysmartcontractpage");
	}
	public String verify_txt_MultichainBalancerPool()
	{
		return pro.getProperty("verify_txt_MultichainBalancerPool");

	}
	public String verify_txt_DEX()
	{
		return pro.getProperty("verify_txt_DEX");

	}
	public String verify_txt_viewAllProduct()
	{
		return pro.getProperty("verify_txt_viewAllProduct");

	}
	
	public String verify_txt_OnServicesPage()
	{
		return pro.getProperty("verify_txt_OnServicesPage");

	}
	
	public String verify_txt_OnAboutUSPage()
	{
		return pro.getProperty("verify_txt_OnAboutUSPage");

	}
	
	public String verify_txt_OnCareerPage()
	{
		return pro.getProperty("verify_txt_OnCareerPage");

	}

	public String verify_txt_OnContactUSPage()
	{
		return pro.getProperty("verify_txt_OnContactUSPage");

	}
	
	public String verify_txt_FinanceandPayments()
	{
		return pro.getProperty("verify_txt_FinanceandPayments");

	}
	
	public String verify_txt_HealthcareandWellness()
	{
		return pro.getProperty("verify_txt_HealthcareandWellness");

	}
	
	public String verify_txt_DigitalAssets()
	{
		return pro.getProperty("verify_txt_DigitalAssets");

	}
	
	public String verify_txt_Education()
	{
		return pro.getProperty("verify_txt_Education");

	}
	

	public String verify_txt_RealEstate()
	{
		return pro.getProperty("verify_txt_RealEstate");

	}
	
	public String verify_txt_SupplyChain()
	{
		return pro.getProperty("verify_txt_SupplyChain");

	}
	
	public String verify_txt_MassMedia()
	{
		return pro.getProperty("verify_txt_MassMedia");

	}
	
	public String verify_txt_email()
	{
		return pro.getProperty("verify_txt_email");

	}
	
	public String verify_txt_contactNumber()
	{
		return pro.getProperty("verify_txt_contactNumber");

	}
	
	public String verify_txt_address()
	{
		return pro.getProperty("verify_txt_address");

	}
	

	public String verify_txt_copyright()
	{
		return pro.getProperty("verify_txt_copyright");

	}
}
