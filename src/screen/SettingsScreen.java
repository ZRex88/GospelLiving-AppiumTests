package screen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class SettingsScreen extends AbstractScreen {

	public SettingsScreen(AppiumDriver driver) {super(driver);}

	//Elements

	private WebElement btnSignIn = driver.findElementByAccessibilityId("Sign In");
	private WebElement btnSync = driver.findElementByAccessibilityId("Sync");

	//Methods
	public boolean SignInIsDisplayed(){
		return btnSignIn.isDisplayed();
	}

	public void SelectSignIn(){
		btnSignIn.click();
	}

	public boolean SyncIsDisplayed(){
		return btnSync.isDisplayed();
	}

	public void SelectSync(){
		btnSync.click();
	}

}
