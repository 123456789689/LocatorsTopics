package Practice.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		// locators

		//1. X-path  Priority=2
		//1. Absolute xpath should not be used => html/body/div1/div2
		//2. Relative xpath should be used only is it is there like this @name='firstName'

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Mourya");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("S");

		//2. id   Priority=1
		driver.findElement(By.id("email")).sendKeys("mouryabhushan.kgl@gmail.com");
		
		//3. name Priority=3
		driver.findElement(By.name("phone")).sendKeys("9886831537");
		driver.findElement(By.name("city")).sendKeys("Bangalore");
		
		//4. LinkText => This is only for links
		driver.findElement(By.linkText("SIGN-ON")).click();
		
		//5. PartialLinktext  => Not useful
		driver.findElement(By.partialLinkText("registration")).click();
		
		//driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		//6. CSS Selectors   Priority=2 because its the value of the id. ex: id=email
		//driver.findElement(By.cssSelector("#email")).sendKeys("jskd@gmail.com");
		
		//7. Class name  => Not useful
		driver.findElement(By.className("sdhgsjd"));
		

		driver.quit();
	}

}
