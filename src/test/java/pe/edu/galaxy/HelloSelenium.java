package pe.edu.galaxy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HelloSelenium {

	public static void main(String[] args) throws InterruptedException, IOException {

		String path = System.getProperty("user.dir");
		String url = "https://mvnrepository.com/";

		//System.out.print(path);

		System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/browser/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.navigate().to(url);

	//	Thread.sleep(5000);
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File(path + "/src/test/resources/screen/image.png"));		
				
				
		driver.quit();

	}
}