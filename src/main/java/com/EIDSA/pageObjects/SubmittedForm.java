package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
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
	
	//Menu
	@FindBy(xpath = "//span[normalize-space()='Items']")
	WebElement items;
	@FindBy(xpath = "//span[normalize-space()='Submitted Forms']")
	WebElement submittedForm;
	
	//Webtable
	@FindBy(xpath="//td[1]//i")
	List<WebElement> view;
	
	@FindBy(xpath="//i[@class='fa fa-eye editicon']")
	WebElement form1;
	
	//Form query
	@FindBy(xpath="(//i[@class='fa fa-question'])[1]")
	WebElement formQuery;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement querySubject;
	@FindBy(xpath="(//textarea[@class='form-control mb-1 my-lg-0'])[1]")
	WebElement queryMessage;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[7]/div/input")
	WebElement role1;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[7]/div/div[2]/ul/li[3]")
	WebElement role2;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[7]/div/span[2]")
	WebElement role3;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[8]/div/input")
	WebElement recipients1;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[8]/div/div[2]/ul/li")
	WebElement recipients2;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[8]/div/span[2]")
	WebElement recipients3;
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submit;
	
	//Form verify
	@FindBy(xpath="//i[@class='fa fa-check']")
	WebElement verify;
	
	//Sign
	@FindBy(xpath="//i[@class='fa fa-pencil']")
	WebElement sign;
	@FindBy(xpath="//input[@type='text']")
	WebElement email;
	@FindBy(xpath="//input[@type='password']")
	WebElement pwd;
	@FindBy(xpath="//button[normalize-space()='Confirm']")
	WebElement confirm;
	
	public void sign(String em,String pw) throws InterruptedException
	{
		Thread.sleep(2000);
		sign.click();
		Thread.sleep(2000);
		email.sendKeys(em);
		Thread.sleep(2000);
		pwd.sendKeys(pw);
		Thread.sleep(2000);
		confirm.click();
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
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(100)");
		Thread.sleep(2000);*/
		submit.click();
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
	
/*	public void clickOnSubmittedForm() throws InterruptedException
	{
		Thread.sleep(2000);
		items.click();
		Thread.sleep(2000);
		submittedForm.click();
		Thread.sleep(2000);
	}*/
	
	public void clickOnSubmittedForm() throws InterruptedException
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
	

}
