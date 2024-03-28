package tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class CFOTestCases 
{
	public static AppiumDriver driver =null ;		//WebDriver instance created
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;				//Instance created for tests
	
	
	
	@BeforeTest
	
	
	public void simpleTest() throws MalformedURLException, InterruptedException 
	{
		String workingDir = System.getProperty("user.dir");
		extent = new com.relevantcodes.extentreports.ExtentReports(workingDir+"//Report//ComplianceCFO.html",true);
		test = extent.startTest("Compliance Logging In - CFO");
		System.out.print("test");
		test.log(LogStatus.PASS, "Test Passed = Mobile App compliance product");
		setup();
		BaseClass.Login(driver,"cfo");
		extent.endTest(test);
		extent.flush();
		
	   
	}

	@Test(priority = 0)
	void EntitiesCount() throws InterruptedException, IOException
	{
		test = extent.startTest("Entities  Count Verification");
		
		Thread.sleep(8000);
		BaseClass.EntitiesCount(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	/*@Test(priority = 1)
	void LocationCount() throws InterruptedException, IOException
	{
		test = extent.startTest("Location  Count Verification");
		
		Thread.sleep(8000);
		BaseClass.LocationCount(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 2)
	void CategoryCount() throws InterruptedException, IOException
	{
		test = extent.startTest("Category  Count Verification");
		
		Thread.sleep(8000);
		BaseClass.CategoryCount(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 3)
	void ComplianceCount() throws InterruptedException, IOException
	{
		test = extent.startTest("Compliance  Count Verification");
		
		Thread.sleep(8000);
		BaseClass.ComplianceCount(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 4)
	void UsersCount() throws InterruptedException, IOException
	{
		test = extent.startTest("Users  Count Verification");
		
		Thread.sleep(8000);
		BaseClass.UsersCount(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
//@Test(priority = 5)
	void PenaltyCount() throws InterruptedException, IOException
	{
		test = extent.startTest("Penalty  Count Verification");
		
		Thread.sleep(8000);
		BaseClass.PenaltyCount(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 6)
		void DashboardfilterStatutory() throws InterruptedException, IOException
		{
			test = extent.startTest("Dashboard Filter Verification");
			
			Thread.sleep(8000);
			BaseClass.DashboardfilterStatutory(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	@Test(priority = 7)
	void DashboardfilterInternal() throws InterruptedException, IOException
	{
		test = extent.startTest("Dashboard Filter Verification");
		
		Thread.sleep(8000);
		BaseClass.DashboardfilterInternal(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
@Test(priority = 8)
	void CloseTimelyCount() throws InterruptedException, IOException
	{
		test = extent.startTest("Statutory compliance - Closed Timely Count Verification");
		
		Thread.sleep(8000);
		BaseClass.CloseTimelycount(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 9)
	void Overduecount() throws InterruptedException, IOException
	{
		test = extent.startTest("Statutory compliance - Overdue Count Verification");
		
		Thread.sleep(8000);
		BaseClass.Overduecount(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 10)
	void ClosedDelayedcount() throws InterruptedException, IOException
	{
		test = extent.startTest("Statutory compliance - Closed Delayed Count Verification");
		
		Thread.sleep(8000);
		BaseClass.ClosedDelayedcount(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 11)
	void InternalCloseTimelycount() throws InterruptedException, IOException
	{
		test = extent.startTest("Internal compliance - Closed Timely Count Verification");
		
		Thread.sleep(8000);
		BaseClass.InternalCloseTimelycount(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 12)
	void InternalOverduecount() throws InterruptedException, IOException
	{
		test = extent.startTest("Internal compliance - Overdue Count Verification");
		
		Thread.sleep(8000);
		BaseClass.InternalOverduecount(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 13)
	void InternalClosedDelayedcount() throws InterruptedException, IOException
	{
		test = extent.startTest("Internal compliance - Closed Delayed Count Verification");
		
		Thread.sleep(8000);
		BaseClass.InternalClosedDelayedcount(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 14)
	void complianceCalender() throws InterruptedException, IOException
	{
		test = extent.startTest("compliance calender verification ");
		
		Thread.sleep(8000);
		BaseClass.complianceCalender(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}	
	
	@Test(priority = 15)
	void ClickMyAct() throws InterruptedException, IOException
	{
		test = extent.startTest("My Act Tab verification ");
		
		Thread.sleep(8000);
		BaseClass.ClickMyAct(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 16)
	void ClickUpdateDetailes() throws InterruptedException, IOException
	{
		test = extent.startTest("Updates Detailes verification ");
		
		Thread.sleep(8000);
		BaseClass.ClickUpdateDetailes(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 17)
	void NewLetterDeatiles() throws InterruptedException, IOException
	{
		test = extent.startTest("News Letter Detailes verification ");
		
		Thread.sleep(8000);
		BaseClass.NewLetterDeatiles(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 18)
	void clickNotification() throws InterruptedException, IOException
	{
		test = extent.startTest("Notification tab verification ");
		
		Thread.sleep(8000);
		BaseClass.clickNotification(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 19)
	void MyReport() throws InterruptedException, IOException
	{
		test = extent.startTest("My Report tab - statutory type -compliance detailes verification ");
		
		Thread.sleep(8000);
		BaseClass.StatutoryMyReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 20)
	void InternalMyReport() throws InterruptedException, IOException
	{
		test = extent.startTest("My Report tab - Internal type -compliance detailes verification ");
		
		Thread.sleep(8000);
		BaseClass.InternalMyReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 21)
	void LockingDetailes() throws InterruptedException, IOException
	{
		test = extent.startTest("Locking Detailes  verification ");
		
		Thread.sleep(8000);
		BaseClass.LockingDetailes(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}*/
	
	//@Test(priority = 22)
	void MyDocument() throws InterruptedException, IOException
	{
		test = extent.startTest("Locking Detailes  verification ");
		
		Thread.sleep(8000);
		BaseClass.MyDocument(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@AfterTest
	
	void close()
	{
		driver.close();
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
