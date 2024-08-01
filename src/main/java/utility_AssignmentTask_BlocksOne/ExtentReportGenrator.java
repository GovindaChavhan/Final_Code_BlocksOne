package utility_AssignmentTask_BlocksOne;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		String path="C:\\Users\\john\\MyWorkspace\\FinalTask_BlocksOne\\Reports\\index.html";
		
		//ExtentSparkReporter --> Title,ReportName,Theme
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Report");
		reporter.config().setReportName("BlocksOne Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Module Name", "Test All Tabs Functionality");
		extent.setSystemInfo("QA", "Govinda Chavhan");
		extent.setSystemInfo("O.S.", "Windows10");
		return extent;
	}

}
