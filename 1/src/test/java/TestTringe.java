
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;



@TestInstance(Lifecycle.PER_CLASS)
public class TestTringe {
  private WebDriver driver;
  
  @BeforeAll
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  	  driver = new ChromeDriver();
  
    
  }
  @AfterAll
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test1() {
    driver.get("https://www.calculator.net/triangle-calculator.html");
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
  @Test
  public void test2() {
    driver.get("https://www.calculator.net/triangle-calculator.html");
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
  public void test3() {
    driver.get("https://www.calculator.net/triangle-calculator.html/triangle-calculator.html");
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
  public void test4() {
    driver.get("https://www.calculator.net/triangle-calculator.html");
    driver.manage().window().setSize(new Dimension(1040, 664));
    driver.findElement(By.cssSelector(".clearbtn")).click();
    driver.findElement(By.name("vc")).click();
    driver.findElement(By.name("vc")).sendKeys("100");
    driver.findElement(By.name("va")).click();
    driver.findElement(By.name("va")).sendKeys("90");
    driver.findElement(By.name("vb")).click();
    driver.findElement(By.name("vb")).sendKeys("60");
    driver.findElement(By.name("vx")).click();
    driver.findElement(By.name("vx")).sendKeys("4");
    driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    assertEquals(driver.findElement(By.cssSelector("p:nth-child(4)")).getText(), "The sum of the three angles must equal 180° or π radians.");
  }
  @Test
  public void test5() {
    driver.get("https://www.calculator.net/triangle-calculator.html");
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
}
