package com.EIDSA.pageObjects;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class SubjectPage extends AbstractComponent{
	
	static WebDriver driver;
	public SubjectPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Subject menu
	@FindBy(xpath = "//span[normalize-space()='Subjects']")
	WebElement subject;	
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Create subject
	@FindBy(xpath = "//img[@alt='Create subject']")
	WebElement createSubject;	
	@FindBy(xpath = "//div[@class='form-group row']//div[1]//select[1]")
	WebElement siteCode;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement subjectId;	
	@FindBy(xpath = "//input[@type='date']")
	WebElement enrolmentDate;	
	@FindBy(xpath = "(//select[@name='account'])[3]")
	WebElement country;	
	@FindBy(xpath = "(//select[@name='account'])[4]")
	WebElement investigator;	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement preVisit;	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement postVisit;	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement city;	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement postCode;	
	@FindBy(xpath = "(//select[@name='account'])[5]")
	WebElement language;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement subjectNotes;	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	WebElement active;	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	WebElement createSchedule;	
	@FindBy(xpath = "//button[normalize-space()='Clear']")
	WebElement clear;	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save;	
	
	//Error
	@FindBy(xpath = "//span[normalize-space()='Please select a site code']")
	WebElement errorSiteCode;	
	@FindBy(xpath = "//span[normalize-space()='Please enter a subject ID']")
	WebElement errorSubjectId;	
	@FindBy(xpath = "//span[normalize-space()='Please select enrolment date']")
	WebElement errorDate;	
	
	//Upload subject
	@FindBy(xpath = "img[alt='Upload subject']")
	WebElement uploadSub;	
	
	//Search
	@FindBy(xpath = "//select[@placeholder='Site code']")
	WebElement searchSiteCode;	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement searchSubId;	
	@FindBy(xpath = "//select[@placeholder='Search']")
	WebElement searchStatus;	
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	WebElement search;	
	
	//Web table
	@FindBy(xpath="//td[1]")
	List<WebElement> tableSiteCode;	
	@FindBy(xpath="//td[2]")
	List<WebElement> tableSubId;	
	@FindBy(xpath="//td[3]")
	List<WebElement> tableStatus;	
	@FindBy(xpath="//td[9]//i")
	List<WebElement> tableShedule;	
	@FindBy(xpath="//td[10]//i")
	List<WebElement> tableComplete;	
	@FindBy(xpath="//td[11]//i")
	List<WebElement> tableEdit;	
	@FindBy(xpath="//td[12]//i")
	List<WebElement> tableWithdraw;;	
	@FindBy(xpath="//td[13]//i")
	List<WebElement> tableDelete;	
	@FindBy(xpath="//td[14]//i")
	List<WebElement> tableDocument;
	
	//Create schedule
	@FindBy(xpath = "//img[@alt='Schedule patient']")
	WebElement createschedule;
	
	//Audit trail	
	@FindBy(xpath = "//strong[normalize-space()='Neethu P S']")
	WebElement auditTrail1;
	@FindBy(xpath = "(//i[@class='fa fa-times'])[2]")
	WebElement auditTrail2;
	@FindBy(xpath = "(//i[@class='fa fa-times'])[1]")
	WebElement auditTrail3;
	
	//Folder creation
		@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div[1]/div/div[1]/div/img")
		WebElement AddFolder;
		@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div/input")
		WebElement FolderName;
		@FindBy(xpath="//button[contains(text(),'Add')]")
		WebElement FolderAdd;
		@FindBy(xpath="//label[normalize-space()='01']")
		WebElement clickOnFolder1;
		@FindBy(xpath="//label[normalize-space()='02']")
		WebElement clickOnFolder2;
		@FindBy(xpath="//label[normalize-space()='03']")
		WebElement clickOnFolder3;
		@FindBy(xpath="//i[@class='fa fa-times']")
		WebElement close;
		
		//Folder edit
		@FindBy(xpath="//img[@alt='Edit folder name']")
		WebElement editFolder1;
		@FindBy(xpath="//input[@placeholder='Enter Folder Name']")
		WebElement editFolder2;
		@FindBy(xpath="//img[@alt='Save folder name']")
		WebElement editFolder3;
		
		//Folder delete
		@FindBy(xpath="//img[@alt='Delete folder']")
		WebElement delete;
		
		//Document upload
		@FindBy(xpath="//img[@alt='upload document']")
		WebElement upload;
		@FindBy(xpath="//textarea[@placeholder='Description']")
		WebElement description;
		@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div[2]/div/div")
		WebElement appr1;
		@FindBy(xpath="//span[normalize-space()='Neethu P S']")
		WebElement appr2;
		@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div[2]/div/div[2]/button")
		WebElement appr3;
		@FindBy(xpath="//input[@id='InPutFile']")
		WebElement chooseFile;
		@FindBy(xpath="//button[@type='button']//div[contains(text(),'Add')]")
		WebElement AddFile;
		
		//Search document
		@FindBy(xpath="//label[contains(text(),'Document Name')]/following-sibling::input[1]")
		WebElement searchDocumentName;
		@FindBy(xpath="//label[contains(text(),'Created Date')]/following-sibling::input[1]")
		WebElement searchCreatedDate;
		@FindBy(xpath="//label[contains(text(),'Uploaded By')]/following-sibling::input[1]")
		WebElement searchUploadedBy;
		@FindBy(xpath="//span[contains(text(),'Search')]")
		WebElement Search1;
		
		//Web table_Document
		@FindBy(xpath="//td[1]")
		List<WebElement> tableFolder;
		@FindBy(xpath="//td[2]")
		List<WebElement> tableDocument1;
		@FindBy(xpath="//td[3]")
		List<WebElement> tableCreatedBy;
		@FindBy(xpath="//td[4]")
		List<WebElement> tableCreatedDate;
		@FindBy(xpath="//td[5]")
		List<WebElement> tableEdit1;
		@FindBy(xpath="//td[6]//i")
		List<WebElement> tableDelete1;
		@FindBy(xpath="//td[7]")
		List<WebElement> tableView;
		@FindBy(xpath="//td[8]//i")
		List<WebElement> tableApprovals;
		@FindBy(xpath="//td[9]")
		List<WebElement> tableDownloads;
		
		@FindBy(xpath="//span[contains(text(),'Please enter a folder name')]")
		WebElement err1;
		
		//Approver2
		
		@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div[2]/div/div")
		WebElement approver1;
		@FindBy(xpath="//span[normalize-space()='Neethu P S']")
		WebElement approver2;
		@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div[2]/div/div/span[2]")
		WebElement approver3;
		@FindBy(xpath="//button[normalize-space()='Add']")
		WebElement addApprover;
		@FindBy(xpath="//img[@alt='Remove approver']")
		WebElement deleteApprover;
		@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div/i")
		WebElement closeApproverWindow;
	
	public void clickSubject() throws InterruptedException
	{
		Thread.sleep(2000);
		subject.click();
		Thread.sleep(2000);
	}
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	public void auditTrail() throws InterruptedException
	{
		Thread.sleep(2000);
		auditTrail1.click();
		Thread.sleep(2000);
		auditTrail2.click();
		Thread.sleep(2000);
		auditTrail3.click();
		Thread.sleep(2000);
	}
	
	public void clickCreateSubject() throws InterruptedException
	{
		Thread.sleep(2000);
		createSubject.click();
		Thread.sleep(2000);
	}
	
	public void saveSub() throws InterruptedException
	{
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}
	
	public void createSubject(String code,String subid,String date,String in) throws InterruptedException
	{
		Thread.sleep(2000);
		subject.click();
		Thread.sleep(2000);
		createSubject.click();
		Thread.sleep(2000);
		Select sitecode=new Select(siteCode);
		sitecode.selectByVisibleText(code);
		Thread.sleep(2000);
		subjectId.sendKeys(subid);
		Thread.sleep(2000);
		enrolmentDate.sendKeys(date);
		Thread.sleep(2000);
		Select inv=new Select(investigator);
		inv.selectByVisibleText(in);
		Thread.sleep(2000);
		save.click();	
		Thread.sleep(2000);
	}
	
	public void duplicateSiteCode(String site) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sitecode=new Select(siteCode);
		sitecode.selectByVisibleText(site);
		Thread.sleep(2000);

	}
	
	public void duplicateSubjectId(String subid) throws InterruptedException
	{
		Thread.sleep(2000);
		subjectId.sendKeys(subid);
		Thread.sleep(2000);
	}
	
	public void duplicatedate(String subid) throws InterruptedException
	{
		Thread.sleep(2000);
		enrolmentDate.sendKeys(subid);
		Thread.sleep(2000);
	}
	
	public static boolean subjectAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Subject added successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public boolean verifySubject(String subjectid) throws InterruptedException 
	{
		boolean sub=false;
		int count = tableSubId.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableSubId.get(i).getText();
			if(text.contains(subjectid))
			{
				sub=true;
				break;
			}
		}
		return sub;
	}
	
	public void searchSiteCode(String sitecode) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(searchSiteCode);
		sel.selectByVisibleText(sitecode);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	public void searchSubjectId(String subid) throws InterruptedException
	{
		Thread.sleep(2000);
		searchSubId.sendKeys(subid);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	public void searchStatus(String status) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(searchStatus);
		sel.selectByVisibleText(status);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	
	public void clearSubjectId() throws InterruptedException
	{
		Thread.sleep(2000);
		searchSubId.click();
		Thread.sleep(2000);
		searchSubId.clear();
		Thread.sleep(2000);
	}
	
	public void searchStatusAll() throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(searchStatus);
		sel.selectByVisibleText("All");
		Thread.sleep(2000);
	}
	
	
	public Boolean siteCodeSearchValidation(String sitecode) throws InterruptedException
	{
		boolean st = true;
		int count =tableSiteCode.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableSiteCode.size();i++)
			{
				String scode=tableSiteCode.get(i).getText();
				if (!(scode.contains(sitecode))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	public Boolean subIdeSearchValidation(String sub) throws InterruptedException
	{
		boolean st = true;
		int count =tableSubId.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableSubId.size();i++)
			{
				String scode=tableSubId.get(i).getText();
				if (!(scode.contains(sub))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	public Boolean statusSearchValidation(String status) throws InterruptedException
	{
		boolean st = true;
		int count =tableStatus.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableStatus.size();i++)
			{
				String scode=tableStatus.get(i).getText();
				if (!(scode.contains(status))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	
	
	public void editSubject(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableSubId.size();i++)
		{
			String text=tableSubId.get(i).getText();
			if(text.equals(subcode))
			{
				tableEdit.get(i).click();
				break;	
			}
		}
	}
	
	public void selDoc(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableSubId.size();i++)
		{
			String text=tableSubId.get(i).getText();
			if(text.equals(subcode))
			{
				tableDocument.get(i).click();
				break;	
			}
		}
	}
	
	public void editSub(String edit) throws InterruptedException
	{
		Thread.sleep(2000);
		subjectNotes.clear();
		Thread.sleep(2000);
		subjectNotes.sendKeys(edit);
		Thread.sleep(2000);
		save.click();	
		Thread.sleep(2000);
	}
	
	public static boolean subjectEditAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Subject updated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}			
	}

	
	public void delSubject(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableSubId.size();i++)
		{
			String text=tableSubId.get(i).getText();
			if(text.equals(subcode))
			{
				tableDelete.get(i).click();
				break;	
			}
		}
	}
	
	public static boolean subjectDelAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this patient?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("Deleted Successfully."));
			alert.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void withdrawnSubject(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableSubId.size();i++)
		{
			String text=tableSubId.get(i).getText();
			if(text.equals(subcode))
			{
				tableWithdraw.get(i).click();
				break;	
			}
		}
	}
	
	public static boolean subjectWithdrawAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to withdraw this patient?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Patient withdrawn successfully"));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void completeSubject(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableSubId.size();i++)
		{
			String text=tableSubId.get(i).getText();
			if(text.equals(subcode))
			{
				tableComplete.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public static boolean subjectCompleteAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to complete this patient?"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void scheduleSubject(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableSubId.size();i++)
		{
			String text=tableSubId.get(i).getText();
			if(text.equals(subcode))
			{
				tableShedule.get(i).click();
				Thread.sleep(2000);
				createschedule.click();
				break;	
			}
		}
	}
	
	public static boolean scheduleAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Schedule created successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean duplicateAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Subject ID already exists"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public void completeSubjectWithEnrolledStatus(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableSubId.size();i++)
		{
			String text=tableSubId.get(i).getText();
			if(text.equals(subcode))
			{
				tableComplete.get(i).click();
				break;	
			}
		}
	}
	
	public static boolean completeSubjectWithEnrolledStatusAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("All the visit status should be either completed or withdrawn for completing patient"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public String siteCodeErrorMsg()
	{
		elementWait(errorSiteCode);
		return errorSiteCode.getText();
	}
	
	public String subIdErrorMsg()
	{
		elementWait(errorSubjectId);
		return errorSubjectId.getText();
	}
	
	public String dateErrorMsg()
	{
		elementWait(errorDate);
		return errorDate.getText();
	}
	
	public static boolean folderCreationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Folder created successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean folderUpdationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Folder updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean documentCreationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Document created successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean documentUpdationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Document updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean documentDeletionAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this document?"));
			alert1.accept();
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("Document deleted successfully"));
			alert.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean folderDeletionAlert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this folder?"));
			alert1.accept();
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("Folder deleted successfully"));
			alert.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public void DocumentNameSearch(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		searchDocumentName.sendKeys(name);
		Thread.sleep(4000);
		Search1.click();
		Thread.sleep(4000);
	}
	
	public void selFolder1() throws InterruptedException
	{
		Thread.sleep(2000);
		clickOnFolder1.click();
		Thread.sleep(2000);
	}
	
	public void selFolder2() throws InterruptedException
	{
		Thread.sleep(2000);
		clickOnFolder2.click();
		Thread.sleep(2000);
	}
	
	public void selFolder3() throws InterruptedException
	{
		Thread.sleep(2000);
		clickOnFolder3.click();
		Thread.sleep(2000);
	}
	
	public Boolean DocumentNameSearchValidation(String nm) throws InterruptedException
	{
		boolean st = true;
		int count =tableDocument1.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableDocument1.size();i++)
			{
				String stat=tableDocument1.get(i).getText();
				if (!(stat.contains(nm))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}

	
	public void DocumentDateSearch(String dt) throws InterruptedException
	{
		Thread.sleep(2000);
		searchCreatedDate.sendKeys(dt);
		Thread.sleep(2000);
		Search1.click();
		Thread.sleep(2000);
	}
	
	public Boolean DateSearchValidation(String nm) throws InterruptedException
	{
		boolean st = true;
		int count =tableCreatedDate.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableCreatedDate.size();i++)
			{
				String stat=tableCreatedDate.get(i).getText();
				if (!(stat.contains(nm))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public void UploadedBySearch(String nm) throws InterruptedException
	{
		Thread.sleep(2000);
		searchUploadedBy.sendKeys(nm);
		Thread.sleep(2000);
		Search1.click();
		Thread.sleep(2000);
	}
	
	public Boolean UploadedBySearchValidation(String nm) throws InterruptedException
	{
		boolean st = true;
		int count =tableCreatedBy.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableCreatedBy.size();i++)
			{
				String stat=tableCreatedBy.get(i).getText();
				if (!(stat.contains(nm))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public void edit_Doc(String name) throws InterruptedException
	{
		for(int i=0;i<tableDocument1.size();i++)
		{
			String text=tableDocument1.get(i).getText();
			if(text.equals(name))
			{
				tableEdit1.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void view_Doc(String name) throws InterruptedException
	{
		for(int i=0;i<tableDocument1.size();i++)
		{
			String text=tableDocument1.get(i).getText();
			if(text.equals(name))
			{
				tableView.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void delete_Doc(String name) throws InterruptedException
	{
		for(int i=0;i<tableDocument1.size();i++)
		{
			String text=tableDocument1.get(i).getText();
			if(text.equals(name))
			{
				tableDelete1.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void approvals_Doc1(String name) throws InterruptedException
	{
		for(int i=0;i<tableDocument1.size();i++)
		{
			String text=tableDocument1.get(i).getText();
			if(text.equals(name))
			{
				tableApprovals.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void edit1() throws InterruptedException
	{
		Thread.sleep(2000);
		description.clear();
		Thread.sleep(2000);
		description.sendKeys("na");
		Thread.sleep(2000);
		AddFile.click();
		Thread.sleep(2000);
		
	}
	
	public void approvals_Doc2() throws InterruptedException
	{
				Thread.sleep(2000);
				approver1.click();
				Thread.sleep(2000);
				approver2.click();
				Thread.sleep(2000);
				approver3.click();
				Thread.sleep(2000);
				addApprover.click();
				Thread.sleep(2000);
	}
	
	public void deleteApprover() throws InterruptedException
	{
		Thread.sleep(2000);
		deleteApprover.click();
		Thread.sleep(2000);
	}
	
	public void closeApproverWindow() throws InterruptedException
	{
		Thread.sleep(2000);
		closeApproverWindow.click();
		Thread.sleep(2000);
	}
	
	public void Download(String name) throws InterruptedException
	{
		for(int i=0;i<tableDocument1.size();i++)
		{
			String text=tableDocument1.get(i).getText();
			if(text.equals(name))
			{
				tableDownloads.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void FolderCreation(String fol) throws InterruptedException
	{
		Thread.sleep(2000);	
		AddFolder.click();
		FolderName.sendKeys(fol);
		Thread.sleep(2000);	
		FolderAdd.click();
		Thread.sleep(2000);
	}
	
	public void close_Folder() throws InterruptedException
	{
		Thread.sleep(2000);	
		close.click();
		Thread.sleep(2000);	
	}
	
	public void DocumentUpload() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
	    upload.click();
		Thread.sleep(2000);
		WebElement uploadbtn=driver.findElement(By.xpath("//input[@type='file']"));
		uploadbtn.sendKeys("C:\\Users\\lenovo\\Downloads\\New.docx");
		AddFile.click();
	    Thread.sleep(2000);
		/*Robot robot = new Robot();
		StringSelection filepath = new StringSelection("C:\\Users\\lenovo\\Downloads\\EIDSA_STUDY_EIDSA_20230505022527_002.xlsx"); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);*/
	}
	
	public void folderCreation_Negative() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);	
		AddFolder.click();
		Thread.sleep(2000);
		FolderAdd.click();
		Thread.sleep(2000);	
	}
	
	public String Err1()
	{
		elementWait(err1);
		return err1.getText();
	}
	

	
	public static boolean duplicateFolderName() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Folder name already exist"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean duplicateStudyAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Study ID already exists."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	
	public static boolean folderDeletionAlert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this folder?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("This folder contains 1 or more documents, folder with document cannot be deleted"));
			alert.accept();
			Thread.sleep(2000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean documentEdit_Negative_Alert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Please add document description or document"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean approverAdditionAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Approver added successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean approverRemovalAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to remove this approver?"));
			alert1.accept();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("Approver removed successfully"));
			alert.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	
	public void folderCreation_Negative2() throws InterruptedException
	{
		Thread.sleep(2000);	
		AddFolder.click();
		FolderName.sendKeys("02");
		Thread.sleep(2000);	
		FolderAdd.click();
		Thread.sleep(2000);
	}
	
	public void folderDeletion_Negative1() throws InterruptedException
	{
		Thread.sleep(2000);	
		clickOnFolder3.click();
		Thread.sleep(2000);
		delete.click();
		Thread.sleep(2000);
	}
	
	public void deleteFolder() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);	
		clickOnFolder2.click();
		Thread.sleep(2000);
	    delete.click();
	    Thread.sleep(2000);	    
	}
	
	public void editDocument_Negative() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);	
		AddFile.click();
		Thread.sleep(2000);
		
	}
	
	public void folderEdit(String nm) throws InterruptedException
	{
		Thread.sleep(2000);
		clickOnFolder1.click();
		Thread.sleep(2000);
		editFolder1.click();
		Thread.sleep(2000);
		editFolder2.clear();
		Thread.sleep(2000);
		editFolder2.sendKeys(nm);
		Thread.sleep(2000);
		editFolder3.click();
		Thread.sleep(2000);
	}
	
	
}
