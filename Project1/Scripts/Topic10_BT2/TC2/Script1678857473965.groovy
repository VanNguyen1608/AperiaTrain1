import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.util.*

//Step 1: Open browser 'https://atlassian.design/components/tooltip/examples'
WebUI.openBrowser('https://atlassian.design/components/tooltip/examples')

// Step 2: Hover to button 'Hover over me'
WebUI.mouseOver(findTestObject('Topic10/btn_beforehover'))

//Step 3: Verify tootip HelloWorld display
WebUI.verifyElementPresent(findTestObject('Topic10/tooltip_HelloWorld'), 0)

WebUI.mouseOver(findTestObject('Topic10/btn_beforehover'))
//Step 4: Get background color
String bgcolor =  WebUI.getCSSValue(findTestObject('Topic10/btn_afterhover'), 'background')
//Write background color
println  'background color :' + bgcolor
//Convert background color
	String[] hexValue = bgcolor.split("[, rgba()]+")
	int hexValue1 = Integer.valueOf(hexValue[1])
	int hexValue2 = Integer.valueOf(hexValue[2])
	int hexValue3 = Integer.valueOf(hexValue[3])
	String convertColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3)
	
println 'after convert bg color :' + convertColor

//Step 5: Verify background color after hover is displayed corectly
WebUI.verifyEqual(convertColor,'#0055cc')

//Step 6: Close browser
WebUI.closeBrowser()





