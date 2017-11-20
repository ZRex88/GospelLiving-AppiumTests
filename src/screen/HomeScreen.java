package screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeScreen extends AbstractScreen {

	public HomeScreen(AppiumDriver driver){
		super(driver);
	}

	//Elements


	//Methods

	TouchAction tapCoordinates = new TouchAction(driver);

	public void SelectGivenGoalCard(String goal){
		driver.findElementByAccessibilityId(goal + " - 0 goals").click();
	}

	public boolean IsGivenGoalCardDisplayed(String goal) throws InterruptedException {
		return driver.findElementByAccessibilityId(goal + " - 0 goals").isDisplayed();
	}

}
