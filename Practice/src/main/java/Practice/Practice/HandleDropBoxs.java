package Practice.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropBoxs {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		Select sl = new Select(driver.findElement(By.name("country")));
		
		sl.selectByVisibleText("AMERICAN SAMOA");
		sl.selectByIndex(4);
		

		
	}

}
