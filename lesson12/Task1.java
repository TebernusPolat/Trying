package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Task1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// https://hrm.neotechacademy.com/
		
		setUp();
		
		sendText(driver.findElement(By.id("txtUsername")),
				ConfigsReader.getProperty("username"));
		//leave password empty
		
		click(driver.findElement(By.xpath("//button[@type = 'submit']")));
		
		wait(5);

		//get the camera
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//take the screenshot
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		
		//save this screenshot in my folder
		try {
			Files.copy(sourceFile, new File("screenshots/HRM/screenshot02.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		tearDown();
	}

}
