package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LogOut;
import pages.LoginPage;

public class Test_Steps 
{
	 static WebDriver driver;
	 LoginPage login=new LoginPage();
	 LogOut logout=new LogOut();
	 HomePage home=new HomePage();
	
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/prakhersrivastava/Downloads/chromedriver_win32/chromedriver.exe");
 		driver =new ChromeDriver();
 		driver.manage().window().maximize();
 		home.HomePageInitial(driver);
		home.getHomePageDashboardUserName();
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
	}
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void User_enters_Credentials_to_LogIn(String username,String password) throws InterruptedException 
	{
		login.LoginPageInitial(driver);
		//System.out.println(driver);
        login.loginToGmail(username, password);
	    // Express the Regexp above with the code you wish you had
	    // For automatic conversion, change DataTable to List<YourType>
	    //throw new PendingException();
	}

	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully() 
	{
		System.out.println("Login Successfully");
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@When("^User LogOut from the Application$")
	public void User_LogOut_from_the_Application()
	{
		logout.LogOutInitial(driver);
		logout.click_mainButton();
		logout.click_signOut();
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void Message_displayed_LogOut_Successfully() throws Throwable {
	    System.out.println("Logout Successfully");
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
	}



}
