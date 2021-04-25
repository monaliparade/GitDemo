import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrchRel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\driverstudy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("testing");

		// driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("hi");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[3]/div/span/svg")).click();

	}

}
