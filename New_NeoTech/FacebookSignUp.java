package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class FacebookSignUp extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// https://www.facebook.com/r.php

		setUp();

		WebElement month = driver.findElement(By.id("month"));
		selectDropdown(month, 4);

		wait(2);

		WebElement day = driver.findElement(By.id("day"));
		selectDropdown(day, "25");

		wait(2);

		tearDown();

	}

}
