import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import screen.*;

public class ImpressionsTest extends AbstractTest {

	public ImpressionsTest(){}

	@Before
	public void Setup(){
		app.navBar().NavToImpressions();
	}

	@Test
	public void AddImpression() throws InterruptedException {
		String ImpressionName = "Test1";

		//Tap Add Impression button
		app.impressionsScreen().TapCreateImpression();

		//Enter impression text
		app.editImpressionsScreen().EnterImpressionText(ImpressionName);

		//Tap save
		app.editImpressionsScreen().ClickSave();

		//Verify impression was added to Impressions page
		Assert.assertTrue(app.impressionsScreen().GivenImpressionExists(ImpressionName));
	}

	//I don't think it's possible to automate this. I'll return to it later -ZCH
	@Test
	public void AddImpressionWithReminder() throws InterruptedException{
		String ImpressionName = "Test1";

		//Tap Add Impression button
		app.impressionsScreen().TapCreateImpression();

		//Enter impression text
		app.editImpressionsScreen().EnterImpressionText(ImpressionName);

		//Set Reminder to true
		app.editImpressionsScreen().ToggleReminder();

		//Set reminder to 3 minutes from now
		app.editImpressionsScreen().SetPickerMenuMinutes(3);

		//Tap save
		app.editImpressionsScreen().ClickSave();

		//Wait 3 minutes
		app.TapScreenToKeepAwake(180_000);


		//Verify reminder

		//Dismiss Reminder

		//Verify impression was added to Impressions page
	}

	@Test
	public void EditImpression(){
		String ImpressionName = "Test1";

		//Tap Add Impression button
		app.impressionsScreen().TapCreateImpression();

		//Enter impression text
		app.editImpressionsScreen().EnterImpressionText(ImpressionName);

		//Tap save
		app.editImpressionsScreen().ClickSave();

		//Tap impression

		//Change impression text

		//Tap save

		//Verify changes to impression were saved

	}

	@Test
	public void DeleteImpression(){
		//Tap Add Impression button

		//Enter impression text

		//Tap save

		//Tap impression

		//Tap delete button

		//Verify impression was removed from Impressions page
	}

	@Test
	public void CompleteImpression(){
		//Tap Add Impression button

		//Enter impression text

		//Tap save

		//Tap complete button

		//Verify impression was removed from Impressions page

		//Tap Completed tab

		//Verify impression is displayed
	}

	@Test
	public void AllImpressionTab(){
		//Tap Add Impression button

		//Enter impression text

		//Tap save

		//Tap complete button

		//Tap Add Impression button

		//Enter impression text

		//Tap save

		//Tap All tab

		//Verify all impressions are displayed
	}

}
