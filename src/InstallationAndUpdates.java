import org.junit.*;

public class InstallationAndUpdates extends AbstractTest {

	public InstallationAndUpdates(){}

	@Test
	public void FreshInstall() throws InterruptedException{
		//Verify app is open by finding the 4 goal cards
		Assert.assertTrue(app.homeScreen().IsGivenGoalCardDisplayed("spiritual"));
		Assert.assertTrue(app.homeScreen().IsGivenGoalCardDisplayed("social"));
		Assert.assertTrue(app.homeScreen().IsGivenGoalCardDisplayed("physical"));
		Assert.assertTrue(app.homeScreen().IsGivenGoalCardDisplayed("intellectual"));
	}
}
