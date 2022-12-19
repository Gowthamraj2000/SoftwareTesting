package chromeTutorials;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOpening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Open chrome
		// google home page
		System.setProperty("webdriver.chrome.driver", "D:\\java program\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("agni"+Keys.ENTER);
		//driver.close();
	}

}
