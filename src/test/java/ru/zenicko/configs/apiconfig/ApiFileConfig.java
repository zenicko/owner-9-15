package ru.zenicko.configs.apiconfig;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"classpath:apiconfig.properties",
        "file:C:\\Windows\\Temp\\apiconfig.properties"})
public interface ApiFileConfig extends Config {

    @Key("api.url")
    String getUrl();

    @Key("api.token")
    String getToken();

}
