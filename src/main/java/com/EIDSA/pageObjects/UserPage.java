package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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

public class UserPage extends AbstractComponent{
	
	static WebDriver driver;
	public UserPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Users menu
	@FindBy(xpath="(//span[contains(text(),'Users')])[2]")
	@CacheLookup
	WebElement User;
	
	//Create user
	@FindBy(xpath="//img[@alt='Create user']")
	WebElement createUser;
	@FindBy(xpath="//input[@placeholder='Enter your first name']")
	WebElement FirstName;
	@FindBy(xpath="//input[@placeholder='Enter your last name']")
	WebElement LastName;
	@FindBy(xpath="//input[@placeholder='Enter your user name']")
	WebElement UserName;
	@FindBy(xpath="//input[@placeholder='Enter your primary email id']")
	WebElement PrimaryEmail;
	@FindBy(xpath="//input[@placeholder='Enter your secondary email id']")
	WebElement SecondaryEmail;
	@FindBy(xpath="//select[@placeholder='Select user type']")
	WebElement UserType;
	@FindBy(xpath="//select[@placeholder='Select roles']")
	WebElement Role;
	@FindBy(xpath="(//select[@name='account'])[3]")
	WebElement Country;
	@FindBy(xpath="//input[@type='date']")
	WebElement DOB;
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement PhoneNumber;
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement Address1;
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement Address2;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement Active;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement Lock;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement Clear;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement Save;
	
	//Search
	@FindBy(xpath="//input[@type='email']")
	WebElement emailOrName;
	@FindBy(xpath="//select[@placeholder='Search']")
	WebElement searchRole;
	@FindBy(xpath="//span[@type='button']")
	WebElement search;
	
	//Web table
	@FindBy(xpath="//td[1]")
	List<WebElement> TableName;
	@FindBy(xpath="//td[8]")
	List<WebElement> TablePrivilege;
	@FindBy(xpath="//td[2]")
	List<WebElement> TableEmail;
	@FindBy(xpath="//td[3]")
	List<WebElement> TableRole;
	@FindBy(xpath="//td[4]")
	List<WebElement> TableActive;
	@FindBy(xpath="//td[8]")
	List<WebElement> TableUserPrivilege;
	@FindBy(xpath="//td[9]")
	List<WebElement> TableEdit;
	@FindBy(xpath="//td[10]")
	List<WebElement> TableAuditTrail;
	@FindBy(xpath="//td[11]")
	List<WebElement> TableDelete;
	
	//Set privilege
	@FindBy(xpath="//button[normalize-space()='Set privilege']")
	WebElement setPrivilege;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div/div")
	WebElement selectStudy1;
	@FindBy(xpath="//span[normalize-space()='IDS04']")
	WebElement selectStudy2;
	@FindBy(xpath="//span[normalize-space()='001']")
	WebElement selectStudy3;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div/div/span[2]")
	WebElement selectStudy4;
	
	//Audit trail
	@FindBy(xpath="//span[@class='badge badge-primary']")
	WebElement update;
	@FindBy(xpath="(//i[@class='fa fa-times'])[2]")
	WebElement closeAuditTrail;
	@FindBy(xpath="//i[@class='fa fa-times']")
	WebElement closeUpdate;
	
	public void clickUser() throws InterruptedException
	{		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		elementWait(User);
		User.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
	}
	
	public void auditTrail2() throws InterruptedException
	{		
		Thread.sleep(2000);
		update.click();
		Thread.sleep(2000);
		closeAuditTrail.click();
		Thread.sleep(2000);
		closeUpdate.click();
		Thread.sleep(2000);
	}
	
	public void createUser(String fm,String lm,String un,String pe,String ut,String rl) throws InterruptedException
	{	
		Thread.sleep(2000);
		createUser.click();
		Thread.sleep(2000);
		FirstName.sendKeys(fm);
		Thread.sleep(2000);
		LastName.sendKeys(lm);
		Thread.sleep(2000);
		UserName.sendKeys(un);
		Thread.sleep(2000);
		PrimaryEmail.sendKeys(pe);
		Thread.sleep(2000);
		Select os = new Select(UserType);
		os.selectByVisibleText(ut);
		Thread.sleep(2000);
		Select os1 = new Select(Role);
		os1.selectByVisibleText(rl);
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
	}
	
	public void createUser_Negative() throws InterruptedException
	{	
		Thread.sleep(2000);
		createUser.click();
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
	}
	
	public void searchEmailOrName(String en) throws InterruptedException
	{		
		Thread.sleep(2000);
		emailOrName.sendKeys(en);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	public void clearEmailOrName() throws InterruptedException
	{		
		Thread.sleep(2000);
		emailOrName.clear();
		Thread.sleep(2000);
		/*search.click();
		Thread.sleep(2000);*/
	}
	
	public void searchRole(String rl) throws InterruptedException
	{		
		Thread.sleep(2000);
		searchRole.sendKeys(rl);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	public void clearRole() throws InterruptedException
	{		
		Thread.sleep(2000);
		searchRole.clear();
		Thread.sleep(2000);
		/*search.click();
		Thread.sleep(2000);*/
	}
	
	
	public void edit1(String email) throws InterruptedException
	{
		for(int i=0;i<TableEmail.size();i++)
		{
			String text=TableEmail.get(i).getText();
			if(text.equals(email))
			{
				TableEdit.get(i).click();
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
	public void edit2(String ed) throws InterruptedException
	{		
		Thread.sleep(2000);
		PhoneNumber.sendKeys(ed);
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
	}
	
	public void privilege2() throws InterruptedException
	{		
		Thread.sleep(2000);
		selectStudy1.click();
		Thread.sleep(2000);
		selectStudy2.click();
		Thread.sleep(2000);
		selectStudy4.click();
		Thread.sleep(2000);
		setPrivilege.click();
		Thread.sleep(2000);
	}
	
	public void privilege1(String email) throws InterruptedException
	{
		for(int i=0;i<TableEmail.size();i++)
		{
			String text=TableEmail.get(i).getText();
			if(text.equals(email))
			{
				TablePrivilege.get(i).click();
				break;	
			}
		}
	}
	
	public void delete(String email) throws InterruptedException
	{
		for(int i=0;i<TableEmail.size();i++)
		{
			String text=TableEmail.get(i).getText();
			if(text.equals(email))
			{
				TableDelete.get(i).click();
				break;	
			}
		}
	}
	
	public void auditTrail1(String email) throws InterruptedException
	{
		for(int i=0;i<TableEmail.size();i++)
		{
			String text=TableEmail.get(i).getText();
			if(text.equals(email))
			{
				TableAuditTrail.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public Boolean emailSearchValidation(String email) throws InterruptedException
	{
		boolean st = true;
		int count =TableEmail.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<TableEmail.size();i++)
			{
				String stat=TableEmail.get(i).getText();
				if (!(stat.contains(email))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean nameSearchValidation(String name) throws InterruptedException
	{
		boolean st = true;
		int count =TableName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<TableName.size();i++)
			{
				String stat=TableName.get(i).getText();
				if (!(stat.contains(name))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	
	public Boolean RoleValidation(String rl) throws InterruptedException
	{
		boolean st = true;
		int count =TableRole.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<TableRole.size();i++)
			{
				String stat=TableRole.get(i).getText();
				if (!(stat.contains(rl))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public static boolean duplicateAlert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("User already exists with same email id!"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean duplicateAlert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Username already taken !"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean privilegeAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("User study privilege saved successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean privilegeAlert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("User study privilege updated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean userCreationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("User created successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean userUpdationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("User updated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean userDeletionAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("Are you sure you want to delete this user?"));
			alert.accept();
			Thread.sleep(2000);
			/*WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("User deleted successfully"));
			alert1.accept();*/
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	
}
