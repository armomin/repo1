package bbSiteDemo

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory

public class ConcatTestObject {
	@Keyword
	def concatColumnsbyObject(TestObject column1, TestObject column2) {

		String col1= column1.findPropertyValue('xpath')
		String col2= column2.findPropertyValue('xpath')


		List<WebElement> types = DriverFactory.getWebDriver().findElements(By.xpath(col1))
		List<WebElement> accts  = DriverFactory.getWebDriver().findElements(By.xpath(col2))
		int i=0
		for (WebElement type : types) {


			String concat=types[i].getText()+accts[i].getText()
			println concat
			i++
		}
	}




	@Keyword

	def SumOfColumn(TestObject column) {

		float value1;


		String  balancecol = column.findPropertyValue('xpath')



		List<WebElement> val = DriverFactory.getWebDriver().findElements(By.xpath(balancecol))

		for (WebElement value : val) {



			value1= Float.parseFloat(value.getText().replaceAll('[,]', ''))+value1


			println value1

			KeywordUtil.markPassed("The Sum is "+value1)
		}
	}
}
