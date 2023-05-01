package com.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Baseclass {
	
	public static WebDriver driver = null;
@Test	
public static void browserLaunch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\cucumber\\project\\Adactin\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	driver.findElement(By.id("username")).sendKeys("Dinu1998");
	driver.findElement(By.id("password")).sendKeys("IM2281");
	driver.findElement(By.id("login")).click();

}
}
