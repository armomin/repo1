package bbSiteDemo

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

public class DatePicker {
	@Keyword
	def datePicker(String monthpath,String datepath,String varmonth, String vardate) {
		while(WebUI.verifyElementClickable(findTestObject('MakeMyTrip_selectpage/navigatemonth'))) {
			List<WebElement> months = DriverFactory.getWebDriver().findElements(By.xpath(monthpath))

			for (WebElement month : months) {
				if (month.getText().equals(varmonth)) {
					print(month.getText())
					List<WebElement> dates = DriverFactory.getWebDriver().findElements(By.xpath(datepath))
					for (WebElement date : dates) {
						if (date.getText() == vardate) {
							date.click()
							break
						}
					}

					break
				}
			}
			WebUI.click(findTestObject('MakeMyTrip_selectpage/navigatemonth'))
		}
	}
}

