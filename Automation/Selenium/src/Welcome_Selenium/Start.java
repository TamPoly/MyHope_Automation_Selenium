package Welcome_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khoa vang\\Desktop\\Coding\\resources\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// 1. Maximize browser của mình
		driver.manage().window().maximize();

		// 2. Trỏ đến link web
		driver.navigate().to("https://www.selenium.dev");

		// 3. Lấy title và in ra console
		System.out.println(driver.getPageSource());

		// 4. Tự động đóng trình duyệt sau X giây
		Thread.sleep(5000);

		// Quit Browser
		driver.quit();
	}
}
