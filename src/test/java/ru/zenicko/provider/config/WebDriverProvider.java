package ru.zenicko.provider.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    @Override
    public WebDriver get(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();

//        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
//        return new FirefoxDriver();

        driver.get("https://github.com");
        return driver;

    }
}
