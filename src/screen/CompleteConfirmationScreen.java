package screen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class CompleteConfirmationScreen extends AbstractScreen{

	public CompleteConfirmationScreen(AppiumDriver driver) {super(driver);}

	public void ClickConfirmComplete(){
		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Complete\"])[2]")).click();
	}

	public void ClickCancelComplete(){
		driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Living\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeSheet/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")).click();
	}

}
