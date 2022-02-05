package guru.qa.homework.tests.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;
import org.aeonbits.owner.Config.Sources;

@LoadPolicy(LoadType.MERGE)
@Sources({"file:./api.properties", "classpath:api.properties"})
public interface ApiConfig extends Config {

  @Key("base.url")
  @DefaultValue("https://github.com/")
  String getBaseUrl();

  @Key("token")
  @DefaultValue("")
  String getToken();

}
