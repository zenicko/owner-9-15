package ru.zenicko.provider.config;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Objects;
import java.util.function.Supplier;

import static java.lang.Thread.sleep;

public class WebDriverProvider implements Supplier<WebDriver> {

    private WebDriverConfig config;
    private WebDriver driver;

    public WebDriverProvider() {
        config = new WebDriverConfig();
    }

    @Override
    public WebDriver get() {
        driver = createWebDriver();
        driver.get(config.getUrl());

        return driver;
    }

    private WebDriver createWebDriver() {
        if (Objects.isNull(config.getRemoteUrl())) {
            if (config.getBrowser().equals(Browser.CHROME)) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                return new ChromeDriver();
            }
            if (config.getBrowser().equals(Browser.FIREFOX)) {
                System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
                return new FirefoxDriver();
            }
        } else {
            return new RemoteWebDriver(config.getRemoteUrl(), DesiredCapabilities.chrome());
        }
        throw new WebDriverException("The Browser isn't found");
    }
}
