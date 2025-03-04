package seliniumprogram;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleWindowHandling
{

	public WebDriver driver;
	
	public void browserinitialisation()
	{
		driver=new EdgeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement contactus=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		//h1[text()='LOGIN PORTAL']
		WebElement loginpage=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginpage.click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> multiplewindow=driver.getWindowHandles();
		String title="";
		
		for(String childwindow:multiplewindow)
		{
			if(!childwindow.equals(parent))
			{
			System.out.println("Child window "+ childwindow );
			driver.switchTo().window(childwindow);
			//System.out.println(driver.getTitle());
			title=driver.getTitle();
			}
			
			if(title.equals("WebDriver | Login Portal"))
			{
				//input[@placeholder='Username']
				WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
				username.sendKeys("tintu");
				
			}
			
			if(title.equals("WebDriver | Contact Us"))
			{
				//input[@name='first_name']
				WebElement firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
				firstname.sendKeys("Tintu");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling multiplewindow=new MultipleWindowHandling();
		multiplewindow.browserinitialisation();
	}

}
