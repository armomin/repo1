package bbSiteDemo

import org.openqa.selenium.Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class SendKeys {
	/* This Keyword clears that already existing Contents from Input type text and enters the user provided 
	 * String
	 * 
	 */
	@Keyword
	def advanveSendKeys(TestObject object, String txt) {




		WebUI.sendKeys(object, Keys.chord(Keys.CONTROL + 'a' , Keys.DELETE ))

		WebUI.sendKeys(object, txt )
	}
}
