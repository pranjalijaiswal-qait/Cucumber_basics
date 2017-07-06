package pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage
{
	    WebDriver driver;
	    By userName = By.id("identifierId");
	    By next=By.id("identifierNext");
	    By password= By.name("password");
	    By password_next = (By.id("passwordNext"));
	    
	    
	    public LoginPage() {
			// TODO Auto-generated constructor stub
		}
	    public void LoginPageInitial(WebDriver driver)
	    {
	        this.driver = driver;
	    }
		public void setUserName(String strUserName)
	    {
          driver.findElement(userName).sendKeys(strUserName);
	    }
	    public void clickNext()
	    {
	    	driver.findElement(next).click();
	    }
	    public void setPassword(String strPassword)
	    {
            driver.findElement(password).sendKeys(strPassword);
	    }
	    public void pwd_next()
	    {
	    	driver.findElement(password_next).click();
	    }
		public void loginToGmail(String username, String password)
		{
			this.setUserName(username);
	        this.clickNext();
	        this.setPassword(password);
	        this.pwd_next();
			// TODO Auto-generated method stub
			
		}
	}
