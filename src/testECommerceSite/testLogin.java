package testECommerceSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class testLogin {

	WebDriver driver = new FirefoxDriver();

	@Test(priority = 0)
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.19.1-arm7hf\\geckodriver.exe");
		driver.manage().window().maximize();
	
		driver.get("http://automationpractice.com/index.php");

	}

	@Test(priority = 1)
	public void openLoginpage() {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();

	}

	@Test(priority = 2)
	public void inputEmail() {
		driver.findElement(By.id("email")).sendKeys("ja4oti@gmail.com");
	}

	@Test(priority = 3)
	public void inputPassword() {
		driver.findElement(By.id("passwd")).sendKeys("ja4macobudo");
	}

	@Test(priority = 4)
	public void clickLoginbutton() {
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
	}
}
