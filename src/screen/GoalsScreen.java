package screen;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoalsScreen extends AbstractScreen {

	public GoalsScreen(AppiumDriver driver) {super(driver);}

	//Elements
	private WebElement AllTab = driver.findElementByAccessibilityId("All");
	private WebElement SpiritualTab = driver.findElementByAccessibilityId("Spiritual");
	private WebElement SocialTab = driver.findElementByAccessibilityId("Social");
	private WebElement PhysicalTab = driver.findElementByAccessibilityId("Physical");
	private WebElement IntellectualTab = driver.findElementByAccessibilityId("Intellectual");
	private WebElement headerSpiritual = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"SPIRITUAL\"]"));
	private WebElement headerSocial = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"SOCIAL\"]"));
	private WebElement headerPhysical = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"PHYSICAL\"]"));
	private WebElement headerIntellectual = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"INTELLECTUAL\"]"));
	private WebElement btnAddGoal = driver.findElementByAccessibilityId("selectGoalEmphasis");

	//Methods
	public void SelectAllTab(){
		AllTab.click();
	}

	public void SelectSpiritualTab(){
		SpiritualTab.click();
	}

	public void SelectSocialTab(){
		SocialTab.click();
	}

	public void SelectPhysicalTab(){
		PhysicalTab.click();
	}

	public void SelectIntellectualTab(){
		IntellectualTab.click();
	}

	public boolean SpiritualHeaderExists(){
		return headerSpiritual.isDisplayed();
	}

	public boolean SocialHeaderExists(){
		return headerSocial.isDisplayed();
	}

	public boolean PhysicalHeaderExists(){
		return headerPhysical.isDisplayed();
	}

	public boolean IntellectualHeaderExists(){
		return headerIntellectual.isDisplayed();
	}

	public boolean GoalExists(String goalText){
		try{
			return driver.findElementByAccessibilityId(goalText).isDisplayed();
		}
		catch(Exception e){
			return false;
		}

	}

	public void ClickAddGivenGoal(String goalType){
		btnAddGoal.click();
		driver.findElementByAccessibilityId(goalType).click();
	}
//
//
//	public void ClickAddSpiritual(){
//		WebElement btnSpiritual =
//		btnSpiritual.click();
//	}
//
//	public void ClickAddSocial(){
//		WebElement btnSocial = driver.findElementByAccessibilityId("social");
//		btnSocial.click();
//	}
//
//	public void ClickAddPhysical(){
//		WebElement btnPhysical = driver.findElementByAccessibilityId("physical");
//		btnPhysical.click();
//	}
//
//	public void ClickAddIntellectual(){
//		WebElement btnIntellectual = driver.findElementByAccessibilityId("intellectual");
//		btnIntellectual.click();
//	}

	public void ClickCancelAddGoal(){
		WebElement btnCancelAddGoal = driver.findElementByAccessibilityId("closeEmphasisSelector");
		btnCancelAddGoal.click();
	}
}
