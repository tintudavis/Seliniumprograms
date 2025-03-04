package seliniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends BaseClass
{

	public void alertsHandlingMethod()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement buttonclickok=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		buttonclickok.click();
		driver.switchTo().alert().accept();
	}
	
	public void alertsHandlingMethod1()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement buttonclick2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		buttonclick2.click();
		System.out.println(buttonclick2.isDisplayed());
		driver.switchTo().alert().dismiss();
	}
	
	public void alertsHandlingMethod2()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement buttonclick3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		buttonclick3.click();		
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		AlertHandling alerts=new AlertHandling();
		alerts.browserInitialisation();
		//alerts.alertsHandlingMethod();
		alerts.alertsHandlingMethod1();
	}

}
