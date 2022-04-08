import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Contact con = Fabricator.contact()

String email = con.eMail()

WebUI.mouseOver(findTestObject('Administration/AdministrationMenu_link'))

WebUI.click(findTestObject('Administration/ChangeEmailAddSubmenu_link'))

WebUI.delay(2)

CustomKeywords.'bbSiteDemo.changeemail.login'(findTestObject('Administration/New Email_txt'), findTestObject('Administration/ConfirmEmail_txt'), 
    email, email, findTestObject('Administration/Update_button'))

WebUI.verifyElementVisible(findTestObject('Administration/Help_link'))

WebUI.takeScreenshot()

com.kms.katalon.core.util.KeywordUtil.markPassed('Log in successful')

