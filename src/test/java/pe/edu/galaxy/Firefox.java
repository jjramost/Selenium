package pe.edu.galaxy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	static String path = "";

	public static void main(String[] args) throws InterruptedException {

		path = System.getProperty("user.dir");

		System.out.print(path);

		System.setProperty("webdriver.gecko.driver", path + "/src/test/resources/browser/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/watch?v=17-qHOERXps");

		String title = driver.getTitle();

		System.out.println(title);

		Thread.sleep(6000);

		driver.quit();

	}
}
