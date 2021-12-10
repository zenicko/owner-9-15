package ru.zenicko.provider.config;

public class WebDriverConfig {
    public Browser getBrowser() {
        String browser1 = System.getProperty("browser");
        System.out.println(browser1);

        return Browser.valueOf("CHROME");
    }

    public String getUrl() {
        String url1 = System.getProperty("url");
        System.out.println(url1);
        return "https://github.com";
    }
}
