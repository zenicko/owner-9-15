package ru.zenicko.configs.apiconfig;

import org.aeonbits.owner.Config;

public interface ApiConfig extends Config {
    @Key("url")
    String getUrl();

    @Key("token")
    String getToken();
}
