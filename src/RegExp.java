import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://gmail.com");
		driver.get("https://rediff.com");

		/*
		 * Regular Expression xpath
		 * driver.findElement(By.xpath("//a[contains(@ title,'Sign in')]")).click(); css
		 */
		driver.findElement(By.cssSelector("a[class*='signin']")).click();

		// customized xpath

		driver.findElement(By.cssSelector("input#login1")).sendKeys("monaliparade");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

	}

}
