package bbSiteDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



public class BrokenLinks {


	@Keyword
	def GetBrokenLinks() {
		String url = ""
		HttpURLConnection huc = null


		int respCode = 200


		int linkss=0,validlinkss=0,brokenlinkss=0




		List<WebElement> links = DriverFactory.getWebDriver().findElements(By.tagName("a"))

		Iterator<WebElement> it = links.iterator()

		while(it.hasNext()){

			url = it.next().getAttribute("href")

			println url
			linkss++


			if(url == null || url.isEmpty()){
				println("URL is either not configured for anchor tag or it is empty");
				continue
			}

			if(!url.startsWith(WebUI.getUrl())){
				println("URL belongs to another domain, skipping it.")
				continue
			}

			try {
				huc = (HttpURLConnection)(new URL(url).openConnection())
				huc.setRequestMethod("HEAD")
				huc.connect()
				respCode = huc.getResponseCode()

				if(respCode >= 400){
					KeywordUtil.logInfo('broken link is '+url)
					brokenlinkss++
				}
				else{
					KeywordUtil.logInfo('valid link is '+url)
					validlinkss++
				}
			} catch (MalformedURLException e) {
				e.printStackTrace()
			} catch (IOException e) {
				e.printStackTrace()
			}
		}

		println('number of unique links '+linkss)
		println('number of valid links '+validlinkss)
		println('number of broken links '+brokenlinkss)
		KeywordUtil.logInfo('total links '+linkss +' valid links '+validlinkss+' brokenlinks '+brokenlinkss)
	}
}


