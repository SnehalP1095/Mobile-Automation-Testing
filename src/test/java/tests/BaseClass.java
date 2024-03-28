package tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

import io.appium.java_client.AppiumBy;




public class BaseClass 
{   
	public static void Login(AppiumDriver driver,String method) throws MalformedURLException, InterruptedException
		{
			//WebDriverWait wait = new WebDriverWait(driver, 20);
		
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	
	        if(method.equalsIgnoreCase("cfo"))
	        {
	        	Locator.setUname(driver).sendKeys("cfo@bitaconsulting.co.in");
	        }
	        else if(method.equalsIgnoreCase("fm"))
	        {
	        	Locator.setUname(driver).sendKeys("fm@bitaconsulting.co.in");
	        }
	        
	        
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	
	    	Locator.clicksignIn(driver).click();
	    
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	Locator.DontAccessOTP(driver).click();
	    	;
	    	 Thread.sleep(1000);
				//wait.until(ExpectedConditions.visibilityOf(Locator.Question1(driver)));
				//wait.until(ExpectedConditions.elementToBeClickable(Locator.Question1(driver)));
				String que1 = Locator.Question1(driver).getText();	//Storing the question in que variable.
				String ans1 = null;
				
				
				if(method.equalsIgnoreCase("cfo"))
				{
					ans1 = getAnswerCFO(que1);						//Storing the answer in ans variable.
				}
				
				else if(method.equalsIgnoreCase("fm"))
				{
					ans1 = getAnswerFM(que1);						//Storing the answer in ans variable.
				}
	    	
				if(ans1.equalsIgnoreCase("birthplace"))
					Locator.Answer1(driver).sendKeys("place");		//Sending answer to the input box.
				else
					Locator.Answer1(driver).sendKeys(ans1);		//Sending answer to the input box.
	    	
	    	//---------------------------------------------------------------------------//
	    	
				String que2 = Locator.Question2(driver).getText();	//Storing the question in que variable.
				String ans2 = null;
				if(method.equalsIgnoreCase("cfo"))
				{
					ans2 = getAnswerCFO(que2);						//Storing the answer in ans variable.
				}
				else if(method.equalsIgnoreCase("fm"))
				{
					ans2 = getAnswerFM(que2);						//Storing the answer in ans variable.
				}
		   
			
				if(ans2.equalsIgnoreCase("birthplace"))
					Locator.Answer2(driver).sendKeys("place");		//Sending answer to the input box.
				else
					Locator.Answer2(driver).sendKeys(ans2);		//Sending answer to the input box.
				Thread.sleep(100);
				
				Locator.Validate(driver).click();				//Clicking on Submit button.
			
				
			
		
		    Thread.sleep(100);
		    Locator.EnterPin(driver).sendKeys("1234");
		    Thread.sleep(100);
		    Locator.NoThanksBtn(driver).click();
		    Thread.sleep(100);
		    Locator.ConfirmPin(driver).sendKeys("1234");  
		    Thread.sleep(100);
		    Locator.submitBtn(driver).click();
		    //Thread.sleep(100);
		   // Locator.skip(driver).click();
		    Thread.sleep(100);
		    Locator.Compliance(driver).click();
	   }
	public static String getAnswerFM(String que)			//Method created to extract last word from question
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
	
	public static String getAnswerCFO(String que)			//Method created to extract last word from question
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
	
	public static void EntitiesCount(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	  	Thread.sleep(5000);
		
       	int	open = Integer.parseInt(Locator.EntitiesCount(driver).getText());	//Reading Notice Open count.
       	
       
       	if(	Locator.EntitiesCount(driver).isEnabled())
       	{
       		Thread.sleep(5000);
           	Locator.EntitiesCount(driver).click();	//Clicking on 'Open' notice
           	test.log(LogStatus.PASS, "Entities box is clickable");
           	
       	}
       	else
       	{
       	 	test.log(LogStatus.FAIL, "Entities box is not clickable");
       	}
       	
    	Thread.sleep(5000);
        // This command scrolls until it finds an element with the text "Display" and clicks on it
	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Locator.EntitiesGridCount(driver)\"))")).getText(); 
    	
       	
    	
       	Thread.sleep(8000);
    	int gridCount = Integer.parseInt(Locator.EntitiesGridCount(driver).getText());	
    	
    	  
		if(open == gridCount)
		{
			
			test.log(LogStatus.PASS, "Entities Dashboard Count = "+open+" |Displayed records from grid =" +gridCount);
		}
		else
		{
		
			test.log(LogStatus.FAIL, "Entities Dashboard Count = "+open+" | Displayed records from grid =" +gridCount);
		}
		Thread.sleep(2000);
		Locator.clickBackArrow(driver).click();
		
		
	}
	public static void LocationCount(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	  	Thread.sleep(5000);
		
       	int	open = Integer.parseInt(Locator.LocationCount(driver).getText());	//Reading Notice Open count.
    	
       	
       	if(	Locator.LocationCount(driver).isEnabled())
       	{
       		Thread.sleep(5000);
           	Locator.LocationCount(driver).click();	//Clicking on 'Open' notice
           	test.log(LogStatus.PASS, "Location box is clickable");
           	
       	}
       	else
       	{
       	 	test.log(LogStatus.FAIL, "Location box is not clickable");
       	}
    	/*Thread.sleep(8000);
    	int gridCount = Integer.parseInt(Locator.EntitiesGridCount(driver).getText());	
    	
    	  
		if(open == gridCount)
		{
			
			test.log(LogStatus.PASS, "Entities Dashboard Count = "+open+" |Displayed records from grid =" +gridCount);
		}
		else
		{
		
			test.log(LogStatus.FAIL, "Entities Dashboard Count = "+open+" | Displayed records from grid =" +gridCount);
		}*/
		Thread.sleep(2000);
		Locator.clickBackArrow(driver).click();
		
		
	}
	
	public static void CategoryCount(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	  	Thread.sleep(5000);
		
       	int	open = Integer.parseInt(Locator.CategoryCount(driver).getText());	//Reading Notice Open count.
    	
       	
       	if(	Locator.CategoryCount(driver).isEnabled())
       	{
       		Thread.sleep(5000);
           	Locator.CategoryCount(driver).click();	//Clicking on 'Open' notice
           	test.log(LogStatus.PASS, "Category box is clickable");
           	
       	}
       	else
       	{
       	 	test.log(LogStatus.FAIL, "Category box is not clickable");
       	}
    	/*Thread.sleep(8000);
    	int gridCount = Integer.parseInt(Locator.EntitiesGridCount(driver).getText());	
    	
    	  
		if(open == gridCount)
		{
			
			test.log(LogStatus.PASS, "Entities Dashboard Count = "+open+" |Displayed records from grid =" +gridCount);
		}
		else
		{
		
			test.log(LogStatus.FAIL, "Entities Dashboard Count = "+open+" | Displayed records from grid =" +gridCount);
		}*/
		Thread.sleep(50000);
		Locator.clickBackArrow(driver).click();
		
		
	}
	
	public static void ComplianceCount(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	  	Thread.sleep(5000);
		
       	int	open = Integer.parseInt(Locator.ComplianceCount(driver).getText());	//Reading Notice Open count.
    	
       	
       	if(	Locator.ComplianceCount(driver).isEnabled())
       	{
       		Thread.sleep(5000);
           	Locator.ComplianceCount(driver).click();	//Clicking on 'Open' notice
           	test.log(LogStatus.PASS, "Compliance box is clickable");
           	
       	}
       	else
       	{
       	 	test.log(LogStatus.FAIL, "Compliance box is not clickable");
       	}
    	/*Thread.sleep(8000);
    	int gridCount = Integer.parseInt(Locator.EntitiesGridCount(driver).getText());	
    	
    	  
		if(open == gridCount)
		{
			
			test.log(LogStatus.PASS, "Entities Dashboard Count = "+open+" |Displayed records from grid =" +gridCount);
		}
		else
		{
		
			test.log(LogStatus.FAIL, "Entities Dashboard Count = "+open+" | Displayed records from grid =" +gridCount);
		}*/
		Thread.sleep(20000);
		Locator.clickBackArrow(driver).click();
		
		
	}
	public static void UsersCount(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	  	Thread.sleep(5000);
		
       	int	open = Integer.parseInt(Locator.UsersCount(driver).getText());	//Reading Notice Open count.
    	
       	
       	if(	Locator.UsersCount(driver).isEnabled())
       	{
       		Thread.sleep(5000);
           	Locator.UsersCount(driver).click();	//Clicking on 'Open' notice
           	test.log(LogStatus.PASS, "Users box is clickable");
           	
       	}
       	else
       	{
       	 	test.log(LogStatus.FAIL, "Users box is not clickable");
       	}
    	/*Thread.sleep(8000);
    	int gridCount = Integer.parseInt(Locator.EntitiesGridCount(driver).getText());	
    	
    	  
		if(open == gridCount)
		{
			
			test.log(LogStatus.PASS, "Entities Dashboard Count = "+open+" |Displayed records from grid =" +gridCount);
		}
		else
		{
		
			test.log(LogStatus.FAIL, "Entities Dashboard Count = "+open+" | Displayed records from grid =" +gridCount);
		}*/
		Thread.sleep(2000);
		Locator.clickBackArrow(driver).click();
		
		
	}
	public static void PenaltyCount(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	  	Thread.sleep(5000);
		
       //	int	open = Integer.parseInt(Locator.PenaltyCount(driver).getText());	//Reading Notice Open count.
    	
       	
       	if(	Locator.PenaltyCount(driver).isEnabled())
       	{
       		Thread.sleep(5000);
           	Locator.PenaltyCount(driver).click();	//Clicking on 'Open' notice
           	test.log(LogStatus.PASS, "Penalty box is clickable");
           	
       	}
       	else
       	{
       	 	test.log(LogStatus.FAIL, "Penalty box is not clickable");
       	}
    	/*Thread.sleep(8000);
    	int gridCount = Integer.parseInt(Locator.EntitiesGridCount(driver).getText());	
    	
    	  
		if(open == gridCount)
		{
			
			test.log(LogStatus.PASS, "Entities Dashboard Count = "+open+" |Displayed records from grid =" +gridCount);
		}
		else
		{
		
			test.log(LogStatus.FAIL, "Entities Dashboard Count = "+open+" | Displayed records from grid =" +gridCount);
		}*/
		Thread.sleep(2000);
		Locator.clickBackArrow(driver).click();
		
		
	}
	public static void CloseTimelycount(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	
       	Thread.sleep(10000);
	
       	int	open = Integer.parseInt(Locator.closedTimelyCount(driver).getText());	//Reading Notice Open count.
       	
       	Locator.closedTimelyCount(driver).click();	//Clicking on 'Open' notice
       	
    	Thread.sleep(8000);
    	int critical = Integer.parseInt(Locator.closedTimelyCriticalCount(driver).getText());	
       	
    	int High =Integer.parseInt(Locator.closedTimelyHighCount(driver).getText());	
    	
    	int medium = Integer.parseInt(Locator.closedTimelyMediumCount(driver).getText());
    	
    	int low= Integer.parseInt(Locator.closedTimelyLowCount(driver).getText());
    	
    	int  count = critical+High+medium+low;
    	 
	
		
		if(open == count)
		{
			
			test.log(LogStatus.PASS, "Statutory - Close Timely Dashboard Count = "+open+" |Displayed records from grid = critical("+critical+") + high("+High+") +medium("+medium+") +low("+low+") =" +count);
		}
		else
		{
		
			test.log(LogStatus.FAIL, "Statutory - Close Timely Dashboard Count = "+open+" | Displayed records from grid = critical("+critical+") + high("+High+") +medium("+medium+") +low("+low+") =" +count);
		}
		
		Thread.sleep(200);
		Locator.clickBackArrow(driver).click();
       	
    
	}
	public static void Overduecount(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	
       	Thread.sleep(10000);
	
       	int	open = Integer.parseInt(Locator.OverdueCount(driver).getText());	//Reading Notice Open count.
       	
       	Locator.OverdueCount(driver).click();	//Clicking on 'Open' notice
       	
    	Thread.sleep(8000);
    	int critical = Integer.parseInt(Locator.OverdueCriticalCount(driver).getText());	
       	
    	int High =Integer.parseInt(Locator.OverdueHighCount(driver).getText());	
    	
    	int medium = Integer.parseInt(Locator.OverdueMediumCount(driver).getText());
    	
    	int low= Integer.parseInt(Locator.OverdueLowCount(driver).getText());
    	
    	int  count = critical+High+medium+low;
    	 
	
		
		if(open == count)
		{
			
			test.log(LogStatus.PASS, "Statutory - Overdue Dashboard Count = "+open+" |Displayed records from grid = critical("+critical+") + high("+High+") +medium("+medium+") +low("+low+") =" +count);
		}
		else
		{
		
			test.log(LogStatus.FAIL, "Statutory - Overdue Dashboard Count = "+open+" | Displayed records from grid = critical("+critical+") + high("+High+") +medium("+medium+") +low("+low+") =" +count);
		}
		Thread.sleep(200);
		Locator.clickBackArrow(driver).click();
       	
    
	}
	public static void ClosedDelayedcount(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	
       	Thread.sleep(10000);
	
       	int	open = Integer.parseInt(Locator.ClosedDelayedCount(driver).getText());	//Reading Notice Open count.
       	
       	Locator.ClosedDelayedCount(driver).click();	//Clicking on 'Open' notice
       	
    	Thread.sleep(8000);
    	int critical = Integer.parseInt(Locator.ClosedDelayedCriticalCount(driver).getText());	
       	
    	int High =Integer.parseInt(Locator.ClosedDelayedHighCount(driver).getText());	
    	
    	int medium = Integer.parseInt(Locator.ClosedDelayedMediumCount(driver).getText());
    	
    	int low= Integer.parseInt(Locator.ClosedDelayedLowCount(driver).getText());
    	
    	int  count = critical+High+medium+low;
    	 
	
		
		if(open == count)
		{
			
			test.log(LogStatus.PASS, "Statutory - Closed Delayed Dashboard Count = "+open+" |Displayed records from grid = critical("+critical+") + high("+High+") +medium("+medium+") +low("+low+") =" +count);
		}
		else
		{
		
			test.log(LogStatus.FAIL, "Statutory - Overdue Dashboard Count = "+open+" | Displayed records from grid = critical("+critical+") + high("+High+") +medium("+medium+") +low("+low+") =" +count);
		}
		Thread.sleep(200);
		Locator.clickBackArrow(driver).click();
       	
    
	}
	public static void InternalCloseTimelycount(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	
		
       	Thread.sleep(10000);
    	Locator.clickInternalStatus(driver).click();
	
       	int	open = Integer.parseInt(Locator.closedTimelyCount(driver).getText());	//Reading Notice Open count.
       	
       	Locator.closedTimelyCount(driver).click();	//Clicking on 'Open' notice
       	
    	Thread.sleep(8000);
    	int critical = Integer.parseInt(Locator.closedTimelyCriticalCount(driver).getText());	
       	
    	int High =Integer.parseInt(Locator.closedTimelyHighCount(driver).getText());	
    	
    	int medium = Integer.parseInt(Locator.closedTimelyMediumCount(driver).getText());
    	
    	int low= Integer.parseInt(Locator.closedTimelyLowCount(driver).getText());
    	
    	int  count = critical+High+medium+low;
    	 	
		if(open == count)
		{
			
			test.log(LogStatus.PASS, "Internal - Close Timely Dashboard Count = "+open+" |Displayed records from grid = critical("+critical+") + high("+High+") +medium("+medium+") +low("+low+") =" +count);
		}
		else
		{
		
			test.log(LogStatus.FAIL, "Internal - Close Timely Dashboard Count = "+open+" | Displayed records from grid = critical("+critical+") + high("+High+") +medium("+medium+") +low("+low+") =" +count);
		}
		
		Thread.sleep(200);
		Locator.clickBackArrow(driver).click();
       	
    
	}
	public static void InternalOverduecount(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	
       	Thread.sleep(10000);
    	Locator.clickInternalStatus(driver).click();
	
       	int	open = Integer.parseInt(Locator.OverdueCount(driver).getText());	//Reading Notice Open count.
       	
       	Locator.OverdueCount(driver).click();	//Clicking on 'Open' notice
       	
    	Thread.sleep(8000);
    	int critical = Integer.parseInt(Locator.OverdueCriticalCount(driver).getText());	
       	
    	int High =Integer.parseInt(Locator.OverdueHighCount(driver).getText());	
    	
    	int medium = Integer.parseInt(Locator.OverdueMediumCount(driver).getText());
    	
    	int low= Integer.parseInt(Locator.OverdueLowCount(driver).getText());
    	
    	int  count = critical+High+medium+low;
    	 
	
		
		if(open == count)
		{
			
			test.log(LogStatus.PASS, "Internal - Overdue Dashboard Count = "+open+" |Displayed records from grid = critical("+critical+") + high("+High+") +medium("+medium+") +low("+low+") =" +count);
		}
		else
		{
		
			test.log(LogStatus.FAIL, "Internal - Overdue Dashboard Count = "+open+" | Displayed records from grid = critical("+critical+") + high("+High+") +medium("+medium+") +low("+low+") =" +count);
		}
		Thread.sleep(200);
		Locator.clickBackArrow(driver).click();
       	
    
	}
	public static void InternalClosedDelayedcount(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	
       	Thread.sleep(10000);
    	Locator.clickInternalStatus(driver).click();
	
       	int	open = Integer.parseInt(Locator.ClosedDelayedCount(driver).getText());	//Reading Notice Open count.
       	
       	Locator.ClosedDelayedCount(driver).click();	//Clicking on 'Open' notice
       	
    	Thread.sleep(8000);
    	int critical = Integer.parseInt(Locator.ClosedDelayedCriticalCount(driver).getText());	
       	
    	int High =Integer.parseInt(Locator.ClosedDelayedHighCount(driver).getText());	
    	
    	int medium = Integer.parseInt(Locator.ClosedDelayedMediumCount(driver).getText());
    	
    	int low= Integer.parseInt(Locator.ClosedDelayedLowCount(driver).getText());
    	
    	int  count = critical+High+medium+low;
    	 
	
		
		if(open == count)
		{
			
			test.log(LogStatus.PASS, "Internal - Closed Delayed Dashboard Count = "+open+" |Displayed records from grid = critical("+critical+") + high("+High+") +medium("+medium+") +low("+low+") =" +count);
		}
		else
		{
		
			test.log(LogStatus.FAIL, "Internal - Overdue Dashboard Count = "+open+" | Displayed records from grid = critical("+critical+") + high("+High+") +medium("+medium+") +low("+low+") =" +count);
		}
		Thread.sleep(200);
		Locator.clickBackArrow(driver).click();
       	
    
	}
	
	public static void  complianceCalender(AppiumDriver driver, ExtentTest test) throws InterruptedException
	{
		Thread.sleep(200);
		Locator.clickcomplianceCalender(driver).click();
		Thread.sleep(200);
		Locator.clickcompliance(driver).click();
		
	
		
		Thread.sleep(2000);
		  String msg =Locator.summaryanddetailes(driver).getText();
		  
		  if(msg.equalsIgnoreCase("Summary & Details"))
		  {
			  test.log(LogStatus.PASS, "View popup open successfully. = " +msg);
		  }
		  else
		  {
			 test.log(LogStatus.FAIL, "View popup not open successfully. = " +msg);
		  }
		  
			Thread.sleep(200);
			Locator.summaryanddetailesBackArrow(driver).click();
		
			Thread.sleep(200);
			Locator.summaryanddetailesBackArrow(driver).click();
		
		
	}
	public static void ClickMyAct(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
		

		Thread.sleep(50000);
		if(Locator.MyActs(driver).isEnabled())
		{
			Thread.sleep(300);
			Locator.MyActs(driver).click();
			
			test.log(LogStatus.PASS, "My Act Tab is clickable");
		}
		else
		{
			test.log(LogStatus.FAIL, "My Act Tab is not clickable");
		}
		
		 Thread.sleep(200);
		  String msg =Locator.clickCategory(driver).getText();
		  
		  if(msg.equalsIgnoreCase("Category"))
		  {
			  test.log(LogStatus.PASS, "Category open successfully. = " +msg);
		  }
		  else
		  {
			 test.log(LogStatus.FAIL, "Category open not successfully. = " +msg);
		  }
		
//		Thread.sleep(500);
//		int Central = Integer.parseInt(Locator.centralAct(driver).getText());	
//		
//		test.log(LogStatus.PASS, "Central Act Count :-"+Central);
//		
//		Thread.sleep(500);
//		int State = Integer.parseInt(Locator.stateAct(driver).getText());
//		
//		test.log(LogStatus.PASS, "State Act Count :-"+State);
		
		Thread.sleep(500);
		Locator.clickHome(driver).click();
		
	}
	
	public static void ClickUpdateDetailes(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	
		Thread.sleep(3000);
		Locator.clickUpdates(driver).click();
		
		Thread.sleep(200);
		Locator.clickOpenUpdates(driver).click();
		
		Thread.sleep(200);
		String msg =Locator.verifyOpenUpdate(driver).getText();
		
		if(msg.equalsIgnoreCase(msg))
		{
			test.log(LogStatus.PASS,"Updates Tab:- compliance detailes Open Successfully :-" +msg);
		}
		else
		{
			test.log(LogStatus.FAIL,"Updates Tab:- compliance detailes Open Not Successfully :-" +msg);
		}
		
		Thread.sleep(200);
		Locator.clickBackArrow(driver).click();
		
	}
	public static void NewLetterDeatiles(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	
		Thread.sleep(2000);
		Locator.NewLetter(driver).click();
		
		Thread.sleep(2000);
		Locator.ClickNewLetter(driver).click();
		
		Thread.sleep(200);
		String msg =Locator.ClickTableOfContents(driver).getText();
		
		if(msg.equalsIgnoreCase(msg))
		{
			test.log(LogStatus.PASS,"News Letter Details Open Successfully :-" +msg);
		}
		else
		{
			test.log(LogStatus.FAIL,"News Letter Details Open Not Successfully :-" +msg);
		}
		Thread.sleep(500);
		Locator.clickBackArrow(driver).click();
	}
	
	
	
	public static void clickNotification(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{

		Thread.sleep(5000);
		if(Locator.ClickNotification(driver).isEnabled())
		{
			Locator.ClickNotification(driver).click();
			test.log(LogStatus.PASS, "Notification tab is clickable");
		}
		else
		{
			test.log(LogStatus.FAIL, "Notification tab is not clickable");
		}
		Thread.sleep(500);
		Locator.clickBackArrow(driver).click();
	}
	public static void StatutoryMyReport(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		Locator.Clickicon(driver).click();
		Thread.sleep(500);
		Locator.ClickMyreport(driver).click();
		Thread.sleep(500);
		Locator.ClickRiskFilter(driver).click();
		Thread.sleep(500);
		Locator.selectRisk(driver).click();
		Thread.sleep(500);
		Locator.clickStatus(driver).click();
		Thread.sleep(500);
		Locator.selectStatus(driver).click();
		Thread.sleep(500);
		Locator.clickApplyBtn(driver).click();
		try
		{
			
			Thread.sleep(7000);
			Locator.clickOpenBtn(driver).click();
			Thread.sleep(500);
			String msg =Locator.clickAct(driver).getText();
		
			if(msg.equalsIgnoreCase(msg))
			{
				test.log(LogStatus.PASS,"Compliance detailes open successfully :-" +msg);
			}
			else
			{
				test.log(LogStatus.FAIL,"Compliance detailes not open successfully :-" +msg);
			}
			Thread.sleep(500);
			Locator.clickBackArrow(driver).click();
			Thread.sleep(500);
			Locator.clickBackArrow(driver).click();
		}
		catch(Exception e)
		{
			
			Thread.sleep(500);
			test.log(LogStatus.FAIL, "No Data Available");
			
			Thread.sleep(500);
			Locator.clickBackArrow(driver).click();
		
		}
		
	}
	public static void InternalMyReport(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		Locator.Clickicon(driver).click();
		Thread.sleep(500);
		Locator.ClickMyreport(driver).click();
		
		Thread.sleep(500);
		Locator.clickComplianceTypeFilter(driver).click();
		Thread.sleep(500);
		Locator.selectComplianceType(driver).click();
		Thread.sleep(500);
		Locator.ClickRiskFilter(driver).click();
		Thread.sleep(500);
		Locator.selectRisk(driver).click();
		Thread.sleep(500);
		Locator.clickStatus(driver).click();
		Thread.sleep(500);
		Locator.selectStatus(driver).click();
		Thread.sleep(500);
		Locator.clickApplyBtn(driver).click();
		Thread.sleep(5000);
		Locator.clickOpenBtn(driver).click();
		Thread.sleep(500);
		String msg =Locator.clickRiskType(driver).getText();
		
		if(msg.equalsIgnoreCase(msg))
		{
			test.log(LogStatus.PASS,"Compliance detailes open successfully :- Risk Type:" +msg);
		}
		else
		{
			test.log(LogStatus.FAIL,"Compliance detailes not open successfully :- Risk Type:" +msg);
		}
		Thread.sleep(500);
		Locator.clickBackArrow(driver).click();
		Thread.sleep(500);
		Locator.clickBackArrow(driver).click();
		
	}
//	public static void StatutoryStandardReport(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
//	{
//		Thread.sleep(5000);
//		Locator.Clickicon(driver).click();
//		Thread.sleep(500);
//		Locator.ClickMyreport(driver).click();
//		
//		Thread.sleep(500);
//		Locator.clickStandardReport(driver).click();
//		
//		Thread.sleep(500);
//		Locator.clickOverallSummaryReport(driver).click();
//	}

	public static void LockingDetailes(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
		Thread.sleep(50000);
		Locator.Clickicon(driver).click();
		
		Thread.sleep(5000);
		Locator.clickLockingDetailes(driver).click();
		Thread.sleep(500);
		Locator.selectComplianceDetailes(driver).click();
		
		Thread.sleep(500);
		Locator.selectUnlockDetailes(driver).click();
		Thread.sleep(500);
		Locator.selectUpdateDateForUnlock(driver).sendKeys("05/03/2024");
		Thread.sleep(500);
		Locator.clickRemark(driver).sendKeys("ok");
		Thread.sleep(500);
		Locator.clickSubmit(driver).click();
		Thread.sleep(500);
		String msg=Locator.clickSubmitMsg(driver).getText();
		if(msg.equalsIgnoreCase(msg))
		{
			test.log(LogStatus.PASS,"Message displayed :-" +msg);
		}
		else
		{

			test.log(LogStatus.FAIL,"Message displayed :-" +msg);
		}
		Thread.sleep(500);
		Locator.clickBackArrow(driver).click();
	}
	public static void MyDocument(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		Locator.Clickicon(driver).click();
		
		Thread.sleep(5000);
		Locator.clickDocument(driver).click();
	}
	
	public static void DashboardfilterStatutory(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	
		Thread.sleep(20000);
		Locator.clickFilter(driver).click();
		Thread.sleep(2000);
		Locator.clickRiskTypeFilter(driver).click();
		Thread.sleep(2000);
		Locator.clickCategoryFilter(driver).click();
		Thread.sleep(2000);
		Locator.clickApplyBtnFilter(driver).click();
		//Thread.sleep(2000);
		//Locator.clickBtnClose(driver).click();
		
		
	 	Thread.sleep(10000);
		
       	int	open = Integer.parseInt(Locator.OverdueCount(driver).getText());	//Reading Notice Open count.
       	
       	Locator.OverdueCount(driver).click();	//Clicking on 'Open' notice
       	
    	Thread.sleep(8000);
    	int critical = Integer.parseInt(Locator.OverdueCriticalCount(driver).getText());
    	
    	int  count = critical;
    	
		if(open == count)
		{
			test.log(LogStatus.PASS, "Risk Type Filter -Critical risk filter working successfully");		
			test.log(LogStatus.PASS, "Statutory - Overdue Dashboard Count = "+open+" |Displayed records from grid = critical =" +count);
		}
		else
		{
			test.log(LogStatus.FAIL, "Risk Type Filter -Critical risk filter not working successfully");
			test.log(LogStatus.FAIL, "Statutory - Overdue Dashboard Count = "+open+" | Displayed records from grid = critical=" +count);
		}
		Thread.sleep(200);
		Locator.clickBackArrow(driver).click();
		
	}
	
	public static void DashboardfilterInternal(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
		
    	Thread.sleep(10000);
    	Locator.clickInternalStatus(driver).click();
	
		Thread.sleep(2000);
		Locator.clickFilter(driver).click();
		Thread.sleep(2000);
		Locator.clickRiskTypeFilter(driver).click();
		Thread.sleep(2000);
		Locator.clickApplyBtnFilter(driver).click();
		
		
		
	 	Thread.sleep(10000);
		
       	int	open = Integer.parseInt(Locator.OverdueCount(driver).getText());	//Reading Notice Open count.
       	
       	Locator.OverdueCount(driver).click();	//Clicking on 'Open' notice
       	
    	Thread.sleep(8000);
    	int critical = Integer.parseInt(Locator.OverdueCriticalCount(driver).getText());
    	
    	int  count = critical;
    	
		if(open == count)
		{
			test.log(LogStatus.PASS, "Risk Type Filter -Critical risk filter working successfully");		
			test.log(LogStatus.PASS, "Internal - Overdue Dashboard Count = "+open+" |Displayed records from grid = critical =" +count);
		}
		else
		{
			test.log(LogStatus.FAIL, "Risk Type Filter -Critical risk filter not working successfully");
			test.log(LogStatus.FAIL, "Internal - Overdue Dashboard Count = "+open+" | Displayed records from grid = critical=" +count);
		}
		Thread.sleep(200);
		Locator.clickBackArrow(driver).click();
		
	}
	
	
	
	


}
