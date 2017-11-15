package screen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainScreen extends AbstractScreen {

	public MainScreen(AppiumDriver driver){
		super(driver);
	}

	//Elements
	WebElement HomeScreen = driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Living\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));

	//Methods

	public boolean IsHomeDisplayed(){
		return HomeScreen.isDisplayed();
	}

}
