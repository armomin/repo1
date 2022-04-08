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

WebUI.mouseOver(findTestObject('Administration/AdministrationMenu_link'))

WebUI.click(findTestObject('Administration/ChangeEmailAddSubmenu_link'))

WebUI.delay(2)

CustomKeywords.'bbSiteDemo.changeemail.login'(findTestObject('Administration/New Email_txt'), findTestObject('Administration/ConfirmEmail_txt'), 
    'narendra@gmail.com', 'khot@gmail.com', findTestObject('Administration/Update_button'))

WebUI.acceptAlert()

com.kms.katalon.core.util.KeywordUtil.markPassed('Updation are failed')

