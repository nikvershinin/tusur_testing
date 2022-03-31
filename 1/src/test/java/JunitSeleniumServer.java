import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//java -jar selenium-server-4.1.2.jar standalone

@TestInstance (Lifecycle.PER_CLASS)
public class JunitSeleniumServer {

	private WebDriver driver;
	  
	  String baseURL, nodeURL;
	  protected ThreadLocal<RemoteWebDriver> threadDriver = null;
	   
	  @BeforeAll
	  public void setUp_1() throws MalformedURLException {
	      baseURL="https://www.calculator.net/triangle-calculator.html";
	      
		  nodeURL="http://localhost:4444";
	      
	          }
	  @AfterEach
	  public void tearDown_1() {
	   driver.close();
	  }
	    
	  @Test
	  public void test_Mozilla_1()throws Throwable {
		  System.out.println("Executing on FireFox");
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setBrowserName("chrome");
		  cap.setPlatform(Platform.WINDOWS);
		       
		  driver = new RemoteWebDriver(new URL(nodeURL), cap);
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
		  driver.get(baseURL);
		  driver.manage().window().setSize(new Dimension(1040, 664));
	    driver.findElement(By.cssSelector(".clearbtn")).click();
	    driver.findElement(By.name("vc")).click();
	    driver.findElement(By.name("vc")).sendKeys("40");
	    driver.findElement(By.name("va")).click();
	    driver.findElement(By.name("va")).sendKeys("60");
	    driver.findElement(By.name("vb")).click();
	    driver.findElement(By.name("vb")).sendKeys("80");
	    driver.findElement(By.name("vx")).click();
	    driver.findElement(By.name("vx")).sendKeys("4");
	    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
	    assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(), "Acute Scalene Triangle");
	  }
	  
	  @Test
	  public void test_Mozila_2()throws Throwable {
		  System.out.println("Executing on FireFox");
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setBrowserName("chrome");
		  cap.setPlatform(Platform.WINDOWS);
		       
		  driver = new RemoteWebDriver(new URL(nodeURL), cap);
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
		  driver.get(baseURL);
		  driver.manage().window().setSize(new Dimension(1040, 664));
	    driver.findElement(By.cssSelector(".clearbtn")).click();
	    driver.findElement(By.name("vx")).click();
	    driver.findElement(By.name("vx")).sendKeys("4");
	    driver.findElement(By.name("vy")).click();
	    driver.findElement(By.name("vy")).sendKeys("4");
	    driver.findElement(By.name("vz")).click();
	    driver.findElement(By.name("vz")).sendKeys("9");
	    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
	    assertEquals(driver.findElement(By.cssSelector("p:nth-child(4)")).getText(), "The sum of two sides must be larger than the third.");
	  } 
	  
	  @Test
	  public void test_Chrome_1() throws Throwable {
	  System.out.println("Executing on CHROME");
	  DesiredCapabilities cap = new DesiredCapabilities();
	  cap.setBrowserName("chrome");
	  cap.setPlatform(Platform.WINDOWS);
	       
	    driver = new RemoteWebDriver(new URL(nodeURL), cap);
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
	    driver.get(baseURL);
	    driver.manage().window().setSize(new Dimension(1040, 664));
	    driver.findElement(By.cssSelector(".clearbtn")).click();
	    driver.findElement(By.name("vc")).click();
	    driver.findElement(By.name("vc")).sendKeys("90");
	    driver.findElement(By.name("vx")).click();
	    driver.findElement(By.name("vx")).sendKeys("4");
	    driver.findElement(By.name("vy")).click();
	    driver.findElement(By.name("vy")).sendKeys("3");
	    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
	    assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(), "Right Scalene Triangle");
	  }
	  
	  
	  @Test
	  public void test_Chrome_2() throws Throwable{
      System.out.println("Executing on CHROME");
      DesiredCapabilities cap = new DesiredCapabilities();
      cap.setBrowserName("chrome");
      cap.setPlatform(Platform.WINDOWS);       
		driver = new RemoteWebDriver(new URL(nodeURL), cap);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
		driver.get(baseURL);
		driver.manage().window().setSize(new Dimension(1040, 664));
	    driver.findElement(By.cssSelector(".clearbtn")).click();
	    driver.findElement(By.name("vc")).click();
	    driver.findElement(By.name("vc")).sendKeys("100");
	    driver.findElement(By.name("vx")).click();
	    driver.findElement(By.name("vx")).sendKeys("4");
	    driver.findElement(By.name("va")).click();
	    driver.findElement(By.name("va")).sendKeys("40");
	    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
	    assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(), "Obtuse Isosceles Triangle");
	  }
}	  
	  
	  
