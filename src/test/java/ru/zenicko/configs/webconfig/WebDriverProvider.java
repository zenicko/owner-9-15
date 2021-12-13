package ru.zenicko.configs.webconfig;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

import java.lang.reflect.Field;

public class WebDriverProvider {
    public static void setBrowser() {
        final WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
        switch (webConfig.getTypeBrowser()) {
            case "local":
                break;
            case "remote":
                RemoteBrowserCredentials credentials = ConfigFactory.create(RemoteBrowserCredentials.class,
                        System.getProperties());
                Configuration.remote = String.format("https://%s:%s@%s",
                        credentials.getUsername(),
                        credentials.getPassword(),
                        credentials.getUrl());
                break;
            default:
                throw new RuntimeException(String.format("Unknown a type of a browser %s", webConfig.getTypeBrowser()));
        }

        String fields = "";
        for (Field field : Browser.class.getFields()) {
            fields += field.getName();
        }
        if (fields.contains(webConfig.getBrowser())) {
            Configuration.browser = webConfig.getBrowser();
            Configuration.browserVersion = webConfig.getVersionBrowser();
        } else
            throw new RuntimeException(String.format("Unknown browser %s", webConfig.getBrowser()));
    }
}
