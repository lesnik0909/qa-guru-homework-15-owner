package guru.qa.homework.tests.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import guru.qa.homework.tests.config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class ApiTests {

  ApiConfig cfg = ConfigFactory.create(ApiConfig.class, System.getProperties());

  @Test
  void apiTest() {
    assertThat(cfg.getBaseUrl()).isEqualTo("https://github.com/");
    assertThat(cfg.getToken()).isEqualTo("some_token");
  }

}
