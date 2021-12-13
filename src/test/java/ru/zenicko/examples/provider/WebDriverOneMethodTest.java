package ru.zenicko.examples.provider;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import ru.zenicko.examples.provider.config.WebDriverProvider;

public class WebDriverOneMethodTest {
    private WebDriver driver;

    @BeforeEach
    void build() {
        driver = new WebDriverProvider().get();
    }

    @Test
    @DisplayName("The simple test uses anything driver")
    public void testGithubTitleSomeDriver() {
        System.out.println(driver.getTitle());
        System.out.println("GitHub: Where the world builds software · GitHub");

        try {
            Assertions.assertEquals(
                    "GitHub: Where the world builds software · GitHub",
                    driver.getTitle(),
                    "!!Not equal!!");
        } finally {
            System.out.println("FINALLY");
            driver.quit();
        }
    }
}
