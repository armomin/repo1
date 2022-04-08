package bbSiteDemo

import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.util.KeywordUtil



public class WriteExcel {

	@Keyword
	def writedata( String data,int rownum) {


		String path= RunConfiguration.getProjectDir()
		FileInputStream fs= new FileInputStream(path+'\\Data Files\\BBData.xlsx')
		XSSFWorkbook workbook = new XSSFWorkbook(fs)
		XSSFSheet sheet = workbook.getSheet('sheet3')
		XSSFRow row =sheet.getRow(rownum)
		int column= row.getLastCellNum()
		XSSFCell cell=null
		if(cell==null)
			cell=row.createCell(column)
		cell.setCellValue(data)
		FileOutputStream fos = new FileOutputStream(path+'\\Data Files\\BBData.xlsx')
		workbook.write(fos)
		fos.close()

		KeywordUtil.markPassed("data written on excel")
	}
}
