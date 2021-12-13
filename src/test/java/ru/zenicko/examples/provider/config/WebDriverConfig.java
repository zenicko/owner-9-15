package ru.zenicko.examples.provider.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("url")
    @DefaultValue("https://github.com")
    String getUrl();

    @Key("remoteurl")
    URL getRemoteUrl();

}
