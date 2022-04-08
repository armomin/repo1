import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'bbSiteDemo.Login.LoginKW'()

CustomKeywords.'bbSiteDemo.Mainmenu.selectMenu'(mainmenu_Tabs['Payments & Transfers'])

CustomKeywords.'bbSiteDemo.submenu.selectSubMenu'(submenu[2], current_URL[1])

CustomKeywords.'bbSiteDemo.SendKeys.advanveSendKeys'(findTestObject('Payment and Transfer/Add Tax Payment/TaxAmount_input'), 
    '6')

WebUI.sendKeys(findTestObject('Payment and Transfer/Add Tax Payment/TaxAmount_input'), Keys.chord(Keys.TAB))

amt = WebUI.getAttribute(findTestObject('Payment and Transfer/Add Tax Payment/TaxAmount_input'), 'value')

println(amt)

CustomKeywords.'bbSiteDemo.ScreenShots.takeSS'()

