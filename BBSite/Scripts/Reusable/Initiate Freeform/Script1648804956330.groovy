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
import fabricator.Contact as Contact
import fabricator.Fabricator as Fabricator

WebUI.callTestCase(findTestCase('Reusable/Login'), [('compId') : '9999COMP', ('userId') : '9999DEMO', ('userPwd') : '111111'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reusable/MainMenu'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'bbSiteDemo.submenu.selectSubMenu'(submenu[4], current_URL[1])



WebUI.sendKeys(findTestObject('Payment and Transfer/Initiate Freeform/bcname_input'), fullname)

WebUI.sendKeys(findTestObject('Payment and Transfer/Initiate Freeform/Address1_txt'), Add1)

WebUI.sendKeys(findTestObject('Payment and Transfer/Initiate Freeform/Address2_txt'), Add2)

WebUI.sendKeys(findTestObject('Payment and Transfer/Initiate Freeform/city_txt'), city)

WebUI.sendKeys(findTestObject('Payment and Transfer/Initiate Freeform/zip_txt'), zip)

WebUI.sendKeys(findTestObject('Payment and Transfer/Initiate Freeform/country_txt'), coun)

WebUI.sendKeys(findTestObject('Payment and Transfer/Initiate Freeform/AccName_txt'), fullname)

WebUI.sendKeys(findTestObject('Payment and Transfer/Initiate Freeform/AccNum_txt'), '4444665776868')

WebUI.sendKeys(findTestObject('Payment and Transfer/Initiate Freeform/ContNum_txt'), fullname)

WebUI.sendKeys(findTestObject('Payment and Transfer/Initiate Freeform/PhoneNum_txt'), phone)

WebUI.sendKeys(findTestObject('Payment and Transfer/Initiate Freeform/Email_txt'), email)

