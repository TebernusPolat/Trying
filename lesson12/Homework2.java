package com.neotech.lesson12;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Homework2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// WindowHandleDemo at com.neotech.lesson07 using the CommonMethods.java
		////https://accounts.google.com/signup

		setUp();
		
		System.out.println("Title of the parent page is: " + driver.getTitle());
		
		//this method waits for an element to be clickable and then clicks on it
		click(driver.findElement(By.linkText("Help")));
		
		wait(2);

		switchToChildWindow();
		
		
		System.out.println("The title of the child page is: " + driver.getTitle());;
		
		
//		driver.close(); this would close the child window
		
		
		tearDown();
	}

}
