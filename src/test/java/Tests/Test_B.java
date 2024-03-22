package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test_B {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	//driver.findElement(By.linkText("Register")).click();
	Actions act = new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN);
	
	/*JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,350)");*/
	/*driver.findElement(By.name("customer.firstName")).sendKeys("Hareram");
	driver.findElement(By.name("customer.lastName")).sendKeys("krishna");
	driver.findElement(By.id("customer.address.street")).sendKeys("krishna nagar");
	driver.findElement(By.id("customer.address.city")).sendKeys("kurnool");
	driver.findElement(By.id("customer.address.state")).sendKeys("AP");
	driver.findElement(By.id("customer.address.zipCode")).sendKeys("518002");
	driver.findElement(By.id("customer.phoneNumber")).sendKeys("8635487463");
	driver.findElement(By.id("customer.ssn")).sendKeys("86354");
	driver.findElement(By.id("customer.username")).sendKeys("Harikrishna");
	driver.findElement(By.id("customer.password")).sendKeys("Harikrishna@1");
	driver.findElement(By.id("repeatedPassword")).sendKeys("Harikrishna@1");
	driver.findElement(By.xpath("//input[@value='Register']")).click();*/
	
	driver.findElement(By.name("username")).sendKeys("Harikrishna");
	driver.findElement(By.name("password")).sendKeys("Harikrishna@1");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.linkText("Open New Account")).click();
	Select sel = new Select(driver.findElement(By.id("type")));
	sel.selectByIndex(1);
	 Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='button']")).click();
	String har =driver.findElement(By.tagName("a")).getAttribute("href");
	System.out.println(har);
	
	driver.findElement(By.linkText("Log Out")).click();
	

	}

}
