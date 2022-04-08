package bbSiteDemo

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class URL {
	@Keyword
	def VerifyURL(String ExpectedURL) {

		String ActualURL=WebUI.getUrl()

		if(	WebUI.verifyMatch(ActualURL, ExpectedURL, false)==true)
			KeywordUtil.markPassed('Actual URL and Expected URL are Matched')

		else

			KeywordUtil.markFailed('Actual URL and Expected URL are Not Matched')
	}
}



