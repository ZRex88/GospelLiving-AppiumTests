import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import screen.GoalsScreen;

public class GoalsTest extends AbstractTest {

	public GoalsTest(){}

	private static final String SPIRITUAL = "spiritual";
	private static final String SOCIAL = "social";
	private static final String PHYSICAL = "physical";
	private static final String INTELLECTUAL = "intellectual";

	public void AddGoal(String goalType, String goalText){
		app.goalsScreen().ClickAddGivenGoal(goalType);
		app.editGoalScreen().EnterGoalTitle(goalText);
		app.editGoalScreen().ClickSave();
	}

	@Before
	public void Setup(){
		app.navBar().NavToGoals();
	}

	@Test
	public void AddSpiritualGoal(){
		String goalText = "Test1";

		//Tap add Spiritual goal button
		AddGoal(SPIRITUAL, goalText);

		//Verify goal was saved
		Assert.assertTrue(app.goalsScreen().GoalExists(goalText));
	}

	@Test
	public void AddSocialGoal(){
		String goalText = "Test1";

		//Tap add Social goal button
		AddGoal(SOCIAL, goalText);

		//Verify goal was saved
		Assert.assertTrue(app.goalsScreen().GoalExists(goalText));
	}

	@Test
	public void AddPhysicalGoal(){
		String goalText = "Test1";

		//Tap add Physical goal button
		AddGoal(PHYSICAL, goalText);

		//Verify goal was saved
		Assert.assertTrue(app.goalsScreen().GoalExists(goalText));
	}

	@Test
	public void AddIntellectualGoal(){
		String goalText = "Test1";

		//Tap add Intellectual goal button
		AddGoal(INTELLECTUAL, goalText);

		//Verify goal was saved
		Assert.assertTrue(app.goalsScreen().GoalExists(goalText));
	}

	@Test
	public void AddGoalStep() throws InterruptedException{
		String goalText = "Test1";
		String stepText = "StepTest1";

		//Tap add goal button
		AddGoal(SPIRITUAL, goalText);

		//Tap Goal to open edit menu
		app.goalsScreen().TapGivenGoal(goalText);

		//Tap Add Step button
		app.editGoalScreen().ClickAddStep();

		//Enter step text
		app.newStepScreen().EnterStepText(stepText);

		//Tap back button
		app.newStepScreen().ClickBackButton();

		//Verify step appears
		Assert.assertTrue(app.editGoalScreen().IsFirstStepDisplayed());
	}

	@Test
	public void GoalTabsDisplayCorrectGoals(){
		String goalText1 = "Test1";
		String goalText2 = "Test2";
		String goalText3 = "Test3";
		String goalText4 = "Test4";

		//Add Spiritual Goal
		AddGoal(SPIRITUAL, goalText1);

		//Add Social Goal
		AddGoal(SOCIAL, goalText2);

		//Add Physical Goal
		AddGoal(PHYSICAL, goalText3);

		//Add Intellectual Goal
		AddGoal(INTELLECTUAL, goalText4);

		//Verify all 4 goals are displayed on All tab
		Assert.assertTrue(app.goalsScreen().GoalExists(goalText1));
		Assert.assertTrue(app.goalsScreen().GoalExists(goalText2));
		Assert.assertTrue(app.goalsScreen().GoalExists(goalText3));
		Assert.assertTrue(app.goalsScreen().GoalExists(goalText4));

		//Verify Spiritual goal only displays on Spiritual tab
		app.goalsScreen().SelectSpiritualTab();
		Assert.assertTrue(app.goalsScreen().GoalExists(goalText1));
		Assert.assertFalse(app.goalsScreen().GoalExists(goalText2));
		Assert.assertFalse(app.goalsScreen().GoalExists(goalText3));
		Assert.assertFalse(app.goalsScreen().GoalExists(goalText4));

		//Verify Social goal only displays on Social tab
		app.goalsScreen().SelectSocialTab();
		Assert.assertFalse(app.goalsScreen().GoalExists(goalText1));
		Assert.assertTrue(app.goalsScreen().GoalExists(goalText2));
		Assert.assertFalse(app.goalsScreen().GoalExists(goalText3));
		Assert.assertFalse(app.goalsScreen().GoalExists(goalText4));

		//Verify Physical goal only displays on Physical tab
		app.goalsScreen().SelectPhysicalTab();
		Assert.assertFalse(app.goalsScreen().GoalExists(goalText1));
		Assert.assertFalse(app.goalsScreen().GoalExists(goalText2));
		Assert.assertTrue(app.goalsScreen().GoalExists(goalText3));
		Assert.assertFalse(app.goalsScreen().GoalExists(goalText4));

		//Verify Intellectual goal only displays on Intellectual tab
		app.goalsScreen().SelectIntellectualTab();
		Assert.assertFalse(app.goalsScreen().GoalExists(goalText1));
		Assert.assertFalse(app.goalsScreen().GoalExists(goalText2));
		Assert.assertFalse(app.goalsScreen().GoalExists(goalText3));
		Assert.assertTrue(app.goalsScreen().GoalExists(goalText4));
	}

	@Test
	public void CompleteGoal(){
		String goalText = "Test1";

		//Add a Spiritual goal
		AddGoal(SPIRITUAL, goalText);

		//Tap goal to open edit goal menu
		app.goalsScreen().TapGivenGoal(goalText);

		//Tap complete
		app.editGoalScreen().ClickComplete();

		//Tap confirm complete
		app.completeConfirmationScreen().ClickConfirmComplete();

		//Navigate to Home page
		app.navBar().NavToHome();

		//Verify Goal Completion card is displayed
		app.homeScreen().IsGivenCompletedGoalCardDisplayed(goalText);
	}

	@Test
	public void DeleteGoal(){
		String goalText = "Test1";

		//Add a Spiritual goal
		AddGoal(SPIRITUAL, goalText);

		//Tap goal to open edit goal menu
		app.goalsScreen().TapGivenGoal(goalText);

		//Tap delete
		app.editGoalScreen().ClickDelete();

		//Tap confirm delete
		app.deleteConfirmationScreen().ClickConfirmDeleteGoal();

		//Verify goal no longer appears on goals page
		Assert.assertFalse(app.goalsScreen().GoalExists(goalText));
	}
}
