
package bbSiteDemo
import java.text.SimpleDateFormat

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import com.kms.katalon.core.util.KeywordUtil
import org.apache.commons.io.FileUtils


public class ScreenShots {
	@Keyword
	/*
	 * saves screenshot with name title of window including timestamp and saves in location
	 */
	def takeSS() {

		String WinTitle = WebUI.getWindowTitle()
		/*File f =new File(GlobalVariable.sspath +'//'+GlobalVariable.testCaseName)

		if (f.exists())
			FileUtils.deleteDirectory(f)
		//f.delete()

		f.mkdir()*/
		WebUI.takeFullPageScreenshot( GlobalVariable.sspath+"//"+GlobalVariable.testCaseName+"//"+WinTitle+new SimpleDateFormat('yyyy_MM_dd__hh_mm_ss').format(new Date()) +'.png')
	}
	//+new SimpleDateFormat('yyyy_MM_dd__hh_mm_ss').format(new Date())
}

