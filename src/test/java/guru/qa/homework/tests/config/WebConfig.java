package guru.qa.homework.tests.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;
import org.aeonbits.owner.Config.Sources;

@LoadPolicy(LoadType.MERGE)
@Sources({"file:./${environment}.properties", "classpath:${environment}.properties"})
public interface WebConfig extends Config {

  @Key("browser.name")
  @DefaultValue("chrome")
  String nameBrowser();

  @Key("browser.version")
  @DefaultValue("95.0")
  String versionBrowser();

  @Key("remote.url")
  String remoteUrl();

}
