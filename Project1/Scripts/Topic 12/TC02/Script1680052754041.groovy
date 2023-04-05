import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Step 1: Open browser and navigate to 'https://automationfc.github.io/multiple-fields/'
WebUI.openBrowser('https://multiple-select.wenzhixin.net.cn/templates/template.html?v=189&url=basic.html')

//Maximize browser
WebUI.maximizeWindow()

//Step 2: Prepare some items select : ['January', 'February', 'April']
def selectItems = ['January','February', 'April']

//Step 3: Click on 'Multiple Select dropdown control on Basic Select section 
WebUI.click(findTestObject('Object Repository/Topic 12/TC02/ddl_multiBasicSelect'))

//Step 4: Select item in dropdown base on prepared data on step 2
for(int i= 0; i <= selectItems.size()-1; i++){
	println ('option: ' + selectItems[i])
	WebUI.click(findTestObject('Object Repository/Topic 12/TC02/chk_option',['value': selectItems[i]]))
}
//Close Browser
WebUI.closeBrowser()
