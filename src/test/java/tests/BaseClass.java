package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	
	public static void setup() throws MalformedURLException
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		//caps.setCapability("platformName", "ANDROID");
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");     //Interface
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");            //Interface
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");  
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi9A");  
		caps.setCapability(MobileCapabilityType.UDID, "X44TJN9TMRTOEE8H");  
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
		caps.setCapability("noReset",true);
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
	    AppiumDriver driver=new AppiumDriver(url,caps);
	    driver=new AndroidDriver(url,caps);

	}  
	
	@Test
	public void simpleTest() throws MalformedURLException {
		System.out.print("test");
		setup();
	}

}
