import io.appium.java_client.AppiumDriver;
import io.appium.java_client.Setting;
import io.appium.java_client.TouchAction;
import screen.*;

public class GL {

	private final AppiumDriver driver;

	public GL(AppiumDriver driver) {
		this.driver = driver;
	}

	//Navigation bar
	public NavBar navBar() { return new NavBar(driver); }

	//Home screen
	public HomeScreen homeScreen() { return new HomeScreen(driver); }

	//Goals screen
	public GoalsScreen goalsScreen() { return new GoalsScreen(driver); }

	//Impressions screens
	public ImpressionsScreen impressionsScreen() { return new ImpressionsScreen(driver); }

	public EditImpressionScreen editImpressionsScreen() { return new EditImpressionScreen(driver);}

	//Settings screen
	public SettingsScreen settingsScreen() { return new SettingsScreen(driver); }

	//Other
	public DeleteConfirmationScreen deleteConfirmationScreen() { return new DeleteConfirmationScreen((driver));}

	/*
	Appium will close if nothing happens in one minute. This will keep Appium
	from closing for the specified amount of time, swiping every 30 seconds occasionally.
	 */
	public void TapScreenToKeepAwake(int time) throws InterruptedException{
		if (time < 30_000){
			time = 30_000;
		}
		int ThirtySecondIntervals = time/30_000; //return 4

		for (int i = 0; i < ThirtySecondIntervals;  i++){
			Thread.sleep(30_000);
			TouchAction swipeDown = new TouchAction(driver);
			swipeDown.press(100, 1000).moveTo(0, 0).release().perform();
		}
	}
}
