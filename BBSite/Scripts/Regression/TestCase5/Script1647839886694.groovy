import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'bbSiteDemo.Login.LoginKW'()

CustomKeywords.'bbSiteDemo.Mainmenu.selectMenu'(mainmenu_Tabs['Payments & Transfers'])

CustomKeywords.'bbSiteDemo.submenu.selectSubMenu'(submenu[2], current_URL[1])

CustomKeywords.'bbSiteDemo.SendKeys.advanveSendKeys'(findTestObject('Payment and Transfer/Add Tax Payment/TaxAmount_input'), 
    'abc')

WebUI.sendKeys(findTestObject('Payment and Transfer/Add Tax Payment/TaxAmount_input'), Keys.chord(Keys.TAB))

AlertText = WebUI.getAlertText()

WebUI.verifyMatch(AlertText, 'Amount: You have entered an invalid dollar amount. Please try again.', false)

WebUI.acceptAlert()

println(AlertText)

