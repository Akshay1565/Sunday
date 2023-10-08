package Testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Assrtion {
static {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
}
public void Assertion() throws InterruptedException
{
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.get("https://www.google.com/");
	 String Actualtile = driver.getTitle();
	 String ExpectedTiltle = "Soogle";
	 SoftAssert s=new SoftAssert();
	 s.assertEquals(Actualtile, ExpectedTiltle);
	 Thread.sleep(3000);
	 driver.close();
	 s.assertAll();
}
}
