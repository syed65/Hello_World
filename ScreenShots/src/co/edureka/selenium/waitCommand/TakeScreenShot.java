package co.edureka.selenium.waitCommand;

//import java.io.File;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {
	WebDriver driver;
	/*String imagePath = "‪‪C:\\Users\\Desktop\\ScreenShot.png";
	File tempFile,parmanentFile;
	TakesScreenshot screenShot;
*/
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("http://www.paytm.com");
		//takeScreenShot();
	}
	/*public void takeScreenShot() {
		try {
			parmanentFile= new File(imagePath);
			if(parmanentFile.exists()) {
				throw new Exception("Image already exist");
			}
			screenShot = (TakesScreenshot)driver;
			tempFile = screenShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(tempFile, parmanentFile);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TakeScreenShot obj = new TakeScreenShot();
		obj.invokeBrowser();*/
		
	}


