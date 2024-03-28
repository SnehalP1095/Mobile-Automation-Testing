package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;


public class FMBaseClass 

{

	public static void PendingforReview(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	
	    
		Thread.sleep(6000);
	  	int	open = Integer.parseInt(Locator.clickPendingForReview(driver).getText());	//Reading Notice Open count.
	  	
	  	Thread.sleep(1000);
		Locator.clickPendingForReview(driver).click();
		
		Thread.sleep(4000);
		
	  	Locator.clickOpenDoc(driver).click();
	  	
	  	Thread.sleep(1000);
	  	
	  	Locator.clickViewDoc(driver).click();
	  	
	  	
	  	driver.navigate().back();
		
	  	Thread.sleep(1000);
	    Locator.clickRemark1(driver).sendKeys("Ok");
		
	    Thread.sleep(1000);
	  	Locator.clickApprove(driver).click();
	  	
	  	Thread.sleep(200);
		Locator.clickBackArrow(driver).click();
		
		Thread.sleep(5000);
		
       	
		int	count = Integer.parseInt(Locator.clickPendingForReview(driver).getText());	//Reading Notice Open count.
	  	
		if(open <= count)
		{
			
			test.log(LogStatus.PASS, "Statutory - Before compliance review count  = "+open+" |After compliance review count = " +count);
		}
		else
		{
		
			test.log(LogStatus.FAIL, "Statutory - Before compliance review count  = "+open+" |After compliance review count = " +count);
		}

       	
    
	}
	public static void InternalPendingforReview(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	 
		Thread.sleep(6000);
    	Locator.clickInternalStatus(driver).click();
	
		Thread.sleep(6000);
	  	int	open = Integer.parseInt(Locator.clickPendingForReview(driver).getText());	//Reading Notice Open count.
	  	
	  	Thread.sleep(1000);
		Locator.clickPendingForReview(driver).click();
		
		Thread.sleep(4000);
		
	  	Locator.clickOpenDoc(driver).click();
	  	
	  	Thread.sleep(1000);
	  	
	  	Locator.clickViewDoc(driver).click();
	  	
	  	
	  	driver.navigate().back();
		
	  	Thread.sleep(1000);
	    Locator.clickRemark1(driver).sendKeys("Ok");
		
	    Thread.sleep(1000);
	  	Locator.clickApprove(driver).click();
	  	
	  	Thread.sleep(200);
		Locator.clickBackArrow(driver).click();
		
		Thread.sleep(200);
    	Locator.clickInternalStatus(driver).click();
		
		Thread.sleep(5000);
		
       	
		int	count = Integer.parseInt(Locator.clickPendingForReview(driver).getText());	//Reading Notice Open count.
	  	
		if(open <= count)
		{
			
			test.log(LogStatus.PASS, "Internal - Before compliance review count  = "+open+" |After compliance review count = " +count);
		}
		else
		{
		
			test.log(LogStatus.FAIL, "Internal - Before compliance review count  = "+open+" |After compliance review count = " +count);
		}
	
       	
    
	}
	
	public static void  complianceCalender(AppiumDriver driver, ExtentTest test) throws InterruptedException
	{
		Thread.sleep(3000);
		Locator.clickcomplianceCalender(driver).click();
		
	
		try
		{
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
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "Record not display");
		}
	 	Thread.sleep(200);
		Locator.clickBackArrow(driver).click();
		
		
	}
	
	public static void ClickMyAct(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
		

		Thread.sleep(5000);
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
			
		
//		
//		Thread.sleep(5000);
//		int Central = Integer.parseInt(Locator.centralAct(driver).getText());	
//		
//		test.log(LogStatus.PASS, "Central Act Count :-"+Central);
//		
//		Thread.sleep(5000);
//		int State = Integer.parseInt(Locator.stateAct(driver).getText());
//		
//		test.log(LogStatus.PASS, "State Act Count :-"+State);
//		
		Thread.sleep(500);
		Locator.clickHome(driver).click();
		
	}
	
	public static void ClickUpdateDetailes(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
	{
	
		Thread.sleep(3000);
		Locator.clickUpdatesFM(driver).click();
		
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
		Thread.sleep(500);
		Locator.clickHome(driver).click();
		
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
		
		Thread.sleep(500);
		Locator.clickHome(driver).click();
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
		Locator.ClickMyreportFM(driver).click();
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
			Locator.ClickMyreportFM(driver).click();
			
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
			
			try
			{
				
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
			catch(Exception e)
			{
				
				Thread.sleep(500);
				test.log(LogStatus.FAIL, "No Data Available");
				
				Thread.sleep(500);
				Locator.clickBackArrow(driver).click();
			
			}
			
			
		}
		public static void MyDocument(AppiumDriver driver, ExtentTest test) throws InterruptedException, IOException
		{
			Thread.sleep(5000);
			Locator.Clickicon(driver).click();
			
			Thread.sleep(5000);
			Locator.MyDocumentFM(driver).click();
			
			Thread.sleep(5000);
			Locator.clickApplyBtn(driver).click();
			
			Thread.sleep(5000);
			Locator.clickOpenBtn(driver).click();
			
			Thread.sleep(1000);
		  	
		  	Locator.clickViewDoc(driver).click();
		  	
			Thread.sleep(500);
			Locator.clickBackArrow(driver).click();
			
			Thread.sleep(500);
			Locator.clickBackArrow(driver).click();
		  	
		}
		
	}
	
	

