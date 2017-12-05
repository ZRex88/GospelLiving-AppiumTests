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
	/*
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
	*/

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
		app.impressionsScreen().TapGivenImpression(ImpressionName);

		//Change impression text
		ImpressionName += "x";
		app.editImpressionsScreen().EnterImpressionText(ImpressionName);

		//Tap save
		app.editImpressionsScreen().ClickSave();

		//Verify changes to impression were saved
		Assert.assertTrue(app.impressionsScreen().GivenImpressionExists(ImpressionName));
	}

	@Test
	public void DeleteImpression() throws InterruptedException{

		String ImpressionName = "Test1";

		//Tap Add Impression button
		app.impressionsScreen().TapCreateImpression();

		//Enter impression text
		app.editImpressionsScreen().EnterImpressionText(ImpressionName);

		//Tap save
		app.editImpressionsScreen().ClickSave();

		//Tap impression
		app.impressionsScreen().TapGivenImpression(ImpressionName);

		//Tap delete button
		app.editImpressionsScreen().ClickDelete();

		//Tap confirm delete button
		app.deleteConfirmationScreen().ClickConfirmDeleteImpression();

		//Verify impression was removed from Impressions page
		Assert.assertFalse(app.impressionsScreen().GivenImpressionExists(ImpressionName));
	}

	@Test
	public void CompleteImpression(){
		String ImpressionName = "Test1";

		//Tap Add Impression button
		app.impressionsScreen().TapCreateImpression();

		//Enter impression text
		app.editImpressionsScreen().EnterImpressionText(ImpressionName);

		//Tap save
		app.editImpressionsScreen().ClickSave();

		//Tap Impression to open edit impression menu
		app.impressionsScreen().TapGivenImpression(ImpressionName);

		//Tap complete button
		app.editImpressionsScreen().ClickComplete();

		//Tap Save
		app.editImpressionsScreen().ClickSave();

		//Verify impression was removed from Impressions page
		Assert.assertFalse(app.impressionsScreen().GivenImpressionExists(ImpressionName));

		//Tap Completed tab
		app.impressionsScreen().SelectCompleteTab();

		//Verify impression is displayed
		Assert.assertTrue(app.impressionsScreen().GivenImpressionExists(ImpressionName));
	}

	@Test
	public void AllImpressionTab(){
		String CompleteImpression = "Test1";
		String ImpressionName = "Test2";

		//Tap Add Impression button
		app.impressionsScreen().TapCreateImpression();

		//Enter impression text
		app.editImpressionsScreen().EnterImpressionText(CompleteImpression);

		//Tap save
		app.editImpressionsScreen().ClickSave();

		//Tap Impression to open edit impression menu
		app.impressionsScreen().TapGivenImpression(CompleteImpression);

		//Tap complete button
		app.editImpressionsScreen().ClickComplete();

		//Tap Save
		app.editImpressionsScreen().ClickSave();

		//Tap Add Impression button
		app.impressionsScreen().TapCreateImpression();

		//Enter impression text
		app.editImpressionsScreen().EnterImpressionText(ImpressionName);

		//Tap save
		app.editImpressionsScreen().ClickSave();

		//Tap All tab
		app.impressionsScreen().SelectAllTab();

		//Verify all impressions are displayed
		Assert.assertTrue(app.impressionsScreen().GivenImpressionExists(CompleteImpression));
		Assert.assertTrue(app.impressionsScreen().GivenImpressionExists(ImpressionName));
	}

}
