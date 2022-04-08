import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import org.apache.commons.io.FileUtils

import internal.GlobalVariable

class NewTestListener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	
	@BeforeTestCase
    def sampleBeforeTestCase(TestCaseContext testCaseContext) {
        String testCaseId = testCaseContext.getTestCaseId()
        GlobalVariable.testCaseName = testCaseId.substring((testCaseId.lastIndexOf("/").toInteger()) + 1)
		
		File f =new File(GlobalVariable.sspath +'//'+GlobalVariable.testCaseName)

		if (f.exists())
			FileUtils.deleteDirectory(f)
		

		f.mkdir()
    }
}