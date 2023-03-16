import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Step 1: open browser
WebUI.openBrowser('')

//Step 2: Navigate to Katalon
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php')

//Step 3: input user name
WebUI.setText(findTestObject('TC01/txt_username'), 'John Doe')

//Step 4: input password
WebUI.setText(findTestObject('TC01/txt_password'), 'ThisIsNotAPassword')

//Step 5: Click button login
WebUI.click(findTestObject('TC01/btn_login'))

//Step 6: Verify Book Appointment title displayed
WebUI.verifyElementVisible(findTestObject('TC01/btn_bookApointment'))

//Step 7: Close browser
WebUI.closeBrowser()

