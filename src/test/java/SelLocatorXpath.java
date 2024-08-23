import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SelLocatorXpath {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/tonycol/Documents/chrome-webdriver-java/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.linkText("Forgot your password?"));

        //XPATH
        // ****  //Tagname[@attribute='value']  ******

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");


    }

}
