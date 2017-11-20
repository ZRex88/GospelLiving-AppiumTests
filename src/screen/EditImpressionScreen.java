package screen;

import com.gargoylesoftware.htmlunit.javascript.host.Touch;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

	public void SetPickerMenu(){
		TouchAction act = new TouchAction(driver);
		act.press(270, 630).moveTo(270, 600).release().perform();

//		WebElement pickerMinute = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Save\"]/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[3]"));
//		String minutes = String.valueOf(Integer.parseInt(pickerMinute.getText() + 3));
//		((IOSElement)driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Save\"]/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[3]"))).setValue(minutes);
	}
}
