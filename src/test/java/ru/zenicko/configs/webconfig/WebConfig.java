package ru.zenicko.configs.webconfig;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${type}_webconfig.properties")
public interface WebConfig extends Config {

    @Key("browser")
    String getBrowser();

    @Key("versionbrowser")
    String getVersionBrowser();

    @Key("typebrowser")
    String getTypeBrowser();
}
