import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

//CustomKeywords.'bbSiteDemo.Login.LoginKW'()

WebUI.callTestCase(findTestCase('Reusable/MainMenu'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'bbSiteDemo.submenu.selectSubMenu'(submenu[2], current_URL[1])

String taxId = WebUI.callTestCase(findTestCase('Reusable/FetchExcel - PARAM'), [('dataObjectName') : 'BBData (1)', ('sheetName') : 'Sheet3'
        , ('referenceColumnName') : 'rownum', ('identifierString') : rownum, ('getDataOfcolumnName') : 'TaxID'], FailureHandling.STOP_ON_FAILURE)

String debitacct = WebUI.callTestCase(findTestCase('Reusable/FetchExcel - PARAM'), [('dataObjectName') : 'BBData (1)', ('sheetName') : 'Sheet3'
        , ('referenceColumnName') : 'rownum', ('identifierString') : rownum, ('getDataOfcolumnName') : 'DebitAccount'], 
    FailureHandling.STOP_ON_FAILURE)

String day = WebUI.callTestCase(findTestCase('Reusable/FetchExcel - PARAM'), [('dataObjectName') : 'BBData (1)', ('sheetName') : 'Sheet3'
        , ('referenceColumnName') : 'rownum', ('identifierString') : rownum, ('getDataOfcolumnName') : 'Day'], FailureHandling.STOP_ON_FAILURE)

String month = WebUI.callTestCase(findTestCase('Reusable/FetchExcel - PARAM'), [('dataObjectName') : 'BBData (1)', ('sheetName') : 'Sheet3'
        , ('referenceColumnName') : 'rownum', ('identifierString') : rownum, ('getDataOfcolumnName') : 'Month'], FailureHandling.STOP_ON_FAILURE)

String endMonth = WebUI.callTestCase(findTestCase('Reusable/FetchExcel - PARAM'), [('dataObjectName') : 'BBData (1)', ('sheetName') : 'Sheet3'
        , ('referenceColumnName') : 'rownum', ('identifierString') : rownum, ('getDataOfcolumnName') : 'EndingMonth'], FailureHandling.STOP_ON_FAILURE)

String endYear = WebUI.callTestCase(findTestCase('Reusable/FetchExcel - PARAM'), [('dataObjectName') : 'BBData (1)', ('sheetName') : 'Sheet3'
        , ('referenceColumnName') : 'rownum', ('identifierString') : rownum, ('getDataOfcolumnName') : 'EndingYear'], FailureHandling.STOP_ON_FAILURE)

String taxtype = WebUI.callTestCase(findTestCase('Reusable/FetchExcel - PARAM'), [('dataObjectName') : 'BBData (1)', ('sheetName') : 'Sheet3'
        , ('referenceColumnName') : 'rownum', ('identifierString') : rownum, ('getDataOfcolumnName') : 'TaxType'], FailureHandling.STOP_ON_FAILURE)

String Excisetaxtype = WebUI.callTestCase(findTestCase('Reusable/FetchExcel - PARAM'), [('dataObjectName') : 'BBData (1)'
        , ('sheetName') : 'Sheet3', ('referenceColumnName') : 'rownum', ('identifierString') : rownum, ('getDataOfcolumnName') : 'ExciseTaxType'], 
    FailureHandling.STOP_ON_FAILURE)

String taxamt = WebUI.callTestCase(findTestCase('Reusable/FetchExcel - PARAM'), [('dataObjectName') : 'BBData (1)', ('sheetName') : 'Sheet3'
        , ('referenceColumnName') : 'rownum', ('identifierString') : rownum, ('getDataOfcolumnName') : 'TaxAmount'], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Payment and Transfer/Add Tax Payment/TaxID_select'), taxId, false)

WebUI.selectOptionByLabel(findTestObject('Payment and Transfer/Add Tax Payment/DebitAcct_select'), debitacct, false)

WebUI.check(findTestObject('Payment and Transfer/Add Tax Payment/Offset_check'))

//CustomKeywords.'bbSiteDemo.SelectDate.dateSet'(day, month)
WebUI.selectOptionByLabel(findTestObject('Payment and Transfer/Add Tax Payment/TaxPeriodEndig_Month'), endMonth, false)

WebUI.selectOptionByLabel(findTestObject('Payment and Transfer/Add Tax Payment/TaxPeriodEnding_Year'), endYear, false)

WebUI.selectOptionByValue(findTestObject('Payment and Transfer/Add Tax Payment/TaxType_select'), taxtype, false)

WebUI.selectOptionByValue(findTestObject('Payment and Transfer/Add Tax Payment/ExciseTaxType_select'), Excisetaxtype, false)

CustomKeywords.'bbSiteDemo.SendKeys.advanveSendKeys'(findTestObject('Payment and Transfer/Add Tax Payment/TaxAmount_input'), 
    '6')

//WebUI.sendKeys(findTestObject('Payment and Transfer/Add Tax Payment/TaxAmount_input'), '')
CustomKeywords.'bbSiteDemo.ScreenShots.takeSS'()

WebUI.click(findTestObject('Payment and Transfer/Add Tax Payment/Add_button'))

TaxPaymentConfirm = WebUI.getWindowTitle()

WebUI.verifyMatch(TaxPaymentConfirm, 'Confirmation', false)

CustomKeywords.'bbSiteDemo.ScreenShots.takeSS'()

batchId = WebUI.getText(findTestObject('Payment and Transfer/Add Tax Payment/ConfirmationPage/batchId_label'))

TotalDebit = WebUI.getText(findTestObject('Payment and Transfer/Add Tax Payment/ConfirmationPage/TotalDebit_label'))

CustomKeywords.'bbSiteDemo.WriteExcel.writedata'(batchId, 1)

CustomKeywords.'bbSiteDemo.WriteExcel.writedata'(TotalDebit, 1)

CustomKeywords.'bbSiteDemo.ScreenShots.takeSS'()

KeywordUtil.markPassed('Screenshot Taken')

