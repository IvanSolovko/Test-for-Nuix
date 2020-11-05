package io.github.duffmanns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AdditionTests {
	@Test
public void additionTest() {
	System.out.println("AdditionTest started");

//	create driver
	System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe"); 
	WebDriver driver= new ChromeDriver();
	
//	open test page
	String url = "https://duffmanns.github.io/calc-test/calculator/app/index.html";
	driver.get(url);
	System.out.println("Page is open"); 
	
//	max brw window
	driver.manage().window().maximize();
	
//	enter  1+3
		WebElement one = driver.findElement(By.id("one"));
		one.click();
		WebElement plus = driver.findElement(By.xpath("//div/div[@class='y-row']/input[@id='divide']"));
		plus.click();
		WebElement three = driver.findElement(By.id("three"));
		three.click();
		WebElement equals = driver.findElement(By.id("equals"));
		equals.click();
		 WebElement c = driver.findElement(By.id("clear"));
		 c.click();
		 
		 
//  enter 5+6
		
		  WebElement five = driver.findElement(By.id("five")); five.click(); 
		  WebElement plus1 = driver.findElement(By.xpath("//div/div[@class='y-row']/input[@id='divide']"));
		plus1.click();
		  
		  WebElement six = driver.findElement(By.id("six")); 
		  six.click(); 
		  WebElement equals1 = driver.findElement(By.id("equals"));
		  equals1.click(); 
		  WebElement c1 = driver.findElement(By.id("clear"));
		  c1.click(); 
		  // enter 3+7 
		  WebElement three1 = driver.findElement(By.id("three")); 
		  three1.click(); 
		  WebElement plus2 = driver.findElement(By.xpath("//div/div[@class='y-row']/input[@id='divide']"));	
		  plus2.click(); 
		  WebElement seven = driver.findElement(By.id("seven")); 
		  seven.click(); 
		  WebElement equals2 = driver.findElement(By.id("equals")); 
		  equals2.click(); 
		  WebElement c2 = driver.findElement(By.id("clear")); 
		  c2.click();
		  
		  
		  // Add all of the three together 
		  WebElement one1 = driver.findElement(By.id("one")); 
		  one1.click(); 
		  WebElement plus3 = driver.findElement(By.xpath("//div/div[@class='y-row']/input[@id='divide']")); 
		  plus3.click(); 
		  WebElement three2 = driver.findElement(By.id("three")); 
		  three2.click(); 
		  WebElement plus4 = driver.findElement(By.xpath("//div/div[@class='y-row']/input[@id='divide']")); 
		  plus4.click(); 
		  WebElement five1 = driver.findElement(By.id("five")); 
		  five1.click(); 
		  WebElement plus5 = driver.findElement(By.xpath("//div/div[@class='y-row']/input[@id='divide']")); 
		  plus5.click(); 
		  WebElement six2 = driver.findElement(By.id("six")); 
		  six2.click(); 
		  WebElement plus6 = driver.findElement(By.xpath("//div/div[@class='y-row']/input[@id='divide']")); 
		  plus6.click();
		  WebElement three3 = driver.findElement(By.id("three")); 
		  three3.click(); 
		  WebElement plus7 = driver.findElement(By.xpath("//div/div[@class='y-row']/input[@id='divide']")); 
		  plus7.click(); 
		  WebElement seven1 = driver.findElement(By.id("seven"));
		  seven1.click(); 
		  WebElement equals3 = driver.findElement(By.xpath("//div/div[@class='y-row']/input[@id='divide']")); 
		  equals3.click(); 
// verify the whole total
		  
		  WebElement total = driver.findElement(By.xpath("//div[@id='display']/div[.='25']"));
		  Assert.assertTrue(total.isDisplayed(),"Total is incorect");
		 	
//	close driver
		 driver.quit(); 
	
}
}
