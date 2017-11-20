package screen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoalsScreen extends AbstractScreen {

	public GoalsScreen(AppiumDriver driver) {super(driver);}

	//Elements
	private WebElement headerSpiritual = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"SPIRITUAL\"]"));
	private WebElement headerSocial = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"SOCIAL\"]"));
	private WebElement headerPhysical = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"PHYSICAL\"]"));
	private WebElement headerIntellectual = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"INTELLECTUAL\"]"));

	//Methods
	public boolean SpiritualHeaderExists(){
		return headerSpiritual.isDisplayed();
	}
	public boolean SocialHeaderExists(){
		return headerSocial.isDisplayed();
	}
	public boolean PhysicalHeaderExists(){
		return headerPhysical.isDisplayed();
	}
	public boolean IntellectualHeaderExists(){
		return headerIntellectual.isDisplayed();
	}
}
