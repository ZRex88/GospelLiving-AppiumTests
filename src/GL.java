import io.appium.java_client.AppiumDriver;
import screen.MainScreen;

public class GL {

	private final AppiumDriver driver;

	public GL(AppiumDriver driver) {
		this.driver = driver;
	}

	public MainScreen gospelLivingScreen() { return new MainScreen(driver); }

}
