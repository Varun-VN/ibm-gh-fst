package fst_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);

		driver.get("https://training-support.net/webelements/drag-drop");

		System.out.println(driver.getTitle());

		WebElement ball = driver.findElement(By.id("ball"));
		WebElement drop1 = driver.findElement(By.id("dropzone1"));
		WebElement drop2 = driver.findElement(By.id("dropzone2"));

		builder.clickAndHold(ball).moveToElement(drop1).pause(1000).build().perform();

		// System.out.println(driver.findElement(By.xpath("//*[@id='dropzone1']/span")).getText());

		if (drop1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
			System.out.println("Ball was dropped in Dropzone 1");
		}

		builder.dragAndDrop(ball, drop2).pause(1000).build().perform();

		// System.out.println(driver.findElement(By.xpath("//*[@id='dropzone2']/span")).getText());
		if (drop2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
			System.out.println("Ball was dropped in Dropzone 2");
		}

		driver.quit();

	}
}