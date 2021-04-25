
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustXc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		// customized xpath syntax   ("//tagname[@attribute='value']")  or instead of input use *.
		/* driver.findElement(By.xpath("//*[@ type='email']")).sendKeys("monaliparade0@gmail.com");
		driver.findElement(By.xpath("//input[@ type='password']")).sendKeys("monali123");
		driver.findElement(By.xpath("//*[@ value='Log In']")).click(); 
		*/
		
		//  customized css   ("tagname[attribute='value']") or no input no * direct ("[attribute='value']")   
		//or another syntax if that field had id  (" tagname#id")
		// ("tagname.classname")
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("monaliparade0@gmail.com");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("monali123");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		
	
		
		
			
		
		
	}

}
