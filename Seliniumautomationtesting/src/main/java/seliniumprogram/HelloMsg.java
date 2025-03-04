package seliniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HelloMsg extends BaseClass{

	public void displayhellomsg()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> msgbox=driver.findElements(By.xpath("//input[@type='text']"));
		{
			for(WebElement msg:msgbox)
			{
				msg.sendKeys("Hello");
			
			}
		}
	}
	
	//input[@type='text']
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloMsg hellomsg=new HelloMsg();
		hellomsg.browserInitialisation();
		hellomsg.displayhellomsg();
	}

}
