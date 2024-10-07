package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsProgram2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		System.out.println("Title of the page is: " + driver.getTitle());

		if (driver.getTitle() == "STORE") {
			System.out.println("Page landed on correct website");
		} else {
			System.out.println("Page not landed on correct website");
		}
		driver.close();

	}

}
