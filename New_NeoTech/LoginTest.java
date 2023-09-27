package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// https://hrm.neotechacademy.com/
		setUp();

		// sending the username
		WebElement username = driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));

		// sending the password
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));

		wait(2);

		// click on the login button
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginBtn.click();

		wait(4);

		// validate the login success by locating the logo
		WebElement logo = driver.findElement(By.id("ohrm-small-logo"));

		if (logo.isDisplayed()) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!!!");
		}

		tearDown();
	}

}
