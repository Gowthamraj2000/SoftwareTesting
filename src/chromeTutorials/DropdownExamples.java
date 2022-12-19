package chromeTutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java program\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		//dropdown1 - id
		//dropdown2 - name
		//dropdown3 - id
		//dropdown - class
		//example - class
		
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropDown1);
		select.selectByIndex(4);
		
		select.selectByValue("2");
		
		select.selectByVisibleText("Selenium");
		
		List<WebElement> listOfOptions = select.getOptions();
		int size = listOfOptions.size();
		System.out.println("number of elememnts :"+ size);
		
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select usingSendKeys = new Select(dropDown2);
		dropDown2.sendKeys("Loadrunner");
		
		WebElement multiSelecter = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiSelectBox = new Select(multiSelecter);
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3);
		
		



	}

}
