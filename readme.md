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

## Steps
___
1. Created an environment of the project: a structure of directories, files .gitignore, readme.md, build.gradle.
2. Created the "simple" class WebDriverTest: non-parameterized and affected by using a driver.
3. Created the provider class consists the initialization logic of a driver and an url.
4. 
## What's new
___
1. Selenium
   1. Set the path to Chromedriver.  
      `System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");`
   2. Set the path to Firefoxdrever.
      `System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");`
## Miscellaneous
___

## Resources
___
1. [Chromedriver]()
2. [FirefoxDriver](https://github.com/mozilla/geckodriver)
2. [The Selenium Browser Automation Project](https://www.selenium.dev/documentation/)
2. []()
2. []()

