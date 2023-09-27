package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		//FrameDemo at com.neotech.lesson07 using the CommonMethods.java
		// https://jqueryui.com/tooltip/
		
		
		setUp();

		//Use the CommonMethods wait()
		//dont confuse with Thread.sleep() - this takes seconds
		wait(2);
		
		switchToFrame(0);
		WebElement ageTxt = driver.findElement(By.id("age"));
		sendText(ageTxt, "Ahmet");
		
		wait(2);
		
		driver.switchTo().defaultContent();
		
		//switch to the frame using WebElement
		switchToFrame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		sendText(driver.findElement(By.id("age")), "25");
		
		//you could also use the sendText(String, String) which locates the element for you
		//sendText("//*[@id='age']","25");
		
		
		wait(2);
		
		driver.switchTo().defaultContent();
		
		tearDown();
		
		
	}

}
