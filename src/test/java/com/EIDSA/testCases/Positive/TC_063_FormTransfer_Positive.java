package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.FormTransfer;

import Base.BaseClassTest;

public class TC_063_FormTransfer_Positive extends BaseClassTest {
//both are completed	
	/*@Test(priority=1)
	public void FormTransfer() throws IOException, InterruptedException
	{
			FormTransfer gq = new FormTransfer(driver);
			gq.clickFormTransfer();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='page-wrapper']/div[3]/div[2]/div[2]/div/div[2]/ul/li[2]/label")).click();
		    driver.findElement(By.xpath("//div[@id='page-wrapper']/div[3]/div[2]/div[2]/div/div[2]/ul/li[2]/ul[2]/li/label")).click();
		    driver.findElement(By.xpath("//div[@id='page-wrapper']/div[3]/div[2]/div[3]/div/div[2]/ul/li[2]/label")).click();
		    driver.findElement(By.xpath("//div[@id='page-wrapper']/div[3]/div[2]/div[3]/div/div[2]/ul/li[2]/ul[2]/li/label")).click();
		    driver.findElement(By.xpath("//div[@id='page-wrapper']/div[3]/div[2]/div[2]/div/div[2]/ul/li[2]/ul[2]/li/ul/li/label")).click();
		    driver.findElement(By.xpath("//div[@id='page-wrapper']/div[3]/div[2]/div[3]/div/div[2]/ul/li[2]/ul[2]/li/ul[2]/li/label")).click();
			Thread.sleep(3000);
			gq.clickTransfer();
			gq.Alert4();
			logger.info("Form transffered");
			driver.navigate().refresh();
	}*/
	
	@Test(priority=2)
	public void FormTransfer2() throws IOException, InterruptedException
	{
		FormTransfer gq = new FormTransfer(driver);
		gq.clickFormTransfer();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='page-wrapper']/div[3]/div[2]/div[2]/div/div[2]/ul/li[2]/label")).click();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/label[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/ul[2]/li[1]/label[1]")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[2]/ul[1]/li[2]/label[1]")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[2]/ul[1]/li[2]/ul[2]/li[1]/label[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[2]/ul[1]/li[2]/ul[2]/li[1]/ul[1]/li[1]/label[1]")).click();
		Thread.sleep(3000);
		gq.clickTransfer();
		gq.Alert1();
		logger.info("Form transffered");
		driver.navigate().refresh();
	}


}
