package screen;

import com.gargoylesoftware.htmlunit.javascript.host.Touch;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EditImpressionScreen extends AbstractScreen{

	public EditImpressionScreen(AppiumDriver driver) {super(driver);}

	//Elements
	private WebElement InputImpressionText = driver.findElementByAccessibilityId("Impression Description");
	private WebElement ReminderToggle = driver.findElementByAccessibilityId("enableReminder");
	private WebElement btnCancel = driver.findElementByAccessibilityId("Cancel");
	private WebElement btnSave = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Save\"]"));


	//Methods
	public void EnterImpressionText(String text){
		InputImpressionText.sendKeys(text);
	}

	public String GetImpressionText(){
		return InputImpressionText.getText();
	}

	public void ToggleReminder(){
		ReminderToggle.click();
	}

	public void ClickCancel(){
		btnCancel.click();
	}

	public void ClickSave(){
		btnSave.click();
	}

	public void SetPickerMenuMinutes(int min){
		//Get the picker menu web element
		List<WebElement> datePicker = driver.findElements(By.className("UIAPickerWheel"));

		//Get the current minutes in the picker menu
		String currentMinutes = datePicker.get(2).getText();

		//Split the string because it contains "Minutes"
		String[] parts = currentMinutes.split(" ");

		//Convert the string to an int, add min, convert back to a string
		String minutes = String.valueOf(Integer.parseInt(parts[0]) + min);

		if (Integer.parseInt(minutes) < 10){
			minutes = "0" + minutes;
		}
		//If greater than 60, increment the hour and set the minutes to the correct value (minutes - 60)

		//Set the new values in the picker menu
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Save\"]/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]")).sendKeys("Today");
//		TouchAction swipe = new TouchAction(driver);
//		swipe.press(170, 625).moveTo(170, 626).release().perform();

		datePicker.get(2).sendKeys(minutes);

	}
}