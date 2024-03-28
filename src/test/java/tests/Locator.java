package tests;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class Locator 
{
	private static WebElement compliance = null;			//WebElement variable created for Username input 
	
	
	
	public static WebElement setUname(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/edtTextUsername"));
		return compliance;
	}
	public static WebElement clicksignIn(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/btnSignIn"));
		return compliance;
	}
	public static WebElement DontAccessOTP(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtViewDontAccessOTP"));
		return compliance;
	}
	public static WebElement Question1(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtViewQuestion1"));
		return compliance;
	}
	public static WebElement Question2(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtViewQuestion2"));
		return compliance;
	}
	public static WebElement Answer1(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/edtTextAnswer1"));
		return compliance;
	}
	public static WebElement Answer2(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/edtTextAnswer2"));
		return compliance;
	}
	public static WebElement Validate(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/btnValidate"));
		return compliance;
	}
	public static WebElement EnterPin(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txt_pin_entry"));
		return compliance;
	}
	public static WebElement ConfirmPin(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txt_pin_rentry"));
		return compliance;
	}
	public static WebElement submitBtn(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/btnSubmitPin"));
		return compliance;
	}
	public static WebElement compliance(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/card_view_compliance"));
		return compliance;
	}
	public static WebElement Compliance(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/card_view_compliance"));
		return compliance;
	}
	public static WebElement NoThanksBtn(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("android:id/autofill_dialog_no"));
		return compliance;
	}
	public static WebElement skip(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/btnCancel"));
		return compliance;
	}
	public static WebElement closedTimelyCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtCloseTimelycount"));
		return compliance;
	}
	public static WebElement closedTimelyCriticalCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtCriticalCount"));
		return compliance;
	}
	public static WebElement closedTimelyHighCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtHighCount"));
		return compliance;
	}
	public static WebElement closedTimelyMediumCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtMediumCount"));
		return compliance;
	}
	public static WebElement closedTimelyLowCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtLowCount"));
		return compliance;
	}
	public static WebElement clickBackArrow(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"));
		return compliance;
	}
	public static WebElement OverdueCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtOverdueCount"));
		return compliance;
	}
	public static WebElement OverdueCriticalCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtCriticalCount"));
		return compliance;
	}
	public static WebElement OverdueHighCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtHighCount"));
		return compliance;
	}
	public static WebElement OverdueMediumCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtMediumCount"));
		return compliance;
	}
	public static WebElement OverdueLowCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtLowCount"));
		return compliance;
	}
	public static WebElement ClosedDelayedCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtCloseDelayedCount"));
		return compliance;
	}
	public static WebElement ClosedDelayedCriticalCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtCriticalCount"));
		return compliance;
	}
	public static WebElement ClosedDelayedHighCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtHighCount"));
		return compliance;
	}
	public static WebElement ClosedDelayedMediumCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtMediumCount"));
		return compliance;
	}
	public static WebElement ClosedDelayedLowCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtLowCount"));
		return compliance;
	}
	public static WebElement clickInternalStatus(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtViewOverdueInternal"));
		return compliance;
	}
	public static WebElement clickcomplianceCalender(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.avantis.users.avantisapp:id/dayLabel' and @text='1']"));
		return compliance;
	}
	public static WebElement clickcompliance(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id='in.avantis.users.avantisapp:id/layoutComplianceName'])[1]/android.widget.ImageView"));
		return compliance;
	}
	public static WebElement summaryanddetailes(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.TextView[@text='Summary & Details']"));
		return compliance;
	}
	public static WebElement summaryanddetailesBackArrow(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"));
		return compliance;
	}
	public static WebElement EntitiesCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/mCardEntitesCount"));
		return compliance;
	}
	public static WebElement LocationCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/mCardLocationCount"));
		return compliance;
	}
	public static WebElement CategoryCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/mCardFunctionCount"));
		return compliance;
	}
	public static WebElement ComplianceCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/mCardCompliancesCount"));
		return compliance;
	}
	public static WebElement UsersCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/mCardUsersCount"));
		return compliance;
	}
	public static WebElement PenaltyCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.avantis.users.avantisapp:id/mCardPenaltyCount']"));
		return compliance;
	}
	public static WebElement EntitiesGridCount(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtViewEntitiesName"));
		return compliance;
	}
	public static WebElement clickHome(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='in.avantis.users.avantisapp:id/navigation_bar_item_icon_view'])[1]"));
		return compliance;
	}
	public static WebElement MyActs(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"in.avantis.users.avantisapp:id/navigation_bar_item_icon_view\"])[2]"));
		return compliance;
	}
	public static WebElement centralAct(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/central_count"));
		return compliance;
	}
	public static WebElement stateAct(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/state_count"));
		return compliance;
	}
	public static WebElement clickUpdates(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='in.avantis.users.avantisapp:id/dayIcon'])[26]"));
		return compliance;
	}
	public static WebElement clickUpdatesFM(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='in.avantis.users.avantisapp:id/navigation_bar_item_icon_view'])[3]"));
		return compliance;
	}
	public static WebElement clickOpenUpdates(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='in.avantis.users.avantisapp:id/txtViewOpen'])[1]"));
		return compliance;
	}
	public static WebElement verifyOpenUpdate(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.TextView[@text='Act']"));
		return compliance;
	}
	public static WebElement NewLetter(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='in.avantis.users.avantisapp:id/navigation_bar_item_icon_view'])[4]"));
		return compliance;
	}
	public static WebElement ClickNewLetter(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.avantis.users.avantisapp:id/txtViewNewsTitle' and @text='TEAMLEASE WEEKLY NEWSLETTER | ISSUE 04 OF FEBRUARY 2024']"));
		return compliance;
	}
	public static WebElement ClickTableOfContents(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.TextView[@text='TABLE OF CONTENTS']"));
		return compliance;
	}
	public static WebElement ClickNotification(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Test Counter Action']"));
		return compliance;
	}
	public static WebElement Clickicon(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id='in.avantis.users.avantisapp:id/toolbar']/android.widget.ImageButton"));
		return compliance;
	}
	public static WebElement ClickMyreport(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/mCardCompliancesCount"));
		return compliance;
	}
	public static WebElement ClickMyreportFM(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Checklist\"]"));
		return compliance;
	}
	public static WebElement NoDataAvailable(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/recyclerViewCFOMyReports"));
		return compliance;
	}
	public static WebElement MyDocumentFM(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/UpcomingCountPS"));
		return compliance;
	}
	public static WebElement ClickRiskFilter(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/edit_spinner1"));
		return compliance;
	}
	public static WebElement selectRisk(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/edit_spinnerPeriod"));
		return compliance;
	}
	public static WebElement clickStatus(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/edit_spinner2"));
		return compliance;
	}
	public static WebElement selectStatus(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/edit_spinnerFY"));
		return compliance;
	}
	public static WebElement clickApplyBtn(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/filter_img"));
		return compliance;
	}
	public static WebElement clickOpenBtn(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='in.avantis.users.avantisapp:id/txtViewOpen'])[1]"));
		return compliance;
	}
	public static WebElement clickAct(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtoverviewActName"));
		return compliance;
	}
	public static WebElement clickComplianceTypeFilter(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/edit_spinner"));
		return compliance;
	}
	public static WebElement selectComplianceType(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/edit_spinner2"));
		return compliance;
	}
	public static WebElement clickRiskType(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txtoverviewRiskType"));
		return compliance;
	}
	public static WebElement clickStandardReport(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.TextView[@text='Standard']"));
		return compliance;
	}
	public static WebElement clickOverallSummaryReport(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.TextView[@text='Overall Summary Report']"));
		return compliance;
	}
	public static WebElement clickDocument(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"in.avantis.users.avantisapp:id/swipeToRefreshCFODashboard\"]/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout"));
		return compliance;
	}
	public static WebElement clickLockingDetailes(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"in.avantis.users.avantisapp:id/swipeToRefreshCFODashboard\"]/android.widget.ScrollView/android.widget.FrameLayout"));
		return compliance;
	}
	public static WebElement selectComplianceDetailes(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='in.avantis.users.avantisapp:id/textViewSelectCompliance'])[1]"));
		return compliance;
	}
	public static WebElement selectUnlockDetailes(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/UnlockCompliance"));
		return compliance;
	}
	public static WebElement selectUpdateDateForUnlock(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.	id("in.avantis.users.avantisapp:id/textViewUpdateDateForUnlock"));
		return compliance;
	}
	public static WebElement clickRemark(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/editTextRemark"));
		return compliance;
	}
	public static WebElement clickSubmit(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/buttonSubmit"));
		return compliance;
	}
	public static WebElement clickSubmitMsg(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='in.avantis.users.avantisapp:id/txtViewComplianceDesc'])[2]"));
		return compliance;
	}
	public static WebElement clickFilter(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/btnCFOFloatingfilter"));
		return compliance;
	}
	public static WebElement clickRiskTypeFilter(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txt_critical"));
		return compliance;
	}
	public static WebElement clickCategoryFilter(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/txt_HR"));
		return compliance;
	}
	public static WebElement clickApplyBtnFilter(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/btnApply"));
		return compliance;
	}
	public static WebElement clickBtnClose(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.id("in.avantis.users.avantisapp:id/btnClose"));
		return compliance;
	}
	public static WebElement clickHorizantalscroll(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='in.avantis.users.avantisapp:id/mCardReviewerSummary']/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout"));
		return compliance;
	}
	public static WebElement clickPendingForReview(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.avantis.users.avantisapp:id/pendingCountRS']"));
		
		return compliance;
	}
	public static WebElement clickOpenDoc(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='in.avantis.users.avantisapp:id/txtViewOpen'])[1]"));
		return compliance;
	}
	public static WebElement clickViewDoc(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.Button[@resource-id='in.avantis.users.avantisapp:id/btnShowDocuments']"));
		return compliance;
	}
	public static WebElement clickRemark1(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='in.avantis.users.avantisapp:id/edtTextRemarks']"));
		return compliance;
	}
	public static WebElement clickApprove(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.Button[@resource-id='in.avantis.users.avantisapp:id/btnApproveCompliance']"));
		return compliance;
	}
	public static WebElement clickCategory(AppiumDriver driver)		//Method for searching Username input
	{
		compliance = driver.findElement(By.xpath("//android.widget.TextView[@text='Category']"));
		return compliance;
	}
	
}
