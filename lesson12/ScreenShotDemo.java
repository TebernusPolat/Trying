package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class ScreenShotDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// https://hrm.neotechacademy.com/

		
		setUp();
		
		//login
		sendText(driver.findElement(By.id("txtUsername")), 
				ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")),
				ConfigsReader.getProperty("password"));
		
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		
		wait(5);
		
		
		//I want to take a screenshot
		
		//what am I doing here?
		//we are creating an object of TakesScreenshot (in fact by down casting)
		//Type of driver --> WebDriver
		//In fact the instance is ChromeDriver 	(WebDriver driver = new ChromeDriver();)
		//so, I can downcast the driver to any of the classes in the inheritance schema
		//from WebDriver down to the ChromeDriver itself.
		
		
		
		//this is my camera
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//this is the screenshot, but it is not saved anywhere
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		
		//saving this file 
		//this can be done using many different libraries
			//differently from other io packages - this will not create the folders for you
		try {
			Files.copy(sourceFile, new File("screenshots/HRM/screenshot01.png"));
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to save the screenshot!!!");
		}
		
		
		
		
		tearDown();
		
	}

}
