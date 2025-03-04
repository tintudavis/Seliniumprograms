package seliniumprogram;

public class NavigationCommands extends BaseClass{

	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommands navigation=new NavigationCommands();
		navigation.browserInitialisation();
		navigation.navigationCommands();
	}

}
