@TestAll
Feature: Drag and Drop

  @Test5
  Scenario: Drag and Drop
    Given User on Drag and Drop page
    When User drags element A to element B
    Then text on element A and B are switched

#  @Test
#  public void DragnDrop()
#  {
#  System.setProperty("webdriver.chrome.driver"," E://Selenium//Selenium_Jars//chromedriver.exe ");
#  driver= new ChromeDriver();
#  driver.get("http://demo.guru99.com/test/drag_drop.html");
#
#  //Element which needs to drag.
#  WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
#
#  //Element on which need to drop.
#  WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
#
#  //Using Action class for drag and drop.
#  Actions act=new Actions(driver);
#
#  //Dragged and dropped.
#  act.dragAndDrop(From, To).build().perform();
#  }