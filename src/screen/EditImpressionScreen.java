package screen;

import com.gargoylesoftware.htmlunit.javascript.host.Touch;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		InputImpressionText.clear();
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

	public void ClickDelete(){
		WebElement btnDelete = driver.findElementByAccessibilityId("Delete Impression");
		btnDelete.click();
	}
	public void ClickSave(){
		btnSave.click();
	}

	public void ClickComplete(){
		WebElement btnComplete = driver.findElementByAccessibilityId("Save Impression");
		btnComplete.click();
	}

	/*
	public void SetPickerMenuMinutes(int min) throws InterruptedException{
		//Get the picker menu web element
		List<WebElement> datePicker = driver.findElements(By.className("UIAPickerWheel"));
		WebElement dayPicker = datePicker.get(0);
		WebElement hourPicker = datePicker.get(1);
		WebElement minutePicker = datePicker.get(2);
		WebElement amPmPicker = datePicker.get(3);

		//Get the current date and time from the picker menu
		String currentDay = dayPicker.getText();
		String currentHour = hourPicker.getText();
		String currentMinutes = minutePicker.getText();


		//Split the string because it contains "Minutes"
		String[] hourParts = currentHour.split(" ");
		String[] minuteParts = currentMinutes.split(" ");

		//Convert the string to an int, add min, convert back to a string
		String futureMinutes = String.valueOf(Integer.parseInt(minuteParts[0]) + min);

		if(Integer.parseInt(futureMinutes) > 59){
			//If greater than 60, increment the hour
			String futureHour = String.valueOf(Integer.parseInt(hourParts[0]) + 1);
			//If hour is greater than 12, set futureHours to correct time and change tha AM/PM
			hourPicker.sendKeys(futureHour);

			//and set the minutes to the correct value (minutes - 60)
			String correctMinutes = String.valueOf(Integer.parseInt(futureMinutes) - 60);

		}

		if (Integer.parseInt(futureMinutes) < 10){
			futureMinutes = "0" + futureMinutes;
		}



		//Set the new values in the picker menu
		dayPicker.sendKeys("Today");
		TouchAction swipe = new TouchAction(driver);
		swipe.press(170, 625).moveTo(170, 675).release().perform();
		minutePicker.sendKeys(futureMinutes);

	}
	*/
}