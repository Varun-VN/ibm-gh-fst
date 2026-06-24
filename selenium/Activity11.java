package fst_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity11 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		driver.get("https://training-support.net/webelements/keyboard-events");
		
		System.out.println(driver.getTitle());
		
		builder.sendKeys("Hi, How are you doing?").build().perform();
		
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h1")).getText());
		
		driver.quit();
		
	}

}
