package screen;
import io.appium.java_client.*;
import org.openqa.selenium.*;


public class DeleteConfirmationScreen extends AbstractScreen {

	public DeleteConfirmationScreen(AppiumDriver driver) {super(driver);}

	//Elements



	//Methods
	public void ClickConfirmDeleteImpression(){
		WebElement btnConfirmDelete = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Delete\"]"));
		btnConfirmDelete.click();
	}

	public void ClickCancelDeleteImpression(){
		WebElement btnCancelDelete = driver.findElement(By.xpath("//XCUIElementTypeSheet[@name='Delete Impression?']/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));
		btnCancelDelete.click();
	}

	public void ClickConfirmDeleteGoal(){
		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Delete\"])[2]")).click();
	}

	public void ClickCancelDeleteGoal(){
		driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Living\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeSheet/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")).click();
	}
}
