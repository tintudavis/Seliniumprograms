package seliniumprogram;

public class BrowserCommands extends BaseClass{

	public void browserCommands()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browser=new BrowserCommands();
		browser.browserInitialisation();
		browser.browserCommands();
	}

}
