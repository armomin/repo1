package bbSiteDemo

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class Mainmenu {

	@Keyword
	def selectMenu(String Tab) {
		WebUI.mouseOver(findTestObject('Payment and Transfer/Home Page/Mainmenu_Tabs',[('MainMenu'):Tab]))
		KeywordUtil.logInfo('Main Menu Entered')
	}
}
