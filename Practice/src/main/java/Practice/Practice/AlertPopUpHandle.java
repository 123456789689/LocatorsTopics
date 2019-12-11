package Practice.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver d = new FirefoxDriver();

		d.get("https://mail.rediff.com/cgi-bin/login.cgi");

		d.findElement(By.xpath("//input[@name='proceed']")).click();

		Alert al = d.switchTo().alert(); // Focus on Alert dialog //Selenium cannot find locators of Alert dialog
											// because its written in some other lang.

		String s = al.getText();
		System.out.println(s);

		if (s.equals("Please enter a valid user name")) {
			System.out.println("Text is right");
		} else {
			System.out.println("Text is wrong");
		}
		Thread.sleep(5000);
		al.accept(); // Used for ok, yes etc
		// al.dismiss(); //Used for cancel,deny etc
		Thread.sleep(5000);
		d.quit();

	}

}
