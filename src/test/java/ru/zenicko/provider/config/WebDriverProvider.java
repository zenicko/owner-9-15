package ru.zenicko.provider.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    private WebDriverConfig config;

    public WebDriverProvider() {
        config = new WebDriverConfig();
    }

    @Override
    public WebDriver get() {
        WebDriver driver = createWebDriver();
        driver.get(config.getUrl());

        return driver;
    }

    private WebDriver createWebDriver() {
        if (config.getBrowser().equals(Browser.CHROME)) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            return new ChromeDriver();
        }
        if (config.getBrowser().equals(Browser.FIREFOX)) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
            return new FirefoxDriver();
        }
        throw new WebDriverException("The Browser isn't found");
    }
}
