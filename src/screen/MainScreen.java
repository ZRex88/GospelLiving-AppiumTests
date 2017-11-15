package screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainScreen extends AbstractScreen {

	public MainScreen(AppiumDriver driver){
		super(driver);
	}

	//Elements
	private WebElement SpiritualCard = driver.findElement(By.xpath("//XCUIElementTypeOther[@name='spiritual - 0 goals']"));
	private WebElement SocialCard = driver.findElement(By.xpath("//XCUIElementTypeOther[@name='social - 0 goals']"));
	private WebElement PhysicalCard = driver.findElement(By.xpath("//XCUIElementTypeOther[@name='physical - 0 goals']"));
	private WebElement IntellectualCard = driver.findElement(By.xpath("//XCUIElementTypeOther[@name='intellectual - 0 goals']"));

	//Methods

	TouchAction tapCoordinates = new TouchAction(driver);

	public boolean IsSpiritualCardDisplayed() throws InterruptedException {
		return SpiritualCard.isDisplayed();
	}

}
