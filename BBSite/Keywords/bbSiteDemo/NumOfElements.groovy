package bbSiteDemo

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory







public class NumOfElements {

	/**
	 * @author MOMIN
	 * This Keyword Takes TestObject As Parameter and provide total Number Of Objects Present On A Page pertaining
	 *  To Xpath Of that Object
	 */
	@Keyword
	def ElementsCount(TestObject column) {

		int count;

		String  balancecol = column.findPropertyValue('xpath')

		List<WebElement> val = DriverFactory.getWebDriver().findElements(By.xpath(balancecol))

		for (WebElement value : val) {

			count++
		}


		return count
	}
}
