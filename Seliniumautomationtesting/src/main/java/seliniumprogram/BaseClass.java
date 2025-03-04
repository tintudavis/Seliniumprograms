package seliniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public WebDriver driver;

	public void browserInitialisation()
	{
		//driver=new ChromeDriver();
		driver=new EdgeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
	
		
		//driver=new FirefoxDriver();
	}
	
	public void quitAndClose()
	{
		//driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass base=new BaseClass();
		base.browserInitialisation();
		base.quitAndClose();
	}

}
