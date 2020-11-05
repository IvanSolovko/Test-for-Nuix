package io.github.duffmanns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DecimalsTests {
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

//	enter  0.5+2.65354
		WebElement zerodot = driver
				.findElement(By.xpath("//div[@id='panel']/div[@class='row-block']//input[@value='.']"));
		zerodot.click();
		WebElement five = driver.findElement(By.id("five"));
		five.click();
		WebElement plus = driver.findElement(By.xpath("//div/div[@class='y-row']/input[@id='divide']"));
		plus.click();
		WebElement two = driver.findElement(By.id("two"));
		two.click();
		WebElement dot = driver.findElement(By.xpath("//div[@id='panel']/div[@class='row-block']//input[@value='.']"));
		dot.click();
		WebElement six = driver.findElement(By.id("six"));
		six.click();
		WebElement five1 = driver.findElement(By.id("five"));
		five1.click();
		WebElement three = driver.findElement(By.id("three"));
		three.click();
		WebElement five3 = driver.findElement(By.id("five"));
		five3.click();
		WebElement four = driver.findElement(By.id("four"));
		four.click();
		WebElement equals = driver.findElement(By.id("equals"));
		equals.click();
		WebElement total = driver.findElement(By.xpath("//div[@id='display']/div[.='3.15354']"));
		Assert.assertTrue(total.isDisplayed(), "Total is incorect");
		equals.click();
		WebElement clean = driver.findElement(By.id("clear"));
		clean.click();
		

//	enter 1.25-.25/0
		WebElement one = driver.findElement(By.id("one"));
		one.click();
		WebElement dot1 = driver.findElement(By.xpath("//div[@id='panel']/div[@class='row-block']//input[@value='.']"));
		dot1.click();
		WebElement two1 = driver.findElement(By.id("two"));
		two1.click();
		WebElement five4 = driver.findElement(By.id("five"));
		five4.click();
		WebElement minus= driver.findElement(By.id("subtract"));
		minus.click();
		WebElement dot2 = driver
				.findElement(By.xpath("//div[@id='panel']/div[@class='row-block']//input[@value='.']"));
		dot2.click();
		WebElement two2 = driver.findElement(By.id("two"));
		two2.click();
		WebElement five5 = driver.findElement(By.id("five"));
		five5.click();
		WebElement one1 = driver.findElement(By.id("one"));
		one1.click();
		WebElement zero = driver.findElement(By.id("zero"));
		zero.click();
		WebElement equals1 = driver.findElement(By.id("equals"));
		equals1.click();
		WebElement total1 = driver.findElement(By.xpath("//div[@id='display']/div[.='0.999']"));
		Assert.assertTrue(total1.isDisplayed(), "Total is incorect");
		equals.click();
		

//		close driver
			 driver.quit(); 
		
	}

}
