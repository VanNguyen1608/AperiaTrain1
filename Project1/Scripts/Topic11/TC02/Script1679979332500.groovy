import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Step 1: Open browser and navigate to 'https://automationfc.github.io/multiple-fields/'
WebUI.openBrowser('https://automationfc.github.io/multiple-fields/')

//Maximize browser
WebUI.maximizeWindow()

//Step 2: prepare list data to check checkbox
def chkValue = ["Anemia","Emotional Disorder", "Digestive Problems"]

//Step 3: Check to checkbox follow list data that prepared in step 2
for(int i= 0; i <= chkValue.size()-1; i++){
	println ('checkbox: ' + chkValue[i])
	WebUI.check(findTestObject('Object Repository/Topic11/TC02/chk_ListValue', ['text': chkValue[i]]))
}


//Close browser
WebUI.closeBrowser()