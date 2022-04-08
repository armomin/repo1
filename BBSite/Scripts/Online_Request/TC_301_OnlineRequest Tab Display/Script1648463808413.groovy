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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.verifyElementPresent(findTestObject('Online Request/Online Request_Page/OnlineRequest_tab'), 3)

WebUI.mouseOver(findTestObject('Online Request/Online Request_Page/OnlineRequest_tab'))

KeywordUtil.logInfo('Online Request tab is Visible')

WebUI.verifyElementVisible(findTestObject('Online Request/Online Request Tab_Page/Recorder Check'), FailureHandling.STOP_ON_FAILURE)

KeywordUtil.logInfo('Recorder Check is Visible')

WebUI.verifyElementVisible(findTestObject('Online Request/Online Request Tab_Page/Request Account Research'), FailureHandling.STOP_ON_FAILURE)

KeywordUtil.logInfo('Request Account Research is Visible')

WebUI.verifyElementVisible(findTestObject('Online Request/Online Request Tab_Page/Request Photocopy'), FailureHandling.STOP_ON_FAILURE)

KeywordUtil.logInfo('Request Photocopy is Visible')

WebUI.verifyElementVisible(findTestObject('Online Request/Online Request Tab_Page/Request_Cash_Change_Order'), FailureHandling.STOP_ON_FAILURE)

KeywordUtil.logInfo('Request_Cash_Change_Order is Visible')

