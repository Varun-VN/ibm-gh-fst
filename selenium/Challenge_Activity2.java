package fst_selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Challenge_Activity2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 17 pro");
				
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 17 pro");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		System.out.println("price is " + driver.findElement(By.xpath("//html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/div[1]/a/span/span[2]/span[2]")).getDomProperty("value"));
	
		driver.quit();
	}

}
