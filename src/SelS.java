import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SelS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("mno");
		 System.setProperty("webdriver.ie.driver","E:\\Software\\IEDriverServer.exe");
		 WebDriver driver1=new InternetExplorerDriver();
		 
		 System.out.println(driver1.getTitle());

	}

}
