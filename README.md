### This is a project with automated tests with owner config

* Run test
```
gradle clean test
```

* Build options
```
-D"base.url"="https://github.com/"
-Dtoken="some_token"
-D"browser.name="chrome"
-D"browser.version="95.0"
-D"remote.url="https://user1:1234@selenoid.autotests.cloud/wd/hub/"
-Denvironment="remote"
```


