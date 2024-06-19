package com.EIDSA.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.AbstractComponents.AbstractComponent;

public class Queries extends AbstractComponent{
	static WebDriver driver;
	public Queries(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Queries
	@FindBy(xpath = "//span[normalize-space()='Queries']")
	WebElement queries;
	@FindBy(xpath = "//span[normalize-space()='Sent']")
	WebElement sent;
	@FindBy(xpath = "//span[normalize-space()='Received']")
	WebElement Received;
	@FindBy(xpath = "//span[normalize-space()='All Queries']")
	WebElement allQueries;
	@FindBy(xpath = "//span[normalize-space()='General']")
	WebElement General;
	
	//General query
	@FindBy(xpath = "//img[@alt='General Query']")
	WebElement generalQuery;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement querySubject;
	@FindBy(xpath="//textarea[@class='form-control my-2 my-lg-0']")
	WebElement queryMessage;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[4]/div")
	WebElement role1;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[4]/div/div[2]/ul/li")
	WebElement role2;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[4]/div/span[2]")
	WebElement role3;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[5]/div/input")
	WebElement recipients1;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[5]/div/div[2]/ul/li")
	WebElement recipients2;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div[5]/div/span[2]")
	WebElement recipients3;
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submit;
	
	//Reply and Reply & Close
	@FindBy(xpath="//tbody/tr[2]/td[13]/i[1]")
	WebElement query1;
	@FindBy(xpath="//div[@id='printcontent']/div/div[2]/div[3]/div[2]/div/div")
	WebElement recipient1;
	@FindBy(xpath="//div[@id='printcontent']/div/div[2]/div[3]/div[2]/div/div/div[3]/ul/li")
	WebElement recipient2;
	@FindBy(xpath="//div[@id='printcontent']/div/div[2]/div[3]/div[2]/div/div/span[2]")
	WebElement recipient3;
	@FindBy(xpath="//textarea[@placeholder='Reply']")
	WebElement replyMsg;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/div[1]/button[1]/img[1]")
	WebElement reply;
	@FindBy(xpath="//button[@class='btn btn-xs pe-lg-0']//img")
	WebElement replyAndClose;
	@FindBy(xpath="//img[@alt='View form']")
	WebElement viewForm;
	@FindBy(xpath="//img[@alt='Export pdf']")
	WebElement exportPdf;
	
	
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	public void formQuery(String sub,String msg) throws InterruptedException
	{
		Thread.sleep(2000);
		generalQuery.click();
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
	
	public String Alert() throws InterruptedException
	{
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		alert.accept();
		return msg;	
	}
	
	public void reply(String msg) throws InterruptedException
	{
		Thread.sleep(2000);
		queries.click();
		Thread.sleep(2000);
		sent.click();
		Thread.sleep(5000);
		query1.click();
		Thread.sleep(2000);
		replyMsg.sendKeys(msg);
		Thread.sleep(2000);
		recipient1.click();
		Thread.sleep(2000);
		recipient2.click();
		Thread.sleep(2000);
		recipient3.click();
		Thread.sleep(2000);
		reply.click();
		Thread.sleep(2000);
		
		
	}
	
	public void replyAndClose(String msg) throws InterruptedException
	{
		Thread.sleep(5000);
		query1.click();
		Thread.sleep(2000);
		replyMsg.sendKeys(msg);
		Thread.sleep(2000);
		recipient1.click();
		Thread.sleep(2000);
		recipient2.click();
		Thread.sleep(2000);
		recipient3.click();
		Thread.sleep(2000);
		replyAndClose.click();
		Thread.sleep(2000);		
	}
	
	public void viewForm() throws InterruptedException
	{
		Thread.sleep(5000);
		query1.click();
		Thread.sleep(2000);
		viewForm.click();
		Thread.sleep(2000);
	}
	public void exportPdf() throws InterruptedException
	{
		Thread.sleep(2000);
		exportPdf.click();
		Thread.sleep(2000);
	}
	
	
	

}
