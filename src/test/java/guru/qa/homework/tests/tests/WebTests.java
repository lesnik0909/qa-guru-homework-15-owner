package guru.qa.homework.tests.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import guru.qa.homework.tests.config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class WebTests {

  @Test
  void webLocalTest() {
    System.setProperty("environment", "locale");
    WebConfig cfg = ConfigFactory.create(WebConfig.class, System.getProperties());

    assertThat(cfg.nameBrowser()).isEqualTo("chrome");
    assertThat(cfg.versionBrowser()).isEqualTo("95.0");
  }

  @Test
  void webRemoteTest() {
    System.setProperty("environment", "remote");
    WebConfig cfg = ConfigFactory.create(WebConfig.class, System.getProperties());

    assertThat(cfg.nameBrowser()).isEqualTo("chrome");
    assertThat(cfg.versionBrowser()).isEqualTo("95.0");
    assertThat(cfg.remoteUrl()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");
  }

}
