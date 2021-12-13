package ru.zenicko.configs.apiconfig;

import org.aeonbits.owner.ConfigFactory;

public class ApiConfigFileProvider {
    String URL;
    String TOKEN;

    public ApiConfigFileProvider() {
        ApiFileConfig config = ConfigFactory.create(ApiFileConfig.class, System.getProperties());
        URL = config.getUrl();
        TOKEN = config.getToken();
    }

    public String getUrl() {
        return URL;
    }

    public String getToken() {
        return TOKEN;
    }
}
