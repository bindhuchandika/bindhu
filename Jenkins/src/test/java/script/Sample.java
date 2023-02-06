package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//push
public class Sample {
	@Test
	public void m(){
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://localhost:8888/");
		   driver.findElement(By.name("user_name")).sendKeys("admin");
		   driver.findElement(By.name("user_password")).sendKeys("admin");
		   driver.findElement(By.id("submitButton")).click();
		   driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		   driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		   driver.findElement(By.xpath("(//td[@class='small'])[2]")).click();
	       driver.findElement(By.linkText("Sign Out")).click();
	       //push
	}
}
