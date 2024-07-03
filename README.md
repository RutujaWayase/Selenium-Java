# Selenium-Java

Selenium WebDriver: Selenium Webdriver is a component in selenium, is a java interface. Webdriver is an API(Application Programming Interface).

WebDriver(Interface) -> RemoteWebDriver -> ChromeDriver, FirefoxDriver, EdgeDriver, etc.

Frontent (Presentation Layer) -> Application/Business Logic Layer(API) -> Database layer

Create Maven project
All maven dependencies available on https://mvnrepository.com/ add the required dependencies in pom.xml

Note: After adding dependencies in pom.xml -> update the project

Webdriver dependencies:
1) Selenium Java: https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.20.0

Interface: is group of related methods with empty bodies. Its class responsibility to implement methods declared in the interface. When class agreed to implement interface, they must need to provide implementation/bodies to all defined methods in interface.

# Selenium WebDriver Interface: 
https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html

Create an object of clss to access the methods:
1) ChromeDriver driver = new ChromeDriver();
driver object -> has access to all methods of Chrome Driver

2) WebDriver driver = new ChromeDriver();
driver object -> has access to the methods of Chrome Driver which are defined in web driver interface


ChromeDriver: https://getwebdriver.com/chromedriver#stable

EdgeDriver: https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver?form=MA13LH 

GekoDriver(Firefox): https://github.com/mozilla/geckodriver/releases


# Difference between driver.close & driver.quit: 
driver.close: is associated only with current window. driver.quit: is associate will all the windows


