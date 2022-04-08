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

WebUI.click(findTestObject('Administration/New_button'))

WebUI.click(findTestObject('Administration/Username_txt'))

WebUI.setText(findTestObject('Administration/Username_txt'), Username)

WebUI.click(findTestObject('Administration/Userid_txt'))

WebUI.setText(findTestObject('Administration/Userid_txt'), UserID)

WebUI.click(findTestObject('Administration/Userpassword_txt'))

WebUI.setText(findTestObject('Administration/Userpassword_txt'), Userpassword)

WebUI.click(findTestObject('Administration/ConfirmPassword_pwd'))

WebUI.setText(findTestObject('Administration/ConfirmPassword_pwd'), Userpassword)

WebUI.click(findTestObject('Administration/EmailAddress_txt'))

WebUI.setText(findTestObject('Administration/EmailAddress_txt'), Email)

WebUI.delay(2)

WebUI.click(findTestObject('Administration/Adduser addbutton'))

WebUI.delay(2)

WebUI.takeScreenshot()

