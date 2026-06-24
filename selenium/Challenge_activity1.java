package fst_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Challenge_activity1 {

	public static void main(String[] args) {
	    
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement element = driver.findElement(By.id("APjFqb"));
		
		String IDattValue = element.getAttribute("id");
		String CLASSattValue = element.getAttribute("class");
		String NAMEattValue = element.getAttribute("name");
		
		System.out.println("ID = " + IDattValue);
		System.out.println("CLASS = " + CLASSattValue);
		System.out.println("NAME = " + NAMEattValue);
		
		driver.quit();
	}

}
