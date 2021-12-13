# This project shows how to get rid of the boilerplate code in Java properties based configuration by Owner.
___

##Acknowledgements
___
[**Artem Eroshenko**](https://github.com/eroshenkoam) 

## About the home task
___
### Конфигурация API тестов

**Сделать пример конфигурации для API тестов:**
1. Базовый url
2. Токен.
Токен нужно передавать защищенно:
    1. Через файл на файловой системе
    2. Через системные property

### Конфигурация WEB тестов
**Сделать пример конфигурации для WEB тестов:**
1. Имя браузера
2. Версия браузера
3. Локальный или удаленный (RemoteWebDriver)

**Сделать два вида конфигурационных файлов:**
1. Для локального запуска на chrome
2. Для удаленного запуска на selenoid

Сделать возможность с помощью одной системной переменной переключать запуск с локального на удаленный.

### Результат
В качестве ответа на задание:
Ссылку на репозиторий в Github и закомиченый конфиг файл.

## How to use
1. Start testing getting api configs by system properties:  
`./gradlew test --tests SomeApiTest -Durl="yandex.ru/api/v1" -Dtoken=12345678`

2,3. Start local or remote browser by system properties and get config from a file
   1. Local browser

      `./gradlew test --tests WebConfigTest.checkSettingLocalBrowser -Dtype=local`
   2. Remote browser

      `./gradlew test --tests WebConfigTest.checkSettingRemoteBrowser -Dtype=remote`         `

## Steps
___
1. Created an environment of the project: a structure of directories, files .gitignore, readme.md, build.gradle.
2. Created the "simple" class WebDriverTest: non-parameterized and affected by using a driver.
3. Created the provider class consists the initialization logic of a driver and an url.
4. Refactoring `class WebDriverProvider`. Created `class WebDriverConfig` which consists the config data.
5. Get properties by the system properties. Refactoring `class WebDriverConfig`.
6. Added remote driver in `class WebDriverProvider` and setting property in `class WebDriverConfig`.
   1. Fixed bugs 
### The branch ownerprop
7. Used package Owner. Refactoring structure of packages for the hometask
### Merge
### The branch hometask
**Конфигурация API тестов**
8. Created testing getting api configs by system properties 
9. Created testing getting api configs by file.properties
**Конфигурация WEB тестов**
10. Created a functionality which getting properties from a file conditional a system property.  

## What's new
___
1. Selenium
   1. Set the path to Chromedriver.  
      `System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");`
   2. Set the path to Firefoxdriver.
      `System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");`
2. Exceptions. 
```
   Serializable->(implements)
       Throwable->(extends)
          Exception->(extends)
              RuntimeException->(extends)
                  NullPointerException 
                  WebDriverException
``` 
3. Gradle. 
   1. Start a test suit.
      `./gradlew test --tests <name class>`
      For example:
      `./gradlew test --tests WebDriverOneMethodTest`
   2. Start a test with properties 
      `./gradlew test --tests WebDriverOneMethodTest -Dbrowser=CHROME -Durl=https://github.com`
   3. Start remote browser
      ` ./gradlew test --tests WebDriverOneMethodTest -Dremoteurl="<URL REMOTE BROWSER>"`
      
## Miscellaneous
___
1. `java.lang.UnsupportedOperationException: Can't resolve a Loader for the URL`
2. Remoute selenium
```
import org.openqa.selenium.remote.BrowserType;
public class Browser implements BrowserType {}
```

## Resources
___
1. [Get Chromedriver](https://chromedriver.chromium.org/downloads)
2. [Get FirefoxDriver](https://github.com/mozilla/geckodriver)
3. [The Selenium Browser Automation Project](https://www.selenium.dev/documentation/)
4. [AssertJ - Rich and fluent assertions for testing for Java](https://assertj.github.io/doc/)
5. [Set Edge browser](https://docs.microsoft.com/ru-ru/microsoft-edge/webdriver-chromium/?tabs=java)
6. 
