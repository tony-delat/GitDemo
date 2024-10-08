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

        //adding as user 2 these lines:
        System.out.println("my line 1");
        System.out.println("my line 2");
        //user 1 changes...
        System.out.println("user 1's lines");
        System.out.println("another one from U1");

        driver.close();

    }
}
