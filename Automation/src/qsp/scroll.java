package qsp;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
	static {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSecond(5));
		driver.get("https://www.bbc.com/");
		
	}
}
