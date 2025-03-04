package seliniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo extends BaseClass
{
	public void dropdowndemoeg()
	{
	 driver.navigate().to("https://selenium.qabible.in/select-input.php");
	 WebElement dropdownselect=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	 Select select=new Select(dropdownselect);
	// select.selectByContainsVisibleText("Green");
	 //select.selectByIndex(0);
	 select.selectByValue("Red");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropdownDemo dropdown=new DropdownDemo();
		dropdown.browserInitialisation();
		dropdown.dropdowndemoeg();
		
	}

}
