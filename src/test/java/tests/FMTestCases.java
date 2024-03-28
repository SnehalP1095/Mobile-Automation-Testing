package tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FMTestCases 

{
	
	public static AppiumDriver driver =null ;		//WebDriver instance created
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;				//Instance created for tests
	
	
	
	@BeforeTest
	
	
	public void simpleTest() throws MalformedURLException, InterruptedException 
	{
		String workingDir = System.getProperty("user.dir");
		extent = new com.relevantcodes.extentreports.ExtentReports(workingDir+"//Report//ComplianceFM.html",true);
		test = extent.startTest("Compliance Logging In - fm");
		System.out.print("test");
		test.log(LogStatus.PASS, "Test Passed = Mobile App compliance product");
		setup();
		BaseClass.Login(driver,"fm");
		extent.endTest(test);
		extent.flush();
		
	   
	}
	
	//@Test(priority = 0)
	void PendingforReview() throws InterruptedException, IOException
	{
		test = extent.startTest("Statutory -Pending for review  Count Verification");
		
		Thread.sleep(8000);
		FMBaseClass.PendingforReview(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 1)
	void InternalPendingforReview() throws InterruptedException, IOException
	{
		test = extent.startTest("Internal -Pending for review  Count Verification");
		
		Thread.sleep(8000);
		FMBaseClass.InternalPendingforReview(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 2)
	void complianceCalender() throws InterruptedException, IOException
	{
		test = extent.startTest("compliance calender verification ");
		
		Thread.sleep(8000);
		FMBaseClass.complianceCalender(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}	
//	@Test(priority = 3)
	void ClickMyAct() throws InterruptedException, IOException
	{
		test = extent.startTest("My Act Tab verification ");
		
		Thread.sleep(8000);
		FMBaseClass.ClickMyAct(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority = 4)
	void ClickUpdateDetailes() throws InterruptedException, IOException
	{
		test = extent.startTest("Updates Detailes verification ");
		
		Thread.sleep(8000);
		FMBaseClass.ClickUpdateDetailes(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
//	@Test(priority = 5)
	void NewLetterDeatiles() throws InterruptedException, IOException
	{
		test = extent.startTest("News Letter Detailes verification ");
		
		Thread.sleep(8000);
		FMBaseClass.NewLetterDeatiles(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority = 6)
	void clickNotification() throws InterruptedException, IOException
	{
		test = extent.startTest("Notification tab verification ");
		
		Thread.sleep(8000);
		FMBaseClass.clickNotification(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 7)
	void MyReport() throws InterruptedException, IOException
	{
		test = extent.startTest("My Report tab - statutory type -compliance detailes verification ");
		
		Thread.sleep(8000);
		FMBaseClass.StatutoryMyReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority = 8)
	void InternalMyReport() throws InterruptedException, IOException
	{
		test = extent.startTest("My Report tab - Internal type -compliance detailes verification ");
		
		Thread.sleep(8000);
		FMBaseClass.InternalMyReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 9)
		void MyDocument() throws InterruptedException, IOException
		{
			test = extent.startTest("My Document tab verification ");
			
			Thread.sleep(8000);
			FMBaseClass.MyDocument(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	
	
	
	
	public static void setup() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		//caps.setCapability("platformName", "ANDROID");
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");     //Interface
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");            //Interface
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");  
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi9A");  
		caps.setCapability(MobileCapabilityType.UDID, "R9ZX10PM4LJ");  
	//	caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,600);  
//		caps.setCapability("appPackage","com.miui.calculator");  
//		caps.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		//caps.setCapability("appPackage","com.facebook.katana");  
		//caps.setCapability("appActivity", "com.facebook.katana.LoginActivity");
		
		caps.setCapability("appPackage","in.avantis.users.avantisapp");  
		caps.setCapability("appActivity","in.avantis.users.avantisapp.activities.SplashScreen");
//		caps.setCapability(MobileCapabilityType.APP ,"Avacom");
		 
		
//		caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome"); 
		caps.setCapability("ignoreHiddenApiPolicyError" , true) ;
		caps.setCapability("noReset",true);                        //If noReset is set to TRUE, the app data will NOT be cleared before this session starts.
		 
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		//URL url=new URL("http://127.0.0.1:4723/wd/hub");
	     driver=new AppiumDriver(url,caps);
	    //driver=new AndroidDriver(url,caps);

	    //Login(driver,"cfo");
	    
	
	}
}
