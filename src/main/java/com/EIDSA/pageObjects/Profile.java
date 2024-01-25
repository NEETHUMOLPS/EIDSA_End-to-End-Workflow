package com.EIDSA.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class Profile extends AbstractComponent{
	static WebDriver driver;
	public Profile(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Select Profile
	@FindBy(xpath = "//img[@alt='User Profile Image']")
	WebElement userProfile;
	@FindBy(xpath = "//span[normalize-space()='Profile']")
	WebElement profile;
	
	//My Profile
	@FindBy(xpath = "//a[normalize-space()='My Profile']")
	WebElement myProfile;
	@FindBy(xpath = "//input[@placeholder='Enter your first name']")
	WebElement firstName;
	@FindBy(xpath = "//input[@placeholder='Enter your last name']")
	WebElement lastName;
	@FindBy(xpath = "//input[@placeholder='Enter your user name']")
	WebElement userName;
	@FindBy(xpath = "//input[@placeholder='Enter your secondary email id']")
	WebElement secondaryEmail;
	@FindBy(xpath = "//input[@type='date']")
	WebElement DOB;
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement phoneNumber;
	@FindBy(xpath = "//select[@class='form-select']")
	WebElement country;
	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement address1;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement address2;
	@FindBy(xpath = "//img[@alt='Save profile']")
	WebElement save1;
	
	//Change Password
	@FindBy(xpath = "//a[normalize-space()='Change Password']")
	WebElement changePassword;
	@FindBy(xpath = "//input[@placeholder='Enter current password']")
	WebElement currentPassword1;
	@FindBy(xpath = "//input[@placeholder='Enter new password']")
	WebElement newPassword1;
	@FindBy(xpath = "//input[@placeholder='Confirm new password']")
	WebElement confirmNewPassword1;
	@FindBy(xpath = "//button[normalize-space()='Update']")
	WebElement update1;
	
	//Digital Signature
	@FindBy(xpath = "//a[normalize-space()='Digital Signature']")
	WebElement digitalSignature;
	@FindBy(xpath = "(//input[@id='password-text'])[1]")
	WebElement newPassword2;
	@FindBy(xpath = "(//input[@type='password'])[2]")
	WebElement confirmNewPassword2;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save2;
	
	@FindBy(xpath = "//button[normalize-space()='Update password']")
	WebElement updatePassword;
	@FindBy(xpath = "(//input[@type='password'])[1]")
	WebElement oldPassword3;
	@FindBy(xpath = "(//input[@id='password-text'])[1]")
	WebElement newPassword3;
	@FindBy(xpath = "(//input[@type='password'])[3]")
	WebElement confirmNewPassword3;
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	WebElement cancel3;
	@FindBy(xpath = "//button[normalize-space()='Update']")
	WebElement update3;
	
	//Default Setup
	@FindBy(xpath = "//a[normalize-space()='Default Setup']")
	WebElement defaultSetup;
	@FindBy(xpath = "(//select)[2]")
	WebElement defaultStudyConfig;
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Save'])[1]")
	WebElement saveDefaultStudyConfig;
	@FindBy(xpath = "(//select)[3]")
	WebElement language;
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Save'])[2]")
	WebElement saveLanguage;
	@FindBy(xpath = "(//select[@class='form-select'])[3]")
	WebElement date;
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Save'])[3]")
	WebElement saveDate;
	@FindBy(xpath = "(//select[@class='form-select'])[4]")
	WebElement time;
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Save'])[4]")
	WebElement saveTime;
	
	public void selectProfile() throws InterruptedException
	{
		Thread.sleep(2000);
		userProfile.click();;
		Thread.sleep(2000);
		profile.click();
		Thread.sleep(2000);
	}
	
	public void myProfile(String num) throws InterruptedException
	{
		Thread.sleep(2000);
		phoneNumber.sendKeys(num);
		Thread.sleep(2000);
		save1.click();
		Thread.sleep(2000);
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("User profile updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void changePassword(String pwd1,String pwd2,String pwd3) throws InterruptedException
	{
		Thread.sleep(2000);
		changePassword.click();
		Thread.sleep(2000);
		currentPassword1.sendKeys(pwd1);
		Thread.sleep(2000);
		newPassword1.sendKeys(pwd2);
		Thread.sleep(2000);
		confirmNewPassword1.sendKeys(pwd3);
		Thread.sleep(2000);
		update1.click();
		Thread.sleep(2000);
	}
	
	public static boolean Alert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Password updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void digitalSignatureCreation(String pwd1,String pwd2) throws InterruptedException
	{
		Thread.sleep(2000);
		digitalSignature.click();
		Thread.sleep(2000);
		newPassword2.sendKeys(pwd1);
		Thread.sleep(2000);
		confirmNewPassword2.sendKeys(pwd1);
		Thread.sleep(2000);
		save2.click();
		Thread.sleep(2000);
	}
	
	public void digitalSignatureUpdation(String pwd1,String pwd2,String pwd3) throws InterruptedException
	{
		Thread.sleep(2000);
		digitalSignature.click();
		Thread.sleep(2000);
		updatePassword.click();
		Thread.sleep(2000);
		oldPassword3.sendKeys(pwd1);
		Thread.sleep(2000);
		newPassword3.sendKeys(pwd2);
		Thread.sleep(2000);
		confirmNewPassword3.sendKeys(pwd3);
		Thread.sleep(2000);
		update3.click();
		Thread.sleep(2000);
	}
	
	public static boolean Alert3() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to update password?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Password updated successfully"));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void defaultSetup(String study/*,String lan,String dt,String tm*/) throws InterruptedException
	{
		Thread.sleep(2000);
		defaultSetup.click();
		Thread.sleep(2000);
		Select sel1 = new Select(defaultStudyConfig);
		sel1.selectByVisibleText(study);
		Thread.sleep(2000);
		saveDefaultStudyConfig.click();
		Thread.sleep(2000);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alert1 = driver.switchTo().alert();
		Assert.assertTrue(alert1.getText().contains("Default study updated successfully"));
		alert1.accept();
		Thread.sleep(2000);
		/*Select sel2 = new Select(language);
		sel2.selectByVisibleText(lan);
		Thread.sleep(2000);
		saveLanguage.click();
		Thread.sleep(2000);
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alert2 = driver.switchTo().alert();
		Assert.assertTrue(alert2.getText().contains("Default language updated successfully"));
		alert2.accept();
		Thread.sleep(2000);
		Select sel3 = new Select(date);
		sel3.selectByVisibleText(dt);
		Thread.sleep(2000);
		saveDate.click();
		Thread.sleep(2000);
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(8));
		wait3.until(ExpectedConditions.alertIsPresent());
		Alert alert3 = driver.switchTo().alert();
		Assert.assertTrue(alert3.getText().contains("Default date format updated successfully"));
		alert3.accept();
		Thread.sleep(2000);
		Select sel4 = new Select(time);
		sel4.selectByVisibleText(tm);
		Thread.sleep(2000);
		saveTime.click();
		Thread.sleep(2000);
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(8));
		wait4.until(ExpectedConditions.alertIsPresent());
		Alert alert4 = driver.switchTo().alert();
		Assert.assertTrue(alert4.getText().contains("Default time format updated successfully"));
		alert4.accept();
		Thread.sleep(2000);*/
	}
	
	public static boolean Alert4() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure want to save this password for your Digital Signature?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Digital Signature Password created successfully"));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}

}
