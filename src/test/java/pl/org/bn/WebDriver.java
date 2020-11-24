package pl.org.bn;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver {
    public ChromeDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe"); // The second argument is the path for chromedriver.exe
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);

        System.out.println("Test Start");
    }

    public void checkSite(){
        driver.get("https://www.bn.org.pl");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Biblioteka Narodowa"));
    }

    @After
    public void close() throws InterruptedException {
        System.out.println("Test finish");
        Thread.sleep(1000);
        driver.quit();

    }

}
