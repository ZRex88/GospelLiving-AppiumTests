import org.junit.*;

public class NavBarTest extends AbstractTest {

	public NavBarTest(){}

	@Test
	public void NavElementsAreDisplayed(){
		//Verify Home is displayed
		Assert.assertTrue(app.navBar().HomeIsDisplayedInNavBar());

		//Verify Goals is displayed
		Assert.assertTrue(app.navBar().GoalsIsDisplayedInNavBar());

		//Verify Impressions is displayed
		Assert.assertTrue(app.navBar().ImpressionsIsDisplayedInNavBar());

		//Verify Settings is displayed
		Assert.assertTrue(app.navBar().SettingsIsDisplayedInNavBar());
	}

	@Test
	public void NavToHome() throws InterruptedException{
		//Navigate to another page so we can actually navigate to Home
		app.navBar().NavToGoals();

		//Tap Home
		app.navBar().NavToHome();

		//Verify home page is displayed by finding the 4 goal cards
		Assert.assertTrue(app.homeScreen().IsGivenGoalCardDisplayed("spiritual"));
		Assert.assertTrue(app.homeScreen().IsGivenGoalCardDisplayed("social"));
		Assert.assertTrue(app.homeScreen().IsGivenGoalCardDisplayed("physical"));
		Assert.assertTrue(app.homeScreen().IsGivenGoalCardDisplayed("intellectual"));
	}

	@Test
	public void NavToGoals() throws InterruptedException{
		//Tap Goals
		app.navBar().NavToGoals();

		//Verify Goals page is displayed by finding the goal headers
		Assert.assertTrue(app.goalsScreen().SpiritualHeaderExists());
		Assert.assertTrue(app.goalsScreen().SocialHeaderExists());
		Assert.assertTrue(app.goalsScreen().PhysicalHeaderExists());
		Assert.assertTrue(app.goalsScreen().IntellectualHeaderExists());

	}

	@Test
	public void NavToImpressions() throws InterruptedException{
		//Tap Impressions
		app.navBar().NavToImpressions();

		//Verify Impressions page is displayed by looking for the 3 tabs
		Assert.assertTrue(app.impressionsScreen().AllTabIsDisplayed());
		Assert.assertTrue(app.impressionsScreen().ActiveTabIsDisplayed());
		Assert.assertTrue(app.impressionsScreen().CompleteTabIsDisplayed());
	}

	@Test
	public void NavToSettings() throws InterruptedException{
		//Tap Settings
		app.navBar().NavToSettings();

		//Verify Settings page is displayed
		Assert.assertTrue(app.settingsScreen().SignInIsDisplayed());
		Assert.assertTrue(app.settingsScreen().SyncIsDisplayed());
	}

}
