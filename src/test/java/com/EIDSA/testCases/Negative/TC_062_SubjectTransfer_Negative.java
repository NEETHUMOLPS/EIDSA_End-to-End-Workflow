package com.EIDSA.testCases.Negative;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.SubjectTransfer;

import Base.BaseClassTest;

public class TC_062_SubjectTransfer_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void SubjectTransfer() throws IOException, InterruptedException
	{
			SubjectTransfer gq = new SubjectTransfer(driver);
			gq.clickSubjectTransfer();
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/label[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/label[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[1]/label[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/label[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[@type='button']")).click();
		    Thread.sleep(3000);
		    gq.Alert2();
			logger.info("Negative test passed");
	}


}
