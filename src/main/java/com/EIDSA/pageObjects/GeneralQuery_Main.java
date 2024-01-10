package com.EIDSA.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstractComponent;

public class GeneralQuery_Main extends AbstractComponent{
	static WebDriver driver;
	public GeneralQuery_Main(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//General query
	@FindBy(xpath = "//img[@alt='General Query']")
	WebElement AllQueries1;
	
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	WebElement querySubject;
	@FindBy(xpath = "//textarea[@class='form-control my-2 my-lg-0']")
	WebElement queryMessage;
	@FindBy(xpath = "//select[@class='priority-select']")
	WebElement priority;
	@FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/div/div[4]/div")
	WebElement role1;
	@FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/div/div[4]/div/div[2]/ul/li[10]")
	WebElement role2;
	@FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/div/div[4]/div/span[2]")
	WebElement role3;
	@FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/div/div[5]/div")
	WebElement recipients1;
	@FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/div/div[5]/div/div[2]/ul/li")
	WebElement recipients2;
	@FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div/div/div[5]/div/span[2]")
	WebElement recipients3;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement emailAlert;
	@FindBy(xpath = "//button[normalize-space()='Clear']")
	WebElement clear;
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submit;
	
	

}
