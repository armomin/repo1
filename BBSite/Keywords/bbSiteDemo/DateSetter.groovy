package bbSiteDemo

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class SelectDate {
	@Keyword
	def dateSet(String day, String Month) {
		WebUI.click(findTestObject('Record_Calendar/datepicker'))

		while (WebUI.getText(findTestObject('Record_Calendar/Month')) != Month ) {

			WebUI.click(findTestObject('Record_Calendar/NextMonth'))
		}

		WebUI.click(findTestObject('Record_Calendar/day',[('days'):day]))
		KeywordUtil.markPassed("date selected")
	}
}
