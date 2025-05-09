package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class BaseTest {

    public WebDriver baseDriver;

    @BeforeSuite
    public void sdfdsf(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // أو --headless لو عندك إصدار قديم
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        baseDriver = new ChromeDriver(options);
        baseDriver.manage().window().maximize();
        baseDriver.get("https://www.demoblaze.com/");
    }

    /*
    @AfterTest
    public void tearDown() {
        getDriver().quit();
        baseDriver.remove();
    }
    */

}
