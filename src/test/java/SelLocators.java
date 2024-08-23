import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SelLocators {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/tonycol/Documents/chrome-webdriver-java/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();

        //implicit wait = 5 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //* Incorrect username or password

        //css selector: class name --> tagname.classname
        //id: tagname#id


        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());


        driver.close();


    }

}
