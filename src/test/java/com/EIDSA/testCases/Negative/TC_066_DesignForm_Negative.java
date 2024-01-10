package com.EIDSA.testCases.Negative;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.DesignForm;

import Base.BaseClassTest;

public class TC_066_DesignForm_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void DesignComplete() throws IOException, InterruptedException
	{
		DesignForm df = new DesignForm(driver);
		df.clickDesignForm();
		df.CreateForm_Negative();
		df.Alert2();
		Thread.sleep(3000);
		df.CreateFormClose();	
		logger.info("Negative test1 passed");
		Thread.sleep(5000);
		df.completeDesign();
		df.Alert7();
		logger.info("Negative test2 passed");
		Thread.sleep(4000);
		df.DeleteColumn();
		df.Alert6();
		logger.info("Negative test3 passed");
		Thread.sleep(4000);
		df.SaveTemplate();
		df.Alert4();
		logger.info("Negative test4 passed");
		Thread.sleep(4000);
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
	    df.Alert8();
	    logger.info("Negative test5 passed");
	    Thread.sleep(4000);
		df.CreatePage();
		Thread.sleep(2000);
		//df.AddPageClose();
		//logger.info("Negative test6 passed");
		WebElement sourceelement2 =driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[9]/a/div/img"));
		WebElement destelement2 =driver.findElement(By.xpath("//div[contains(text(),'Drag elements here')]"));	

		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
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
	    df.Alert6();
	    logger.info("Negative test6 passed");
	    WebElement sourceelement3 =driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/a[1]/div[1]/img[1]"));
		WebElement destelement3=driver.findElement(By.xpath("//div[contains(text(),'Drag elements here')]"));	

		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
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
		//click on column		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div/div/div/div/div/div/div/div")).click();
		Thread.sleep(2000);
		
		WebElement sourceelement4 =driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[9]/a/div/img"));
		WebElement destelement4 =driver.findElement(By.xpath("//div[contains(text(),'Drag elements here')]"));	

		JavascriptExecutor js4 = (JavascriptExecutor)driver;
		js4.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
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
	    df.Heading("","");
	    df.HeadingAdd();
	    df.Alert12();
	    Thread.sleep(3000);
	    df.HeadingClose();
	    logger.info("Negative test7 passed");
	    Thread.sleep(4000);
		df.NewPage();
		Thread.sleep(2000);
		df.PageName("pg 01");
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		button.click();
		df.Alert9();
		Thread.sleep(3000);
		logger.info("Negative test8 passed");
		Thread.sleep(2000);		
		//click on column		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div/div/div/div/div/div/div/div")).click();
		Thread.sleep(2000);
		
		WebElement sourceelement5 =driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[9]/a/div/img"));
		WebElement destelement5 =driver.findElement(By.xpath("//div[contains(text(),'Drag elements here')]"));	

		JavascriptExecutor js5 = (JavascriptExecutor)driver;
		js5.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
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
				                    + "simulateHTML5DragAndDrop(source,destination);", sourceelement5, destelement5);
	    Thread.sleep(2000);
	    WebElement addHeading = driver.findElement(By.xpath("//input[@id='headdingtext']"));
	    addHeading.sendKeys("H1");
	    Thread.sleep(2000);
	    WebElement filedName = driver.findElement(By.xpath("//input[@id='instructionstext']"));
	    filedName.sendKeys("H2");
	    Thread.sleep(2000);
	    WebElement add = driver.findElement(By.xpath("//*[@id=\"modalcontents\"]/div/div/div/div[2]/div[3]/div/div[1]/img"));
	    add.click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div/div/div/div/div/div/div/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/img[1]")).click();
	    Thread.sleep(2000);
	    df.Alert13();
	    logger.info("Negative test9 passed");
	
	}

}
