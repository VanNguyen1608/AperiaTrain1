import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Step 1: Open browser and navigate to 'https://automationfc.github.io/multiple-fields/'
WebUI.openBrowser('https://automationfc.github.io/multiple-fields/')

//Maximize browser
WebUI.maximizeWindow()

//Get total checkbox
int total = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Topic11/TC03/chk_All'),3).size()
println ('total:' + total)


public static List<String> getRandom(int total, int numOfItems){
	Random rand = new Random()
	Set<String> set = new LinkedHashSet<Integer>();
	while (set.size() < numOfItems){
		int random = rand.nextInt(total) +1
		set.add(random.toString())
	}
	List<String> result = new ArrayList<>(set)
	return result
}


List<String> randomCheck = getRandom(total,4)

//Step 2: Check random some checkbox

for(String random in randomCheck){
	WebUI.check(findTestObject('Object Repository/Topic11/TC03/chk_Randomchk',['index': random]))
}

//Delay (2)
WebUI.delay(2)

//Close browser
WebUI.closeBrowser()
