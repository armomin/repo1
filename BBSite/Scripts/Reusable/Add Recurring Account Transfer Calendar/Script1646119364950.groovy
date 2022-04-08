import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
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

CustomKeywords.'bbSiteDemo.Login.LoginKW'()

CustomKeywords.'bbSiteDemo.Mainmenu.selectMenu'(mainmenu_Tabs['Payments & Transfers'])

CustomKeywords.'bbSiteDemo.submenu.selectSubMenu'(submenu[4], current_URL[1])

CustomKeywords.'bbSiteDemo.ScreenShots.takeSS'()

WebUI.selectOptionByLabel(findTestObject('Payment and Transfer/Add Recurring Transfer/fromAcct_select'), '01110001 - chess12333 - $34.01', 
    false)

WebUI.selectOptionByLabel(findTestObject('Payment and Transfer/Add Recurring Transfer/toAcct_select'), '01110002 - Jackson Holy PK - $342.53', 
    false)

CustomKeywords.'bbSiteDemo.SendKeys.advanveSendKeys'(findTestObject('Payment and Transfer/Add Recurring Transfer/amount_txt'), 
    '5')

WebUI.click(findTestObject('Payment and Transfer/Add Recurring Transfer/calendaricon_startdate'))

WebUI.selectOptionByLabel(findTestObject('Payment and Transfer/Add Recurring Transfer/Calendar/Year Picker_select'), 
    '2023', false)

WebUI.selectOptionByLabel(findTestObject('Payment and Transfer/Add Recurring Transfer/Calendar/month picker'), 'Apr', 
    false)

WebUI.selectOptionByLabel(findTestObject('null'), [('days'):'22'], false)

WebUI.sendKeys(findTestObject('Payment and Transfer/Add Recurring Transfer/transfermemo_txt'), 'This is Memo')

WebUI.sendKeys(findTestObject('Payment and Transfer/Add Recurring Transfer/email_txt'), 'demo@gmail.com')

WebUI.click(findTestObject('Payment and Transfer/Add Recurring Transfer/transferschedule_radio_dynamic', [('schedule') : 'W']))

WebUI.selectOptionByLabel(findTestObject('Payment and Transfer/Add Recurring Transfer/tsweekly_select'), 'Wednesday', 
    false)

String numtransferstring = num_transfer.toString()

WebUI.setText(findTestObject('Payment and Transfer/Add Recurring Transfer/noTransfer'), numtransferstring)

WebUI.getAttribute(findTestObject('Payment and Transfer/Add Recurring Transfer/noTransfer'), 'value')

int totaldays = (num_transfer - 1) * 7

String strdays = totaldays.toString()

CustomKeywords.'bbSiteDemo.DaysCount.NextDate'(start_date, strdays)

println(GlobalVariable.dateAfter)

WebUI.focus(findTestObject('Payment and Transfer/Add Recurring Transfer/EndDate_input'))

enddatetext = WebUI.getAttribute(findTestObject('Payment and Transfer/Add Recurring Transfer/EndDate_input'), 'value')

WebUI.verifyMatch(enddatetext, GlobalVariable.dateAfter, false)

println(GlobalVariable.dateAfter)

WebUI.click(findTestObject('Payment and Transfer/Add Recurring Transfer/Add_button'))

verification_url = WebUI.getUrl()

WebUI.verifyMatch(verification_url, 'https://bbsitedemo.btbanking.com/onlineserv/CM/olaa.cgi?state=verifyTransfer', false)

WebUI.click(findTestObject('Payment and Transfer/Add Recurring Transfer/Verification_page/Submit_button'))

WebUI.click(findTestObject('Payment and Transfer/Home Page/Logout_footer_button'))

