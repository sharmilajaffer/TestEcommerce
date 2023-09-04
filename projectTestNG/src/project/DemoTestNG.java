package project;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DemoTestNG {
	
  	static WebDriver driver;
  	
  	@BeforeMethod
  public void setup() throws InterruptedException {
		  	//Setting up the chrome driver exe, the second argument is the location where you have kept the driver in your system
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver.exe");  	 
		  	//Setting the driver to chrome driver
  		     System.setProperty("webdriver.gecko.driver","C:\\Users\\jaffe\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe"); // Setting system properties of FirefoxDriver
  		// Create a new instance of the Firefox driver
  		    FirefoxOptions options = new FirefoxOptions();
  			 driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
		  	 //driver = new ChromeDriver();
		  	  String url = " https://admin-demo.nopcommerce.com";
		  	  driver.get(url);
		  	  driver.navigate().to(url);  
		  	driver.manage().window().maximize();
  	}
  	
	@Test
  	public void test() throws InterruptedException {
             driver.findElement(By.xpath("//button[@type='submit']")).click();
             //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            // Thread.sleep(3000);
		  	// Navigate to 'Catalog' Link on the left tree view
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		      driver.findElement(By.linkText("Catalog")).click();
		      
		    // Navigate to 'Products' link in the left tree view  
		      //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  
		      Thread.sleep(300);
		  	  driver.findElement(By.linkText("Categories")).click();
		  	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  	Thread.sleep(300);
		    // Click on "Add New" button in Products screen 
		  	 driver.findElement(By.linkText("Add new")).click();
		  	 //driver.findElement(By.xpath("//html/body/div[3]/div[1]/div[1]/div/a")).click();
		  	
		  	//*[@id="Name"]
		  	// Add Product name  
		  	//driver.findElement(By.id("Name")).sendKeys("HP-Laptop2");;
		  	//driver.findElement(By.cssSelector("input#Name.form-control.text-box.single-line")).sendKeys("HP-Laptop2");
		  	 driver.findElement(By.xpath("//*[@id='Name']")).sendKeys("HP-Laptop2");
		  	  JavascriptExecutor js = (JavascriptExecutor)driver;
		  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  	//driver.findElement(By.xpath("//*[@id=\"Description_ifr\"]")).sendKeys("HP-Laptop2");
		  	   js = (JavascriptExecutor)driver;
		  	   
		  	// Create object of the Select class
		  	 Select se = new Select(driver.findElement(By.xpath("//*[@id=\"ParentCategoryId\"]")));
		  	 			
		  	 // Select the option with value "6"
		  	 se.selectByValue("1");
		  	
		  	  // Scroll to locate Category select box
		  	  js.executeScript("scroll(0, 500);");
		  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  	String filepath = "C:\\Users\\jaffe\\Downloads\\hp_Laptop.jpg";
		  	driver.findElement(By.name("qqfile")).sendKeys(filepath);
		  //	driver.findElement(By.xpath("//input[@id=\"nestedSetting874054657\"]/div[1]/div[2]/span[1]/span/input[1]")).sendKeys("500.00");
		  	//driver.findElement(By.xpath("//input[@id=\"nestedSetting874054657\"]/div[2]/div[2]/span[1]/span/input[1]")).sendKeys("1500.00");
		  	
		  	

		  	  
		  	    
			// Select 'Computers' Category  
//		  	  driver.findElement(By.xpath("//div[@class='form-group row']//div[@class='k-widget k-multiselect k-multiselect-clearable']")).click();
//		  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//			  driver.findElement(By.xpath("//div[@id='SelectedCategoryIds-list']//ul/li[1]")).click();
//		  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//            // Scroll to locate Price input field		  	
//		  	  js.executeScript("scroll(0, 1000);");
		  	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		    //  driver.findElement(By.xpath("//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[2]/div[1]/div[2]/div[1]/div[2]/span[1]/span[1]/input[1]")).sendKeys("5000");
//		  	  
	        // Scroll up and Save the product 
		    // js.executeScript("scroll(0, 0);");
		  	Thread.sleep(5000);
		      //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		      driver.findElement(By.name("save")).click();
		      Thread.sleep(5000);
		      
		      driver.findElement(By.name("SearchCategoryName")).sendKeys("HP-Laptop2");
		      Thread.sleep(5000);
		      
		      driver.findElement(By.id("search-categories")).click();
		      
		      Thread.sleep(5000);
		      driver.findElement(By.className("mastercheckbox")).click();
		      Thread.sleep(5000);
		      driver.findElement(By.id("delete-selected")).click();
		      Thread.sleep(5000);
		      driver.findElement(By.id("delete-selected-action-confirmation-submit-button")).click();
		      Thread.sleep(5000);

//	        // Search the Product in Category screen  
//	          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));  
//	          driver.findElement(By.linkText("Categories")).click();
//		  	  driver.findElement(By.xpath("//input[@id='SearchCategoryName']")).sendKeys("Computers");
//		      driver.findElement(By.xpath("//button[@id='search-categories']")).click();
//		   
//		      //driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]"));
//		      //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//		  	  // Scroll to locate Category select box
//		  	  js.executeScript("scroll(0, 200);");
//		  	  //driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
//		      //driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]"))
//		  	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//		      driver.findElement(By.linkText("Edit")).click();
//		      //driver.findElement(By.xpath("//a[normalize-space()="Edit"]"));
//		      //*[@id="categories-grid"]/tbody/tr[2]/td[2]
//		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//		      //driver.findElement(By.linkText("Delete")).click();
//		      js.executeScript("scroll(0, 1000);");
//		      
//		      driver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[1]")).click();
		      //driver.findElement(By.xpath("//a[contains(@class,'btn btn-default')][normalize-space()='Delete'])[1]")).click();
		      
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





