package fst_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://training-support.net/webelements/tables");

		System.out.println(driver.getTitle());

		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));

		System.out.println("No of columns : " + cols.size());

		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));

		System.out.println("No of rows : " + rows.size());

		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]/td"));
        System.out.println("Third row cell values: ");
		
		 for(WebElement cell : thirdRow) {
	            System.out.println(cell.getText());
	        }
		
		// System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]")).getText());

		System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[2]/td[2]")).getText());

		driver.quit();

	}
}
