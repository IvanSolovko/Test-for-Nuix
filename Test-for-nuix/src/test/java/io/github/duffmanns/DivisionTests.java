package io.github.duffmanns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTests {
	@Test
	public void additionTest() {
		System.out.println("DivisionTest started");

//	create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	open test page
		String url = "https://duffmanns.github.io/calc-test/calculator/app/index.html";
		driver.get(url);
		System.out.println("Page is open");

//	max brw window
		driver.manage().window().maximize();

//	enter  5/1
		WebElement five = driver.findElement(By.id("five"));
		five.click();
		WebElement divide = driver.findElement(By.cssSelector("[value='÷']"));
		divide.click();
		WebElement one = driver.findElement(By.id("one"));
		one.click();
		WebElement equals = driver.findElement(By.id("equals"));
		equals.click();
		WebElement clean = driver.findElement(By.id("clear"));
		clean.click();

//		 enter 6/2

		WebElement six = driver.findElement(By.id("six"));
		six.click();
		WebElement divide1 = driver.findElement(By.cssSelector("[value='÷']"));
		divide1.click();
		WebElement two = driver.findElement(By.id("two"));
		two.click();
		WebElement equals1 = driver.findElement(By.id("equals"));
		equals1.click();
		WebElement clean1 = driver.findElement(By.id("clear"));
		clean1.click();

//		 enter 100/2
		WebElement one1 = driver.findElement(By.id("one"));
		one1.click();
		WebElement zero = driver.findElement(By.id("zero"));
		zero.click();
		zero.click();
		WebElement divide2 = driver.findElement(By.cssSelector("[value='÷']"));
		divide2.click();
		WebElement two2 = driver.findElement(By.id("two"));
		two2.click();
		WebElement equals2 = driver.findElement(By.id("equals"));
		equals2.click();
		WebElement total = driver.findElement(By.xpath("//div[@id='display']/div[.='50']"));
		  Assert.assertTrue(total.isDisplayed(),"Total is incorect");
		WebElement clean2 = driver.findElement(By.id("clear"));
		clean2.click();

//		 enter 0/2
		WebElement zero2 = driver.findElement(By.id("zero"));
		zero2.click();
		WebElement divide4 = driver.findElement(By.cssSelector("[value='÷']"));
		divide4.click();
		WebElement two1 = driver.findElement(By.id("two"));
		two1.click();
		WebElement equals3 = driver.findElement(By.id("equals"));
		equals3.click();
		WebElement clean3 = driver.findElement(By.id("clear"));
		clean3.click();

//		 enter 4/0
		WebElement four = driver.findElement(By.id("four"));
		four.click();
		WebElement divide5 = driver.findElement(By.cssSelector("[value='÷']"));
		divide5.click();
		WebElement zero3 = driver.findElement(By.id("two"));
		zero3.click();
		WebElement equals4 = driver.findElement(By.id("equals"));
		equals4.click();
		WebElement clean4 = driver.findElement(By.id("clear"));
		clean4.click();

//		close driver
			 driver.quit(); 
		
	}

}
