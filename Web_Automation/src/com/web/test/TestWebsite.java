package com.web.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebsite 
{
    static WebDriver driver=null;
	public static void main(String[] args) 
	{
		
         launchBrowserChrome();
        // launchBrowserFirefox();
	}
	
	
	static void launchBrowserChrome()
	{
		String strpath=System.getProperty("user.dir")+"\\Libraries\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strpath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		//driver.findElement(By.name("firstname")).sendKeys("Maruthiraja");
		//driver.findElement(By.name("lastname")).sendKeys("BN");
		//driver.findElement(By.xpath("//div/input[1][@name='sex']")).click();
		driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//a[@href=\"/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics_c5b70a82461a484189e700166599ce9f\"] ")).click();
		
		
	}
	
	
	static void launchBrowserFirefox()
	{
		String strpath=System.getProperty("user.dir")+"\\Libraries\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", strpath);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.name("firstname")).sendKeys("Maruthiraja");
		driver.findElement(By.name("lastname")).sendKeys("BN");
		driver.findElement(By.xpath("//div/input[1][@name='sex']")).click();
		
	}

}
