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

Scenario 1: Locator matching with single webelement.

•	findElement(loc) -> single webelement; Return type: WebElement
•	findElements(loc) -> single webelement; Return type: List<WebElement>

Scenario 2: Locator matching with multiple webelement.

•	findElement(loc) -> single webelement; Return type: WebElement
•	findElements(loc) -> multiple webelement; Return type: List<WebElement>

Scenario 3: Locator is not matching with any element/s.

•	findElement(loc) -> No Such Element Exception.
•	findElements(loc) -> will not throw any exception. Returns 0. // this will create empty list collection if there are no elements.

# CSS Selector
 
 tag id -> tag#id
 
 tag class -> tag#class
 
 tag attribute -> tag[attribute="value"]
 
 tag class attribute -> tag.class[attribute="value"]

# XPath 
XPath is an address of the element and is based on DOM - Document Object Model

Types of XPath:
1) Absolute XPath(Full xpath) => Ex: /html/body/header/div/div/div[2]/div/input
2) Relative XPath(partial xpath) => Ex: //*[@id="search"]/input

Differences between Absolute & Relative XPaths?
1)	Absolute XPath starts with / -> represents root node.
Relative XPath starts with //

2)	Absolute XPath does not use attributes.
Relative XPath works with attribute.

3)	Absolute XPath traverse through each node till it find element.
Relative XPath directly jumps & finds the element by using attribute.

Relative XPath:
Syntax:
•	//tagname[@attribute=’value’]
•	//*[@attribute=’value’]
Ex: //*[@title='MacBook'] or //img[@title='MacBook']

XPath with single attribute => Ex: //input[@placeholder='Search']

XPath with multiple attribute => Ex: //input[@name='search'][@placeholder='Search']

link text can be inner text but all inner text can't be link text

//<a href="https://xyz.com">Click Me</a> =>
linktext=yes; inner text=yes

<div>welcome</div>
linktext=no; inner text=yes

xpath with contains() => Ex: //input[contains(@placeholder,'Sea')]

handling dynamic attributes => 
• //*[@id='start' or @id='stop']
• //*[contains(@id,'st')]
• //*[starts-with(@id,'st')]

Chained XPath => Combination of Absolute & Relative XPath. Ex: //div[@id='logo']/a/img

Locating a parent element:
Syntax:
1)	//<knownXpath>/parent::*
2)	//<knownXpath>/parent::element
3)	//<knownXpath>/..

Ex:
1)	//input[@id=’txtUsername’]/parent::form
2)	//input[@id=’txtUsername’]/parent::*
3)	//input[@id=’txtUsername’]/..






























