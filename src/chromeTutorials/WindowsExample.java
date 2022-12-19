package chromeTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
public class WindowsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "D:\\java program\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldwindow = driver.getWindowHandle();
		WebElement firstButton = driver.findElement(By.id("home"));
		firstButton.click();
		
		Set<String> handles = driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
			
		}
		WebElement editbox= driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();
		driver.close();
		
		driver.switchTo().window(oldwindow);
		
		WebElement openMultipleWindows = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		openMultipleWindows.click();
		//to find the total number of windows.
		int numberOfWindows = driver.getWindowHandles().size();
		System.out.println("no of windows opened: "+ numberOfWindows);
		
		WebElement dontCloseMe = driver.findElement(By.id("color"));
		dontCloseMe.click();
		Set<String> newWindowHandles = driver.getWindowHandles();
		
		for(String allWindows : newWindowHandles) {
			if(!allWindows.equals(oldwindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
		}
		driver.quit();
		
	}

}
