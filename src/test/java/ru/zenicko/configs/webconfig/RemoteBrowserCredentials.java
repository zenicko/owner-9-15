package ru.zenicko.configs.webconfig;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:remotebrowsercredential.properties")
public interface RemoteBrowserCredentials extends Config {
    @Key("username")
    String getUsername();

    @Key("password")
    String getPassword();

    @Key("url")
    String getUrl();
}
