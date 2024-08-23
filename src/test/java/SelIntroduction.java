import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

    public static void main(String[] args) {

        //Invoking Browser
        //Chrome - ChromeDriver --> Methods close
        //Firefox - FirefoxDriver (gecko) --> Methods close
        //safari....

        //chromedriver.exe invokes Chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/tonycol/Documents/chrome-webdriver-java/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.close();

    }
}
