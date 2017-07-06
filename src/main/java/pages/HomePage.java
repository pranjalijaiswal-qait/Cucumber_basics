package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage 
{
	 WebDriver driver;
	public HomePage() {
		// TODO Auto-generated constructor stub
	}
	 public void HomePageInitial(WebDriver driver)
	 {
	    this.driver = driver;
	 }
	public void getHomePageDashboardUserName()
     {
 		driver.get("http://www.gmail.com");
	  }
}