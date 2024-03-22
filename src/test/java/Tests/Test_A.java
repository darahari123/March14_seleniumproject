package Tests;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_A {

public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new ChromeDriver();
	//	driver.get("https://demo.automationtesting.in/Register.html");
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
	String kar =	driver.getCurrentUrl();
	       if(kar.equals("https://www.flipkart.com/")) {
	    	   System.out.println("landed in correct application");
	       }
	       else {
	    	   System.out.println("incorrect app");
	    	   
	       }
	     String sam =  driver.getTitle();
	     System.out.println(sam);
	     if(sam.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
	     {
	    	 System.out.println("showing correct title page");
	     }
	     else {
	    	 System.out.println("showing incorrect page");
	     }
	
		driver.manage().window().fullscreen();
		  driver.manage().deleteAllCookies();
		/*driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Hari krishna");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Dara");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("krishna nagar,hyderabd");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("hari@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("132563262836");
		driver.findElement(By.name("radiooptions")).click();
		driver.findElement(By.id("checkbox1")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
				js.executeScript("window.scrollBy(0,500);");
		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		
		driver.findElement(By.xpath("//a[text()='Arabic']")).click();
		driver.findElement(By.xpath("//a[text()='Bulgarian']")).click();
		driver.findElement(By.xpath("//a[text()='Finnish']")).click();
		driver.findElement(By.xpath("//a[text()='Hindi']")).click();
		
		Select sell = new Select(driver.findElement(By.id("Skills")));
		sell.selectByVisibleText("C");
		
		Thread.sleep(5000);
		
		
		
	 
		Select se= new Select(driver.findElement(By.id("yearbox")));
		se.selectByValue("1920");
		
		Select sa= new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		sa.selectByVisibleText("May");
		
		Select seq= new Select(driver.findElement(By.id("daybox")));
		seq.selectByIndex(6);
		
		driver.findElement(By.id("firstpassword")).sendKeys("Harikrishna@12");
		driver.findElement(By.id("secondpassword")).sendKeys("Harikrishna@12");*/
		
		
		
		
		
		
		
		
		
		
	}

}
