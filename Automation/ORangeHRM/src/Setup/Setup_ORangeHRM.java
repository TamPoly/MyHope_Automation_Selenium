package Setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup_ORangeHRM {

	static WebDriver driver = null;

	public static void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khoa vang\\Desktop\\Coding\\resources\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");

		// Đăng nhập
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).submit();
	}

	public static void CloseProgram() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
