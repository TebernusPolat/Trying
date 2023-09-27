package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.CommonMethods;

public class WaitExplicitTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// http://webdriveruniversity.com/Ajax-Loader/index.html
		setUp();

		WebDriverWait wait = getWaitObject();
		waitForVisibility(driver.findElement(By.id("button1")));

		wait(3);
		tearDown();

	}

}
