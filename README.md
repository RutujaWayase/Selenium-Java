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

array.length method used for normal/single array
array.size method used for ArrayList, eg: ArrayList<String>

# link text has tag anchor tag 'a'.
We always prefer linkText() over partialLinkText().
partialLinkText() is prefered when we hve a single link on the page.

•	TagName & Class: used for group of webelements

•	findElement(): returns a particlar/single webelement

•	findElements(): returns a group/multiple webelement => Variable type used List or Set. Return Type: List.
List Element allows duplicates. Set doesn't allow diplicates.

•	To find total elements in list use size() method.

findElement() - single webelement
findElements() - multiple webelement

Scenario 1: Locator matching with single webelement
findElement(loc) -> single webelement; Return type: WebElement
findElements(loc) -> single webelement; Return type: List<WebElement>

Scenario 2: Locator matching with multiple webelement
findElement(loc) -> single webelement; Return type: WebElement
findElements(loc) -> multiple webelement; Return type: List<WebElement>

Scenario 3: Locator is not matching with any element/s.
findElement(loc) -> No Such Element Exception.
findElements(loc) -> will not throw any exception. Returns 0. // this will create empty list collection if thee are no elements.








