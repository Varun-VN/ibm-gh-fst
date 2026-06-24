package fst_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;


public class Activity4 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/target-practice");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(), '#3')]")).getText());
		
		System.out.println(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
		
		Color color = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
		System.out.println(color);
		System.out.println(color.asRgb());
		System.out.println(color.asHex());
		
		// Find the violet button and print its classes
        System.out.println(driver.findElement(By.xpath("//button[text()='Purple']")).getAttribute("class"));
        // Find the grey button and print its text
        System.out.println(driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText());
		
		driver.quit();
	}

}
