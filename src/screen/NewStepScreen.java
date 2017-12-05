package screen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewStepScreen extends AbstractScreen{
	public NewStepScreen(AppiumDriver driver) {super(driver);}

	//Elements
	WebElement btnBack = driver.findElementByAccessibilityId("Back");

	WebElement inputStepText = driver.findElement(By.xpath("//XCUIElementTypeTextView[@name=\"What is one thing you need to do to reach your goal?\"]"));

	WebElement btnStartDate = driver.findElement(By.xpath("//XCUIElementTypeTextView[@name=\"Start date\"]"));

	WebElement btnEndDate = driver.findElement(By.xpath("//XCUIElementTypeTextView[@name=\"End date\"]"));

	WebElement btnReminder = driver.findElement(By.xpath("//XCUIElementTypeTextView[@name=\"Reminder\"]"));

	//Methods
	public void ClickBackButton(){
		btnBack.click();
	}

	public void EnterStepText(String text){
		inputStepText.sendKeys(text);
	}

}
