package bbSiteDemo

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable




public class Login {

	@Keyword
	def LoginKW() {
		String compId = WebUI.callTestCase(findTestCase('Reusable/FetchExcel - PARAM'), [('dataObjectName') : 'BBData (1)', ('sheetName') : 'Sheet1'
			, ('referenceColumnName') : 'CompId', ('identifierString') : '9999COMP', ('getDataOfcolumnName') : 'CompId'], FailureHandling.STOP_ON_FAILURE)

		String userId = WebUI.callTestCase(findTestCase('Reusable/FetchExcel - PARAM'), [('dataObjectName') : 'BBData (1)', ('sheetName') : 'Sheet1'
			, ('referenceColumnName') : 'CompId', ('identifierString') : '9999COMP', ('getDataOfcolumnName') : 'UserId'], FailureHandling.STOP_ON_FAILURE)

		String userPwd = WebUI.callTestCase(findTestCase('Reusable/FetchExcel - PARAM'), [('dataObjectName') : 'BBData (1)', ('sheetName') : 'Sheet1'
			, ('referenceColumnName') : 'CompId', ('identifierString') : '9999COMP', ('getDataOfcolumnName') : 'UserPass'],
		FailureHandling.STOP_ON_FAILURE)




		WebUI.openBrowser(GlobalVariable.URL)

		WebUI.maximizeWindow()

		WebUI.setText(findTestObject('Payment and Transfer/Login Page/CompanyID_text'), compId)
		KeywordUtil.markPassed("CompanyId Entered")

		WebUI.setText(findTestObject('Payment and Transfer/Login Page/UserId_text'), userId)
		KeywordUtil.markPassed("UserId Entered")

		WebUI.setText(findTestObject('Payment and Transfer/Login Page/UserPassword_text'), userPwd)
		KeywordUtil.markPassed("Userpwd Entered")

		WebUI.click(findTestObject('Payment and Transfer/Login Page/Login_button'))


		KeywordUtil.markPassed("logged In successfully")

		String homepage_url = WebUI.getUrl()




		if(WebUI.verifyMatch(homepage_url, GlobalVariable.HomeURL, false)) {

			KeywordUtil.markPassed("logged In successfully")
			print("pass")
		}

		else {
			KeywordUtil.markFailedAndStop("failedd")
			print('failed')
		}
	}
}


