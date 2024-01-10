package com.EIDSA.testCases.Negative;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.FormTransfer;

import Base.BaseClassTest;

public class TC_064_FormTransfer_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void FormTransfer1() throws IOException, InterruptedException
	{
		{
			FormTransfer gq = new FormTransfer(driver);
			gq.clickFormTransfer();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/div[2]/ul/li[1]/label")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/div[2]/ul/li[1]/ul[1]/li/label")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/div[2]/ul/li[1]/ul[1]/li/ul[1]/li/label")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[2]/ul/li[1]/label")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[2]/ul/li[1]/ul[1]/li/label")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[2]/ul/li[1]/ul[1]/li/ul[2]/li/label")).click();
			Thread.sleep(3000);
			gq.clickTransfer();
			gq.Alert2();
			logger.info("Negative test passed");
			driver.navigate().refresh();
		}
	}
	
	@Test(priority=2)
	public void FormTransfer2() throws IOException, InterruptedException
	{
		FormTransfer gq = new FormTransfer(driver);
		gq.clickFormTransfer();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/div[2]/ul/li[1]/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/div[2]/ul/li[1]/ul[1]/li/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/div[2]/ul/li[1]/ul[1]/li/ul[1]/li/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[2]/ul/li[1]/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[2]/ul/li[1]/ul[1]/li/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[2]/ul/li[1]/ul[1]/li/ul[1]/li/label")).click();
		Thread.sleep(3000);
		gq.clickTransfer();
		gq.Alert3();
		logger.info("Negative test passed");
		driver.navigate().refresh();
	}
}
