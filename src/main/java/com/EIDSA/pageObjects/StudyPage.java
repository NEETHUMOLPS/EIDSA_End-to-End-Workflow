package com.EIDSA.pageObjects;

import java.time.Duration;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import com.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;

public class StudyPage extends AbstractComponent{
	
	static WebDriver driver;
	public StudyPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Menu
	@FindBy(xpath="//span[normalize-space()='Study List']")
	WebElement Study;
	
	//Study creation
	@FindBy(xpath="//img[@alt='Create study']")
	WebElement createStudy;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement studyID;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement studyName;
	@FindBy(xpath="//input[@type='email']")
	WebElement sponsor;
	@FindBy(xpath="//select[@class='form-select']")
	WebElement status;
	@FindBy(xpath="//input[@type='test']")
	WebElement studyNotes;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement preVisit;
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement postVisit;
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement numberOfSites;
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement numberOfSubject;
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement duration;
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement active;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement clickClear;
	
	//Web table
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[1]")
	List<WebElement> studyid;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[2]")
	List<WebElement> studynames;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[3]")
	List<WebElement> studyStatus;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[9]//i")
	List<WebElement> visiticon;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[10]//i")
	List<WebElement> activeCheckbox;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[11]/i")
	List<WebElement> studyEdit;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[13]/i")
	List<WebElement> studyDelete;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[12]/i")
	List<WebElement> audit;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[14]/i")
	List<WebElement> documentIcon;
	
	//Error
	@FindBy(xpath="//label[contains(text(),'ID')]//following-sibling::span[@class='errormsg']")
	WebElement studyIdErr;
	@FindBy(xpath="//label[contains(text(),'Name')]//following-sibling::span[@class='errormsg']")
	WebElement studyNameErr;
	
	//Search
	@FindBy(xpath="//label[contains(text(),'ID')]//following-sibling::input[1]")
	WebElement studyidsearch;
	@FindBy(xpath="//label[contains(text(),'Status')]//following-sibling::select")
	WebElement studystatusSearch;
	@FindBy(xpath="//span[@type='button']")
	WebElement studySearch;
	
	//Audit trail
	@FindBy(xpath="//strong[normalize-space()='Neethu P S']")
	WebElement auditTrail1;
	@FindBy(xpath="//div[@class='audit__history__modal__title d-flex justify-content-between py-2 px-3']//i[@class='fa fa-times']")
	WebElement auditTrail2;
	@FindBy(xpath="//i[@class='fa fa-times']")
	WebElement auditTrail3;
	
	@FindBy(xpath="(//li[@class='PaginationControl'])[3]")
	WebElement next;
	
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
	List<WebElement> tableDocument;
	@FindBy(xpath="//td[3]")
	List<WebElement> tableCreatedBy;
	@FindBy(xpath="//td[4]")
	List<WebElement> tableCreatedDate;
	@FindBy(xpath="//td[5]")
	List<WebElement> tableEdit;
	@FindBy(xpath="//td[6]//i")
	List<WebElement> tableDelete;
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
	
	
	public void clickCreateSudy_Negative1() throws InterruptedException
	{
		Thread.sleep(2000);
		createStudy.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		SoftAssert softAssert = new SoftAssert();
		String ActualErrorMEssage1 = driver.findElement(By.xpath("//span[contains(text(),'Please enter a study ID')]")).getText();
        Thread.sleep(2000);	
        String ActualErrorMEssage2 = driver.findElement(By.xpath("//span[contains(text(),'Please enter a study name')]")).getText();
        Thread.sleep(2000);	
        softAssert.assertEquals(ActualErrorMEssage1, "Please enter a study ID");
        softAssert.assertEquals(ActualErrorMEssage2, "Please enter a study name");
        softAssert.assertAll();
	}
		
	public void clickStudy() throws InterruptedException
	{
		Thread.sleep(2000);
		Study.click();
		Thread.sleep(2000);
	}
	
	
	public void createStudy(String studId,String studName) throws InterruptedException
	{
		
		Thread.sleep(2000);
		createStudy.click();
		Thread.sleep(2000);
		studyID.sendKeys(studId);
		Thread.sleep(2000);
		studyName.sendKeys(studName);
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}
	
	public void createStudy_Negative(String studId,String studName) throws InterruptedException
	{
		Thread.sleep(2000);
		createStudy.click();
		Thread.sleep(2000);
		studyID.sendKeys(studId);
		Thread.sleep(2000);
		studyName.sendKeys(studName);
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}


	
	public boolean verifyStudy(String studId) throws InterruptedException 
	{
		boolean study=false;
		int count = studyid.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  studyid.get(i).getText();
			if(text.contains(studId))
			{
				study=true;
				break;
			}
		}
		return study;
	}
	
	public String studyIdErrorMsg()
	{
		elementWait(studyIdErr);
		return studyIdErr.getText();
	}
	public String studyNameErrorMsg()
	{
		elementWait(studyNameErr);
		return studyNameErr.getText();
	}
	public static boolean duplicateAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Study ID already exists."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public void visitIcon(String studId) throws InterruptedException
	{

		int count = studyid.size();
		for(int i=0;i<count;i++)
		{

			String text =  studyid.get(i).getText();
			if(text.contains(studId))
			{
				visiticon.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void editStudyIcon(String nstudyid) throws InterruptedException
	{
		for(int i=0;i<studyid.size();i++)
		{
			String text=studyid.get(i).getText();
			if(text.equals(nstudyid))
			{
				studyEdit.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void auditTrail1(String sid) throws InterruptedException
	{
		int count=studyid.size();
		for(int i=0;i<count;i++)
		{
			String studylist=studyid.get(i).getText();
			if(studylist.contains(sid))
			{
				audit.get(i).click();
				Thread.sleep(2000);
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
		auditTrail3.click();	
		Thread.sleep(2000);
	}
	
	public void editStudy(String notes) throws InterruptedException
	{
		Thread.sleep(2000);
		studyNotes.clear();
		Thread.sleep(2000);
		studyNotes.sendKeys(notes);
		Thread.sleep(2000);
		save.click();	
		Thread.sleep(2000);
	}
	
	public static boolean studyAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Study created successfully."));
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
			Assert.assertTrue(alert1.getText().contains("Study updated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public void delStudyIcon(String sid) throws InterruptedException
	{
		int count=studyid.size();
		for(int i=0;i<count;i++)
		{
			String studylist=studyid.get(i).getText();
			System.out.println(studylist+i);
			if(studylist.contains(sid))
			{
				System.out.println(studyDelete.get(i));
				studyDelete.get(i).click();
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
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this study?"));
			alert1.accept();
			Thread.sleep(1000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Deleted successfully."));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}

	public void searchStudyId(String studysearch) throws InterruptedException
	{
		Thread.sleep(2000);
		studyidsearch.sendKeys(studysearch);
		Thread.sleep(2000);
		studySearch.click();
		Thread.sleep(2000);
	}
	public void searchStudyStatus(String studystatus) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(studystatusSearch);
		sel.selectByVisibleText(studystatus);
		Thread.sleep(2000);
		studySearch.click();
		Thread.sleep(2000);
	}

	public Boolean studySearchValidation(String search) throws InterruptedException
	{
		Boolean present=true;
		int count=studyid.size();
		if(count<1)
		{ 
			present=false;
		}
		else
		{
			for(int i=0;i<studyid.size();i++)
			{
				String name=studynames.get(i).getText();
				String id=studyid.get(i).getText();
				if (!(id.contains(search)||(name.contains(search)))) 
				{
					System.out.println(id);
					present = false;
					break;
				}
			}
			if((present==true)&&(next.isDisplayed()))
			{
				next.click();
			}
		}
		return present;
	}
	public Boolean studyStatusValidation(String status) throws InterruptedException
	{
		boolean st = true;
		int count =studyStatus.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<studyStatus.size();i++)
			{
				String stat=studyStatus.get(i).getText();
				if (!(stat.contains(status))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
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
		int count =tableDocument.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableDocument.size();i++)
			{
				String stat=tableDocument.get(i).getText();
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
		for(int i=0;i<tableDocument.size();i++)
		{
			String text=tableDocument.get(i).getText();
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
		for(int i=0;i<tableDocument.size();i++)
		{
			String text=tableDocument.get(i).getText();
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
		for(int i=0;i<tableDocument.size();i++)
		{
			String text=tableDocument.get(i).getText();
			if(text.equals(name))
			{
				tableDelete.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void approvals_Doc1(String name) throws InterruptedException
	{
		for(int i=0;i<tableDocument.size();i++)
		{
			String text=tableDocument.get(i).getText();
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
		for(int i=0;i<tableDocument.size();i++)
		{
			String text=tableDocument.get(i).getText();
			if(text.equals(name))
			{
				tableDownloads.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void selDoc(String id) throws InterruptedException
	{
		for(int i=0;i<studyid.size();i++)
		{
			String text=studyid.get(i).getText();
			if(text.equals(id))
			{
				documentIcon.get(i).click();
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