package tests;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class Locator 
{
	private static WebElement litigation = null;			//WebElement variable created for Username input 
	
	
	
	public static WebElement setUname(AppiumDriver driver)		//Method for searching Username input
	{
		litigation = driver.findElement(By.id("in.avantis.users.avantisapp:id/edtTextUsername"));
		return litigation;
	}
	public static WebElement clicksignIn(AppiumDriver driver)		//Method for searching Username input
	{
		litigation = driver.findElement(By.id("in.avantis.users.avantisapp:id/btnSignIn"));
		return litigation;
	}
	public static WebElement DontAccessOTP(AppiumDriver driver)		//Method for searching Username input
	{
		litigation = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtViewDontAccessOTP"));
		return litigation;
	}
	public static WebElement Question1(AppiumDriver driver)		//Method for searching Username input
	{
		litigation = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtViewQuestion1"));
		return litigation;
	}
	public static WebElement Question2(AppiumDriver driver)		//Method for searching Username input
	{
		litigation = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtViewQuestion2"));
		return litigation;
	}
	public static WebElement Answer1(AppiumDriver driver)		//Method for searching Username input
	{
		litigation = driver.findElement(By.id("in.avantis.users.avantisapp:id/edtTextAnswer1"));
		return litigation;
	}
	public static WebElement Answer2(AppiumDriver driver)		//Method for searching Username input
	{
		litigation = driver.findElement(By.id("in.avantis.users.avantisapp:id/edtTextAnswer2"));
		return litigation;
	}
	public static WebElement Validate(AppiumDriver driver)		//Method for searching Username input
	{
		litigation = driver.findElement(By.id("in.avantis.users.avantisapp:id/btnValidate"));
		return litigation;
	}
	public static WebElement EnterPin(AppiumDriver driver)		//Method for searching Username input
	{
		litigation = driver.findElement(By.id("in.avantis.users.avantisapp:id/txt_pin_entry"));
		return litigation;
	}
	public static WebElement ConfirmPin(AppiumDriver driver)		//Method for searching Username input
	{
		litigation = driver.findElement(By.id("in.avantis.users.avantisapp:id/txt_pin_rentry"));
		return litigation;
	}
	public static WebElement submitBtn(AppiumDriver driver)		//Method for searching Username input
	{
		litigation = driver.findElement(By.id("in.avantis.users.avantisapp:id/btnSubmitPin"));
		return litigation;
	}
	public static WebElement Litigation(AppiumDriver driver)		//Method for searching Username input
	{
		litigation = driver.findElement(By.id("in.avantis.users.avantisapp:id/card_view_litigation"));
		return litigation;
	}
	public static WebElement NoThanksBtn(AppiumDriver driver)		//Method for searching Username input
	{
		litigation = driver.findElement(By.id("android:id/autofill_dialog_no"));
		return litigation;
	}
	public static WebElement skip(AppiumDriver driver)		//Method for searching Username input
	{
		litigation = driver.findElement(By.id("in.avantis.users.avantisapp:id/btnCancel"));
		return litigation;
	}
	

}
