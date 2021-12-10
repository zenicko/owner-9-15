package ru.zenicko.intro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.opentest4j.AssertionFailedError;

public class WebDriverTest {

    @Test
    @DisplayName("The simple test uses ChromeDriver")
    public void testGithubTitleChrome() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com");
        System.out.println(driver.getTitle());
        try {
            Assertions.assertEquals(
                    "GitHub1: Where the world builds software · GitHub",
                    driver.getTitle(),
                    "!!Not equal!!");
        } finally {
            System.out.println("FINALLY CHROME");
            driver.quit();
        }
    }

    @Test
    @DisplayName("The simple test use FirefoxDriver")
    public void testGithubTitleFirefox() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://github.com");
        System.out.println(driver.getTitle());
        try {
            Assertions.assertEquals("GitHub1: Where the world builds software · GitHub", driver.getTitle());
        }
        finally {
            System.out.println("FINALLY CHROME");
            driver.quit();
        }
    }
}
