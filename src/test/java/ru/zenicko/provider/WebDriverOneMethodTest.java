package ru.zenicko.provider;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import ru.zenicko.provider.config.WebDriverProvider;

public class WebDriverOneMethodTest {
    WebDriver driver = new WebDriverProvider().get();

    @Test
    @DisplayName("The simple test uses SomeDriver")
    public void testGithubTitleSomeDriver() {

        System.out.println(driver.getTitle());
        try {
            Assertions.assertEquals(
                    "GitHub1: Where the world builds software · GitHub",
                    driver.getTitle(),
                    "!!Not equal!!");
        } finally {
            System.out.println("FINALLY");
            driver.quit();
        }
    }
}
