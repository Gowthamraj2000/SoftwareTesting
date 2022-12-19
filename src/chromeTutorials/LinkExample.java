package chromeTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java program\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("http://www.leafground.com/home.html");
		//driver.findElement(By.linkText("Go to Home Page")).click();
		//driver.close();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.findElement(By.partialLinkText("Home Page")).click();
	}

}
