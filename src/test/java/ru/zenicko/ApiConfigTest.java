package ru.zenicko;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.zenicko.configs.apiconfig.ApiConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Testing config for API. Get data by Owner")
public class ApiConfigTest {
    private static ApiConfig apiConfig; //interface for Owner

    @BeforeAll
    static void setPropertiesApiTest() {
        apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties()); //
    }

    @Test
    @DisplayName("Testing URL")
    void valueUrlConfigTest() {
        assertThat(apiConfig.getUrl()).isEqualTo("yandex.ru/api/v1");
    }

    @Test
    @DisplayName("Testing Token")
    void valueTokenConfigTest() {
        assertThat(apiConfig.getToken()).isEqualTo("12345678");
    }

}
