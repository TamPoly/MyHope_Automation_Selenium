package basic_funtions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Funtions{

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khoa vang\\Desktop\\Coding\\resources\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// Thời gian chờ ngầm định, 10s không tìm thấy thì fail
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		// Login vào OrangeHRM
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);

		// truy cập vào PIM menu
		driver.findElement(
				By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']"))
				.click();

		// truy cập vào Add Employee
		driver.findElement(By.xpath("//a[normalize-space()='Add Employee']")).click();

		// Phương thức này xác định xem một phần tử hiện đang được hiển thị hay không
		boolean headerTitle = driver.findElement(By.xpath("//h6[normalize-space()='Add Employee']")).isDisplayed();
		if (headerTitle == true) {
			System.out.println("Add Employee screen");
		}

		WebElement firstName = driver.findElement(By.name("firstName"));
		WebElement middleName = driver.findElement(By.name("middleName"));
		WebElement lastName = driver.findElement(By.name("lastName"));

		boolean first = firstName.isEnabled();
		boolean middle = middleName.isEnabled();
		boolean last = lastName.isEnabled();

		if (first) {
			firstName.sendKeys("Nguyen");
			Thread.sleep(1000);
		}
		if (middle) {
			middleName.sendKeys("Van");
			Thread.sleep(1000);
		}
		if (last) {
			lastName.sendKeys("A");
			Thread.sleep(1000);
		}

		boolean iconSwitch = driver
				.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"))
				.isSelected();

		if (iconSwitch == false) {
			driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"))
					.click();
			Thread.sleep(2000);
			System.out.println("Turned on Create Login Details");
		}
		
		//Trở về màn hìn List
		driver.findElement(By.xpath("//a[normalize-space()='Employee List']")).click();
		
		List<WebElement> thList = driver.findElements(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']"));	

		for(int i=0; i < thList.size(); i++) {
			//Chạy từ 0 đến < độ dài của List
			//In ra giá trị Text của thẻ th
			System.out.println(thList.get(i).getText());
			
			//In ra Text của thẻ HTML -- vd: div, button, input, form, table,...
			String tagName = driver.findElement(By.xpath("//button[normalize-space()='Search']")).getTagName();
			System.out.println(tagName);
			
			//In ra Text giá trị của CSS
			String cssValue = driver.findElement(By.xpath("//button[normalize-space()='Search']")).getCssValue("background-color");
			System.out.println(cssValue);
			
			//In ra tên thuộc tính trong thẻ HTML
			String getAttribute = driver.findElement(By.xpath("//button[normalize-space()='Search']")).getAttribute("type");
			System.out.println(getAttribute);
			
			//In ra kích thước của element
			WebElement getDimension = driver.findElement(By.xpath("//div[@class='orangehrm-container']"));
			Dimension dimension = getDimension.getSize();
			System.out.println("Width: " + dimension.getWidth() + " Height: " + dimension.getHeight());
			
			//In ra vị trí của phần tử theo tọa độ (X, Y)
			WebElement getPoint = driver.findElement(By.xpath("//div[contains(text(),'QA Lead')]"));
			Point point = getPoint.getLocation();
			System.out.println("X: " + point.x + " Y: " + point.y);
			
			Thread.sleep(3000);
		}
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
