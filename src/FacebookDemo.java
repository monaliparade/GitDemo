import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo

{
	    public static void main(String[] args) {
		// TODO Auto-generated method stub

          WebDriver driver= new ChromeDriver();
          System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver.exe");

		
          //driver.get("https://google.com");
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("monaliparade0@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Mona123");
		
	    //driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("123456");  // both email nd pass having same class name so i will enter value in email nt in pass..as selenium scan from top to bottom if having same class name. 
			//driver.findElement(By.cssSelector());
		 driver.findElement(By.xpath("//*[@id='u_0_b']")).click();     //login button
		 driver.findElement(By.linkText("forgotten account?")).click();
		//System.out.println( driver.findElement(By.cssSelector("div._4rbf._53ij")).getText());
			
		//driver.quit()
		
		
		
 }

}
