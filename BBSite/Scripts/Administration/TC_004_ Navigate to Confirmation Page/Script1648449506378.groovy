import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import fabricator.Contact as Contact
import fabricator.Fabricator as Fabricator
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

Contact con = Fabricator.contact()

String Email = con.eMail()

String Username = con.fullName(false, false)

String UserId = con.firstName()

WebUI.mouseOver(findTestObject('Administration/AdministrationMenu_link'))

WebUI.click(findTestObject('Administration/AddUsers_link'))

WebUI.delay(2)

WebUI.click(findTestObject('Administration/New_button'))

WebUI.setText(findTestObject('Administration/Username_txt'), Username)

WebUI.setText(findTestObject('Administration/Userid_txt'), UserId)

WebUI.setText(findTestObject('Administration/Userpassword_txt'), Userpassword)

WebUI.setText(findTestObject('Administration/ConfirmPassword_pwd'), Userpassword)

WebUI.setText(findTestObject('Administration/EmailAddress_txt'), Email)

WebUI.delay(2)

WebUI.click(findTestObject('Administration/Adduser addbutton'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Administration/Confirmation text'), 'Confirmation')

WebUI.takeScreenshot()

KeywordUtil.markPassed('Confirmation Text is present')

