package chromeTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "D:\\java program\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement getpositionButton = driver.findElement(By.id("position"));
		Point xypoint = getpositionButton.getLocation();
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		System.out.println("X value is:"+ xValue + "Y value is :" + yValue);
		
		// find the color
		WebElement colorButton = driver.findElement(By.id("color"));
		String  color = colorButton.getCssValue("background-color");
		System.out.println("button color is :"+ color);
		
		//find the button size
		WebElement sizeElement = driver.findElement(By.id("size"));
		int height = sizeElement.getSize().getHeight();
		int width = sizeElement.getSize().getWidth();
		System.out.println("height is :"+ height + "width is :"+ width);
		
		// go to home page
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();		

	}

}
