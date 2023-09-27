package com.neotech.lesson11;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class AlertsTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// https://demo.guru99.com/test/delete_customer.php

		setUp();

		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();

		wait(2);
		System.out.println(getAlertText());
		dismissAlert();

		driver.findElement(By.name("submit")).click();
		wait(2);
		acceptAlert();

		wait(2);
		System.out.println(getAlertText());
		acceptAlert();

		wait(3);

		tearDown();

	}

}
