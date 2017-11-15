import org.junit.*;

public class InstallationAndUpdates extends AbstractTest {

	public InstallationAndUpdates(){}

	@Test
	public void FreshInstall() throws InterruptedException{
		//Verify app opens


		Assert.assertTrue(app.mainScreen().IsSpiritualCardDisplayed());
	}

	@Test
	public void FreshInstallAndLaunchWithCellularConnection() throws InterruptedException{
		//Not sure I can automate this with simulator
		//Verify app opens
	}

	@Test
	public void FreshInstallAndLaunchWithOutNetworkConnection() throws InterruptedException{
		//Disable network connection
		//Verify app opens
	}
}
