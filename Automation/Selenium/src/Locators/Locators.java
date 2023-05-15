package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khoa vang\\Desktop\\Coding\\resources\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://login.suno.vn");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		// Đối tượng của WebElement
		// Click vào button
		// WebElement button_Login = driver.findElement(By.id("header_login"));
		// button_Login.click();

		WebElement username = driver.findElement(By.name("Username"));
		username.sendKeys("omitester2022@gmail.com");

		WebElement password = driver.findElement(By.name("Password"));
		password.sendKeys("Quakhumoi137");

		WebElement submit_Login = driver.findElement(By.name("button"));
		submit_Login.click();
		Thread.sleep(1000);

		// có thể thay thế linkText bằng partialLinkText để lấy 1 phần của Text
		WebElement link_Text = driver.findElement(By.linkText("Hàng hoá"));
		link_Text.click();
		Thread.sleep(3000);

		/*
		 * Các loại CSS Selector 
		 * 1. Tag and ID: css=tag#id 2. Tag and Class: css=tag.class 
		 * 3. Tag and Attribute: css=tag[attribute=value] 4. Tag, Class,and Attribute 
		 * 5. Sub-String Matches 
		 * 5.1. Starts With (^) 
		 * 5.2. Ends With ($)
		 * 5.3. Contains (*) 
		 * 6. Child Elements 
		 * 6.1. Direct Child 
		 * 6.2. Sub-child 
		 * 6.3. nth-child
		 */

		// cssSelector Tag - ID
		WebElement cssSelector_button = driver.findElement(By.cssSelector("button#btn_product_add"));
		cssSelector_button.click();
		Thread.sleep(3000);

		// cssSelector Tag - Class
		WebElement cssSelector_input = driver.findElement(By.cssSelector("input.mat-input-element")); //Chưa thể truy vấn cụ thể
		
		//WebElement cssSelector_input = driver.findElement(By.xpath("//input[@id='productName']"));
		cssSelector_input.sendKeys("Khóa học Selenium");



		// cssSelector Tag - Attribute
		WebElement cssSelector_attribute = driver
				.findElement(By.cssSelector("input[id='mat-input-2']"));
		cssSelector_attribute.sendKeys("2001");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@id=\'createGoodsStep3\']/mat-bar-button/button")).click();
		Thread.sleep(10000);
		
		
		// Quit Browser
		driver.quit();
		
		

	}

}
