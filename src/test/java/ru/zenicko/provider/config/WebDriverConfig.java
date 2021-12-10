package ru.zenicko.provider.config;

public class WebDriverConfig {
    public Browser getBrowser(){
        return Browser.CHROME;
    }
    public String getUrl(){
        return "https://github.com";
    }
}
