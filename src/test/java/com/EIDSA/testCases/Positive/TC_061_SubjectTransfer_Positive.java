package com.EIDSA.testCases.Positive;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.SubjectTransfer;

import Base.BaseClassTest;

public class TC_061_SubjectTransfer_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void SubjectTransfer() throws IOException, InterruptedException
	{
			SubjectTransfer gq = new SubjectTransfer(driver);
			gq.clickSubjectTransfer();
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/label[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/label[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[2]/label[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//label[contains(text(),'Sub 001')]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[@type='button']")).click();
		    Thread.sleep(3000);
		    gq.Alert1();
			logger.info("Subject transferred successfully");
	}

}
