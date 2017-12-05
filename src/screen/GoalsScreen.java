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
		WebElement headerSpiritual = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"SPIRITUAL\"]"));
		return headerSpiritual.isDisplayed();
	}

	public boolean SocialHeaderExists(){
		WebElement headerSocial = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"SOCIAL\"]"));
		return headerSocial.isDisplayed();
	}

	public boolean PhysicalHeaderExists(){
		WebElement headerPhysical = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"PHYSICAL\"]"));
		return headerPhysical.isDisplayed();
	}

	public boolean IntellectualHeaderExists(){
		WebElement headerIntellectual = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"INTELLECTUAL\"]"));
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

	public void TapGivenGoal(String goalText){
		driver.findElementByAccessibilityId(goalText).click();
	}

	public void ClickAddGivenGoal(String goalType){
		WebElement btnAddGoal = driver.findElementByAccessibilityId("selectGoalEmphasis");
		btnAddGoal.click();
		driver.findElementByAccessibilityId(goalType).click();
	}

	public void ClickCancelAddGoal(){
		WebElement btnCancelAddGoal = driver.findElementByAccessibilityId("closeEmphasisSelector");
		btnCancelAddGoal.click();
	}
}