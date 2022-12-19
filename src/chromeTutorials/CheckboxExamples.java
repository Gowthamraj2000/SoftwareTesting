package chromeTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "D:\\java program\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement java = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		java.click();
		WebElement clangueage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[4]"));
		clangueage.click();
		
		WebElement seleniumDriver = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
		boolean seleniumSelected = seleniumDriver.isSelected();
		System.out.println(seleniumSelected);
		
		WebElement firstElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		if(firstElement.isSelected()) {
			firstElement.click();
		}
		else {
			System.out.println("firstElement is not selected");
		}
		
		WebElement secondElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		if(secondElement.isSelected()) {
			secondElement.click();
		}
		else {
			System.out.println("secondElement is not selected");
		}
		
		WebElement opTion1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[1]"));
		opTion1.click();
		WebElement opTion2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[2]"));
		opTion2.click();
		WebElement  opTion3 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[3]"));
		 opTion3.click();
		WebElement  opTion4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[4]"));
		opTion4.click();
		WebElement  opTion5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[5]"));
		opTion5.click();
		WebElement  opTion6 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[6]"));
		opTion6.click();
		
	}

}
