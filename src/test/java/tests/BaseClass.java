package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class BaseClass {

	
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
	    AppiumDriver driver=new AppiumDriver(url,caps);
	    //driver=new AndroidDriver(url,caps);

	    Login(driver,"fe");
	
	}
	    
	   
	public static void Login(AppiumDriver driver,String method) throws MalformedURLException, InterruptedException
		{
	    
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	Locator.setUname(driver).sendKeys("fe@bitaconsulting.co.in");
	    
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	Locator.clicksignIn(driver).click();
	    
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	Locator.DontAccessOTP(driver).click();
	    	
	    	String que1 = Locator.Question1(driver).getText();	//Storing the question in que variable.
			String ans1 = null;
			
			if(method.equalsIgnoreCase("fe"))
			{
				ans1 = getAnswerFE(que1);						//Storing the answer in ans variable.
			}
			
	    	
	    	if(ans1.equalsIgnoreCase("birthplace"))
	    		Locator.Answer1(driver).sendKeys("place");		//Sending answer to the input box.
			else
				Locator.Answer1(driver).sendKeys(ans1);		//Sending answer to the input box.
	    	
	    	//---------------------------------------------------------------------------//
	    	
	    	String que2 = Locator.Question2(driver).getText();	//Storing the question in que variable.
			String ans2 = null;
			
		   if(method.equalsIgnoreCase("fe"))
			{
				ans2 = getAnswerFE(que2);						//Storing the answer in ans variable.
			}
		   
			
			if(ans2.equalsIgnoreCase("birthplace"))
				Locator.Answer2(driver).sendKeys("place");		//Sending answer to the input box.
			else
				Locator.Answer2(driver).sendKeys(ans2);		//Sending answer to the input box.
			
			Thread.sleep(100);
		    Locator.Validate(driver).click();
		    Thread.sleep(100);
		    Locator.EnterPin(driver).sendKeys("1234");
		    Thread.sleep(100);
		    Locator.NoThanksBtn(driver).click();
		    Thread.sleep(100);
		    Locator.ConfirmPin(driver).sendKeys("1234");  
		    Thread.sleep(100);
		    Locator.submitBtn(driver).click();
		    Thread.sleep(100);
		    Locator.skip(driver).click();
		    Thread.sleep(100);
		    Locator.Litigation(driver).click();
	   }
	public static String getAnswerFE(String que)			//Method created to extract last word from question
	{														//as it is the answer of the question.
		String last = que.substring(que.lastIndexOf(" "));	//We are selecting word after last " ".
		int len = last.length();							
		String ans = last.substring(1, len-1);				//We are neglecting letters from string of position first " " and last "?"
		if(ans.equalsIgnoreCase("pet"))
			ans = "dog";
		if(ans.equalsIgnoreCase("car"))
			ans = "red";
		return ans.toLowerCase();							//Returning answer and converting to LowerCase too.  
	}
	
	    	
	
	@Test
	public void simpleTest() throws MalformedURLException, InterruptedException {
		System.out.print("test");
		BaseClass.setup(); 
	   
	}

}
