import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe"
				+ " ");

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com"); // hit url on the browser
		System.out.println(driver.getTitle()); // validate if your page title is correct
		System.out.println(driver.getCurrentUrl()); // validate if u r landed on correct url
		// System.out.println(driver.getPageSource()); //print page source
		driver.get("https://yahoo.com");
		driver.manage().window().maximize(); // maximize window
		driver.navigate().back(); // come back to google page from yahoo
		driver.navigate().forward(); // move to nxt page
		driver.close(); // it closes current browser
		driver.quit(); // it closes all the browsers opened by selenium srcipt.....like googl nd othr
						// pages also
	}

}
