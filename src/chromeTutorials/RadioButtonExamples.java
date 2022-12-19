package chromeTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExamples {

	public static void main(String[] args) {
		// obs 22.0.2
		System.setProperty("webdriver.chrome.driver",  "D:\\java program\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement unChecked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]"));
		
		WebElement checked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]"));
		
		boolean status1 = unChecked.isSelected();
		boolean status2 = checked.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement below20 = driver.findElement(By.name("age"));
		below20.click();
		
		
	}

}
