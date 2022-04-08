package bbSiteDemo

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




















public class SearchIt {
	/**
	 this keyword fetches the suggestion given by search and click on Search Button
	 */


	@Keyword
	def GetSuggestionList(String suggestionListxpath,TestObject searchText, String text ) {

		WebUI.setText(searchText,text)

		String liText=''

		List<WebElement> list = DriverFactory.getWebDriver().findElements(By.xpath(suggestionListxpath))

		for (WebElement li : list) {


			liText = li.getText()

			println liText
		}

		WebUI.sendKeys(searchText, Keys.chord(Keys.ENTER ))
	}
}




