import io.appium.java_client.AppiumDriver;
import io.appium.java_client.Setting;
import screen.*;

public class GL {

	private final AppiumDriver driver;

	public GL(AppiumDriver driver) {
		this.driver = driver;
	}

	public NavBar navBar() { return new NavBar(driver); }

	public HomeScreen homeScreen() { return new HomeScreen(driver); }

	public GoalsScreen goalsScreen() { return new GoalsScreen(driver); }

	public ImpressionsScreen impressionsScreen() { return new ImpressionsScreen(driver); }

	public EditImpressionScreen editImpressionsScreen() { return new EditImpressionScreen(driver);}

	public SettingsScreen settingsScreen() { return new SettingsScreen(driver); }

}
