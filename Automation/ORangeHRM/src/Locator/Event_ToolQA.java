package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Event_ToolQA {

	public static WebDriver driver = null;

	public static void Element() throws Exception {
		driver.findElement(By.xpath("//h5[normalize-space()='Elements']")).click();
	}

	public static void checkbox() {
		driver.findElement(By.xpath("//span[normalize-space()='Check Box']")).click();
	}

	public void radio() {

	}

	public void combobox() {

	}

}
