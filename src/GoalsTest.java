import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
	public void AddGoalStep(){
		String goalText = "Test1";

		//Tap add goal button

		//Tap Intellectual button

		//Enter goal text

		//Tap save
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

//	@Test
//	public void CompleteGoal(){
//		String goalText = "Test1";
//
//		//Tap add goal button
//		app.goalsScreen().ClickAddGoal();
//
//		//Tap Intellectual button
//		app.goalsScreen().ClickAddIntellectual();
//
//		//Enter goal text
//		app.editGoalScreen().EnterGoalTitle(goalText);
//
//		//Tap save
//		app.editGoalScreen().ClickSave();

		//Tap goal to open edit goal menu

		//Tap complete

		//Tap confirm complete

		//Navigate to Home page

		//Verify Goal Completion card is displayed
//	}

}
