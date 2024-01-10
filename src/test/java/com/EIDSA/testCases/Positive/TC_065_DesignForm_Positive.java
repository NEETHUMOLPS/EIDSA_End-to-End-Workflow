package com.EIDSA.testCases.Positive;

import java.awt.event.InputEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.DesignForm;

import Base.BaseClassTest;

public class TC_065_DesignForm_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void DesignComplete() throws IOException, InterruptedException
	{
		DesignForm df = new DesignForm(driver);
		df.clickDesignForm();
		df.CreateForm("Demo02");
		df.Alert1();
		logger.info("Form created");
		df.CreatePage();
		logger.info("Page created");
		Thread.sleep(5000);
		
		WebElement sourceelement1 =driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/a[1]/div[1]/img[1]"));
		WebElement destelement1 =driver.findElement(By.xpath("//div[contains(text(),'Drag elements here')]"));	

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
				                    + "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
				                    + "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
				                    + "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
				                    + "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
				                    + "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
				                    + "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
				                    + "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
				                    + "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
				                    + "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
				                    + "var dropEvent = createEvent('drop');\n"
				                    + "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
				                    + "var dragEndEvent = createEvent('dragend');\n"
				                    + "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
				                    + "var source = arguments[0];\n" + "var destination = arguments[1];\n"
				                    + "simulateHTML5DragAndDrop(source,destination);", sourceelement1, destelement1);
	    Thread.sleep(2000);
		logger.info("Column created");		
		//click on column		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div/div/div/div/div/div/div/div")).click();
		Thread.sleep(2000);
		
		WebElement sourceelement2 =driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[9]/a/div/img"));
		WebElement destelement2 =driver.findElement(By.xpath("//div[contains(text(),'Drag elements here')]"));	

		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
				                    + "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
				                    + "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
				                    + "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
				                    + "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
				                    + "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
				                    + "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
				                    + "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
				                    + "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
				                    + "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
				                    + "var dropEvent = createEvent('drop');\n"
				                    + "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
				                    + "var dragEndEvent = createEvent('dragend');\n"
				                    + "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
				                    + "var source = arguments[0];\n" + "var destination = arguments[1];\n"
				                    + "simulateHTML5DragAndDrop(source,destination);", sourceelement2, destelement2);
	    Thread.sleep(2000);
	    df.Heading("Heading1","Heading2");
	    df.HeadingAdd();
		logger.info("Heading created");		
		//click on column		
		Thread.sleep(2000);
		df.completeDesign();
		df.Alert11();
		logger.info("Design completed");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div/div/div/div/div/div/div/div")).click();
		Thread.sleep(2000);
	    WebElement filedName = driver.findElement(By.xpath("//input[@id='instructionstext']"));
	    filedName.clear();
	    Thread.sleep(2000);
	    filedName.sendKeys("H3");
		Thread.sleep(2000);
		WebElement save = driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/img[1]"));
	    save.click();
		logger.info("Edit completed");	
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div/div/div/div/div/div/div/div")).click();
		df.HeadingDelete();
		Thread.sleep(2000);
		logger.info("Heading deleted");	
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div/div/div/div/div/div/div/div")).click();
		df.DeleteColumn();	
		df.Alert10();
		logger.info("Column deleted");
		Thread.sleep(2000);
		df.DeletePage();
		df.Alert5();
		logger.info("Page deleted");	
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div/div[1]/div")).click();	
		driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
		df.Alert3();
		logger.info("Form deleted");	
		
	}

}
