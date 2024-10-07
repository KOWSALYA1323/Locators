package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsProgram3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Artificial Intelligence");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'History')]")).click();

		System.out.println("Title of the page is: " + driver.getTitle());
		Thread.sleep(3000);
		driver.close();

	}

}
