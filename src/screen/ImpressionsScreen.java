package screen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class ImpressionsScreen extends AbstractScreen {

	public ImpressionsScreen(AppiumDriver driver) {super(driver);}

	//Elements
	private WebElement AllTab = driver.findElementByAccessibilityId("All");
	private WebElement ActiveTab = driver.findElementByAccessibilityId("Active");
	private WebElement CompleteTab = driver.findElementByAccessibilityId("Complete");
	private WebElement btnCreateImpression = driver.findElementByAccessibilityId("createImpression");


	//Methods
	public void SelectAllTab(){
		AllTab.click();
	}

	public boolean AllTabIsDisplayed(){
		return AllTab.isDisplayed();
	}

	public void SelectActiveTab(){
		ActiveTab.click();
	}

	public boolean ActiveTabIsDisplayed(){
		return ActiveTab.isDisplayed();
	}

	public void SelectCompleteTab(){
		CompleteTab.click();
	}

	public boolean CompleteTabIsDisplayed(){
		return CompleteTab.isDisplayed();
	}

	public void ClickCreateImpression(){
		btnCreateImpression.click();
	}
}
