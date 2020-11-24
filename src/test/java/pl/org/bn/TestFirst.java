package pl.org.bn;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestFirst extends WebDriver{
    @Test
    public void FirstTest(){
        checkSite();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu-bar\"]/div/button")));
        driver.findElement(By.xpath("//*[@id=\"menu-bar\"]/div/button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"heading-dla-bibliotekarzy\"]/a[2]")));
        driver.findElement(By.xpath("//*[@id=\"heading-dla-bibliotekarzy\"]/a[2]")).click();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section/div[2]/ul/li[12]"));
        driver.executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"wrapper\"]/section/div[2]/ul/li[12]")));
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section/div[2]/ul/li[12]")).click();

    }

    @Test
    public void SecondTest(){
        checkSite();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu-bar\"]/div/button")));
        driver.findElement(By.xpath("//*[@id=\"menu-bar\"]/div/button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu-list\"]/li[5]")));
        driver.findElement(By.xpath("//*[@id=\"menu-list\"]/li[5]")).click();
    }

}
