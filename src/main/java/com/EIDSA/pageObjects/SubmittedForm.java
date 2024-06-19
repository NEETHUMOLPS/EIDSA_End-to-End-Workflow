package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class SubmittedForm extends AbstractComponent{
	static WebDriver driver;
	public SubmittedForm(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Menu
	@FindBy(xpath = "//span[normalize-space()='Items']")
	WebElement items;
	@FindBy(xpath = "//span[normalize-space()='Submitted Forms']")
	WebElement submittedForm;
	
	//Webtable	
	@FindBy(xpath="//tbody/tr[1]/td[8]/i[1]")
	WebElement form1;
	@FindBy(xpath="//tbody/tr[2]/td[8]/i[1]")
	WebElement form2;
	@FindBy(xpath="//tbody/tr[3]/td[8]/i[1]")
	WebElement form3;
	
	//Form query
	@FindBy(xpath="(//i[@class='fa fa-question'])[1]")
	WebElement formQuery;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement querySubject;
	@FindBy(xpath="(//textarea[@class='form-control mb-1 my-lg-0'])[1]")
	WebElement queryMessage;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[7]/div/input")
	WebElement role1;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[7]/div/div[2]/ul/li[1]")
	WebElement role2;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[7]/div/span[2]")
	WebElement role3;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[8]/div/input")
	WebElement recipients1;
	@FindBy(xpath="//li[normalize-space()='sujis@yopmail.com']")
	WebElement recipients2;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[8]/div/span[2]")
	WebElement recipients3;
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submit;
	
	//Archive
	@FindBy(xpath="//i[@class='fa fa-archive']")
	WebElement archive;
	
	//Queries
	@FindBy(xpath="//button[@class='btn btn-danger float-right mr-1 tooltipvisibility']//img")
	WebElement openQuery;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[6]/button[1]/img[1]")
	WebElement closedQuery;
	
	@FindBy(xpath="//i[@class='fa fa-eye']")
	WebElement queryView;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/button[1]/img[1]")
	WebElement close;
	
	//Form verify
	@FindBy(xpath="//i[@class='fa fa-check']")
	WebElement verify;
	
	//Sign
	@FindBy(xpath="//i[@class='fa fa-pencil']")
	WebElement sign;
	@FindBy(xpath = "//u[normalize-space()='unsign']")
	WebElement unsign;
	@FindBy(xpath="//input[@type='text']")
	WebElement email;
	@FindBy(xpath="//input[@type='password']")
	WebElement pwd;
	@FindBy(xpath="//button[normalize-space()='Confirm']")
	WebElement confirm;
	
	//Upload document
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[8]/button[1]/img[1]")
	WebElement uploadDocument;
	@FindBy(xpath="//input[@id='InPutFile']")
	WebElement chooseFile;
	@FindBy(xpath="//button[normalize-space()='Upload']")
	WebElement upload;
	
	//View documents
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[9]/button[1]/img[1]")
	WebElement viewDocument;
	@FindBy(xpath="//tbody/tr[1]/td[3]/i[1]")
	WebElement view;
	@FindBy(xpath="//tbody/tr[1]/td[4]/i[1]")
	WebElement download;
	@FindBy(xpath="//tbody/tr[1]/td[5]/i[1]")
	WebElement delete;
	
	
	//Download PDF
	@FindBy(xpath="//i[@class='fa fa-file-pdf-o']")
	WebElement downloadPdf;
	
	//Form save
	@FindBy(xpath="(//i[@class='fa fa-floppy-o'])[1]")
	WebElement formSave;
	
	//Form verify
	@FindBy(xpath="(//i[@class='fa fa-check'])[1]")
	WebElement formVerify;
	
	//Page query
	@FindBy(xpath="(//i[@class='fa fa-question'])[2]")
	WebElement pageQuery;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement querySubject1a;
	@FindBy(xpath="(//textarea[@class='form-control mb-1 my-lg-0'])[1]")
	WebElement queryMessage1a;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[8]/div")
	WebElement role1a;
	@FindBy(xpath="//li[normalize-space()='Administrator']")
	WebElement role1b;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[8]/div/span[2]")
	WebElement role1c;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[9]/div")
	WebElement recipients1a;
	@FindBy(xpath="//li[normalize-space()='sujis@yopmail.com']")
	WebElement recipients1b;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[9]/div/span[2]")
	WebElement recipients1c;
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submit1a;
	
	//Data verification
	@FindBy(xpath="//button[normalize-space()='Validate']")
	WebElement validate;
	@FindBy(xpath="//button[normalize-space()='Incorrect']")
	WebElement incorrect;
	
	//Filed query
	@FindBy(xpath="//button[@type='button']//i[@class='fa fa-question']")
	WebElement filedQuery;
	
	//Page save
	@FindBy(xpath="//div[@class='col-md-4 mx-lg-0']//i[@class='fa fa-floppy-o']")
	WebElement pageSave;
	
	//Data filed
	@FindBy(xpath="(//input[contains(@type,'textbox')])[2]")
	WebElement field;
	
	//Field query
	@FindBy(xpath="//button[contains(@type,'button')]//i[contains(@class,'fa fa-question')]")
	WebElement fieldQuery;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement querySubject2a;
	@FindBy(xpath="(//textarea[@class='form-control mb-1 my-lg-0'])[1]")
	WebElement queryMessage2a;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[8]/div")
	WebElement role2a;
	@FindBy(xpath="//li[normalize-space()='Administrator']")
	WebElement role2b;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[8]/div/span[2]")
	WebElement role2c;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[9]/div")
	WebElement recipients2a;
	@FindBy(xpath="//li[normalize-space()='sujis@yopmail.com']")
	WebElement recipients2b;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[9]/div/span[2]")
	WebElement recipients2c;
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submit2a;
	
		
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	public void downloadPdf() throws InterruptedException
	{
		Thread.sleep(2000);
		downloadPdf.click();
		Thread.sleep(2000);
	}
	
	public void archive() throws InterruptedException
	{
		Thread.sleep(2000);
		archive.click();
		Thread.sleep(2000);
	}
	
	public void openQuery() throws InterruptedException
	{
		Thread.sleep(2000);
		openQuery.click();
		Thread.sleep(2000);
		queryView.click();
		Thread.sleep(2000);
	}
	
	public void DataVerification() throws InterruptedException
	{
		Thread.sleep(2000);
		field.click();
		Thread.sleep(2000);
		validate.click();
		Thread.sleep(2000);
	}
	
	public void clickOnFiled() throws InterruptedException
	{
		Thread.sleep(2000);
		field.click();
		Thread.sleep(2000);
	}
	
	public void PageSave() throws InterruptedException
	{
		Thread.sleep(2000);
		pageSave.click();
		Thread.sleep(2000);
	}
	
	public void sign(String em,String pwd1) throws InterruptedException 
	{
		Thread.sleep(2000);
		sign.click();
		Thread.sleep(2000);
		email.sendKeys(em);
		Thread.sleep(2000);
		pwd.sendKeys(pwd1);
		Thread.sleep(2000);
		confirm.click();
		Thread.sleep(2000);
	}
	
	public void unsign(String em,String pwd1) throws InterruptedException 
	{
		Thread.sleep(2000);
		unsign.click();
		Thread.sleep(2000);
		email.sendKeys(em);
		Thread.sleep(2000);
		pwd.sendKeys(pwd1);
		Thread.sleep(2000);
		confirm.click();
		Thread.sleep(2000);
	}
	
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		close.click();
		Thread.sleep(2000);
	}
	
	public void closedQuery() throws InterruptedException
	{
		Thread.sleep(2000);
		closedQuery.click();
		Thread.sleep(2000);
		queryView.click();
		Thread.sleep(2000);
	}
	
	public void selectForm1() throws InterruptedException
	{
		Thread.sleep(2000);
		form1.click();
		Thread.sleep(2000);
	}
	
	public void selectForm2() throws InterruptedException
	{
		Thread.sleep(2000);
		form2.click();
		Thread.sleep(2000);
	}
	
	public void selectForm3() throws InterruptedException
	{
		Thread.sleep(2000);
		form3.click();
		Thread.sleep(2000);
	}
	
	public void uploadDocument() throws InterruptedException
	{
		Thread.sleep(2000);
		uploadDocument.click();
		Thread.sleep(2000);
		WebElement uploadbtn=driver.findElement(By.xpath("//input[@id='InPutFile']"));
		uploadbtn.sendKeys("C:\\Users\\NeethumolPS\\eclipse-workspace\\EndToEnd_EIDSA\\testData\\UAT EIDSA - E-Consent(4).pdf");
		upload.click();
	    Thread.sleep(2000);
	}
	
	
	public void formQuery(String sub,String msg) throws InterruptedException
	{
		Thread.sleep(2000);
		formQuery.click();
		Thread.sleep(2000);
		querySubject.sendKeys(sub);
		Thread.sleep(2000);
		queryMessage.sendKeys(msg);
		Thread.sleep(2000);
		role1.click();
		Thread.sleep(2000);
		role2.click();
		Thread.sleep(2000);
		role3.click();
		Thread.sleep(2000);
		recipients1.click();
		Thread.sleep(2000);
		recipients2.click();
		Thread.sleep(2000);
		recipients3.click();
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);
	}
	
	public void fieldQuery(String sub,String msg) throws InterruptedException
	{
		Thread.sleep(2000);
		fieldQuery.click();
		Thread.sleep(2000);
		querySubject2a.sendKeys(sub);
		Thread.sleep(2000);
		queryMessage2a.sendKeys(msg);
		Thread.sleep(2000);
		role2a.click();
		Thread.sleep(2000);
		role2b.click();
		Thread.sleep(2000);
		role2c.click();
		Thread.sleep(2000);
		recipients2a.click();
		Thread.sleep(2000);
		recipients2b.click();
		Thread.sleep(2000);
		recipients2c.click();
		Thread.sleep(2000);
		submit2a.click();
		Thread.sleep(2000);
	}
	
	public void pageQuery(String sub,String msg) throws InterruptedException
	{
		Thread.sleep(2000);
		pageQuery.click();
		Thread.sleep(2000);
		querySubject1a.sendKeys(sub);
		Thread.sleep(2000);
		queryMessage1a.sendKeys(msg);
		Thread.sleep(2000);
		role1a.click();
		Thread.sleep(2000);
		role1b.click();
		Thread.sleep(2000);
		role1c.click();
		Thread.sleep(2000);
		recipients1a.click();
		Thread.sleep(2000);
		recipients1b.click();
		Thread.sleep(2000);
		recipients1c.click();
		Thread.sleep(2000);
		submit1a.click();
		Thread.sleep(2000);
	}
	
	public static boolean queryGenerationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Query generated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
			
			public static boolean verifyFormAlert() throws InterruptedException
			{
				try
				{
					WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait1.until(ExpectedConditions.alertIsPresent());
					Alert alert1 = driver.switchTo().alert();
					Assert.assertTrue(alert1.getText().contains("Status of some of the fields are not validated or incorrect. Do you want to verify this form?"));
					alert1.accept();
					Thread.sleep(2000);
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.alertIsPresent());
					Alert alert = driver.switchTo().alert();
					Assert.assertTrue(alert.getText().contains("Form verified successfully"));
					alert.accept();
					return true;
				} catch (NoAlertPresentException e) {
					return false;
				}
				
			}
	
	public void clickOnSubmittedForm() throws InterruptedException
	{
		Thread.sleep(2000);
		items.click();
		Thread.sleep(2000);
		submittedForm.click();
		Thread.sleep(2000);
	}
	
	public void clickOnSubmittedForm1() throws InterruptedException
	{
		Thread.sleep(2000);
		submittedForm.click();
		Thread.sleep(2000);
	}
	
		
	public void viewForm() throws InterruptedException
	{
		Thread.sleep(2000);
		form1.click();
		Thread.sleep(2000);
	}
	
	public void verifyForm() throws InterruptedException
	{
		Thread.sleep(2000);
		verify.click();
		Thread.sleep(2000);
	}
	
	public String Alert() throws InterruptedException
	{
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		alert.accept();
		return msg;	
	}
	
	public void viewDocuments() throws InterruptedException
	{
		Thread.sleep(2000);
		viewDocument.click();
		Thread.sleep(2000);
		view.click();
		Thread.sleep(2000);
	}
	
	public void viewDocument() throws InterruptedException
	{
		Thread.sleep(2000);
		viewDocument.click();
		Thread.sleep(2000);
	}
	
	public void download() throws InterruptedException
	{
		Thread.sleep(2000);
		download.click();
		Thread.sleep(2000);
	}
	
	public void delete() throws InterruptedException
	{
		Thread.sleep(2000);
		delete.click();
		Thread.sleep(2000);
	}
	
	public static boolean deleteAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this document?"));
			alert1.accept();
			Thread.sleep(5000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Document deleted successfully"));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean archiveAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to archive this form?"));
			alert1.accept();
			Thread.sleep(5000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Form archived successfully"));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	

}
