package ru.zenicko.provider.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class WebDriverConfig {

    public Browser getBrowser() {
        String browser = System.getProperty("browser");
        if (Objects.isNull(browser)) {
            return Browser.CHROME;
        }
        return Browser.valueOf(browser);
    }

    public String getUrl() {
        String url = System.getProperty("url");
        if (Objects.isNull(url)) {
            return "https://github.com";
        }
        return url;
    }

    public URL getRemoteUrl() {
        String remoteUrl = System.getProperty("remoteurl");

        if (Objects.nonNull(remoteUrl)) {
            try {
                return new URL(remoteUrl);
            } catch (MalformedURLException e) {
                throw new RuntimeException("The \"remoteurl\" is bad!");
            }
        }
        return null;
    }
}
