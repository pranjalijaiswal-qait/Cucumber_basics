package cucumber_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {
     private static WebDriver driver=null;
     
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:/Users/prakhersrivastava/Downloads/chromedriver_win32/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		WebElement web_mail_id=driver.findElement(By.id("identifierId"));
		web_mail_id.sendKeys("pranjalijaiswal119@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	    pwd.sendKeys("alldbest@119");
		driver.findElement(By.id("passwordNext")).click();
		WebElement signout=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")));
		signout.click();
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
