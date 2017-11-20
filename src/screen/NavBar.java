package screen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavBar extends AbstractScreen {

	public NavBar(AppiumDriver driver) {super(driver);}
	
	//Elements
	private WebElement btnHome = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Home\"]"));
	private WebElement btnGoals = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Goals\"]"));
	private WebElement btnImpressions = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Impressions\"]"));
	private WebElement btnSettings = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Settings\"]"));

	//Methods
	
	public void NavToHome(){
		btnHome.click();
	}
	
	public boolean HomeIsDisplayedInNavBar(){
		return btnHome.isDisplayed();
	}

	public void NavToGoals(){
		btnGoals.click();
	}

	public boolean GoalsIsDisplayedInNavBar(){
		return btnGoals.isDisplayed();
	}

	public void NavToImpressions(){
		btnImpressions.click();
	}

	public boolean ImpressionsIsDisplayedInNavBar(){
		return btnImpressions.isDisplayed();
	}

	public void NavToSettings(){
		btnSettings.click();
	}

	public boolean SettingsIsDisplayedInNavBar(){
		return btnSettings.isDisplayed();
	}
}
