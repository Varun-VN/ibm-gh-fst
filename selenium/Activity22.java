package fst_selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity22 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://training-support.net/webelements/popups");

		System.out.println(driver.getTitle());

		driver.findElement(By.id("launcher")).click();

		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.id("password")).sendKeys("password");

		driver.findElement(By.xpath("//button[@class = 'svelte-1pdjkmx']")).click();

		System.out.println(driver.findElement(By.xpath("//h1[contains(@class, 'text-center')]")).getText());

		driver.quit();

	}
}
