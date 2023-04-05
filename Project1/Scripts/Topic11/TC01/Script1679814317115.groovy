import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Step 1: Open browser and navigate to 'https://automationfc.github.io/multiple-fields/'
WebUI.openBrowser('https://automationfc.github.io/multiple-fields/')

//Maximize browser
WebUI.maximizeWindow()

//Get total number of checkbox
int total = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Topic11/TC01/chk_All'),3).size()

//Step 2: Check All checkbox
for(int i= 1; i <= total; i++){
	WebUI.check(findTestObject('Object Repository/Topic11/TC01/chk_AllByIndex', ['index': i]))
}

//Step 3: Deplay 5(s)
WebUI.delay(2)

//Step 4: Uncheck All checkbox
for(int j= 1; j <= total; j++){

	WebUI.uncheck(findTestObject('Object Repository/Topic11/TC01/chk_AllByIndex', ['index': j]))
}

//Deplay 2(s)
WebUI.delay(2)

//Close browser
WebUI.closeBrowser()



