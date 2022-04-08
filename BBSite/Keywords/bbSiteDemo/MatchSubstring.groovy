package bbSiteDemo

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil


public class MatchSubstring {

	@Keyword
	def matchSubStringAndVerify( String actualText, String expectedText) {
		KeywordUtil.logInfo("comparing two strings if expected substring is present")
		if(actualText.contains(expectedText))
			KeywordUtil.markPassed(expectedText +" expected text found")
		else
			return false
	}
}

