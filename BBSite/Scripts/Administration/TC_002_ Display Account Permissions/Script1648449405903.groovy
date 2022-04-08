import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

/*
 * WebUI.callTestCase(findTestCase('null'), [('mainmenu_Tabs') :
 * [('Administration') : 'Administration', ('Account Activities & Reporting') :
 * 'Account Activities & Reporting', ('Payments & Transfers') : 'Payments &
 * Transfers', ('Online Requests') : 'Online Requests'] , ('submenu') : [(1) :
 * 'Add Transfer', (2) : 'Add Tax Payment', (3) : 'Request Wire Investigation'],
 * ('current_URL') : [(1) :
 * 'https://bbsitedemo.btbanking.com/onlineserv/CM/ACH.cgi?state=eftpsPay'] ,
 * ('rownum') : '1'], FailureHandling.STOP_ON_FAILURE)
 */

WebUI.mouseOver(findTestObject('Administration/AdministrationMenu_link'))

WebUI.click(findTestObject('Administration/AddUsers_link'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Administration/AccountPermission_txt'), 'Account Permissions for 9999DEMO')

WebUI.takeScreenshot()

KeywordUtil.markPassed('Account Permissions for 9999DEMO Text is present')

WebUI.verifyElementPresent(findTestObject('Administration/AccountPermission_table'), 3)

KeywordUtil.markPassed('Account Permissions for 9999DEMO Table are present')

