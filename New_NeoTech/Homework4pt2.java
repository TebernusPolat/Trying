package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework4pt2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/form/div[3]/button")).click();
		WebElement driver2 = driver.findElement(By.id("txtPassword-error"));
		Thread.sleep(1000);
		if (driver2.isDisplayed()) {
			System.out.println("Test Passed:" + driver2.getText());
		} else {

			System.out.println("Test failed");
		}
		Thread.sleep(3000);
		tearDown();
	 ahmet abi bizimleydi kankam
		 
	}

}
