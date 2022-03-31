//java -jar selenium-server-4.1.2.jar standalone

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;

public class TestNGSelemiun {
// private WebDriver driver;
 FirefoxDriver driver1;
	ChromeDriver driver2;
 String baseURL, nodeURL;
protected ThreadLocal<RemoteWebDriver> threadDriver = null;

@BeforeClass
public void setUp() throws MalformedURLException {
	
	baseURL="https://www.calculator.net/triangle-calculator.html";
    
	  nodeURL="http://localhost:4444";

}
//@AfterClass
//public void tearDown() {
// driver.close();
//}


@Test
 public void test_Mozilla_1_TNG() throws Throwable {
    System.out.println("Executing on FireFox");
    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
    FirefoxOptions options = new FirefoxOptions();
    
    
    DesiredCapabilities capability=new DesiredCapabilities();
    capability.setBrowserName("firefox");
    capability.setPlatform(Platform.WINDOWS);

    
    driver1 = new FirefoxDriver(options);
    
    driver1.get(baseURL);
 driver1.manage().window().setSize(new Dimension(1040, 664));
 driver1.findElement(By.cssSelector(".clearbtn")).click();
 driver1.findElement(By.name("vc")).click();
 driver1.findElement(By.name("vc")).sendKeys("40");
 driver1.findElement(By.name("va")).click();
 driver1.findElement(By.name("va")).sendKeys("60");
 driver1.findElement(By.name("vb")).click();
 driver1.findElement(By.name("vb")).sendKeys("80");
 driver1.findElement(By.name("vx")).click();
 driver1.findElement(By.name("vx")).sendKeys("4");
 driver1.findElement(By.cssSelector("tr:nth-child(5) input")).click();
 assertEquals(driver1.findElement(By.cssSelector("td > h3")).getText(), "Acute Scalene Triangle");
 driver1.quit();
}


//@Test
//public void test_Mozilla_2_TNG() throws Throwable {
//   System.out.println("Executing on FireFox");
//   DesiredCapabilities capability=new DesiredCapabilities();
//   capability.setBrowserName("firefox");
//   capability.setPlatform(Platform.WINDOWS);
//   driver=new RemoteWebDriver(new URL(nodeURL),capability);
//driver.get(baseURL);
//driver.manage().window().setSize(new Dimension(1040, 664));
//driver.findElement(By.cssSelector(".clearbtn")).click();
//driver.findElement(By.name("vx")).click();
//driver.findElement(By.name("vx")).sendKeys("4");
//driver.findElement(By.name("vy")).click();
//driver.findElement(By.name("vy")).sendKeys("4");
//driver.findElement(By.name("vz")).click();
//driver.findElement(By.name("vz")).sendKeys("9");
//driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
//assertEquals(driver.findElement(By.cssSelector("p:nth-child(4)")).getText(), "The sum of two sides must be larger than the third.");
//}


@Test
public void test_Chrome_1_TNG() throws Throwable {
    System.out.println("Executing on CHROME");
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	capabilities.setBrowserName("chrome");     
	capabilities.setPlatform(Platform.WINDOWS);

	 driver2 = new ChromeDriver(options);
       
driver2.get(baseURL);
driver2.manage().window().setSize(new Dimension(1040, 664));
driver2.findElement(By.cssSelector(".clearbtn")).click();
driver2.findElement(By.name("vc")).click();
driver2.findElement(By.name("vc")).sendKeys("90");
driver2.findElement(By.name("vx")).click();
driver2.findElement(By.name("vx")).sendKeys("4");
driver2.findElement(By.name("vy")).click();
driver2.findElement(By.name("vy")).sendKeys("3");
driver2.findElement(By.cssSelector("tr:nth-child(5) input")).click();
assertEquals(driver2.findElement(By.cssSelector("td > h3")).getText(), "Right Scalene Triangle");
driver2.quit();
}

//@Test
//public void test_Chrome_2_TNG() throws Throwable {
//    System.out.println("Executing on CHROME");
//    DesiredCapabilities cap = new DesiredCapabilities();
//    cap.setBrowserName("chrome");
//    /* The execution happens on the Selenium Grid with the address mentioned earlier */
//    cap.setPlatform(Platform.WINDOWS);
//    driver = new RemoteWebDriver(new URL(nodeURL), cap);
//    //driver = new RemoteWebDriver(new URL(nodeURL), cap);
//
//	driver.manage().window().setSize(new Dimension(1040, 664));
//    driver.findElement(By.cssSelector(".clearbtn")).click();
//    driver.findElement(By.name("vc")).click();
//    driver.findElement(By.name("vc")).sendKeys("100");
//    driver.findElement(By.name("vx")).click();
//    driver.findElement(By.name("vx")).sendKeys("4");
//    driver.findElement(By.name("va")).click();
//    driver.findElement(By.name("va")).sendKeys("40");
//    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
//    assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(), "Obtuse Isosceles Triangle");
//  }
}	  

