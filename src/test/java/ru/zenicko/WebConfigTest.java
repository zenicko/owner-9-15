package ru.zenicko;

import com.codeborne.selenide.Configuration;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.zenicko.configs.webconfig.WebDriverProvider;

public class WebConfigTest {

    @BeforeAll
    static void setBrowser() {
        WebDriverProvider.setBrowser();
    }

    @Test
    @Tag("Local")
    @DisplayName("Testing config for a local browser")
    void checkSettingLocalBrowser() {
        SoftAssertions softy = new SoftAssertions();

        softy.assertThat(Configuration.browser).isEqualTo("CHROME");
        softy.assertThat(Configuration.browserVersion).isEqualTo("91");
        softy.assertThat(Configuration.remote).isNull();
        softy.assertAll();
    }

    @Test
    @Tag("Remote")
    @DisplayName("Testing config for a remote browser")
    void checkSettingRemoteBrowser() {
        SoftAssertions softy = new SoftAssertions();

        softy.assertThat(Configuration.browser).isEqualTo("CHROME");
        softy.assertThat(Configuration.browserVersion).isEqualTo("91");
        softy.assertThat(Configuration.remote).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");

        softy.assertAll();
    }
}
