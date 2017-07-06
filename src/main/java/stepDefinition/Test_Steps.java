package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	private static WebDriver driver;
	private static WebDriverWait wait;
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/prakhersrivastava/Downloads/chromedriver_win32/chromedriver.exe");
		driver =new ChromeDriver();
		
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
	}

	@When("^User Navigate to LogIn Page$")
	public void User_Navigate_to_LogIn_Page() throws Throwable {
		driver.get("http://www.gmail.com");
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@When("^User enters UserName and Password$")
	public void User_enters_UserName_and_Password() throws Throwable 
	{
		WebElement web_mail_id=driver.findElement(By.id("identifierId"));
		web_mail_id.sendKeys("pranjalijaiswal119@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		 wait = new WebDriverWait(driver, 50);
		WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	    pwd.sendKeys("alldbest@119");
		driver.findElement(By.id("passwordNext")).click();
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully() throws Throwable 
	{
		System.out.println("Login successfully");
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@When("^User LogOut from the Application$")
	public void User_LogOut_from_the_Application() throws Throwable
	{
		WebElement signout=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")));
		signout.click();
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void Message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("Logout successfully");
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}
}
