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

WebUI.openBrowser(GlobalVariable.Btbank)

WebUI.setText(findTestObject('Accounts/LoginPage/Companyname_textbox'), company)

WebUI.setText(findTestObject('Accounts/LoginPage/Password_textbox'), password)

WebUI.click(findTestObject('Accounts/LoginPage/Login_btn'))

WebUI.verifyElementText(findTestObject('Accounts/LoginPage/Fieldrequired_text'), 'This field is required')

WebUI.takeFullPageScreenshot(GlobalVariable.sspath + '\\Fieldrequired.png')

WebUI.setText(findTestObject('Accounts/LoginPage/UserId_textbox'), userid)

WebUI.click(findTestObject('Accounts/LoginPage/Login_btn'))

WebUI.verifyElementPresent(findTestObject('Accounts/LoginError/Error_text'), 0)

WebUI.takeFullPageScreenshot(GlobalVariable.sspath + '\\Loginerror.png')



