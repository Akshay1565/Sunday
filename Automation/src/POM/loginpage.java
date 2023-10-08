package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {

	//declaration
	@FindBy(id="username");
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath = "//Login ")
}
