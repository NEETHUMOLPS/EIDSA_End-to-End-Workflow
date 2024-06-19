package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
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

public class PartiallyFilledForms extends AbstractComponent{
	static WebDriver driver;
	public PartiallyFilledForms(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Partially filled forms
	@FindBy(xpath = "//span[normalize-space()='Items']")
	WebElement items;
	@FindBy(xpath = "//span[normalize-space()='Partially Filled Forms']")
	WebElement partiallyFilledForms;
	
	@FindBy(xpath = "//tbody/tr[1]/td[8]/i[1]")
	WebElement form1;
	@FindBy(xpath = "//tbody/tr[2]/td[8]/i[1]")
	WebElement form2;
	
	//Sign
	@FindBy(xpath = "//i[@class='fa fa-pencil']")
	WebElement sign;
	@FindBy(xpath = "//u[normalize-space()='unsign']")
	WebElement unsign;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement email;
	@FindBy(xpath = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Confirm']")
	WebElement confirm;
	
	@FindBy(xpath = "//input[@type='textbox']")
	WebElement nameField;
	@FindBy(xpath = "//button[normalize-space()='Review And Submit']")
	WebElement reviewAndSubmitForm;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveForm;
	
	
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	public void clickOnPartiallyFilledForms() throws InterruptedException 
	{
		Thread.sleep(2000);
		items.click();
		Thread.sleep(2000);
		partiallyFilledForms.click();
		Thread.sleep(2000);
	}
	
	public void sign(String em,String pwd) throws InterruptedException 
	{
		Thread.sleep(2000);
		sign.click();
		Thread.sleep(2000);
		email.sendKeys(em);
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		confirm.click();
		Thread.sleep(2000);
	}
	
	public void unSign(String em,String pwd) throws InterruptedException 
	{
		Thread.sleep(2000);
		unsign.click();
		Thread.sleep(2000);
		email.sendKeys(em);
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		confirm.click();
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
	
	
	public void fillFormReviewAndSubmit(String nm) throws InterruptedException
	{
		Thread.sleep(2000);
		nameField.clear();
		Thread.sleep(2000);
		nameField.sendKeys(nm);
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		elementWait(reviewAndSubmitForm);
		reviewAndSubmitForm.click();
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
	

}
