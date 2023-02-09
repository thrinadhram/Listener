package ScrennShots;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners({ITestListener.class})
public class FirstTest extends BaseTest{
  @Test(testName = "TestGoogle")
  public void TestGoogle() throws Exception
  {
	  
	  driver.get("http://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("HYR Tutorials",Keys.ENTER);
	  String ExceptedValue="HYR Tutorials - Google Search";
	  String actualValue=driver.getTitle();
	  Assert.assertEquals(actualValue, ExceptedValue, "Title is MisMatch");
	  Thread.sleep(2000);
	  driver.quit();
  }
  @Test(testName = "facebook")
  public void facebook() throws Exception
  {
	  driver.get("https://www.facebook.com");
	 driver.findElement(By.xpath("//*[@name='email']")).sendKeys("HYR Tutorials");
	 // Thread.sleep(1000);
	  String actualTitle=driver.getTitle();
	 String ExceptedTitle="log in or sign up";
	  Assert.assertEquals(actualTitle, ExceptedTitle,"Title is Mismatched");
	  
	  String actuelUrl="http:/www.facebook.com/";
	  String ExceptedUrl=driver.getCurrentUrl();
	  Assert.assertEquals(actuelUrl, ExceptedUrl,"Url is MisMatched");
  }
}
