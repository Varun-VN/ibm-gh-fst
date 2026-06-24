package fst_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Activity17 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://training-support.net/webelements/selects");

		System.out.println(driver.getTitle());

		WebElement dropdown = driver.findElement(By.cssSelector(".h-80"));

		Select multiSelect = new Select(dropdown);

		multiSelect.deselectByVisibleText("HTML");

		for (int i = 3; i <=5; i++) {
			multiSelect.selectByIndex(i);
		}

		multiSelect.selectByValue("nodejs");

		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		System.out.println("Selected options are: ");
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}

		multiSelect.deselectByIndex(4);

		selectedOptions = multiSelect.getAllSelectedOptions();
		System.out.println("Selected options are: ");
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}
		
		driver.quit();

	}
}
