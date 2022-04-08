package bbSiteDemo

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testdata.ExcelData
import com.kms.katalon.core.util.KeywordUtil



public class GetExcel {
	@Keyword
	def getExcelKW() {
		ExcelData temp = (ExcelData) findTestData(dataObjectName)
		temp.changeSheet(sheetName)

		def allColumnNameList = temp.getColumnNames()
		def referenceColumnIndex = null
		for (int i=0; i < allColumnNameList.size(); i++) {
			//println (allColumnNameList[i])
			if (allColumnNameList[i] == referenceColumnName) {
				referenceColumnIndex = i
				break
			}
		}// Creating  a hashmap
		def testDataList = temp.getAllData()
		def testDataMapsForTestCases = [:]
		for (Object row : testDataList) {
			def testDataMapForTestCase = [:]
			for (int i=0; i < allColumnNameList.size(); i++) {
				testDataMapForTestCase.put(allColumnNameList[i], row[i]);
				println(allColumnNameList[i] + " : " + row[i])
			}
			testDataMapsForTestCases.put(row[referenceColumnIndex], testDataMapForTestCase);
		}
		testDataMapsForTestCases=testDataMapsForTestCases
		String expectedData = testDataMapsForTestCases.get(identifierString).get(getDataOfcolumnName)
		if (expectedData == null) {
			expectedData = ""
		}
		return expectedData

		KeywordUtil.markPassed("Excel fetched")

	}
}
