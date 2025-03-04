package seliniumprogram;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsEg extends BaseClass{

	public void multipleCheckboxClick()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	List<WebElement> multiplecheckbox=driver.findElements(By.xpath("//input[@class='check-box-list']"));
	{
		for(WebElement listcheckbox:multiplecheckbox)
		{
			listcheckbox.click();
		}
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElementsEg multiplecheckbox=new FindElementsEg();
		multiplecheckbox.browserInitialisation();
		multiplecheckbox.multipleCheckboxClick();
	}

}
