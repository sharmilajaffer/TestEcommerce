package project;

import org.testng.annotations.Test;



import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class DemoTestNG {
	
  	static WebDriver driver;
  	
  	@BeforeMethod
  public void setup() throws InterruptedException {
		  	//Setting up the chrome driver exe, the second argument is the location where you have kept the driver in your system
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaffe\\Downloads\\chromedriver_win32_path\\chromedriver.exe");  	 
		  	//Setting the driver to chrome driver
		  	  driver = new ChromeDriver();
		  	  String url = " https://admin-demo.nopcommerce.com";
		  	  driver.get(url);
		  	  driver.navigate().to(url);  
		  	driver.manage().window().maximize();
		  	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	}
  	
	@Test
  	public void test() throws InterruptedException {
             driver.findElement(By.xpath("//button[@type='submit']")).click();
             //WebDriverWait wait = new WebDriverWait(driver,30);
             //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/a[@class='nav-link active']//*[contains(text(),'Catalog')][1]")));
		  	// Navigate to Categories
		        driver.findElement(By.linkText("Catalog")).click();
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  
		  	  driver.findElement(By.linkText("Products")).click();
		  	  //WebElement m = driver.findElement(By.xpath("//a[@class='nav-link active']//*[contains(text(),'Catalog')][1]"));
		  	  //m.click();
		  	  //System.out.println("Test successfull");
		        //driver.findElement(By.cssSelector("p").linkText(" Products"));
		        //driver.findElement(By.cssSelector("a")).findElement(By.linkText(" Catalog")).click();
		        //driver.findElement(By.linkText("Categories")).click();
		        
		        // Click on "Add New"
		  	    driver.findElement(By.linkText("Add new")).click();
		  	    driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("HP-Laptop2");
		  	    JavascriptExecutor js = (JavascriptExecutor)driver;
		  	    js.executeScript("scroll(0, 500);");
		  	    
			 driver.findElement(By.xpath("//div[@class='form-group row']//div[@class='k-widget k-multiselect k-multiselect-clearable']")).click();
		  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 driver.findElement(By.xpath("//div[@id='SelectedCategoryIds-list']//ul/li[1]")).click();
		  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));


		  	 // driver.findElement(By.xpath("//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]")).sendKeys("Computers");
		  	js.executeScript("scroll(0, 1000);");  
		  	  //driver.findElement(By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']")).sendKeys("Computers");
		  	    //driver.findElement(By.xpath("//*[@id='SelectedCategoryIds']")).sendKeys("Computers");
		  	    //Thread.sleep(60);
		  	    //driver.findElement(By.xpath("//*[@id='SelectedCategoryIds']")).findElement(By.xpath("//li[contains(text(),'Computers')]")).click();
		  	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		  	    //driver.findElement(By.xpath())

		  	driver.findElement(By.xpath("//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[2]/div[1]/div[2]/div[1]/div[2]/span[1]/span[1]/input[1]")).sendKeys("5000");
		  	    //driver.findElement(By.xpath("//input[@id='Price']")).sendKeys("5000");
		  	Thread.sleep(60);
		  	    driver.findElement(By.xpath("//button[@name='save']")).click();
		  	    driver.findElement(By.linkText("Categories")).click();
		  	    driver.findElement(By.xpath("//input[@id='SearchCategoryName']")).sendKeys("Computers");
		  	    Thread.sleep(60);
		  	    driver.findElement(By.xpath("//button[@id='search-categories']")).click();
		  	    
		        //driver.findElement(By.cssSelector("button[onclick='AddCategory();']")).click();
		  	  System.out.println("Test successfull");
		  	 
  }
  
  @BeforeMethod
  public void beforeMethod() { 
	  
  }
 
  @AfterMethod
  public void afterMethod() {
  	  System.out.println("Closing the browser session");
  	  driver.quit();
  }

}


