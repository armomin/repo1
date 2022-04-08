package bbSiteDemo

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory

public class TableText {

	/**
	 * @author MOMIN
	 * 
	 */
	@Keyword
	def GetTRText(TestObject column, ArrayList<String> ElementToBeFound ) {

		int count;
		ArrayList<String> l = new ArrayList<String>();

		String  ParticipantColumn = column.findPropertyValue('xpath')

		List<WebElement> values = DriverFactory.getWebDriver().findElements(By.xpath(ParticipantColumn))

		for (WebElement val : values) {

			String val1=val.getText()

			l.add(val1)
		}

		for (String Ele :ElementToBeFound ) {
			if (l.contains(Ele)) {
				KeywordUtil.logInfo(Ele+ ' Element is Present')
			}
			else {
				KeywordUtil.logInfo(Ele+ ' Element Not Present')
			}
			continue
		}

		println  l
		println  ElementToBeFound
	}
}
