package ru.zenicko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.zenicko.configs.apiconfig.ApiConfigFileProvider;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiConfigFileTest {
    static ApiConfigFileProvider apiConfig = new ApiConfigFileProvider();

    @Test
    @DisplayName("Testing URL")
    void valueUrlConfigTest() {
        assertThat(apiConfig.getUrl()).isEqualTo("https://yandex.ru/api/v1");
    }

    @Test
    @DisplayName("Testing Token")
    void valueTokenConfigTest() {
        assertThat(apiConfig.getToken()).isEqualTo("12345678");
    }

}
