package bbSiteDemo

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class submenu {

	@Keyword
	def selectSubMenu(String sub_menu, String current_URL) {


		WebUI.click(findTestObject('Payment and Transfer/Home Page/submenu',[('submenu'):sub_menu]))
		String submenu_url=WebUI.getUrl(FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.verifyMatch(current_URL, submenu_url, false)

		KeywordUtil.markPassed("Sub Menu Selected")
	}
}
