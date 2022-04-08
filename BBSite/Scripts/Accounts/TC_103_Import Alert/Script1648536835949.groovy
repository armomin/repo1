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

WebUI.callTestCase(findTestCase('Reusable/Login'), [('compId') : '9999COMP', ('userId') : '9999DEMO', ('userPwd') : '111111'], 
    FailureHandling.STOP_ON_FAILURE)
WebUI.mouseOver(findTestObject('Payment and Transfer/Home Page/Mainmenu_Tabs', [('MainMenu') : 'Account Activities & Reporting']))

//WebUI.mouseOver(findTestObject('Accounts/HomePage/Account_Activities_tab'))

WebUI.click(findTestObject('Accounts/HomePage/Upload_Issued_Checks_link'))

WebUI.click(findTestObject('Accounts/UploadIssuedChecks/Upload_btn'))

String text = WebUI.getAlertText()

WebUI.verifyMatch(text, 'You must select a file to Upload.', false)

WebUI.acceptAlert()

