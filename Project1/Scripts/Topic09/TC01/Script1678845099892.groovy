import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Step 1: Open browser and navigate to url: 'https://demo.guru99.com/V4/'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.guru99.com/V4/')

//Step 2: Click link here at the bottom
WebUI.click(findTestObject('Topic09/TC01/lnk_here'))

//Check if Adv is present
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Topic09/TC01/ifm_adv'), 3)) {
    WebUI.switchToFrame(findTestObject('Object Repository/Topic09/TC01/ifm_adv'), 0)

    WebUI.click(findTestObject('Object Repository/Topic09/TC01/btn_close'))
	
}

WebUI.switchToDefaultContent()

//Step 3: Input Email ID
WebUI.setText(findTestObject('Topic09/TC01/txt_emailID'), 'tungxuan1608@gmail.com')

//Step 4: Click Submit
WebUI.click(findTestObject('Topic09/TC01/btn_submit'))

//Step 5: Get User id and password
String username = WebUI.getText(findTestObject('Topic09/TC01/txt_username'), FailureHandling.STOP_ON_FAILURE)

String pass = WebUI.getText(findTestObject('Topic09/TC01/txt_password'), FailureHandling.STOP_ON_FAILURE)

//Step 6: Navigate to 'https://demo.guru99.com/V4/' again
WebUI.navigateToUrl('https://demo.guru99.com/V4/')

//Step 7: Input username and password at step 5
WebUI.setText(findTestObject('Topic09/TC01/txt_userID'), username)

WebUI.setText(findTestObject('Topic09/TC01/txt_passGuru'), pass)

//Click button Login
WebUI.click(findTestObject('Topic09/TC01/btn_login'))

//Step 8: Verify message: Welcome tofindTestObject('Object Repository/Topic09/TC01/msg_welcome') manager
String welcome = WebUI.getText(findTestObject('Object Repository/Topic09/TC01/msg_welcome'))
WebUI.verifyEqual(welcome,'Welcome To Manager\'s Page of Guru99 Bank')

//Step 9: Close Browser
WebUI.closeBrowser()

