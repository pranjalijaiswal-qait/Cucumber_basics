package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut 
{

	WebDriver driver;
	By mainButton=By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span");
	By signout=By.xpath(".//*[@id='gb_71']");
	public LogOut() {
		// TODO Auto-generated constructor stub
	}
	public void LogOutInitial(WebDriver driver)
	{
		this.driver=driver;
	}
	public void click_mainButton()
	{
		driver.findElement(mainButton).click();
	}
	public void click_signOut()
	{
		driver.findElement(signout).click();
	}
}
