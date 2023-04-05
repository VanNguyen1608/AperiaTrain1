import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Step 1: Open browser and navigate to 'https://automationfc.github.io/multiple-fields/'
WebUI.openBrowser('https://demos.telerik.com/kendo-ui/dropdownlist/index')

//Maximize browser
WebUI.maximizeWindow()

//Delay 2s
WebUI.delay(10)

//Step 2: Click on categories dropdown control
WebUI.click(findTestObject('Object Repository/Topic 12/TC01/ddl_Categories'))

//Delay 2s
WebUI.delay(2)

//Step 3: Select item on Categories dropdown
String text = 'Confections'
WebUI.click(findTestObject('Object Repository/Topic 12/TC01/ddl_option1', ['text':text]))

//Close Browser
WebUI.closeBrowser()