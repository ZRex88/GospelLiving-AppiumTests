package screen;
import io.appium.java_client.*;
import org.openqa.selenium.*;


public class DeleteConfirmationScreen extends AbstractScreen {

	public DeleteConfirmationScreen(AppiumDriver driver) {super(driver);}

	//Elements
	private WebElement btnConfirmDelete = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Delete\"]"));
	private WebElement btnCancelDelete = driver.findElement(By.xpath("//XCUIElementTypeSheet[@name='Delete Impression?']/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));

	//Methods
	public void ClickConfirmDelete(){
		btnConfirmDelete.click();
	}

	public void ClickCancelDelete(){
		btnCancelDelete.click();
	}
}
