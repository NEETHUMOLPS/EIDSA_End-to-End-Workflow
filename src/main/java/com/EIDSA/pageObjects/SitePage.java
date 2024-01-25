package com.EIDSA.pageObjects;
import java.awt.AWTException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;

public class SitePage extends AbstractComponent{
	
	static WebDriver driver;
	public SitePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Site menu
	@FindBy(xpath = "//span[normalize-space()='Items']")
	WebElement items;
	@FindBy(xpath = "//span[normalize-space()='Sites']")
	WebElement site;
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Site creation
	@FindBy(xpath = "//img[@alt='Create site']")
	WebElement siteCreate;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement siteCode;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement siteName;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement siteContactName;
	@FindBy(xpath="//input[@type='email']")
	WebElement siteContactEmail;
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement noOfSubject;
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement studyNotes;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement active;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement clear;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	
	//Web table
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[1]")
	List<WebElement> SiteCode;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[2]")
	List<WebElement> tableSiteName;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[3]")
	List<WebElement> tableStatus;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[8]//i")
	List<WebElement> tablesiteEdit;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[9]//i")
	List<WebElement> tableAction;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[10]//i")
	List<WebElement> tableAuditTrail;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[11]//i")
	List<WebElement> tableDelete;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[12]//i")
	List<WebElement> tableDocument;
	
	@FindBy(xpath="//img[@alt='Open site status']")
	WebElement Open;
	@FindBy(xpath="//img[@alt='Completed site status']")
	WebElement Complete;
	@FindBy(xpath="(//img[@title='Close'])[1]")
	WebElement Terminate;

	//Search
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement siteCodeSearch;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement siteNameSearch;
	@FindBy(xpath="//select[@class='form-select my-md-2 my-lg-0']")
	WebElement siteStatusSearch;
	@FindBy(xpath="//span[contains(text(),'Search')]")
	WebElement siteSearch;
	
	@FindBy(xpath="(//li[@class='PaginationControl'])[3]")
	WebElement next;
	
	//Error
	@FindBy(xpath="//span[contains(text(),'Please enter site code')]")
	WebElement siteCodeError;
	@FindBy(xpath="//span[contains(text(),'Please enter a valid email')]")
	WebElement emailIdError;
	
	//Audit trail
	@FindBy(xpath="(//strong[contains(text(),'Neethu P S')])[1]")
	WebElement auditTrail1;
	@FindBy(xpath="//i[@class='fa fa-times']")
	WebElement auditTrail2;
	
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
	List<WebElement> tableEdit;
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
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}

	public String siteCodeErrorMsg()
	{
		elementWait(siteCodeError);
		return siteCodeError.getText();
	}
	public String emaileErrorMsg()
	{
		elementWait(emailIdError);
		return emailIdError.getText();
	}
	
	public void clickCreateSite() throws InterruptedException
	{
		Thread.sleep(2000);
		siteCreate.click();
		Thread.sleep(2000);
	}
	
	public void duplicateSite(String sitecode) throws InterruptedException
	{
		Thread.sleep(2000);
		siteCode.sendKeys(sitecode);
		Thread.sleep(2000);
	}
	
	public void invalidEmail(String email) throws InterruptedException
	{
		Thread.sleep(2000);
		siteContactEmail.sendKeys(email);
		Thread.sleep(2000);
	}
	
	public void clickSave() throws InterruptedException
	{
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}
	
	public void clickSite() throws InterruptedException
	{
		Thread.sleep(2000);
		items.click();
		Thread.sleep(2000);
		site.click();
		Thread.sleep(2000);
	}
	
	public void createSite(String sitecode,String sitename) throws InterruptedException
	{
		Thread.sleep(2000);
		siteCreate.click();
		Thread.sleep(2000);
		siteCode.sendKeys(sitecode);
		Thread.sleep(2000);
		siteName.sendKeys(sitename);
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}
	
	public boolean verifySite(String sitecode) throws InterruptedException 
	{
		boolean site=false;
		int count = SiteCode.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  SiteCode.get(i).getText();
			if(text.contains(sitecode))
			{
				site=true;
				break;
			}
		}
		return site;
	}
	
	public static boolean duplicateAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Site code already exists"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public void editSiteIcon(String sitecode) throws InterruptedException
	{
		for(int i=0;i<SiteCode.size();i++)
		{
			String text=SiteCode.get(i).getText();
			if(text.equals(sitecode))
			{
				tablesiteEdit.get(i).click();
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
	public void selDoc(String sitecode) throws InterruptedException
	{
		for(int i=0;i<SiteCode.size();i++)
		{
			String text=SiteCode.get(i).getText();
			if(text.equals(sitecode))
			{
				tableDocument.get(i).click();
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
	public void editSite(String newSiteName) throws InterruptedException
	{
		Thread.sleep(2000);
		siteName.clear();
		Thread.sleep(2000);
		siteName.sendKeys(newSiteName);
		Thread.sleep(2000);
		save.click();	
		Thread.sleep(2000);
	}
	
	public void auditTrail1(String sid) throws InterruptedException
	{
		int count=SiteCode.size();
		for(int i=0;i<count;i++)
		{
			String studylist=SiteCode.get(i).getText();
			if(studylist.contains(sid))
			{
				tableAuditTrail.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void auditTrail2() throws InterruptedException
	{
		Thread.sleep(2000);
		auditTrail1.click();
		Thread.sleep(2000);
		auditTrail2.click();
		Thread.sleep(2000);
		auditTrail2.click();	
		Thread.sleep(2000);
	}
	
	public static boolean siteAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Site saved successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean editAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Site updated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public void delSiteIcon(String sid) throws InterruptedException
	{
		int count=SiteCode.size();
		for(int i=0;i<count;i++)
		{
			String studylist=SiteCode.get(i).getText();
			if(studylist.contains(sid))
			{
				tableDelete.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	public static boolean deleteAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this site?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("Deleted Successfully."));
			alert.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean deleteSiteWithPatientsAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this site?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("This site contains 1 or more patients, sites with patients cannot be deleted"));
			alert2.accept();
			Thread.sleep(2000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public void searchSiteCode(String sitecodesearch) throws InterruptedException
	{
		Thread.sleep(2000);
		siteCodeSearch.sendKeys(sitecodesearch);
		Thread.sleep(2000);
		siteSearch.click();
		Thread.sleep(2000);
	}
	
	public void searchSiteName(String sitenamesearch) throws InterruptedException
	{
		Thread.sleep(2000);
		siteNameSearch.sendKeys(sitenamesearch);
		Thread.sleep(2000);
		siteSearch.click();
		Thread.sleep(2000);
	}
	public void searchSiteStatus(String sitestatus) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(siteStatusSearch);
		sel.selectByVisibleText(sitestatus);
		Thread.sleep(2000);
		siteSearch.click();
		Thread.sleep(2000);
	}
	
	public Boolean siteCodeSearchValidation(String sitecode) throws InterruptedException
	{
		boolean st = true;
		int count =SiteCode.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<SiteCode.size();i++)
			{
				String scode=SiteCode.get(i).getText();
				if (!(scode.contains(sitecode))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	public Boolean siteNameSearchValidation(String sitename) throws InterruptedException
	{
		boolean st = true;
		int count =tableSiteName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableSiteName.size();i++)
			{
				String scode=tableSiteName.get(i).getText();
				if (!(scode.contains(sitename))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	public Boolean siteStatusSearchValidation(String sitestat) throws InterruptedException
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
				if (!(scode.contains(sitestat))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	public void siteActionOpen(String sid) throws InterruptedException
	{
		int count=SiteCode.size();
		for(int i=0;i<count;i++)
		{
			String sitelist=SiteCode.get(i).getText();
			if(sitelist.contains(sid))
			{
				tableAction.get(i).click();
				Thread.sleep(2000);
				Open.click();
				Thread.sleep(2000);
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
				wait1.until(ExpectedConditions.alertIsPresent());
				Alert alert1 = driver.switchTo().alert();
				Assert.assertTrue(alert1.getText().contains("Are you sure you want to open this site?"));
				alert1.accept();
				Thread.sleep(2000);
				break;
			}
		}
	}
	public void siteActionTerminate(String sid) throws InterruptedException
	{
		Thread.sleep(1000);
		int count=SiteCode.size();
		for(int i=0;i<count;i++)
		{
			String sitelist=SiteCode.get(i).getText();
			if(sitelist.contains(sid))
			{
				tableAction.get(i).click();
				Thread.sleep(2000);
				Terminate.click();
				Thread.sleep(2000);
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
				wait1.until(ExpectedConditions.alertIsPresent());
				Alert alert1 = driver.switchTo().alert();
				Assert.assertTrue(alert1.getText().contains("Are you sure you want to close this site?"));
				alert1.accept();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void siteActionComplete(String sid) throws InterruptedException
	{
		int count=SiteCode.size();
		for(int i=0;i<count;i++)
		{
			String sitelist=SiteCode.get(i).getText();
			if(sitelist.contains(sid))
			{
				tableAction.get(i).click();
				Thread.sleep(2000);
				Complete.click();
				Thread.sleep(2000);
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
				wait1.until(ExpectedConditions.alertIsPresent());
				Alert alert1 = driver.switchTo().alert();
				Assert.assertTrue(alert1.getText().contains("Are you sure you want to complete this site?"));
				alert1.accept();
				Thread.sleep(2000);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
				wait.until(ExpectedConditions.alertIsPresent());
				Alert alert = driver.switchTo().alert();
				Assert.assertTrue(alert.getText().contains("Site completed successfully."));
				alert.accept();
				
				
				break;
			}
		}
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
				tableEdit.get(i).click();
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
