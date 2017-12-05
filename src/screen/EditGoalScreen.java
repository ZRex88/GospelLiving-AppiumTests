package screen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditGoalScreen extends AbstractScreen {

	public EditGoalScreen(AppiumDriver driver) {super(driver);}

	//Elements
	private WebElement inputGoalTitle = driver.findElementByAccessibilityId("goalTitle");
	private WebElement inputGoalImportant = driver.findElementByAccessibilityId("Question 0");
	private WebElement inputGoalBecomeLikeSavior = driver.findElementByAccessibilityId("Question 1");
	private WebElement btnAddStep = driver.findElement(By.xpath("//XCUIElementTypeCell[@name=\"Add Step\"]"));
	private WebElement btnAddCheckInDate = driver.findElementByAccessibilityId("Add Check In Date");

	//Methods

	public void ClickCancel(){
		WebElement btnCancel = driver.findElementByAccessibilityId("Cancel");
		btnCancel.click();
	}

	public void ClickSave(){
		WebElement btnSave = driver.findElementByAccessibilityId("Save");
		btnSave.click();
	}

	public void EnterGoalTitle(String title){
		inputGoalTitle.clear();
		inputGoalTitle.sendKeys(title);
	}

	public void EnterInputGoalImportant(String text){
		inputGoalImportant.clear();
		inputGoalImportant.sendKeys(text);
	}

	public void enterInputGoalBecomeLikeSavior(String text){
		inputGoalBecomeLikeSavior.clear();
		inputGoalBecomeLikeSavior.sendKeys(text);
	}

	public void ClickAddStep(){
		btnAddStep.click();
	}

	public void ClickAddCheckInDate(){
		btnAddCheckInDate.click();
	}

	public void ClickComplete(){
		driver.findElementByAccessibilityId("Complete").click();
	}

	public void ClickDelete(){
		driver.findElementByAccessibilityId("Delete").click();
	}

	public void ClickConfirmDelete(){
		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Delete\"])[2]")).click();
	}
}
