package project;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
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
  	}
  	
	@Test
  	public void test() throws InterruptedException {
             driver.findElement(By.xpath("//button[@type='submit']")).click();
            
		  	// Navigate to 'Catalog' Link on the left tree view 
		      driver.findElement(By.linkText("Catalog")).click();
		      
		    // Navigate to 'Products' link in the left tree view  
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  
		  	  driver.findElement(By.linkText("Products")).click();
		  	  
		    // Click on "Add New" button in Products screen 
		  	  driver.findElement(By.linkText("Add new")).click();
		  	  
		  	// Add Product name  
		  	  driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("HP-Laptop2");
		  	  JavascriptExecutor js = (JavascriptExecutor)driver;
		  	
		  	  // Scroll to locate Category select box
		  	  js.executeScript("scroll(0, 500);");
		  	    
			// Select 'Computers' Category  
		  	  driver.findElement(By.xpath("//div[@class='form-group row']//div[@class='k-widget k-multiselect k-multiselect-clearable']")).click();
		  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			  driver.findElement(By.xpath("//div[@id='SelectedCategoryIds-list']//ul/li[1]")).click();
		  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

            // Scroll to locate Price input field		  	
		  	  js.executeScript("scroll(0, 1000);");
		  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		      driver.findElement(By.xpath("//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[2]/div[1]/div[2]/div[1]/div[2]/span[1]/span[1]/input[1]")).sendKeys("5000");
		  	  
	        // Scroll up and Save the product 
		      js.executeScript("scroll(0, 0);");
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		      driver.findElement(By.xpath("//button[@name='save']")).click();
		  	  
	        // Search the Product in Category screen  
	          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));  
	          driver.findElement(By.linkText("Categories")).click();
		  	  driver.findElement(By.xpath("//input[@id='SearchCategoryName']")).sendKeys("Computers");
		      driver.findElement(By.xpath("//button[@id='search-categories']")).click();
		  	  
  }
  
  @BeforeMethod
  public void beforeMethod() { 
	  
  }
 
  @AfterMethod
  public void afterMethod() {
      System.out.println("Test successfull");
  	  System.out.println("Closing the browser session");
  	  driver.quit();
  }

}


