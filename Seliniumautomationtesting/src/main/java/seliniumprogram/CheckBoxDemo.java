package seliniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxDemo extends BaseClass{
	
	public void checkBoxDemoclick()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		//WebElement checkboxclick=driver.findElement(By.cssSelector(null))
		WebElement checkboxclick=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/input"));
		
		checkboxclick.click();
		System.out.println(checkboxclick.isSelected());
	}
	
	
	public void radioButtonClick()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radioclick=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radioclick.click();
	}
	public static void main(String[] args) 
	{
		
		CheckBoxDemo checkboxdemo=new CheckBoxDemo();
		checkboxdemo.browserInitialisation();
		checkboxdemo.checkBoxDemoclick();
		checkboxdemo.radioButtonClick();
		// TODO Auto-generated method stub

	}

}
