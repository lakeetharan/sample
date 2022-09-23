package org.tasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class FaceBook1 {
	 WebDriver driver;
		@BeforeClass
		
		public void beforeclass() {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Theepan\\Dailytask\\driver\\chromedriver.exe");
		      driver= new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("https://www.facebook.com/");	
		      
		}
		
		@AfterClass
		public void afterclass() {
			driver.quit();

		}
		@BeforeMethod
		public void beforeeachmethod() throws IOException {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File as = ts.getScreenshotAs(OutputType.FILE);
			System.out.println(as);
			
			File file=new File("E:\\screenshotselenium\\vicky.png");
			FileUtils.copyFile(as, file);
			

		}
		@AfterMethod
		private void aftereachmethod() throws IOException {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File as1 = ts.getScreenshotAs(OutputType.FILE);
			System.out.println(as1);
			
			File file1=new File("E:\\screenshotselenium\\lucky.png");
			FileUtils.copyFile(as1, file1);
		
		}
		@Test
		private void busniesslogics() {
			WebElement element = driver.findElement(By.id("email"));
			element.sendKeys("lakeetharan@gmail.com");
			
			WebElement element2 = driver.findElement(By.id("pass"));
			element2.sendKeys("Lakeetharan31");
			
			WebElement element3 = driver.findElement(By.xpath("//button[text()='Log in']"));
			element3.click();
			 System.out.println("like");
		}
		
		

	}


